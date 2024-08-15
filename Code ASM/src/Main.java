import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Student> studentList = new ArrayList<>();
    public static void main(String[] args) {

        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong sv:");
        n = scanner.nextInt();

        for(int i = 1;i<=n;i++){
            input();
        }
        System.out.println("IN DANH SACH SV:");
        output();
    }

    // Nhap moi 1 sinh vien
    public static void input()
    {


        System.out.println("Nhap vao thong tin sinh vien:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma sv:");
        String code = scanner.nextLine();
        System.out.println("Nhap ten sv:");
        String name = scanner.nextLine();
        System.out.println("Nhap diem:");
        float grade = scanner.nextFloat();
        Student student = new Student(code, name, grade);
        studentList.add(student);


    }

    // In danh sach sinh vien
    public static void output(){

        for(Student student: studentList){

            System.out.println(student.toString());
        }

    }

    public static void removeByCode(String code)
    {


    }

    public static  void sortByGradeDesc(){


    }

    public static Student findByCodeOrName(String keyword){


        return null;
    }

    public static List<Student> filterByGrade(float x){

        return  null;
    }
}