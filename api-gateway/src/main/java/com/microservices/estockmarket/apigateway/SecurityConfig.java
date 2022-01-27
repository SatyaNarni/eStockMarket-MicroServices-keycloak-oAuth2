package com.microservices.estockmarket.apigateway;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
/*import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;*/

@Configuration
public class SecurityConfig {
	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
		//http.cors().configurationSource(corsConfigurationSource());
		http.csrf().disable().authorizeExchange().anyExchange().authenticated().and().oauth2Login();
		return http.build();
	}
	

	/*
	 * @Bean public CorsWebFilter corsFilter() { return new
	 * CorsWebFilter(corsConfigurationSource()); }
	 * 
	 * @Bean CorsConfigurationSource corsConfigurationSource() { CorsConfiguration
	 * configuration = new CorsConfiguration();
	 * configuration.setAllowCredentials(true);
	 * configuration.setAllowedOrigins(Arrays.asList("*"));
	 * configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE",
	 * "PATCH", "OPTIONS")); configuration.setExposedHeaders(Arrays.asList("*"));
	 * configuration.setAllowedHeaders(Arrays.asList("*"));
	 * configuration.addAllowedHeader("*"); UrlBasedCorsConfigurationSource source =
	 * new UrlBasedCorsConfigurationSource();
	 * source.registerCorsConfiguration("/**", configuration); return source; }
	 */

	
}
