package com.novigante.fakenotification.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Notification {

  private String message;

}
