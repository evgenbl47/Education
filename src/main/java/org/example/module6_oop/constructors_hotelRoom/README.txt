=== JAVA LEARNING TASK ===

📁 Модуль: Module 6: OOP - Constructors (Overloading + Bonus)
📁 Задача: Room Class with Constructor Overloading (Hotel Booking System)
📅 Дата: 26.03.2026
📂 Пакет: org.example.module6_oop.constructors_hotelRoom

🎯 Цель:
Закрепить перегрузку конструкторов + метод цепочки (fluent interface).

📋 Требования:
1. Поля: roomNumber, roomType, pricePerNight, hasBreakfast, hasSeaView
2. 3 конструктора: полный, базовый, по умолчанию
3. Методы: printRoomInfo(), calculateTotal(int nights)
4. БОНУС: upgradeToSuite() - меняет тип и цену, возвращает this

📂 Файлы:
- Room.java          : Класс с перегрузкой + бонус-метод
- RoomTest.java      : Тестирование + цепочка вызовов
- README.txt         : Документация

💡 Ключевые моменты:
- this(...) - вызов конструктора из конструктора
- return this - позволяет цепочку вызовов (fluent interface)
- Гибкость: клиент выбирает уровень детализации

🔗 Full-stack связь:
- Fluent interface используется в:
  * Builders (Lombok, AutoValue)
  * Stream API (.filter().map().collect())
  * Конфигураторах (Spring, Hibernate)

🐛 Баги и решения:
- Опечатка: room3 вместо roomUpgrade в выводе → исправил
- Стиль: hasBreakFast → hasBreakfast (camelCase)

✅ Статус: Готово + Бонус выполнен