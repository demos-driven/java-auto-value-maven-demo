/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package com.denglitong.basic;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Animal {

  public static Animal create(String name, int numberOfLegs) {
    // run `mvn clean package` to generate the AutoValue implemented class
    return new AutoValue_Animal(name, numberOfLegs);
  }

  public abstract String name();

  public abstract int numberOfLegs();
}
