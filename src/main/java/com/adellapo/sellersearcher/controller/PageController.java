package com.adellapo.sellersearcher.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.adellapo.sellersearcher.domain.Category;
import com.adellapo.sellersearcher.domain.Result;
import com.adellapo.sellersearcher.domain.Search;

/**
 * 
 * @author Andres
 * @see <a href="https://github.com/adellapo/seller-searcher-app/" target=
 *      "_blank">Github Repo</a>
 * @version 1.0
 * @since Sep 7, 2020
 */
@Controller
public class PageController {

	private Search search;
	private RestTemplate rt;
	private String siteId = "";
	private String sellerId = ""; // 179571326

	/**
	 * 
	 * @param model Model
	 * @return String with the required Template page
	 */
	@GetMapping(value = { "/" })
	public String showHomePage(Model model) {

		search = new Search();

		model.addAttribute("dataSearch", search);

		return "index";

	}

	/**
	 * 
	 * @param ds ModelAttribute
	 * @param model Model
	 * @return String with the required Template page
	 */
	@PostMapping(value = { "/" })
	public String search(@ModelAttribute Search ds, Model model) {

		try {

			siteId = ds.getSiteId();

			sellerId = String.valueOf(ds.getSeller().getId());

			search = rt.getForObject("https://api.mercadolibre.com/sites/" + siteId + "/search?seller_id=" + sellerId,
					Search.class);

			for (Result r : search.getResults()) {

				Category c = rt.getForObject("https://api.mercadolibre.com/categories/" + r.getCategoryId(),
						Category.class);

				r.setCategoryName(c.getName());

			}

			model.addAttribute("dataSearch", search);

			FileOutputStream fos = new FileOutputStream("./src/main/resources/static/output/output.txt");

			search.toString().chars().forEach(chr -> {
				try {
					fos.write((char) chr);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			fos.close();

			return "index";

		} catch (Exception e) {

			return "error";

		}

	}

	/**
	 * 
	 * @param builder RestTemplateBuilder
	 * @return RestTemplate
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/**
	 * 
	 * @param restTemplate RestTemplate
	 * @return RestTemplate
	 * @throws Exception -
	 */
	@Bean
	public RestTemplate getSearch(RestTemplate restTemplate) throws Exception {

		this.rt = restTemplate;

		return restTemplate;

	}

}
