package com.cricket.cricky.model.match;

import com.cricket.cricky.model.people.Team;
import java.util.List;
import lombok.Data;

@Data
public class PointsTable {

  private List<PointsRow> pointsTable;

  private static class PointsRow {
    private int row;
    private Team team;
    private int matchesPlayed;
    private int matchesWon;
    private int matchesLost;
    private int matchesTied;
    private int matchesNoResult;
    private int points;
    private double netRunRate;
  }

}
