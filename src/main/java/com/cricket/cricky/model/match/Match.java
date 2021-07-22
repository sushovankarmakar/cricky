package com.cricket.cricky.model.match;

import com.cricket.cricky.model.people.GroundStaff;
import com.cricket.cricky.model.people.MatchOfficial;
import com.cricket.cricky.model.people.Team;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Match {

  private final String id;
  private final TeamsBetween teamsBetween;
  private final Stadium venue;
  //private Toss toss;
  private final LocalDateTime startTime;
  private final LocalDateTime endTime;
  //private final Map<Integer, Innings> innings = new HashMap<>();
  private final List<MatchOfficial> umpires = new ArrayList<>();
  //private MatchResult matchResult;
  private final List<GroundStaff> scorer = new ArrayList<>();
  private final List<MatchOfficial> referees = new ArrayList<>();
  private Tournament tournament;
  private Team winningTeam;
  private Team loosingTeam;

}
