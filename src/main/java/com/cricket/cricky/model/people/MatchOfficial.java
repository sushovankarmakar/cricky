package com.cricket.cricky.model.people;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public abstract class MatchOfficial extends Person {

  private String license;
}
