package com.sanyi.a.service;

import com.sanyi.a.domain.UserDomain;


public interface UserService {
    UserDomain searchByName(String name);
    int addUser(Object[] values);
}
