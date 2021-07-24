package com.cricket.cricky.model.common;

import java.util.List;
import lombok.Data;

@Data
public class Image {

  private String name;
  private String cdnUrl;
  private List<String> resolutions;
  private List<String> tags;

}
