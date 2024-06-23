package com.infosys.Online.recruitment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Online.recruitment.Entity.Notifications;
import com.infosys.Online.recruitment.Service.NotificationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/notifications")

public class NotificationController {

	@Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<Notifications> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @PostMapping("/{id}/reply")
    public Notifications sendReply(@PathVariable Integer id, @RequestBody String reply) {
        return notificationService.sendReply(id, reply);
    }
}
