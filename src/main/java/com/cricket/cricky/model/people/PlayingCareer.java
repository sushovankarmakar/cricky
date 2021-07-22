package com.cricket.cricky.model.people;

import com.cricket.cricky.model.people.enums.MatchFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public abstract class PlayingCareer {

  private List<String> teamsPlayedFor;
  private Map<MatchFormat, LocalDate> careerSpan;
  private Map<MatchFormat, Statistics> statistics;

  @Data
  private static class Statistics {

    private Batting batting;
    private Bowling bowling;
    private Fielding fielding;
  }

  @Data
  private static class Batting {

    private int matchPlayed;
    private int inningsPlayed;
    private int notOut;
    private int runs;
    private int fours;
    private int sixes;
    private int highest;
    private double average;
    private int ballFaced;
    private double strikeRate;
    private int centuries;
    private int halfCenturies;
    private int ducks;
    private int manOfTheMatch;
    private PlayerRanking battingRanking;
  }

  @Data
  private static class Bowling {

    private int innings;
    private double overs;
    private int maiden;
    private int runConceded;
    private int wickets;
    private double average;
    private double economyRate;
    private double strikeRate;
    private int fourWicketsTaken;
    private int fiveWicketsTaken;
    private int tenWicketsTaken;
    private PlayerRanking bowlingRanking;
  }

  @Data
  private static class Fielding {

    private int catches;
    private int stumping;
    private int runOutMade;
  }

}
