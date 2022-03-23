package com.gdware.crudexample.traktauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RequestMapping("api/v1/traktauth")
@RestController
public class TraktAuthController {

    private final TraktAuthService traktAuthService;

    @Autowired
    public TraktAuthController(TraktAuthService traktAuthService) {
        this.traktAuthService = traktAuthService;
    }

    @GetMapping
    public RedirectView getAuthCode() {
        return traktAuthService.getAuthCode();
    }

    @GetMapping("signin")
    public String signIn(@RequestParam(name = "code") String code) {
        return code;
    }
}
