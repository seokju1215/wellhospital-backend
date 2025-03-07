package com.example.demo.member.domain.auth.jwt;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JWTConsts {
    public static final String TOKEN_ISSURE = "wellhosp";
    public static final String USER_CLAIMS = "user-id";
    public static final String TOKEN_TYPE = "token_type";
}
