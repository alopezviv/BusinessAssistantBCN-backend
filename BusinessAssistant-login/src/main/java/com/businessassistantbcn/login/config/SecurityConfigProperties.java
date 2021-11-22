package com.businessassistantbcn.login.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="security")
public class SecurityConfigProperties {
	private String secret;
	private String login;
	public String getSecret() {
		return secret;
	}
	public String getLogin() {
		return login;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String toString() {
		return this.secret + " " + this.login;
	}
}
