public class Main {
    public static void main(String[] args) {
        task1();

    }
    public static void task1() {
        String  firstName = " Семён ";
        String middleName = " Семёнович ";
        String lastName = " Иванов ";
        String fullName = lastName +firstName + middleName;
        System.out.println(" ФИО сотрудника — " + fullName);

        String fullName1 = fullName.toUpperCase();
        System.out.println(" Данные ФИО сотрудника для заполнения отчета — " + fullName1);

        String fullName2 = fullName.replace('ё', 'e');
        System.out.println(" Данные ФИО сотрудника — " + fullName2);







    }
}