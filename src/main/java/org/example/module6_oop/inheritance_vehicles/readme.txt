🎯 Техническое Задание для практики inheritance_vehicles
📁 Название задачи: inheritance_vehicles
🎯 Цель:
Закрепить наследование, super, @Override, полиморфизм, instanceof и casting
на примере иерархии транспортных средств с углублённым погружением.
📋 Описание
Создай иерархию классов «Транспортные средства». Базовый класс Vehicle и три наследника: Car, Bike, Truck. Отработай наследование, валидацию, полиморфизм и логические методы.

🗂️ Структура файлов
src/main/java/org/example/module6_oop/inheritance_vehicles/
├── Vehicle.java         // Базовый класс
├── Car.java             // Наследник 1
├── Bike.java            // Наследник 2
├── Truck.java           // Наследник 3
├── VehicleTest.java     // Main-класс для тестов
└── README.txt           // (Сгенерируем после)

📦 Структура классов:
• Vehicle (базовый)
  └─ protected: brand, maxSpeed, weight
  └─ methods: getType(), move(), showInfo(), getters/setters (с валидацией)
• Car extends Vehicle
  └─ private: doors, hasAC
  └─ override: getType(), move(), showInfo()
  └─ specific: openTrunk(), canCarryCargo()
• Bike extends Vehicle
  └─ private: hasBasket, wheelSize
  └─ override: getType(), move(), showInfo()
  └─ specific: ringBell()
• Truck extends Vehicle
  └─ private: cargoCapacity, axles
  └─ override: getType(), move(), showInfo()
  └─ specific: loadCargo(), canCarryCargo()

📐 Требования к классам
1. Базовый класс Vehicle.java
Поля (protected)    Тип     Описание
brand               String  Марка транспорта
maxSpeed            int     Макс. скорость (км/ч)
weight              double  Вес (кг)

Методы                  Описание
Конструктор             3 параметра
getType()               Возвращает "Vehicle"
move()                  Вывод: "Vehicle is moving..."
showInfo()              Выводит базовую информацию
Геттеры/Сеттеры         Для всех полей (с валидацией!)

⚠️ Валидация в сеттерах:
brand: если null или пустая → установить "Unknown".
maxSpeed: если < 0 или > 300 → установить 100.
weight: если < 0 → установить 1000.

2. Класс Car.java (наследник)
Поля (private)          Тип         Описание
doors                   int         Количество дверей
hasAC                   boolean     Есть ли кондиционер

Методы              Описание
Конструктор         5 параметров + super(...) первой строкой
getType()           Переопределить → "Car"
move()              Переопределить → "🚗 Car is driving on road..."
showInfo()          Переопределить → добавить двери и AC
openTrunk()         Уникальный → "🔓 Car trunk opened!"
canCarryCargo()     Логический → true, если doors >= 4
Геттеры/Сеттеры     Для полей doors (валидация: > 0) и hasAC

3. Класс Bike.java (наследник)
Поля (private)          Тип         Описание
hasBasket               boolean     Есть ли корзина
wheelSize               int         Размер колеса (дюймы)

Методы               Описание
Конструктор         5 параметров + super(...) первой строкой
getType()           Переопределить → "Bike"
move()              Переопределить → "🚲 Bike is pedaling..."
showInfo()          Переопределить. Выводить всю информацию (включая корзину и колёса)
ringBell()          Уникальный → "🔔 Bike bell rings!"
Геттеры/Сеттеры     Для полей wheelSize (валидация: > 0) и hasBasket

4. Класс Truck.java (наследник)
Поля (private)      Тип     Описание
cargoCapacity       int     Грузоподъёмность (кг)
axles               int     Количество осей

Методы              Описание
Конструктор         5 параметров + super(...) первой строкой
getType()           Переопределить → "Truck"
move()              Переопределить → "🚚 Truck is hauling cargo..."
showInfo()          Переопределить. Выводить всю информацию (включая грузоподъёмность и оси)
loadCargo()         Уникальный → "📦 Truck loading cargo..."
canCarryCargo()     Логический → true, если cargoCapacity > 0
Геттеры/Сеттеры     Для полей cargoCapacity (валидация: >= 0) и axles

5. Класс VehicleTest.java (точка входа)
Что нужно сделать:
Создать по одному объекту: Vehicle, Car, Bike, Truck.
Положить их в массив типа Vehicle[] — полиморфизм!
Пройти циклом и вызвать showInfo() + move().
Через instanceof проверить тип и вызвать уникальные методы (openTrunk, ringBell, loadCargo).
Доп. задание: Для Car и Truck вызвать метод canCarryCargo() и вывести результат в консоль.
Вывод — на английском 🇬🇧, комментарии — на русском 🇷🇺.

🖥️ Ожидаемый вывод в консоли (пример)
=== Creating Vehicles ===

=== Polymorphism in Action ===
Vehicle: Unknown, speed: 100 km/h, weight: 1000 kg
Vehicle is moving...
🚗 Car: Toyota, speed: 200 km/h, weight: 1500 kg, doors: 4, AC: true
🚗 Car is driving on road...
🚲 Bike: Giant, speed: 30 km/h, weight: 15 kg, basket: true, wheels: 26
🚲 Bike is pedaling...
🚚 Truck: Volvo, speed: 90 km/h, weight: 5000 kg, capacity: 10000 kg, axles: 3
🚚 Truck is hauling cargo...

=== Type Check (instanceof) ===
Car is Vehicle? true
Bike is Vehicle? true
Truck is Vehicle? true

=== Specific Methods ===
🔓 Car trunk opened!
🔔 Bike bell rings!
📦 Truck loading cargo...

=== Cargo Check ===
Car can carry cargo? true
Truck can carry cargo? true

🧾 Чеклист перед сдачей
Все классы находятся в пакете inheritance_vehicles
Поля базового класса имеют модификатор protected
В конструкторах наследников super(...) вызывается первой строкой
Все переопределённые методы помечены аннотацией @Override
В сеттерах реализована валидация (без throw, со значениями по умолчанию)
В тесте создан массив типа Vehicle[] (полиморфизм)
Перед вызовом уникальных методов используется проверка instanceof
Перед использованием приведения типа (casting) используется проверка instanceof
В тесте вызван метод canCarryCargo() для Car и Truck
Все комментарии в коде написаны на русском языке 🇷🇺
Код, имена переменных и вывод в консоль — на английском языке 🇬🇧
Метод main() находится только в классе VehicleTest