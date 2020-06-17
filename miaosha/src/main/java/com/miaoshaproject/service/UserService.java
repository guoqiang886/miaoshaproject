package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @author guoqiang
 * @create 2020/5/25 - 21:02
 */
public interface UserService {

    // 通过用户id获取用户对象
    UserModel getUserById(Integer id);

    // 通过缓存获取用户对象
    UserModel getUserByIdInCache(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /**
     *
     * @param telphone 用户注册时的手机号
     * @param encrptPassword 加密后的密码
     * @return
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;

}
