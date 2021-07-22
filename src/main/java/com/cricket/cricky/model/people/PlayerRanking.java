package com.cricket.cricky.model.people;

import lombok.Data;

@Data
public class PlayerRanking {

  private int currentRank;
  private int currentPoints;

  private int highestRank;
  private int highestPoints;
}
