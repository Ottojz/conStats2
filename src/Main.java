public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("task 1");

        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Неверные условия");
        }

        //task 2
        System.out.println("task 2");

        clientOS = 1;
        short clientDeviceYear = 2010;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else {
            System.out.println("Неверные условия");
        }

        //task 3
        System.out.println("task 3");

        int year = 2084;

        if (year >= 1584 && (year - 1584) % 4 == 0) {

            if ((year - 1584) % 100 == 0) {

                if ((year - 1584) % 400 == 0) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год не високосный");
                }

            } else {
                System.out.println("Год високосный");
            }

        } else {
            System.out.println("До 1584 года високосных не было");
        }
/* В данном случае можно решить без вложенности, можно через switch, но на Switch есть отдельная задача №5 -
эти варианы понимаю

Смотю сейчас разбор. Как я понял, високосные года стали отсячитываться от 1584 и корректировки каждые 100 лет
отсчитываются также от 1584, то есть 1684 не високосный (1584 + 100), а 1984 - високосный (1584 + 400)
В любом случае, логику понял, переделать отсчет на 0 год - это проще, чем добалять отсяет от 1584 */

        //task 4
        System.out.println("task 4");

        byte deliveryDistance = 95;
        byte deliveryTerm = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTerm);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTerm + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTerm + 2));
        } else {
            System.out.println("Доставка не осуществляется");
        }
//Понимаю, что можно без второй переменной (byte deliveryTerm = 1;), но по условию задания вроде как надо

        //task 5
        System.out.println("task 5");

        byte monthNumber = 12;

        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Это зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Это весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Это летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Нет такого месяца");

        }
//В разборе домашки указано, что нельзя в один кейс несколько значений, как "case 1, 2, 12:", но у меня это код работает
    }
}