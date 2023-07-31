package com.example.GetApi.Cotroller;

import com.example.GetApi.Entity.ApiEntity;
import com.example.GetApi.Service.TestingApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;
@RestController
public class TestingApiController {
    @Autowired
    TestingApiService testingApiService;
    @GetMapping("/getData")
    public List<ApiEntity> getData() throws Exception {

        return  testingApiService.restTemplateCalling();
    }

}
