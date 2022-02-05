/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package com.denglitong.basic;

import java.util.Objects;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Animal_Generated extends Animal {
  private final String name;
  private final int numberOfLegs;

  public AutoValue_Animal_Generated(String name, int numberOfLegs) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    this.numberOfLegs = numberOfLegs;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public int numberOfLegs() {
    return numberOfLegs;
  }

  @Override
  public String toString() {
    return "AutoValue_Animal_Generated{" +
        "name='" + name + '\'' +
        ", numberOfLegs=" + numberOfLegs +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {return true;}
    if (o == null || getClass() != o.getClass()) {return false;}
    AutoValue_Animal_Generated that = (AutoValue_Animal_Generated)o;
    return numberOfLegs == that.numberOfLegs && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, numberOfLegs);
  }
}
