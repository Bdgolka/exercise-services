package com.pluralsight.client;

import java.net.URI;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.pluralsight.model.Activity;

public class ActivitySearchClient {
	
	private Client client;
	
	public ActivitySearchClient(){
		client = ClientBuilder.newClient(); 
	}
	
	public List<Activity> search(String param, List<String> searchValues, String secondParam, int durationFrom, String thirdParam, int durationTo){
		
		URI uri = UriBuilder.fromUri("http://localhost:8080/exercise-services/webapi/")
				.path("search/activities")
				.queryParam(param, searchValues)
				.queryParam(secondParam, durationFrom)
				.queryParam(thirdParam, durationTo)
				.build();
				
		WebTarget target = client.target(uri);
		
	List<Activity> responce = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Activity>>(){});
	
	System.out.println(responce);
		
	return responce;
		
	}
}
