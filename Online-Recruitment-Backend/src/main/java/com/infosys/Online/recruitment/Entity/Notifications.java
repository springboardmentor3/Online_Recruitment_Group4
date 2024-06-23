package com.infosys.Online.recruitment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notifications {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String message;
    private String reply;
    private Integer jobApplicationId;
    
	public Notifications() {
		super();
		
	}

	public Notifications(Integer id, String message, String reply, Integer jobApplicationId) {
		super();
		this.id = id;
		this.message = message;
		this.reply = reply;
		this.jobApplicationId = jobApplicationId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Integer getJobApplicationId() {
		return jobApplicationId;
	}

	public void setJobApplicationId(Integer jobApplicationId) {
		this.jobApplicationId = jobApplicationId;
	}

	@Override
	public String toString() {
		return "Notifications [id=" + id + ", message=" + message + ", reply=" + reply + ", jobApplicationId="
				+ jobApplicationId + "]";
	}
    
    
}
