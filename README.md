Git локальный цикл: шаги и команды
    init -> status -> add -> commit -> branch -> log     
    инициализация гит -> проверка статуса (что отслеживается, что игноируется)->
    -> добавление изменений в индекс -> создание коммита с учетом изменений из индекса ->
    -> создание отдельной ветки -> вывод лога

Правило веток:
    master
    feature/DVT-3


Quick start: 
    через Run Anything (ctrl+ctrl): 
        для build - gradle build 
        для test - gradle test 
        для run - gradle run
 через Gradle Tool Window:
    для build - devtools/Tasks/build/ двойной клик по build
    для test - devtools/Tasks/verification/ двойной клик по test
    для run - devtools/Tasks/application/ двойной клик по run

Packages (у нас ru.mentee.power): 
        позволяют избежать конфликтов имен, создавая пространства имен
        упрощают навигацию, позволяя логически разнест  классы и др. элементы и файлы
        структура папок должна повторять имя пакета, 
            т.е. пакет ru.mentee.power соответсвует структуре ru/mentee/power
        файлы содержащие объеявление package ru.mentee.power будут находиться в этой директории

Record MenteeProgress, поля:
    menteeName - строка, имя менти 
    sprintNumber - целочисленный, номер спринта
    plannedHoursPerWeek - целочисленный, запланированное число часов обучения в неделю
    
Ссылка на урок: https://mentee-power.xl.ru/learn/MCIneBj4KkyH-GIRCspFvA/theory