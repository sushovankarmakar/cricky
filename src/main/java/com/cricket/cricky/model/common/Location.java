package com.cricket.cricky.model.common;

import lombok.Data;

@Data
public abstract class Location {

  private String addressLine1;
  private String addressLine2;
  private String addressLine3;

  private String city;
  private String state;
  private String country;
  private String zipCode;

  private String latitude;
  private String longitude;
}
