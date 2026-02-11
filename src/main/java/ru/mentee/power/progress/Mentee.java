package ru.mentee.power.progress;

import java.util.List;

public record Mentee(
    String name,
    String city,
    String goal,
    int completedLessons,
    int totalLessons
) {
  public Mentee {

    if (completedLessons < 0 || totalLessons <= 0 || completedLessons > totalLessons) {
      throw new IllegalArgumentException("Incorrect progress value");
    }
  }
}
