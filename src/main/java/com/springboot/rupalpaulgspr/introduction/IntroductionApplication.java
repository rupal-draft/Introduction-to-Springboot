package com.springboot.rupalpaulgspr.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionApplication implements CommandLineRunner {

	private final CakeBaker cb;
	public IntroductionApplication(CakeBaker cb){
		this.cb=cb;
	}
	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cb.bakeCake();
	}
}
