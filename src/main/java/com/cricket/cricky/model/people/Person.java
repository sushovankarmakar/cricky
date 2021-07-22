package com.cricket.cricky.model.people;

import com.cricket.cricky.model.common.Contact;
import lombok.Data;

@Data
public abstract class Person {

  private String name;
  private PersonalInfo personalInfo;
  private Contact contact;
}
