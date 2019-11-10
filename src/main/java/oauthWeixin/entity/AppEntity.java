package oauthWeixin.entity;

import lombok.Data;

@Data
public class AppEntity {

	private long id;
	private String appId;
	private String appName;
	private String appSecret;
	private String accessToken;
	private String redirectUri;
	private int isFlag;
}
