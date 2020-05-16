package com.example.userapi.Model;

import javax.persistence.*;


@Entity
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private String first_name;
        private String email;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String name) {
            this.first_name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

