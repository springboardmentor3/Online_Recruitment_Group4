package com.infosys.Online.recruitment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Online.recruitment.Entity.Notifications;
import com.infosys.Online.recruitment.Repositary.NotificationRepositary;

@Service
public class NotificationService implements NotificationInterface {

	@Autowired
    private NotificationRepositary notificationRepository;

    public Notifications createNotification(String message, Integer jobApplicationId) {
        Notifications notification = new Notifications();
        notification.setMessage(message);
        notification.setJobApplicationId(jobApplicationId);
        return notificationRepository.save(notification);
    }

    public List<Notifications> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Notifications sendReply(Integer notificationId, String reply) {
        Notifications notification = notificationRepository.findById(notificationId).orElseThrow();
        notification.setReply(reply);
        return notificationRepository.save(notification);
    }
}
