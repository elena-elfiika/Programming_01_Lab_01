/* Ряд простых чисел 2, 
3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 
89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 
179, 181, 191, 193, 197, 199 */

public class Lab_01_Main {
    public static void main(String[] args) {
        // Счётчик пар
        int n = 30;
        // Первые простые числа
        int a = 5, b = 3;
        // Делитель
        int d;
        
        System.out.println(n + " первых пар простых чисел:");
        
        do {
            d = (int) (Math.sqrt(a));

            for (int kva = 3; kva <= d + 1; kva += 2){
                if (a % kva == 0){
                    break;
                } else {
                    if (kva + 1 > d){
                        if (b == a - 2){
                            System.out.println(b + " и " + a);
                            // System.out.println(a + " = a; " + d + " = d; kva = " + kva);
                            n -= 1;
                        }
                        b = a;
                    }
                }
            }
            a += 2;

        } while (n!=0);
    }
}