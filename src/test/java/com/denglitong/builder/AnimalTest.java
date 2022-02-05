/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package com.denglitong.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalTest {

  @Test
  public void testAnimalMethods() {
    Animal dog = Animal.builder().setName("dog").setNumberOfLegs(4).build();
    assertThat(dog.name()).isEqualTo("dog");
    assertThat(dog.numberOfLegs()).isEqualTo(4);
    assertThat(dog).hasToString("Animal{name=dog, numberOfLegs=4}");
  }
}
