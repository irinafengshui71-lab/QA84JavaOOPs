public class Lesson_6_MainBooks{

    public static void main(String[] args){
        Book bk = new Book("Buratino ", "Tolstoj ", 150, 12345);

        System.out.println(bk.toString());

        FictionBook fb = new FictionBook("Vii ", "Gogol ", 230, 12345, "Drama ");
        System.out.println(fb);

        EducationBook eb = new EducationBook("Math", "Pifagor", 300, 15432, "Geometriy");
        System.out.println(eb);

        KidsFictionBook kfb = new KidsFictionBook("Kolobok ", "Persons ", 40, 14432, "fairytale ", 3);

    }
}
/* HW4
                                  Person
                            [name, id, age]
                        |           |              |
                     Employee     SportsMan       Patient
             [company, salary]    [sport, status]     [idCardInsurance]
                     |
                SalesEmployee
                [bonus]
*/