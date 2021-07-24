package com.cricket.cricky.model.match;

import com.cricket.cricky.model.match.enums.MatchStatus;
import com.cricket.cricky.model.people.GroundStaff;
import com.cricket.cricky.model.people.MatchOfficial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Match {

  private final String id;

  private String description;
  private final TeamsBetween teamsBetween;
  private final Stadium venue;
  private Toss toss;
  private final LocalDateTime startTime;
  private final LocalDateTime endTime;
  private ScoreCard scoreCard;
  private final List<MatchOfficial> umpires = new ArrayList<>();
  private MatchResult matchResult;
  private MatchStatus matchStatus;
  private final List<GroundStaff> scorer = new ArrayList<>();
  private final List<MatchOfficial> referees = new ArrayList<>();

}
