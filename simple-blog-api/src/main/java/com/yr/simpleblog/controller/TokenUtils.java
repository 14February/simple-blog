package com.yr.simpleblog.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class TokenUtils {
    private TokenUtils() {}

    public static void addToken(HttpServletResponse response, String token) {
        Cookie cookie = new Cookie("token", token);
        cookie.setPath("/");
        cookie.setDomain("localhost");
        cookie.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie);
    }

    public static String getValueFromCookie(HttpServletRequest request, String name) {
        if (request == null || name == null) {
            return null;
        }
        // 获取请求中的所有 cookie
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return null;
        }
        for (Cookie cookie : cookies) {
            // 查找名为 "token" 的 cookie
            if (name.equals(cookie.getName())) {
                // 如果找到 token，返回它的值
                return cookie.getValue();
            }
        }
        return null;
    }



}
