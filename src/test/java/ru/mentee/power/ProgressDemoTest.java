package ru.mentee.power;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProgressDemoTest {

  @Test
  @DisplayName("Main should execute correct")
  void shouldExecuteCorrect () {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outContent));

    ProgressDemo.main();

    String output = outContent.toString();

    assertThat(output).isNotEmpty();

    assertThat(output).contains("Status: ");
    assertThat(output).contains("Current branch is feature/DVT-3");
  }
}