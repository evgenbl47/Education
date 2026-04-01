📁 Название задачи: inheritance_animals
🎯 Цель:
Закрепить наследование, super, @Override, полиморфизм и instanceof на примере иерархии животных.
📋 Описание
Создай систему классов «Животные». Базовый класс Animal и два наследника: Dog и Cat. Отработай наследование, super, @Override, полиморфизм и instanceof.

🗂️ Структура файлов
src/main/java/org/example/module6_oop/inheritance_animals/
├── Animal.java           // Базовый класс
├── Dog.java              // Наследник 1
├── Cat.java              // Наследник 2
├── AnimalTest.java       // Main-класс для тестов
└── README.txt            // (Сгенерируем после)

📦 Структура классов:
• Animal (базовый)
  └─ protected: name, age, color
  └─ methods: getType(), makeSound(), showInfo(), getters
• Dog extends Animal
  └─ private: breed, isTrained
  └─ override: getType(), makeSound(), showInfo()
  └─ specific: fetch()
• Cat extends Animal
  └─ private: isIndoor, livesLeft
  └─ override: getType(), makeSound(), showInfo()
  └─ specific: scratch()

📐 Требования к классам
1. Базовый класс Animal.java
Поля (protected)    Тип     Описание
name                String  Имя животного
age                 int     Возраст в годах
color               String  Цвет шерсти

Методы          Описание
Конструктор     Принимает 3 параметра (name, age, color)
getType()       Возвращает "Animal"
makeSound()     Вывод: "Some animal sound"
showInfo()      Выводит базовую информацию
Геттеры         Для всех полей

2. Класс Dog.java (наследник)
Поля (private)      Тип         Описание
breed               String      Порода собаки
isTrained           boolean     Обучен ли командам

Методы          Описание
Конструктор     5 параметров + super(...) первой строкой!
getType()       Переопределить → вернуть "Dog"
makeSound()     Переопределить → вывод "🐕 Woof! Woof!"
showInfo()      Переопределить → добавить породу и обучение
fetch()         Уникальный метод → вывод "🎾 Dog brings the ball back!"
Геттеры/сеттеры По необходимости

3. Класс Cat.java (наследник)
Поля (private)      Тип         Описание
isIndoor            boolean     Домашний или уличный
livesLeft           int         Осталось жизней (максимум 9)

Методы              Описание
Конструктор         5 параметров + super(...) первой строкой!
getType()           Переопределить → вернуть "Cat"
makeSound()         Переопределить → вывод "🐱 Meow! Meow!"
showInfo()          Переопределить → добавить домашний/уличный и жизни
scratch()           Уникальный метод → вывод "🛋️ Cat scratches the furniture!"
Геттеры/сеттеры     По необходимости

4. Класс AnimalTest.java (точка входа)
Что нужно сделать:
Создать по одному объекту каждого типа: Animal, Dog, Cat.
Положить их в массив типа Animal[] — это демонстрация полиморфизма!
Пройти циклом и вызвать showInfo() + makeSound() — каждый объект покажет свою версию метода.
Через instanceof проверить тип и вызвать уникальные методы: fetch(), scratch().
Вывод — на английском 🇬🇧, комментарии — на русском 🇷🇺.

🖥️ Ожидаемый вывод в консоли
=== Creating Pets ===

=== Polymorphism in Action ===
Animal: Generic, age: 5, color: Gray
Some animal sound
🐕 Dog: Rex, age: 3, breed: Labrador, trained: true
🐕 Woof! Woof!
🐱 Cat: Murka, age: 2, indoor: true, lives: 7
🐱 Meow! Meow!

=== Type Check (instanceof) ===
Dog is Animal? true
Cat is Animal? true
Dog is Cat? false

=== Specific Methods ===
🎾 Dog brings the ball back!
🛋️ Cat scratches the furniture!

✅ Чеклист перед сдачей
Все классы в пакете inheritance_animals
Поля в Animal — protected (видны наследникам)
В конструкторах Dog и Cat вызов super(...) стоит первой строкой
Методы getType(), makeSound(), showInfo() переопределены с @Override
В AnimalTest создан массив Animal[] — продемонстрирован полиморфизм
Использован instanceof перед вызовом fetch() и scratch()
Использовано приведение типа (casting) для вызова уникальных методов
Комментарии в коде на русском
Код, переменные и вывод в консоль — на английском
main() только в AnimalTest.java

Ожидаемый вывод в консоль:
=== Creating Pets ===

=== Polymorphism in Action ===
Animal name: Animal, age: 2, color: white
Some animal sound
🐕 Dog: Gav, age: 1, breed: simple, trained: true
🐕 Woof! Woof!
🐱 Cat: Kitty, age: 3, indoor: true, lives: 7
🐱 Meow! Meow!

=== Type Check (instanceof) ===
Dog is Animal? true
Cat is Animal? true
Dog is Cat? false

=== Specific Methods ===
🐱 Cat scratches the furniture!
🎾 Dog brings the ball back!