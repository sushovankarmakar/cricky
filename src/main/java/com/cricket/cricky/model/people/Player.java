package com.cricket.cricky.model.people;

import com.cricket.cricky.model.common.Image;
import com.cricket.cricky.model.common.NewsAndEditorials;
import com.cricket.cricky.model.common.Video;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class Player extends Person {

  private String profileSummary;
  private PlayingCareer career;
  private String battingStyle; // right hand bat
  private String bowlingStyle; // right arm medium
  private String playingRole;  // top order batter, batting all rounder
  private List<Image> images;
  private List<NewsAndEditorials> news;
  private List<Video> videos;

}
