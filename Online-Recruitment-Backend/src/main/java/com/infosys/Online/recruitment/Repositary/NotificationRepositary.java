package com.infosys.Online.recruitment.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.Online.recruitment.Entity.Notifications;

public interface NotificationRepositary extends JpaRepository<Notifications, Integer> {

}
