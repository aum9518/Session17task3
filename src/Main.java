import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        EducationCenter school = new School("Sattarkulov","Kyrgyzstan", LocalDate.of(1991,01,01));
        EducationCenter univercity = new Univercity("KNU","Kyrgyzstan",LocalDate.of(1983,01,01));
        EducationCenter collage = new Collage("KIT","Kyrgyzstan",LocalDate.of(1988,01,01));

        Student student1 = new Student("Manas","Abdugani uulu",'M',LocalDate.of(2002,01,9),school);
        Student student2 = new Student("Arapbai","Borubai uulu",'M',LocalDate.of(2019,01,9),collage);
        Student student3 = new Student("Gulzhan ","Janybekova",'F',LocalDate.of(2021,01,9),univercity);

        Student[] students = {student1,student2,student3};
        method(students);
    }
    public static void method(Student[] students){
        for (Student a:students) {
            Period ped = Period.between(a.getDateOfStart(),LocalDate.now());
            System.out.println(a.toString());
            System.out.println("Butkonuno ushuncha "+ped+" boldu");
        }

    }
}