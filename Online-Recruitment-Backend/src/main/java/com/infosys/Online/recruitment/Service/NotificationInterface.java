package com.infosys.Online.recruitment.Service;

import java.util.List;

import com.infosys.Online.recruitment.Entity.Notifications;

public interface NotificationInterface {

	public Notifications createNotification(String message, Integer jobApplicationId);
	
	public List<Notifications> getAllNotifications();
	 
	public Notifications sendReply(Integer notificationId, String reply);
}
