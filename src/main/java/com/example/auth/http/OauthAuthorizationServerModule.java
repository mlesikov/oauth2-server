/*
 * Created by IntelliJ IDEA.
 * User: mlesikov
 * Date: 7/22/14
 * Time: 2:00 PM
 */
package com.example.auth.http;

import com.example.auth.core.CoreModule;
import com.example.auth.http.security.OauthAuthorizationServerSecurityModule;
import com.google.inject.AbstractModule;

public class OauthAuthorizationServerModule extends AbstractModule {

  private String url = "";

  public OauthAuthorizationServerModule(String url) {
    this.url = url;
  }

  public OauthAuthorizationServerModule() {
  }

  protected void configure() {
    install(new CoreModule());
    install(new OauthAuthorizationServerSecurityModule(url));
//    install(new SitebricksModule() {
//      @Override
//      protected void configureSitebricks() {
//        at(url + "/register").serve(RegistrationEndpoint.class);
//        at(url + "/authorize").serve(AuthorizationEndpoint.class);
//        at(url + "/login").show(LoginEndpoint.class);
//        at(url + "/token").serve(TokenEndpoint.class);
//        at(url + "/verify").serve(VerificationEndpoint.class);
//      }
//    });
  }
}