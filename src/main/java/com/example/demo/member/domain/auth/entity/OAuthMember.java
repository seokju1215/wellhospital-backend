package com.example.demo.member.domain.auth.entity;


import com.example.demo.member.domain.auth.enums.Authority;
import com.example.demo.member.domain.auth.enums.Provider;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OAuthMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oauth_member_id")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Provider provider;

    @Enumerated(value = EnumType.STRING)
    private Authority authority;

    private String oauthId;

    @Column(name = "is_registered", nullable = false)
    boolean isRegistered;

    private OAuthMember(Provider provider, String oauthId, Authority authority) {
        this.provider = provider;
        this.oauthId = oauthId;
        this.authority = authority;
        this.isRegistered = false;
    }

    public static OAuthMember of(Provider provider, String oauthId, Authority authority) {
        return new OAuthMember(provider, oauthId, authority);
    }


    public void  updateRegisterStatus() { // 가입처리
        this.isRegistered = true;
    }

}

