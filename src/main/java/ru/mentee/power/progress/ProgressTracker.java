package ru.mentee.power.progress;

public class ProgressTracker {

  public String calculateTotalProgress(Mentee[] mentees) {

    if (mentees == null || mentees.length == 0) {
      return "Mentees list is empty!";
    }

    int totalCompleted = 0;
    int totalTotal = 0;
    int index = 0;

    while (index < mentees.length) {
      totalCompleted += mentees[index].completedLessons();
      totalTotal += mentees[index].totalLessons();
      index++;
    }
    int totalRemaining = totalTotal - totalCompleted;
    return String.format("Summary: completed %d from %d lessons, "
            + "remaining %d lessons",
        totalCompleted, totalTotal, totalRemaining);
  }

  public static void main(String[] args) {
    ProgressTracker tracker = new ProgressTracker();

    Mentee[] mentees = {
        new Mentee("Alisa", "Kaliningrad", "Backend development", 7, 12),
        new Mentee("Kolya", "Rybinsk", "Java BAckend", 4, 12),
        new Mentee("Nastya", "Moscow", "Backend development", 5, 12)
    };
    String progress = tracker.calculateTotalProgress(mentees);
    System.out.println(progress);
  }
}
