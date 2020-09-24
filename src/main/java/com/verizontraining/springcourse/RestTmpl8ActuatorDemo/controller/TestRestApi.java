package com.verizontraining.springcourse.RestTmpl8ActuatorDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.verizontraining.springcourse.RestTmpl8ActuatorDemo.models.Post;

@RestController
public class TestRestApi {
	private final String BASE_URL = "https://jsonplaceholder.typicode.com/";
	
	@Autowired
	RestTemplate rTemplate;

	@GetMapping("/test-get-api")
	public Post getPostApi() {
		
		Post post = rTemplate.getForObject(BASE_URL+"posts/1", Post.class);
		return post;
		
	}
	
	@PostMapping("/test-post-api")
	public Post createPostApi(@RequestBody Post post) {
		Post post1 = rTemplate.postForObject(BASE_URL+"posts", post, Post.class);
		return post1;
	}
}
