package ru.mentee.power.progress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("ProgressTracker testing")

class ProgressTrackerTest {

    @Test
    @DisplayName("Should correctly calculates progress when mentee array is given")
    void shouldCalculateTotalProgress_whenMultipleMentees() {
        //given - подготовка данных (создание трекера, заподнение массива)
        ProgressTracker tracker = new ProgressTracker();
        Mentee[] mentees = {
                new Mentee("Ivan", "Moscow", "Backend development", 5, 12),
                new Mentee("Mariya", "St. Petersburg", "Fullstack", 8, 12),
                new Mentee("Pete", "Kazan", "Java Backend", 12, 12)
        };
        //when -  выполнение действия - расчет прогресса
        String result = tracker.calculateTotalProgress(mentees);

        assertThat(result)
                .contains("completed 25 from 36 lessons")
                .contains("remaining 11 lessons");
    }

    @Test
    @DisplayName("Should process array correctly when all mentees done the course ")
    void shouldCalculateTotalProgress_whenAllMenteesCompleted() {
        ProgressTracker tracker = new ProgressTracker();
        Mentee[] mentees = {
                new Mentee("Ivan", "Moscow", "Backend development", 12, 12),
                new Mentee("Mariya", "St. Petersburg", "Fullstack", 12, 12),
        };

        String result = tracker.calculateTotalProgress(mentees);

        assertThat(result)
                .contains("completed 24 from 24 lessons")
                .contains("remaining 0 lessons");
    }
}