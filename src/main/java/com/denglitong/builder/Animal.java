/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package com.denglitong.builder;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Animal {

  public abstract String name();

  public abstract int numberOfLegs();

  public static Builder builder() {
    // run `mvn clean package` to generate the AutoValue implemented class
    return new AutoValue_Animal.Builder();
  }

  // initialize a builder to the same property values as an existing value instance
  public abstract Builder toBuilder();

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setName(String value);

    public abstract Builder setNumberOfLegs(int value);

    public abstract Animal build();
  }
}
