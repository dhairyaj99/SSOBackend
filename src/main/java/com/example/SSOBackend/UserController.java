package com.example.SSOBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

import java.security.Principal;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user")
    public Map<String, Object> user(Principal principal) {
        OidcUser oidcUser = (OidcUser) principal;
        return oidcUser.getClaims();
    }
}
