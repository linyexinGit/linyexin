package com.linyexin.linyexincommonservicefacade.service;

import com.linyexin.linyexincommonservicefacade.entity.LoginReq;
import com.linyexin.linyexincommonservicefacade.entity.UserEntity;

public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
