package com.gdware.crudexample.traktauth;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

@Service
public class TraktAuthService {

    // TODO Make secret safe
    private static final String CLIENT_ID = "client id from app settings";
    private static final String REDIR_URL = "redir url from app settins";
    private static final String URL = String.format("https://trakt.tv/oauth/authorize?response_type=code&client_id=%s&redirect_uri=%s", CLIENT_ID, REDIR_URL);

    public TraktAuthService() {
    }

    public RedirectView getAuthCode() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(URL);
        return redirectView;
    }

}