package com.mk.auth.core.handler;

import com.mk.auth.core.constant.CommonConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author liumingkang
 * @Date 2020-02-01 16:31
 * @Destcription 认证成功之后的处理逻辑
 * @Version 1.0
 **/
@Component("authSuccessHandler")
@Slf4j
public class AuthSuccessHandler implements AuthenticationSuccessHandler
{

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException
    {
        log.info(CommonConstant.LOG_PREFIX + "login success!");
        httpServletResponse.getWriter().write("success login! user :"+ SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
