package com.portable.newsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portable.newsapp.interactor.SearchNews;
import com.portable.newsapp.remoteservice.response.Response;

@RestController
@RequestMapping("/search")
public class SearchNewsController {

	@Autowired
	private SearchNews search;
	
    @GetMapping()
    public Response search(@RequestParam String key) {
        return search.execute(key);
    }
}
