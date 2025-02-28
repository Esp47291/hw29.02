// Задача 1
class Task1 {
    public static void main(String[] args) {
        int clientOS = 0; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректное значение clientOS");
        }
    }
}

// Задача 2
class Task2 {
    public static void main(String[] args) {
        int clientOS = 0; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;

        // Проверка корректности clientOS
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Некорректное значение clientOS");
            return;
        }

        // Условное выражение соответствует требованиям задания
        String baseMessage = clientOS == 0 ?
                "Установите версию приложения для iOS по ссылке" :
                "Установите версию приложения для Android по ссылке";

        // Вывод зависит от clientDeviceYear, без оператора else (тернарный оператор)
        String finalMessage = clientDeviceYear < 2015 ?
                baseMessage.replace("версию", "облегченную версию") :
                baseMessage;

        // Имена переменных отражают их содержимое, двойная вложенность отсутствует
        System.out.println(finalMessage);
    }
}

// Задача 3
class Task3 {
    public static void main(String[] args) {
        int year = 2021;

        // Проверка валидности года
        if (year <= 0) {
            System.out.println("Год должен быть положительным");
            return;
        } else if (year < 1584) {
            System.out.println("Год должен быть больше 1584");
            return;
        }

        // Условное выражение для високосного года соответствует требованиям
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Вывод зависит от переменной, без else (тернарный оператор)
        String message = isLeap ?
                year + " год является високосным" :
                year + " год не является високосным";

        // Имена переменных отражают содержимое, двойная вложенность отсутствует
        System.out.println(message);
    }
}

// Задача 4
class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;

        // Проверка корректности расстояния
        if (deliveryDistance < 0) {
            System.out.println("Расстояние не может быть отрицательным");
            return;
        }

        int days;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставка свыше 100 км не осуществляется");
            return;
        }

        System.out.println("Потребуется дней: " + days);
    }
}

// Задача 5
class Task5 {
    public static void main(String[] args) {
        int monthNumber = 12;

        // Проверка корректности номера месяца
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Номер месяца должен быть от 1 до 12");
            return;
        }

        String season = "";
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
        }

        System.out.println("Месяц " + monthNumber + " принадлежит к сезону: " + season);
    }
}