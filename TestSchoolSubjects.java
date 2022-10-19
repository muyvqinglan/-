package Xuanke;

import java.util.Scanner;

public class TestSchoolSubjects {
    public void menu1() {
        System.out.println("欢迎使用选课系统！" + "\n" + "菜单：" + "\n" + "1.教师登录" + "\n" + "2.学生登陆" + "\n" + "请输入1/2选择登陆方式");
    }

    public void menu2() {
        System.out.println("欢迎使用选课系统" + "\n" + "菜单：" + "\n" + "1.选课操作" + "\n" + "2.退课操作" + "\n" + "请输入1/2选择操作类型");
    }

    public void reportError() {
        System.out.println("输入有误，程序终止");
    }

    public void fengexian() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("-----");
        }
        ;
        System.out.println();
    }

    public static void main(String[] args) {
        TestSchoolSubjects TS = new TestSchoolSubjects();
        Scanner input = new Scanner(System.in);
        Curriculums gaoshu = new Curriculums(1, "高数", "教101", "8:00");
        Curriculums wuli = new Curriculums(2, "物理", "教106", "13:00");
        Curriculums dianlu = new Curriculums(3, "模拟电路", "教201", "14:00");
        Curriculums xiandai = new Curriculums(4, "线性代数", "教202", "15:00");
        Curriculums lisan = new Curriculums(5, "离散数学", "教203", "16:00");
        Curriculums wulishiyan = new Curriculums(6, "马克思主义基本原理", "jiao204", "17:00");
        Curriculums moren1[] = new Curriculums[6];
        Curriculums moren2[] = new Curriculums[6];
        Teachers Mrwang = new Teachers(1, "王老师", "男", moren1);
        Students StdWang = new Students(1, "小王", "男", moren2);
        int x = 0;
        while (true) {
            TS.fengexian();
            if (x == 0) {
                System.out.println("欢迎使用选课系统" + "\n" + "未有教师开设课程，本次为开课操作" + "\n" + "正在进行开课操作!");
                TS.fengexian();
                System.out.println("可开课程为:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                        + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname + "\n"
                        + wulishiyan.curriculumsname + "   从上到下依次为0-5");
                TS.fengexian();
                System.out.println("选择想开设的课程：");
                int z = input.nextInt();
                Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                Mrwang.openCurriculums(Mrwang, z, moren[z]);
                moren[z].curriculumsTeacher = "王老师";
                TS.fengexian();
                System.out.println("是否继续?" + "\n" + "1.继续" + "\n" + "2.结束");
                TS.fengexian();
                x = input.nextInt();
                if (x == 1) {
                    continue;
                }
                TS.fengexian();
                break;
            } else {
                TS.menu1();
                TS.fengexian();
                x = input.nextInt();
                if (x == 1) {
                    System.out.println("正在开课!");
                    TS.fengexian();
                    System.out.println("可开课程为:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                            + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname
                            + "\n" + wulishiyan.curriculumsname + "   从上到下依次为0-5");
                    TS.fengexian();
                    System.out.println("输入想开设的课程");
                    int z = input.nextInt();
                    Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                    Mrwang.openCurriculums(Mrwang, z, moren[z]);
                    moren[z].curriculumsTeacher = "王老师";
                } else if (x == 2) {
                    TS.fengexian();
                    TS.menu2();
                    TS.fengexian();
                    int s = input.nextInt();
                    if (s == 1) {
                        TS.fengexian();
                        System.out.println("正在选课!");
                        TS.fengexian();
                        System.out.println("可开课程为:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                                + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname
                                + "\n" + wulishiyan.curriculumsname + "   从上到下依次为0-5");
                        TS.fengexian();
                        Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                        int j = input.nextInt();
                        StdWang.choiceCurriculums(StdWang, j, moren[j]);
                    } else if (s == 2) {
                    	System.out.println("正在退课!");
                        TS.fengexian();
                        int p = input.nextInt();
                        StdWang.outCurriculums(StdWang, p);
                    } else {
                        TS.fengexian();
                        TS.reportError();
                        TS.fengexian();
                        break;
                    }
                    TS.fengexian();
                    System.out.println("选课结束，正在打印选课信息");
                    System.out.println("学生姓名:" + StdWang.name + "\n" + "所选课程:" + "\n");
                    for (int i = 0; i < 6; i++) {
                        if (StdWang.curriculums[i] == null) {
                            continue;
                        }
                        System.out.print(StdWang.curriculums[i].number + "丨" + StdWang.curriculums[i].curriculumsname
                                + "丨" + StdWang.curriculums[i].place + "丨" + StdWang.curriculums[i].Classtime + "丨"
                                + StdWang.curriculums[i].curriculumsTeacher + "\n");
                    }
                    TS.fengexian();
                } else {
                    TS.fengexian();
                    TS.reportError();
                    TS.fengexian();
                    break;
                }
            }
            ;
            System.out.println("是否继续?" + "\n" + "1.继续" + "\n" + "2.结束");
            TS.fengexian();
            int y = input.nextInt();
            if (y == 1) {
                continue;
            } else if (y == 2)
                break;
            else {
                TS.fengexian();
                TS.reportError();
                TS.fengexian();
                break;
            }
        }
        input.close();
    }

}