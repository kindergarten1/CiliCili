package com.cilicili.userManagement.service;

import com.cilicili.userManagement.model.dto.LoginDTO;
import com.cilicili.userManagement.model.dto.UserRegisterDTO;
import com.unitl.response.ResponseVO;

/**
 * @Author SlyAimer
 * @Date 2023/8/26 21:39
 * @Version 1.0
 */
public interface UserManagementInterface{

    /**
     * 用户登录
     * @param loginDTO {@link LoginDTO}
     * @return {@link ResponseVO}
     */
    ResponseVO<?> login(LoginDTO loginDTO);

    /**
     * 用户注册
     * @param registerDTO {@link UserRegisterDTO}
     * @return {@link ResponseVO}
     */
    ResponseVO<?> register(UserRegisterDTO registerDTO);

}
