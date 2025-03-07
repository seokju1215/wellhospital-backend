package com.example.demo.member.domain.auth.service;

import com.example.demo.member.domain.auth.jwt.TokenType;

public interface TokenSaveService {
    void saveToken(final String token, final TokenType tokenType, final String oauthId);
}
