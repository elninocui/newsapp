package com.portable.newsapp.interactor;

import com.portable.newsapp.remoteservice.response.Response;

public interface SearchNews {

	Response execute(String key);
}
