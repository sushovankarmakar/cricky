package com.cricket.cricky.model.people;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Doctor extends SupportStaff {

  private String license;
}
