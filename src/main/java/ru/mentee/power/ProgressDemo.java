package ru.mentee.power;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProgressDemo {
    public static void main(String[] args) {

        // напиши new MenteeProgress( "Имя студента", 1, 6)  затем выдели и набери Ctrl + Alt + V (Windows/Linux) или Option + Command + V (macOS) выделяет выражение в переменную.
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

        System.out.println("current branch is feature/DVT-2");

    }
}