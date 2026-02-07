package ru.mentee.power.progress;

public class ProgressTracker {
    /**
     * Вычисляет суммарный прогресс группы mentee.
     *
     * @param mentees массив mentee
     * @return строка с информацией о суммарном прогрессе (пройдено/осталось уроков)
     */

    public String calculateTotalProgress(Mentee[] mentees){
        // TODO: Реализовать логику подсчёта суммарного прогресса с использованием цикла while
        // Шаги:
        // +1. Проверить валидность массива (null, пустой)
        // +2. Инициализировать аккумуляторы: totalCompleted = 0, totalTotal = 0, index = 0
        // +3. Использовать цикл while (index < mentees.length) для перебора массива
        // +4. На каждой итерации: totalCompleted += mentees[index].completedLessons(), totalTotal += mentees[index].totalLessons(), index++
        // +5. Вычислить оставшиеся: totalRemaining = totalTotal - totalCompleted
        // +6. Вернуть строку формата: "Суммарно: пройдено X из Y уроков, осталось Z уроков"

        if (mentees == null || mentees.length==0) {
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
            return String.format("Summary: completed %d from %d lessons, remaining %d lessons", totalCompleted, totalTotal, totalRemaining);
    }

    public static void main (String[] args){
        ProgressTracker tracker = new ProgressTracker();

        //массив mentee

        Mentee[] mentees = {
                new Mentee("Alisa", "Kaliningrad", "Backend development", 7,12 ),
                new Mentee("Kolya", "Rybinsk", "Java BAckend", 4,12),
                new Mentee("Nastya", "Moscow", "Backend development", 5,12)
                };
        String progress = tracker.calculateTotalProgress(mentees);
        System.out.println(progress);
    }
}
