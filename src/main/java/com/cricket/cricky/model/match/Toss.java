package com.cricket.cricky.model.match;

import com.cricket.cricky.model.match.enums.TossAction;
import com.cricket.cricky.model.people.Team;
import lombok.Data;

@Data
public class Toss {

  private String tossedBy;
  private String askedBy;
  private Team wonByTeam;
  private TossAction tossAction;

}
