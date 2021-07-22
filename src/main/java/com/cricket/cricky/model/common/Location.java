package com.cricket.cricky.model.common;

import lombok.Data;

@Data
public abstract class Location {

  private String city;
  private String state;
  private String country;

  private String latitude;
  private String longitude;
}
