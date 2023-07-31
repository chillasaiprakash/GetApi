package com.example.GetApi.Entity;





    public class ApiEntity {
        public String firstName;
        public String lastName;

        public Integer id;

        @Override
        public String toString() {
            return "TestApiDto{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", id=" + id +
                    '}';
        }

        public ApiEntity() {
        }

        public ApiEntity(String firstName, String lastName, Integer id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }


    }



