package com;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/htgl/*")
public class HtglResourceConfig extends ResourceConfig{
	public HtglResourceConfig() {
		packages("com/xiangshiguang/srdz");
		System.out.println("HtglResourceConfig");
	}
}