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

    // value instance is immutable after build,
    // but we can use toBuilder() to get a mutable builder with the same properties
    Animal dog2 = dog.toBuilder().setNumberOfLegs(3).build();
    assertThat(dog2.name()).isEqualTo("dog");
    assertThat(dog2.numberOfLegs()).isEqualTo(3);
    assertThat(dog2).hasToString("Animal{name=dog, numberOfLegs=3}");
  }
}
