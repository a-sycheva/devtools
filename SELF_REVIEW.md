## Результаты само-ревью DVT-9

### Найденные проблемы

#### 1. Не удален лишний комментарий
<pre>
<b>Файл:</b> StudentList.java строка 3
<b>Проблема:</b> Лишний комментарий
<b>Почему важно:</b> лишние комментарии усложняют восприятие кода, растягивают его и могут путать
<b>Исправление:</b> необходимо убрать не нужные комментарии
</pre>


#### 2. CI badge в README привязан к конкретной ветке
<pre>
<b>Файл:</b> README.java строка 3
<b>Проблема:</b> CI badge в README привязан к ветке DVT-8
<b>Почему важно:</b> CI badge привязанный к конкретной будет отображать результаты actions для нее даже после мерджа в main, что искажает восприятие информации из README
<b>Исправление:</b> стоит оставить стандартную привязку badge:
[![Java CI with Jacoco and Checkstyle](https://github.com/a-sycheva/devtools/actions/workflows/ci.yml/badge.svg)](https://github.com/a-sycheva/devtools/actions/workflows/ci.yml)
</pre>


#### 3. Не восстановлен стандартный вывод
<pre>
<b>Файл:</b> src/main/java/ru/mentee/power/ProgressDemoTestJava.java строка 19
<b>Проблема:</b> В методе shouldExecuteCorrect происходит замена стандартного вывода без его восстановления
<b>Почему важно:</b> без восстановления стандартного вывода программы возможно поломка дальнейших тестов, так как System.out.println будет осуществлять вывод в неожиданное для них место
<b>Исправление:</b> необходимо вернуть обратно System.setOut(originalOut)после перехвата нового вывода.

	было:
	    System.setOut(new PrintStream(outContent));
		ProgressDemo.main();
		String output = outContent.toString();
	
	стало:
		System.setOut(new PrintStream(outContent));
		ProgressDemo.main();
		String output = outContent.toString();
		System.setOut(originalOut)
</pre>



#### 4. Не используемый import
<pre>
<b>Файл:</b> src/main/java/ru/mentee/power/progress/Mentee.java строка 4
<b>Проблема:</b> не используемый import java.util.List
<b>Почему важно:</b> лишние импорты могу засорять код, путать ревьювера и вызывать конфликты имен
<b>Исправление:</b> необходимо убрать лишний импорт.
</pre>
