package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findbyDescription(List<String> descriptions, int durationFrom, int durationTo) {
		//Select * from activities where description in (?,?,?) and duration > ? and duration < ?
		
		List<Activity> activities = new ArrayList<Activity>();
		Activity activity = new Activity();
		activity.setId("2345");
		activity.setDescription("swimming");
		activity.setDuration(55);
		
		activities.add(activity);
		
		return activities;
	}
	
	public void create(Activity activity) {
	 // should issue an insert statement to the db	
	}
	
	@Override
	public List<Activity> findAllActivities(){
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activivty1 = new Activity();
		
		activivty1.setDescription("Swimming");
		activivty1.setDuration(55);
		
		activities.add(activivty1);
		
		Activity activivty2 = new Activity();
		
		activivty2.setDescription("Cycling");
		activivty2.setDuration(120);
		
		activities.add(activivty2);
		
		return activities;
	}
	@Override
	public Activity findActivity(String activityId) {
		
		if(activityId.equals("7777")){
			return null;
		}
        
		Activity activivty1 = new Activity();
		
		activivty1.setId("1234");
		activivty1.setDescription("Swimming");
		activivty1.setDuration(55);
		
		return activivty1;
	}

	@Override
	public Activity update(Activity activity) {
		//search the database to see if we have an activity with that id already
		//select * from Activity where id = ?
		//if rs size ==0
		//insert into Activity table
		//else
		//update the Activity			
		
		return activity;		
	}

	@Override
	public void delete(String activityId) {
		// delete from activity where activityId = ?
		
	}
}
