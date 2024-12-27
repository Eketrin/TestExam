1.	Разработать проект: вывод сообщения в терминал. Разместить проект на удаленном репозитории системы контроля версий. Внести изменения в проект: добавить тест, изменения в проекте реализовать отдельной ветке. Ветку разместить на удаленном репозитории проекта. С помощью инструментов веб-версии системы контроля версий объединить ветки. Изменения загрузить в разрабатываемый проект на локальном репозитории.
 
2.	Выполнить исправления в opensource или другом (не вашем) проекте, размещенном на удаленном репозитории системы контроля версий.
3.	Обработка исключительных ситуаций. Разработать программу, которая запрашивает у пользователя два целых числа и отображает их сумму. В случае некорректного ввода необходимо его обработать и повторно запросить у пользователя числа.
4.	Обработка исключительных ситуаций. С помощью двух массивов (String[] months = {"январь", …}; int[] dom = {31,… };) разработать программу, которая предложит пользователю ввести целое число от 1 до 12, а затем отобразит месяц и количество дней, соответствующие этому целому числу. Если пользователь вводит недопустимое число, то программа должна отображать Недопустимое число с помощью перехвата исключения.
5.	Обработка исключительных ситуаций. Разработать программу ввода числа и отображения соответствующего месяца. Необходимо предотвратить ввод пользователем любого числа, кроме целого.
6.	Обработка исключительных ситуаций. Определить класс Triangle для задания треугольника с тремя сторонами. В треугольнике сумма длин любых двух сторон больше длины третьей стороны. Класс Triangle должен удовлетворять этому правилу. Создать класс IllegalTriangleException и конструктор класса Triangle, чтобы выбросить объект типа IllegalTriangleException, если треугольник создан со сторонами, нарушающими это правило.
7.	Обработка исключительных ситуаций. Создать класс с двумя целочисленными полями: числителем и знаменателем. Конструктор этого класса создает дроби при заданных значениях, но выбрасывает исключение при нулевом знаменателе. Для этого дополнительно создать класс проверяемого исключения, объекты которого выбрасываются, если знаменатель объекта равен 0, а также написать тестовый класс, который проверяет эти классы.
8.	Разработать метод, которому передается коллекция объектов типа ArrayList, а возвращается коллекция ArrayList, но уже без дубликатов. Необходимо использовать метод contains() интерфейса List.
9.	Реализовать алгоритм линейного поиска элемента в массиве. При нахождении элемента необходимо вернуть его позицию в массиве. Если элемент не найден, то вернуть -1.
 
10.	Реализовать поиск наибольшего элемента в массиве с помощью метода compareTo() интерфейса Comparable. Определите класс Circle с полем radius и найдите наибольший элемент в массиве экземпляров этого класса.
11.	Реализуйте поиск наибольшего элемента в двумерном массиве с помощью метода compareTo() интерфейса Comparable.
12.	Разработать обобщенный метод для сортировки массива объектов типа Comparable. Для проверки этого метода разработать программу, которая сортирует массив целых чисел, массив чисел типа double, массив символов и массив строк.
****************
13.	Реализовать класс Cat. У класса должны быть реализованы следующие приватные методы:
-	sleep() – выводит на экран «Sleep»
-	meow() – выводит на экран «Meow»
-	eat() – выводит на экран «Eat» И публичный метод:
-	status() – вызывает один из приватных методов случайным образом.
Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
14.	Реализовать класс Student. У класса должны быть следующие приватные поля:
-	String name – имя студента.
-	String surname – фамилия студента.
-	int[] grades – последние 10 оценок студента.
Их может быть меньше, но не может быть больше 10. И следующие публичные методы:
-	Getter и setter-методы для name.
-	Getter и setter-методы для surname.
-	Getter и setter-методы для grades.
-	метод, добавляющий новую оценку в grades. Самая первая оценка должна быть удалена, новая должна сохраниться в конце массива (т.е. массив должен сдвинуться на 1 влево).
-	метод, возвращающий средний балл студента (рассчитывается как среднее арифметическое от всех оценок в массиве grades).
Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
15.	Реализовать класс Student. У класса должны быть следующие приватные поля:
-	String name – имя студента
-	String surname – фамилия студента
-	int[] grades – последние 10 оценок студента.
Необходимо реализовать класс StudentService. У класса должны быть реализованы следующие публичные методы:
-	bestStudent() – принимает массив студентов (класс Student), возвращает лучшего студента (студент, который имеет самый высокий средний балл). Если таких несколько – вывести любого.
-	sortBySurname() – принимает массив студентов (класс Student) и сортирует его по фамилии.
Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
16.	Напишите программу на Java, используя Java (IO или NIO), которая считывает содержимое текстового файла и выводит на экран количество строк в этом файле, а также самые длинные строки. Необходимо написать программу, которая принимает в качестве входного параметра путь к текстовому файлу. Программа должна следующие действия:
-	Подсчитать общее количество строк в файле.
-	Найти самые длинные строки в файле. Если есть несколько строк одинаковой максимальной длины, выведите все такие строки.
17.	Разработать программу на Java, используя Java (IO или NIO), которая считывает содержимое двух текстовых файлов и создает третий файл, содержащий объединенное содержимое этих двух файлов. Программа должна считать содержимое этих файлов, а затем записать объединенное содержимое в третий файл. Очередность записи в третий файл не важна.
18.	Создать функцию, для сложения двух чисел. Написать пять модульных тестов для проверки работоспособности данной функции.
********************
19.	Создать функцию, которая ищет наибольшее число в массиве. Написать пять модульных тестов для проверки работоспособности данной функции.
20.	Создать функцию, для умножения двух чисел. Написать пять модульных тестов для проверки работоспособности данной функции.
21.	Создать функцию нахождения максимального из трех чисел. Написать пять модульных тестов для проверки работоспособности данной функции.
 
22.	Создать функцию, для определения количества букв в строке. Написать пять модульных тестов для проверки работоспособности данной функции.
23.	Создать функцию, для определения количества цифр в строке. Написать пять модульных тестов для проверки работоспособности данной функции.
24.	Создать функцию, для определения количества специальных символов в строке. Написать пять модульных тестов для проверки работоспособности данной функции.
*******************
25.	Разработать класс для хранения данных о пользователе туристического агентства. Используя созданный класс, смоделировать работу приложения туристического агентства. Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
26.	Разработать класс для хранения данных о покупателе магазина ювелирных украшений. Используя созданный класс, смоделировать работу приложения магазина ювелирных украшений. Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
27.	Разработать класс для хранения данных о покупателе магазина спортивной одежды. Используя созданный класс, смоделировать работу приложения магазина спортивной одежды. Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
28.	Разработать класс для хранения данных о товаре в строительном магазине. Используя созданный класс, смоделировать работу приложения хранения данных о товаре в строительном магазине. Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
29.	Разработать класс для хранения данных о животном в питомнике для бездомных животных. Используя созданный класс, смоделировать работу приложения для хранения данных о животном в питомнике для бездомных животных. Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
30.	Разработать класс для хранения данных об автомобилях, находящихся в таксопарке. Используя созданный класс, смоделировать работу приложения. Загрузить проект в отдельный репозиторий с названием, совпадающим с названием проекта.
