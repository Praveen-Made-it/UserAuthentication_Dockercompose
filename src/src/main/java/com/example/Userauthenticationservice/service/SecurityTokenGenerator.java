/*
* Author Name: M Jaya Suriya
* Date: 11/29/2022
* Created With: IntelliJ IDEA Community Edition
*/
package com.example.Userauthenticationservice.service;

import com.example.Userauthenticationservice.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {

    Map<String,String> generateToken(User user);
}