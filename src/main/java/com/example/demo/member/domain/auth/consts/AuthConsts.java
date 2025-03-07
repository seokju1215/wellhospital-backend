package com.example.demo.member.domain.auth.consts;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthConsts {
    public static final String AUTHENTICATION_TYPE= "Bearer"; // JWT 인증 타입
    public static final String AUTHENTICATION_TYPE_PREFIX = AUTHENTICATION_TYPE+" ";
    public static final String AUTHORIZATION = "Authorization"; // HTTP Authorization 헤더 키 값
    public static final String REFRESH_TOKEN_HEADER = "RefreshToken"; // 리프래시 토큰을 보내는 헤더 키 값
    public static final String EMPTY_HEADER = null; // 헤더가 비어있으면 ㅇㅇ
}
