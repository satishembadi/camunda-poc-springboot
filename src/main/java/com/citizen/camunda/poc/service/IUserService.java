package com.citizen.camunda.poc.service;

import com.citizen.camunda.poc.model.User;

import java.util.Optional;

public interface IUserService {
  Optional<String> login(String sessionId, String username, String password);

  Optional<User> isAuthenticated(String sessionId);

  void logout(String sessionId);

}
