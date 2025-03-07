package com.example.demo.member.domain.auth.service;

import com.example.demo.member.domain.auth.jwt.TokenType;

public interface TokenQueryService {
    String findTokenByValue(final String value, final TokenType tokenType);
}
