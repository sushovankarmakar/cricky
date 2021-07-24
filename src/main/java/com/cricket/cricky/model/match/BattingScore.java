package com.cricket.cricky.model.match;

import com.cricket.cricky.model.people.Player;
import java.util.Map;
import lombok.Data;

@Data
public class BattingScore {

  private Player batter;
  private int runScored;
  private int ballFaced;
  private int totalFours;
  private int totalSixes;
  private double strikeRate;

  private Map<Integer, Run> runScoredInEachBall;
  private boolean isOut;
  private FallOfWicket fallOfWicket;

}
