/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package com.denglitong.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalTest {

  @Test
  public void testAnimalMethods() {
    Animal dog = Animal.create("dog", 4);
    assertThat(dog.name()).isEqualTo("dog");
    assertThat(dog.numberOfLegs()).isEqualTo(4);
    assertThat(dog.toString()).isEqualTo("Animal{name=dog, numberOfLegs=4}");
  }
}
