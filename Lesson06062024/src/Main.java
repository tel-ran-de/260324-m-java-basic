public class Main {
    public static void main(String[] args) {
//        Object[] stud = Students.students;
//        for(int i = 0; i < stud.length; i++) {
//            System.out.println(stud[i].getClass());
////            System.out.println(stud[i]);
//        }
//        Student student = new Student();
//        student.toString();
        Person ivan = new Person("Ivan");
        Person petr = new Person("Peter");
        Object vasay = new Object();
        String str = new String();

        System.out.println(ivan.equals(petr));
        System.out.println(ivan.equals(vasay));
        System.out.println(ivan.equals(str));



    }
}