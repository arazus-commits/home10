
public class Main {
    public static void main(String[] args) {
        //задача 1
        String firstName = " Ivan";
        String middleName = " Ivanov";
        String lastName = " Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println(fullName);

        //задача 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //задача 3
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1.replace('ё', 'e'));

    }
}