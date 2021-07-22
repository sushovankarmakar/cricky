package com.cricket.cricky.model.organization;

import com.cricket.cricky.model.common.Contact;
import com.cricket.cricky.model.common.Location;
import java.time.LocalDate;
import lombok.Data;

@Data
public abstract class Organization {

  private String name;
  private String abbreviation;
  private OrganizationType organizationType;
  private Location headquarter;
  private LocalDate foundedAt;
  private Contact contact;

  private String president;
  private String vicePresident;

}
