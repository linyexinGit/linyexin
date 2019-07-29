package com.linyexin.linyexinuser.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.linyexin.linyexincommonservicefacade.entity.LoginReq;
import com.linyexin.linyexincommonservicefacade.entity.UserEntity;
import com.linyexin.linyexincommonservicefacade.service.UserService;


/**
* @program: UserServiceImpl
* @description:
* @author: lin.yx
* @create: 2019/7/22
*/
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    /**
     *
     * @param loginReq
     * @return
     */
    @Override
    public UserEntity login(LoginReq loginReq) {
        return null;
    }
}
