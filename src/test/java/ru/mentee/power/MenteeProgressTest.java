package ru.mentee.power;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MenteeProgressTest {

    @Test
    void shouldFormatSummary_whenProgressCreated(){
        MenteeProgress progress = new MenteeProgress("Anastasiya", 2, 10);
        String result = progress.summary();
        assertThat(result).isEqualTo("Sprint 2 -> Anastasiya: planned 10 h");
    }

    @Test
    void shouldDetectReadiness_whenHoursAboveThreshold() {
        MenteeProgress progress = new MenteeProgress("Anastasiya", 1, 4);

        assertThat(progress.readyForSprint()).isTrue();
    }

    @Test
    void shouldDetectLackOfReadiness_whenHoursBelowThreshold(){
        MenteeProgress progress = new MenteeProgress("Anastasiya", 2, 2);
        assertThat(progress.readyForSprint()).isFalse();
    }
}
