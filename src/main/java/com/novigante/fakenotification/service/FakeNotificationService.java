package com.novigante.fakenotification.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FakeNotificationService {

  List<String> notificationMessages = List.of(
      "Your application has been successfully deployed",
      "Your application has been successfully updated",
      "Your application has been successfully unlocked",
      "You have a new message",
      "You have a new friend request",
      "You have a new connection request",
      "You have a new notification",
      "You have a new email",
      "Your account has been compromised",
      "Your account has been locked",
      "Your account has been disabled",
      "Your account has been deleted",
      "Your account has been suspended",
      "Your account has been banned",
      "Your application has been compromised",
      "Your application has been locked",
      "Your application has been disabled",
      "Your application has been deleted",
      "Your application has been suspended",
      "Your application has been banned",
      "Your application has a critical vulnerability",
      "Your application has a high vulnerability",
      "Your application has a medium vulnerability",
      "Your application has a low vulnerability"
  );


  public String getRandomNotificationMessage(){
    return notificationMessages.get((int) (Math.random() * notificationMessages.size()));
  }


}
