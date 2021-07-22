package com.cricket.cricky.model.people;

import com.cricket.cricky.model.common.Contact;
import java.util.List;
import lombok.Data;

@Data
public class Team {

  private final String name;
  private final String tourName;
  private List<Player> players;
  private Contact contact;
  private List<SupportStaff> supportStaffs;

}
