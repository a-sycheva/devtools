package ru.mentee.power.progress;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MenteeTest {

    @Test
    @DisplayName("If Completed more than Total then throw exception")
    void shouldThrowException_whenCompletedGreaterThanTotal() {
        assertThatThrownBy(() -> new Mentee("Ivan", "Moscow","Backend",15,10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Incorrect progress value");
    }

    @Test
    @DisplayName("If data is correct then don`t throw exception")
    void shouldNotThrowException_whenValidData(){
        assertThatCode(()->new Mentee("Ivan", "Moscow","Backend",8,10))
                .doesNotThrowAnyException();
    }

}