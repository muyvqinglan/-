package Xuanke;

import java.util.Scanner;

public class Teachers {
    Scanner input = new Scanner(System.in);
    public int number;
    public String name;
    public String sex;
    public Curriculums[] curriculums;

    public Teachers(int number, String name, String sex, Curriculums[] curriculums) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.curriculums = curriculums;
    }

    public void openCurriculums(Teachers teacher, int n, Curriculums curriculums1) {
        teacher.curriculums[n] = curriculums1;
        System.out.println(teacher.name + "" + teacher.curriculums[n].curriculumsname + "γ̳ɹ");
    }
}