package com.portable.newsapp.interactor.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.portable.newsapp.interactor.SearchNews;
import com.portable.newsapp.remoteservice.GuardianContentApi;
import com.portable.newsapp.remoteservice.response.Response;

@Service
public class SearchNewsImpl implements SearchNews{

	@Value("${guardian.key}")
	private String apiKey;
	
	@Override
	public Response execute(String key) {
		GuardianContentApi api = new GuardianContentApi(apiKey);
	    Response response = null;
		try {
			response = api.getContent(key);
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		
		return response;
	}
	
}
