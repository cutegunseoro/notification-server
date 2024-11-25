package com.ssafy.travlog.notification.batch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class NotificationBatchJob {
	@Scheduled(cron = "0 0 * * * ?")
	public void processNotifications() {
		log.info("Starting NotificationBatchJob...");

		try {
			// Simulate fetching pending notifications
			log.info("Fetching pending notifications...");
			// Add code to fetch notifications from database or queue

			// Simulate processing each notification
			log.info("Processing notifications...");
			// Add your notification processing logic here

			// Simulate marking notifications as sent
			log.info("Marking notifications as sent...");
			// Add code to update notification statuses in the database

			log.info("NotificationBatchJob completed successfully.");
		} catch (Exception e) {
			log.error("Error occurred while running NotificationBatchJob", e);
		}
	}
}
