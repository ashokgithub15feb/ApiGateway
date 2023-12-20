//package com.lcwd.gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		
//		UserDetails userDetails = User.withUsername("ashok").password(passwordEncoder().encode("ashok")).roles("NORMAL").build();
//		
//		UserDetails userDetails1 = User.withUsername("ashok1").password(passwordEncoder().encode("ashok1")).roles("ADMIN").build();
//		
//		InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager(userDetails, userDetails1);
//		
//		return detailsManager;
//	}
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.csrf().disable().authorizeHttpRequests().requestMatchers("/v1/api/auth").permitAll().anyRequest().authenticated().and().formLogin();
//
//		return httpSecurity.build();
//	}
//}
