package com.cricket.cricky.model.people;

import com.cricket.cricky.model.common.Location;
import java.util.Date;
import lombok.Data;

@Data
public abstract class PersonalInfo {

  private String firstName;
  private String middleName;
  private String lastName;
  private String initials;

  private Date dateOfBirth;
  private Location birthPlace;

  private String nationality;

  private double weight;
  private double height;
}
