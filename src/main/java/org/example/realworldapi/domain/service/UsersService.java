package org.example.realworldapi.domain.service;

import org.example.realworldapi.domain.entity.User;

public interface UsersService {
    User create(String username, String email, String password);
}
