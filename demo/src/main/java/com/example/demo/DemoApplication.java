package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableZuulProxy
@EnableAutoConfiguration
@EnableScheduling
@SpringBootApplication
@ComponentScan("com.example")
public class DemoApplication implements CommandLineRunner{
	
	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		getValue();
		
	}
	
	public void getValue()
	{
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<>();
		map.put("fname", "vijay");
		map.put("lname", "gupta");
		
		list.add(map);
		
		for(int i = 0 ; i<list.size(); i++)
		{
			Map<String, Object> map2 = list.get(i);
			for(Entry<String,Object> entryset : map2.entrySet())
			{
				System.out.println("key : " + entryset.getKey());
				System.out.println("value:  " + entryset.getValue());
				
			}
		}
	}
	
	
	

}
