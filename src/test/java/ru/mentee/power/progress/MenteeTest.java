package ru.mentee.power.progress;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MenteeTest {

  @Test
  @DisplayName("If Completed more than Total then throw exception")
  void shouldThrowExceptionWhenCompletedGreaterThanTotal() {
    assertThatThrownBy(() -> new Mentee("Ivan", "Moscow", "Backend", 15, 10))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Incorrect progress value");
  }

  @Test
  @DisplayName("If data is correct then don`t throw exception")
  void shouldNotThrowExceptionWhenValidData() {
    assertThatCode(() -> new Mentee("Ivan", "Moscow", "Backend", 8, 10))
        .doesNotThrowAnyException();
  }

}