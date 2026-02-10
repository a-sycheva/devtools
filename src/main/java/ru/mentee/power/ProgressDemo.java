package ru.mentee.power;

public class ProgressDemo {
  static void main() {

    MenteeProgress progress = new MenteeProgress(
        "Anastasiya", // возьми значение из своего плана DVT-0
        2,               // номер спринта
        10                // запланированные часы на спринт
    );

    System.out.println(progress.summary());

    if (progress.readyForSprint()) {
      System.out.println("Status: sprint ready");
    } else {
      System.out.println("Status: backlog first");
    }

    System.out.println("Current branch is feature/DVT-3");

  }
}