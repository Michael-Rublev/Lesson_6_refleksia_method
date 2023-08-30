public class Lesson_6_1_String_Method {

    //создаю пользовательский метод
    public static void printText(String text) { //Внутри (параметры: String - тип, text - имя параметра)
        System.out.println(text);
    }

    public static void main(String[] args) {
        //Методы/Атрибуты/Функции - МЕТОДЫ, методы строки это такие атрибуты обьектов
        // которые выполняют действия (возвращают что либо), метод это действие.
        // у ментодов есть характеристики

        String s = "sergey";

        int index = s.indexOf('g');// 'g' это тип в аргументе, который находится
        // в параметрах характеристиках метода indexOf

        System.out.println(index);

        printText(s); //Строковый агрумент, который мы передаем в пользовательский ментод (строка 4)

    }
}
