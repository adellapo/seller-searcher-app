package com.adellapo.sellersearcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.adellapo.sellersearcher.test.domain.Otro;

/**
 * 
 * @author Andres
 * @link https://www.github.com/adellapo/seller-searcher-app
 * @version 1.0
 * @since Sep 5, 2020
 */
@SpringBootApplication
public class SellerSearcherAppApplication {

	private static final Logger log = LoggerFactory.getLogger(SellerSearcherAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SellerSearcherAppApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			// test de RestTemplate
			Otro otro = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Otro.class);
			
			// logeo de testing
			log.info(otro.toString());

		};
	}

}
