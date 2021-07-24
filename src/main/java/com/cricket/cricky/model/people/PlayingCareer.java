package com.cricket.cricky.model.people;

import com.cricket.cricky.model.match.enums.MatchFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public abstract class PlayingCareer {

  private List<String> teamsPlayedFor;
  private Map<MatchFormat, LocalDate> careerSpan;
  private Map<MatchFormat, PlayerStatistics> statistics;

}
