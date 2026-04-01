📁 Задача: inheritance_houses
📅 Дата: 2026-03-29
👨‍💻 Автор: NT4H / Student

🎯 Цель:
Отработать наследование, super, @Override, полиморфизм и instanceof на примере иерархии домов.

📦 Структура классов:
• House (базовый)
  └─ protected: address, square, yearBuilt
  └─ methods: getType(), showInfo(), getters
• Cottage extends House
  └─ private: hasGarden, gardenSize
  └─ override: getType(), showInfo()
  └─ specific: plantTree()
• Skyscraper extends House
  └─ private: floors, hasElevator
  └─ override: getType(), showInfo()
  └─ specific: goToFloor(int)

🔑 Ключевые концепции:
1. extends — наследование полей и методов
2. super(...) — вызов конструктора родителя (ПЕРВАЯ СТРОКА!)
3. @Override — переопределение поведения
4. Полиморфизм: House h = new Cottage(...)
5. instanceof + casting — безопасный доступ к методам наследника

🖥️ Запуск:
Выполнить main() в классе HouseTest

📝 Языковое соглашение:
• Код/вывод: English
• Комментарии: Russian