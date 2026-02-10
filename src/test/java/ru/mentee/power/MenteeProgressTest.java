package ru.mentee.power;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MenteeProgressTest {

  @Test
  void shouldFormatSummaryWhenProgressCreated() {
    MenteeProgress progress = new MenteeProgress("Anastasiya", 2, 10);
    String result = progress.summary();
    assertThat(result).isEqualTo("Sprint 2 -> Anastasiya: planned 10 h");
  }

  @Test
  void shouldDetectLackOfReadinessWhenHoursBelowThreshold() {
    MenteeProgress progress = new MenteeProgress("Anastasiya", 2, 2);
    assertThat(progress.readyForSprint()).isFalse();
  }

  @Test
  void ShouldReturnTrueIfPlannedHoursMoreThan3() {
    MenteeProgress menteeProgress = new MenteeProgress("Andrey", 2, 5);

    assertThat(menteeProgress.readyForSprint()).isTrue();
  }
}
