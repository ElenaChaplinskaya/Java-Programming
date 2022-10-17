# Java trainee
lesson 1-3 - Алгоритмические задачи
lesson 4 - Циклы
Tasks
1)Добавить метод, который суммирует все числа от 1 до введенного пользователем числа.
Например, если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.
Добавить проверку, что введённое число >= 1, сумму считать через цикл, введённое число - параметр метода
2)Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
3)Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
4)Написать метод проверки чётное ли число, используя тернарный оператор.
5)Добавить метод для вычисления факториала числа. Реализовать данную функцию через рекурсию.

lesson 5- Массивы
Tasks
1)Создать массив типа String с размером 7. Записать в него значения дней недели. Вывести на консоль значение последнего элемента.
2)Дан массив целых чисел произвольной длины(число вводятся с клавиатуры). Найти в массиве те элементы, значение которых меньше среднего арифметического, взятого от всех элементов
3)Заполнить вводом с клавиатуры численный массив за исключением последнего элемента, вывести его на экран. Запросить еще одно значение и его позицию в массиве. Вставить указанное число в заданную позицию, подвинув элементы после него.
4)Найти максимальное число в двумерном массиве.

lesson 6-Классы + массивы
Tasks
1)Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi>i.
2)Дана матрица. Вывести k-ю строку и p-й столбец матрицы
3)Определить класс Children, который содержит такие поля (члены класса): закрытые – имя ребенка, фамилию и возраст , публичные – методы ввода данных и отображения их на экран. Задать конструкторы - без параметров и со всеми параметрами. Объявить два объекта класса, внести данные и показать их. 
4)Создать класс Покупатель: 
поля Фамилия, Имя, Отчество, год рождения, Номер кредитной карточки(целое число), Номер банковского счета; 
конструктор;
методы: установка значений атрибутов, получение значений атрибутов, вывод информации о клиенте, получение возраста покупателя.
Создать массив объектов данного класса. Вывести имена покупателей у которых номер кредитной карточки заканчивается на 1.

lesson 7 -String
Tasks
1)Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”. 
Распечатать последний символ строки. Используем метод String.charAt().
Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
Найти позицию подстроки “Java” в строке “I like Java!!!”.
Заменить все символы “а” на “о”. 
Преобразуйте строку к верхнему регистру.
Преобразуйте строку к нижнему регистру.
Вырезать строку Java c помощью метода String.substring().
2)Ввести строку и подсчитать количество запятых в ней.
3)Имеется строка с текстом. Вывести текст, составленный из последних букв 
всех слов.

lesson 8- Наследование
Tasks
1)Реализовать иерархию классов «Фигуры»(не менее 3х классов) Реализовать функцию подсчета площади и периметра для каждого типа фигуры.Для круга создать метод получения диаметра.
2)Потренироваться создавать объекты-наследники и объекты родительского класса, вызывать методы каждого объекта

lesson 9 -Наследование
Tasks
1)Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе. Реализовать методы по начислению зарплаты в зависимости от должности (почасовая, процентная, смешанная). Иерархия должна иметь хотя бы три уровня.

lesson 10- Дженерики, enum
Tasks
1)Напишите метод filter, который принимает на вход массив (любого типа) и реализацию интерфейса Filter c методом apply(Object o), чтобы убрать из массива лишнее значение. Проверьте как он работает на строках или других объектах.

2)Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L). Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер". Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.  Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.

3)Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одеть Женщину". 
Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"), Галстук (реализует интерфейсы "Мужская Одежда").   
Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одеть Женщину, одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды. Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.

lesson 11 - Коллекции
Tasks
1)Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам. Создать коллекцию, содержащую объекты класса Student. Написать метод, который удаляет студентов со средним баллом <3. Если средний балл>=3, студент переводится на следующий курс. Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса. А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
  
lesson 12 - Коллекции.Map
Tasks
1)Создайте класс Pet и его наследников Cat, Dog, Parrot. Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet. Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения. 
2)Создайте метод public boolean isUnique(Map<String, String> map), который возвращает true, если в отображении нет двух и более одинаковых value, и false в противном случае. Для пустого отображения метод возвращает true. Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true, а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.
3)Создайте метод public int countCommon(Set<Integer> list1, Set<Integer> list2), который возвращает количество уникальных совпавших значений в обоих списках.
Например, для списков [3, 7, -1, 2, 7, 15] и [-5, 15, 2, -1, 7, 36] метод вернет 4, т.к. совпали элементы -1, 2, 7 и 15.
4)Создайте метод  public Set<String> removeEvenLength(Set<String> set), который возвращает множество, в котором удалены все элементы четной длины из исходного множества.Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]
  
lesson 13- Исключения
Tasks
1)Интернет-магазин. Аутентификация пользователя: Пусть у вас будет отображение, содержащие пары логин пароль. Если пользователь ввел данные из этого отображения, он аутентифицирован. Если введенные логин, пароль не содержатся в отображении, проверяете их корректность - пароль содержит хотя бы одну цифру и буквы латинского алфавита, длина пароля от 8 до 20 символов.
  
lesson 14 - Потоки ввода-вывода
Tasks
1)Написать класс, который копирует содержимое из одного файла в другой. Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.
2)Написать метод который циклически просматривает содержимое заданного каталога и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах. Используем рекурсию и класс File.

lesson 15 - Thread
Tasks
1)Дописать класс Application - добавить анмаршалинг данных из файла xml
2)Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов, затем находит максимальный элемент в этом массиве и выводит на экран в формате “ имя потока - максимальный элемент”. Запусить 10 потоков. 

lesson 16-Stream API
Tasks
1)Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. Используем функциональный интерфейс Predicate.
2)Создать класс Book. Получить список всех книг библиотеки, отсортированных по году издания. 
3)Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 50 человек в возрасте от 15 до 30. Напишите одну непрерывную цепочку stream вызовов, которая:выбирает объекты, возраст которых меньше 21;распечатывает их на экран;сортирует по фамилии, а потом по имени(использовать thenComparing у объекта Comparator);
берёт 4 первых объекта;формирует коллекцию из фамилий объектов;агрегирует всё в коллекцию.
  
lesson 17 - Синхронизация
Tasks
1)Cоздать метод,который печатате название потока и засыпает на 2 секунды. Запустить одновременно 10 потоков. Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно









