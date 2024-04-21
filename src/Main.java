public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
        System.out.println();

        System.out.println("Задача 2:");
        String fullNameOne = "Ivanov Ivan Ivanovich";
        String uppercaseFullName = fullNameOne.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + uppercaseFullName);
        System.out.println();

        System.out.println("Задача 3:");
        String fullNameTwo = "Иванов Семён Семёнович";
        String replacedFullName = fullNameTwo.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника - " + replacedFullName);
    }
}