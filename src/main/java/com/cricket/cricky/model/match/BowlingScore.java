package com.cricket.cricky.model.match;

import com.cricket.cricky.model.people.Player;
import lombok.Data;

@Data
public class BowlingScore {

  private Player bowler;
  private double overs;
  private int maidens;
  private int wickets;
  private int noBalls;
  private int wides;
  private double economy;
  private int dotBalls;
  private int fours;
  private int sixes;

}
