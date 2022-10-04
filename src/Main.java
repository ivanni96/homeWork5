public class Main {
    public static void main(String[] args) {

        // Задача 1

        int clientOS = 1;

        if (clientOS == 1){
            System.out.println("Установите версию приложения для iOS по ссылке");}
            if (clientOS == 0){
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        // Задача 2

        int clientOS2 = 0;
        int clientDeviceYear = 2015;

        if (clientOS2 == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");}

        if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS2 == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");}
        if (clientDeviceYear < 2015 && clientOS2 == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }

        }





