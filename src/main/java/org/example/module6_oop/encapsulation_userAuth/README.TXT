=== JAVA LEARNING TASK ===

📁 Модуль: Module 6: OOP - Part 3 (Encapsulation)
📁 Задача: encapsulation_userAuth
📅 Дата: 26.03.2026
📂 Пакет: org.example.module6_oop.encapsulation_userAuth

🎯 Цель:
Освоить инкапсуляцию: скрыть поля через private, предоставить доступ через геттеры/сеттеры с валидацией.

📋 Требования:
1. Поля: username, email, age, password (все private)
2. Конструктор: инициализация всех полей
3. Геттеры: getUsername(), getEmail(), getAge(), getPassword()
4. Сеттеры с валидацией:
   - setUsername(): длина >= 3 → "Error: Username must be at least 3 characters!"
   - setEmail(): содержит @ → "Error: Invalid email format!"
   - setAge(): 0 <= age <= 150 → "Error: Invalid age!"
   - setPassword(): длина >= 8 → "Error: Password must be at least 8 characters!"
5. Метод printUserInfo(): вывод без пароля
6. Бонус: private метод isValidEmail() для проверки email

📂 Файлы:
- User.java              : Класс с инкапсуляцией и валидацией
- Test_User.java         : Тестирование сеттеров/геттеров
- theory_encapsulation.html : Теория (справочник)
- README.txt             : Документация задачи

💡 Ключевые моменты:
- private поля скрыты от внешнего кода
- геттеры (get...) читают данные
- сеттеры (set...) пишут данные с проверкой
- валидация защищает от некорректных значений
- private helper-методы (isValidEmail) упрощают логику

🔗 Full-stack связь:
- Инкапсуляция — основа моделей данных (Entity/DTO) в Spring/Hibernate
- Валидация в сеттерах → защита бизнес-логики на уровне модели
- toString() переопределение → удобный вывод для логирования/отладки

🐛 Баги и решения:
- [Заполни после: например, граница age > 0 → age >= 0]

✅ Статус: Готово


part2
=== JAVA LEARNING TASK ===

📁 Модуль: Module 6: OOP - Part 3 (Encapsulation + Bonus)
📁 Задача: encapsulation_userAuth
📅 Дата: 26.03.2026
📂 Пакет: org.example.module6_oop.encapsulation_userAuth

🎯 Цель:
Освоить инкапсуляцию + реализовать безопасную смену пароля.

📋 Требования:
1. Поля: username, email, age, password (все private)
2. Конструктор + геттеры/сеттеры с валидацией
3. БОНУС: changePassword(old, new, confirm) — трёхступенчатая проверка

📂 Файлы:
- User.java              : Класс с инкапсуляцией + changePassword()
- Test_User.java         : Тестирование
- theory_encapsulation.html : Теория
- README.txt             : Документация

💡 Ключевые моменты:
- private поля + public методы = инкапсуляция
- Валидация в сеттерах защищает данные
- changePassword() демонстрирует сложную бизнес-логику
- Early Return (опционально) уменьшает вложенность

🔗 Full-stack связь:
- Смена пароля — типичная операция в системах аутентификации
- В реальных проектах пароли хешируются (BCrypt), но логика проверок аналогична

🐛 Баги и решения:
- Исправил границу age: > 0 → >= 0, < 150 → <= 150
- Сообщения об ошибках в changePassword() можно унифицировать с форматом "Error: ..."

✅ Статус: Готово + Бонус выполнен