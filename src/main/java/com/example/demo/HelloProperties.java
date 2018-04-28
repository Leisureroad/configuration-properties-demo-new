package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

	private List<String> fooList = Arrays.asList("a", "b");

	private Set<String> bar;

	public List<String> getFooList() {
		return fooList;
	}

	public void setFooList(List<String> fooList) {
		this.fooList = fooList;
	}

	public Set<String> getBar() {
		return bar;
	}

	public void setBar(Set<String> bar) {
		this.bar = bar;
	}
}
