package HomeWork;

public class Day03 {
    public static void main(String[] args) {
        //--------
        System.out.println(10 % 2);
        System.out.println(9 % 2);
        int a_1 = 5, a_2 = 10;
        a_1++;
        ++a_2;
        int a_3 = a_1++;
        int a_4 = ++a_2;
        System.out.println(a_1);
        System.out.println(a_3);
        System.out.println(a_3);
        System.out.println(a_4);

        //--------
        int b_1 = 5;
        int b_2 = 10;
        System.out.println(b_1 < b_2);
        System.out.println(b_1 > b_2);
        System.out.println(b_1 <= b_2);
        System.out.println(b_1 >= b_2);
        System.out.println(b_1 == b_2);
        System.out.println(b_1 != b_2);

        System.out.println(b_1 + b_2 == 15);
        System.out.println(b_1 - b_2 != 5);
        System.out.println(b_2 % b_1 == 0);
        System.out.println(b_1++ != 6);
        System.out.println(b_1 == 6);

        //--------
        int c_1 = 5, c_2 = 10, c_3 = 15;
        System.out.println((c_3 == c_1 + c_2) && (c_1 == c_2));
        System.out.println((c_3 != c_1 + c_2) && (c_1 != c_2));
        System.out.println((c_3 == c_1 + c_2) && (c_1 != c_2));
        System.out.println((c_3 != c_1 + c_2) && (c_1 == c_2));

        System.out.println((c_3 == c_1 + c_2) || (c_1 == c_2));
        System.out.println((c_3 != c_1 + c_2) || (c_1 != c_2));
        System.out.println((c_3 == c_1 + c_2) || (c_1 != c_2));
        System.out.println((c_3 != c_1 + c_2) || (c_1 == c_2));

        System.out.println(!(c_3 != c_1 + c_2));
        System.out.println(!(c_1 != c_2));

        int temp = 5;
        System.out.println((c_1 == c_2) && (temp++ == 5));
        System.out.println(temp);
        System.out.println((c_1 != c_2) || (temp++ == 5));
        System.out.println(temp);

        //--------
        int d_1 = 5;
        d_1 += 5;
        d_1 -= 5;
        d_1 *= 6;
        d_1 /= 3;
        d_1 %= 3;
        short s = 10;
        s += 10;//s = (short) (s + 10);

        //--------
        int age = 24;
        String name = "小明";
        System.out.println("姓名：" + name + " 年龄：" + age);
        System.out.println(10 + "" + 20 + 30);//102030
        System.out.println(10 + 20 + "" + 30);//3030
        System.out.println(10 + 20 + 30 + "");//60

        //--------
        int e_1 = 10;
        int flag = e_1 > 0 ? 1 : 0;
        int e_2 = 15;
        int max = e_1 > e_2 ? e_1 : e_2;
        System.out.println("max = " + max);

        //--------
        int f_1 = 550;
        if (f_1 >= 500) {
            f_1 *= 0.8;
        }
        int f_2 = 95;
        if ((f_2 <= 100) && (f_2 >= 0)) {
            System.out.println("Legal");
        } else {
            System.out.println("Not Legal");
        }

        //--------
        int g_1 = 550;
        if (g_1 >= 500) {
            g_1 *= 0.8;
        } else {
            g_1 *= 0.9;
        }

        int g_2 = 95;
        if ((g_2 <= 100) && (g_2 >= 0)) {
            System.out.println("Legal");
        } else {
            System.out.println("Not Legal");
        }

        //--------
        int h_1 = 2100;
        if (h_1 >= 2000) {
            h_1 *= 0.5;
        } else if (h_1 >= 1000) {
            h_1 *= 0.7;
        } else if (h_1 >= 500) {
            h_1 *= 0.8;
        } else if (h_1 >= 0) {
            h_1 *= 0.9;
        } else {
            System.out.println("Not Legal");
        }
    }
}
