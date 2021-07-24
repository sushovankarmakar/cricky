package com.cricket.cricky.model.match;

import com.cricket.cricky.model.people.Squad;
import com.cricket.cricky.model.people.Team;
import lombok.Data;

@Data
public class TeamsBetween {

  private final Team homeTeam;
  private final Team awayTeam;

  private final Squad homeTeamSquad;
  private final Squad awayTeamSquad;
}
