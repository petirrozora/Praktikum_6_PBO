package Pertemuan6;

public class Matriks {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    System.out.print((j == 0 ? "   " : j + "  "));
                } else {             
                    System.out.print((j == 0 ? i + "  " : (i * j) + "  "));
                }
            }
            System.out.println();
        }
    }
}