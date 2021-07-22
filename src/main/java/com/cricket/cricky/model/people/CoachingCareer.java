package com.cricket.cricky.model.people;

import com.cricket.cricky.model.people.enums.MatchFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public abstract class CoachingCareer {

  private List<String> teamsCoachedFor;
  private Map<MatchFormat, LocalDate> careerSpan;
  private Map<MatchFormat, Statistics> statistics;

  @Data
  private static class Statistics {

    private int totalMatches;
    private int matchesWon;
    private int matchesDrawn;
    private int matchesLost;

    private int totalSeries;
    private int seriesWon;
    private int seriesDrawn;
    private int seriesLost;

    private int totalTournament;
    private int tournamentsWon;
    private int tournamentsLost;
  }

}
