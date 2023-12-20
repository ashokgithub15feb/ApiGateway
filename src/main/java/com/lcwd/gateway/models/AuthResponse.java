package com.lcwd.gateway.models;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AuthResponse {

	private String userId;
	private String accessTocken;
	private String refreshToken;
	private long expireAt;
	private Collection<String> authories;
	
}
