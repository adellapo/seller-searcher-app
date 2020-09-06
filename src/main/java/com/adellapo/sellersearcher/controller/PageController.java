package com.adellapo.sellersearcher.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.adellapo.sellersearcher.domain.Search;

@Controller
public class PageController {

	private Search search;

	@RequestMapping(value = { "", "/" })
	public String showHomePage(Model model) {
		model.addAttribute("dataSearch", search);
		return "index";
	}

	@Bean
	public RestTemplate restTemplate2(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public Search getSearch(RestTemplate restTemplate2) throws Exception {

		// seller search
		String siteId = "MLA";
		String sellerId = "179571326";
		search = restTemplate2.getForObject(
				"https://api.mercadolibre.com/sites/" + siteId + "/search?seller_id=" + sellerId, Search.class);

		return search;
	}

}
