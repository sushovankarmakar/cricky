package com.cricket.cricky.model.match;

import com.cricket.cricky.model.people.Team;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Tournament {

  //private final int id;
  private final String name;
  private final List<Team> teams = new ArrayList<>();
  //private List<Sponsor> sponsors;
  //private final List<Match> matches;
  private final List<Stadium> venues = new ArrayList<>();
  private final LocalDateTime startTime;
  private final LocalDateTime endTime;
  //private List<Team> teamStandingPositions;
  //private List<Stat> stats;
  //private Map<AwardType, Person> awards;

  public Tournament(String name, LocalDateTime startTime, LocalDateTime endTime) {
    this.name = name;
    this.startTime = startTime;
    this.endTime = endTime;
  }
}
