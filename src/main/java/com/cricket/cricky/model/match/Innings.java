package com.cricket.cricky.model.match;

import java.util.List;
import lombok.Data;

@Data
public class Innings {

  private int inningsNumber;
  private int totalRuns;
  private int totalWickets;
  private List<BattingScore> battingScores;
  private List<BowlingScore> bowlingScores;

  private List<Over> overs;

}
