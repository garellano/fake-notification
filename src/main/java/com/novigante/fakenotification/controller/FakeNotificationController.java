package com.novigante.fakenotification.controller;

import com.novigante.fakenotification.model.Notification;
import com.novigante.fakenotification.service.FakeNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fake-notifications")
public class FakeNotificationController {


  @Autowired
  private FakeNotificationService fakeNotificationsService;

  @GetMapping
  public Notification getRandomNotificationMessage() {
    return
        Notification.builder()
            .message(fakeNotificationsService.getRandomNotificationMessage())
            .build();
  }
}
