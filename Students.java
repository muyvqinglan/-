package Xuanke;

import java.util.Scanner;

public class Students {
    Scanner input = new Scanner(System.in);
    public int number;
    public String name;
    public String sex;
    public Curriculums[] curriculums;

    public Students(int number, String name, String sex, Curriculums[] curriculums) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.curriculums = curriculums;
    }

    public void choiceCurriculums(Students student, int n, Curriculums curriculums1) {
        student.curriculums[n] = curriculums1;
        System.out.println(student.name + "选择" + student.curriculums[n].curriculumsname + "课程成功");
    }

    public void outCurriculums(Students student, int n) {
        System.out.println(student.name + "退选" + student.curriculums[n].curriculumsname + "课程成功");
        student.curriculums[n] = null;
    }
}