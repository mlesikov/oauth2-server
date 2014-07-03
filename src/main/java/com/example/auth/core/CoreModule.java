package com.example.auth.core;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * @author Ivan Stefanov <ivan.stefanov@clouway.com>
 */
public class CoreModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Clock.class).to(SystemClock.class).in(Singleton.class);
    bind(AccessTokenGenerator.class).to(BearerAccessTokenGenerator.class).in(Singleton.class);
    bind(TokenGenerator.class).to(Sha1TokenGenerator.class).in(Singleton.class);
    bind(TokenSecurity.class).to(TokenSecurityImpl.class).in(Singleton.class);
    bind(AuthorizationSecurity.class).to(AuthorizationSecurityImpl.class).in(Singleton.class);
  }
}