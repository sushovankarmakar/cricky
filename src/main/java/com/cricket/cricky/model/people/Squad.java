package com.cricket.cricky.model.people;

import java.util.List;
import lombok.Data;

@Data
public class Squad {

  private Team team;
  private List<Player> playingMembers;
  private Player twelveMember;
  private List<Player> benchedMembers;
}
