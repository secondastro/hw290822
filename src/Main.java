import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    public static void task1() {
        int age = 5;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Нужно немного подождать");
        }
    }

    public static void task2() {
        int age = 9;
        int schoolAge = 7;
        int studentAge = 18;
        int firstWorkAge = 24;
        if (age >= schoolAge && age < studentAge) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= studentAge && age < firstWorkAge) {
            System.out.println("Можно поступать в университет");
        }
        if (age >= firstWorkAge) {
            System.out.println("Пора искать работу");
        }
    }

    public static void task3() {
        int capacity = 102;
        int seatingPlaces = 60;
        int passengers = 93;
        if (passengers == capacity) {
            System.out.println("Мест нет");
        }
        if (passengers < seatingPlaces) {
            System.out.println("Свободно " + (seatingPlaces - passengers) + " сидений и " + (capacity - seatingPlaces) + " стоячих мест");
        }
        if (passengers >= seatingPlaces && passengers < capacity) {
            System.out.println("Свободно " + (capacity - passengers) + " стоячих мест");
        }
    }

    public static void task4() {
        int age = 5;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Нужно немного подождать");
        }
    }

    public static void task5() {
        int age = 9;
        int schoolAge = 7;
        int studentAge = 18;
        int firstWorkAge = 24;
        if (age >= firstWorkAge) {
            System.out.println("Пора искать работу");
        } else {
            if (age >= studentAge) {
                System.out.println("Можно поступать в университет");
            } else {
                if (age >= schoolAge) {
                    System.out.println("Ребенок ходит в школу");
                }
            }
        }
    }

    public static void task6() {
        int capacity = 102;
        int seatingPlaces = 60;
        int passengers = 93;
        if (passengers == capacity) {
            System.out.println("Мест нет");
        } else {
            if (passengers < seatingPlaces) {
                System.out.println("Свободно " + (seatingPlaces - passengers) + " сидений и " + (capacity - seatingPlaces) + " стоячих мест");
            } else if (passengers < capacity) {
                System.out.println("Свободно " + (capacity - passengers) + " стоячих мест");
            }
        }
    }

    public static void task7() {
        int age = 45;
        int schoolAge = 7;
        int studentAge = 18;
        int workAge = 24;
        if (age >= 2) {
            String n;
            if (age < schoolAge) {
                n = " в детский сад";
            } else {
                if (age < studentAge) {
                    n = " в школу";
                } else {
                    if (age < workAge) {
                        n = " в университет";
                    } else {
                        n = " на работу";
                    }
                }
            }
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить" + n);
        }
    }

    public static void task8() {
        int age = 9;
        int age5 = 5;
        int age14 = 14;
        if (age < age5) {
            System.out.println("Кататься нельзя");
        } else {
            if (age < age14) {
                System.out.println("Можно кататься в сопровождении взрослого");
            } else {
                System.out.println("Кататься можно");
            }
        }
    }

    public static void task9() {
        int one = 1;
        int two = 2;
        int three = 3;
        int max;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }
        if (max < three) {
            max = three;
        }
        System.out.println(max);
    }
}