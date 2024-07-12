package day02;

public class VarDemo {
    public static void main(String[] args) {
        int num_1 = 0x00000001;
        int num_2 = 0b00000000000000000000000000000001;
        System.out.println(num_1+" and "+num_2);
        for (int i = 0; i <= 31; i++) {
            num_1 ^= (0b1 << i);
            num_2 ^= (0b1 << i);
        }
        System.out.println((num_1+1)+" and "+(num_2+1));
    }
}
