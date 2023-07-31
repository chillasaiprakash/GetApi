package com.example.GetApi.Service;

import com.example.GetApi.Entity.ApiEntity;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;
@Service
public class TestingApiService {
    RestTemplate rt = new RestTemplate();
    @Retryable(value= Exception.class, maxAttempts = 5, backoff = @Backoff(delay = 100))
    @CircuitBreaker(name = "CircuitBreaker", fallbackMethod = "fallbackMethod")
    public List<ApiEntity> restTemplateCalling() throws URISyntaxException {
        System.out.println("entered");
        String url = "http://localhost:8081/getData";
        URI uri = new URI(url);

        List<ApiEntity> entity = rt.getForObject(uri, List.class);

        return entity;
    }


    public List<ApiEntity> fallbackMethod(Exception e)
    {
        List<ApiEntity> en=rt.getForObject("http://localhost:8082/getData",List.class);
        return en;
    }

}
