

public class Main {

    public static void main(String[] args) {
//        taks1();
//        task2();
        task3();



    }

    public static void taks1() {
//        Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате.
//        Бухгалтерия попросила написать программу, в которой можно работать с Ф. И. О. сотрудников.
//                Напишите четыре строки:
//        С именем firstName — для хранения имени.
//                С именем middleName — для хранения отчества.
//                С именем lastName — для хранения фамилии.
//                С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//                Выведите в консоль фразу: «ФИО сотрудника — …».
//        В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника - " + lastName + " " + firstName + " " + middleName);
    }

    public static void task2() {
//    Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью написанные заглавными
//    буквами (верхним регистром).
//    Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
//    В качестве строки с исходными данными используйте строку fullName.
//    Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудников для заполнения отчета - " + fullName);
    }

    public static void task3() {
//        Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».
//        В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
//        Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }

    }