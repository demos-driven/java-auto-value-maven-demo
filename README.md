# java-auto-value-maven-demo

## User guide

https://github.com/google/auto/blob/master/value/userguide/index.md

## Why use AutoValue

https://github.com/google/auto/blob/master/value/userguide/why.md

## Background

- AutoValue concept: You write an abstract class, and AutoValue implements it.
- Be careful that you don't accidentally pass parameters to the generated constructor in the wrong
  order. Consider switching to use the builder option to avoid this problem.

## Usage

See the unit tests.

```
mvn clean package test
```
