=== JAVA LEARNING TASK ===

📁 Модуль: Module 6: OOP - Constructors
📁 Задача: Product Class with Constructor
📅 Дата: [ДД.ММ.ГГГГ]

🎯 Цель:
📋 НОВАЯ ЗАДАЧА: «Online Store — Product Class» 🛒
📖 Легенда:
Ты делаешь бэкенд для интернет-магазина. Нужно создать класс Product (товар),
который будет хранить информацию о продукте. Используем конструктор для удобного создания объектов!

📋 Требования:
📝 ТЕХНИЧЕСКОЕ ЗАДАНИЕ (ТЗ):

Часть 1: Класс Product.java
Создай класс Product со следующими полями:
    Поле            Тип         Описание
    name            String      Название товара
    price           double      Цена в долларах
    quantity        int         Количество на складе
    isAvailable     boolean     Есть ли в наличии

Добавь конструктор:
    public Product(String name, double price, int quantity, boolean isAvailable)

Добавь методы:
    void printProductInfo() — выводит всю информацию о товаре (на английском)
    double getTotalValue() — возвращает double (общая стоимость = price * quantity)

Часть 2: Класс ProductTest.java
Создай файл для тестирования с main методом:

Создай 2 объекта Product с помощью конструктора:
    product1: "Laptop", 999.99, 5, true
    product2: "Mouse", 29.99, 0, false

Для каждого товара:
    Вызови printProductInfo()
    Вызови getTotalValue() и выведи результат: "Total value: $X.XX"
Добавь разделители в выводе (например, === Product 1 ===)

💡 Ключевые моменты:
[Что нового узнал?]

✅ Статус: В процессе

src/main/java/org/example/
│
└── module6_oop/
    └── class_product/        ← НОВАЯ задача
        ├── Product.java
        ├── ProductTest.java
        └── README.txt        ← Не забудь создать!


=== JAVA LEARNING TASK ===

📁 Модуль: Module 6: OOP - Part 2 (Constructors)
📁 Задача: Product Class with Constructor (Online Store)
📅 Дата: 26.03.2026
📂 Пакет: org.example.module6_oop.constructors_onlineStore

🎯 Цель:
Научиться использовать конструкторы для инициализации объектов.
Создать класс Product для интернет-магазина с удобным созданием товаров.

📋 Требования:
1. Класс Product с полями: name (String), price (double), quantity (int), isAvailable (boolean)
2. Конструктор: public Product(String name, double price, int quantity, boolean isAvailable)
3. Метод printProductInfo() - вывод всей информации о товаре (void)
4. Метод getTotalValue() - расчёт общей стоимости (price * quantity), возврат double
5. Создать 2 объекта в ProductTest.java с разными данными
6. Вывод на английском языке
7. Разделители в консоли для каждого товара

📂 Структура файлов:
- Product.java       : Класс-шаблон с конструктором и методами
- ProductTest.java   : Точка входа (создание объектов через конструктор)
- README.txt         : Документация задачи

💡 Ключевые моменты:
- Конструктор вызывается автоматически при new Product(...)
- Имя конструктора = имя класса (Product)
- Нет возвращаемого типа (ни void, ни тип данных)
- this. используется для различения полей и параметров
- Конструктор упрощает создание объектов (1 строка вместо 5)

🔗 Связь с Full-stack:
- Класс Product = модель данных (Data Model / Entity)
- В реальном проекте такие классы используются для:
  * Передачи данных между слоями приложения
  * Отображения товаров на сайте
  * Работы с базой данных (ORM)

🐛 Баги и решения:
- [Заполни после завершения задачи]

✅ Статус: В процессе