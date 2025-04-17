package br.com.picpay_challenge_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PicpayChallengeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicpayChallengeConfigServerApplication.class, args);
	}

}
