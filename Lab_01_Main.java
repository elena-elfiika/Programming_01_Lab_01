public class Lab_01_Main {
    public static void main(String[] args) {
        // Счётчик пар
        int n = 15;
        // Первые простые числа
        int a = 5, b = 3;
        int kva;
        // Делитель
        double d;
        
        System.out.println(n + " первых пар простых чисел:");
        
        do {
            d = Math.sqrt(a);

            for (kva = 3; kva <= d ; kva += 2){
                
                if (a % kva == 0){
                    break;
                }
            }

                if (kva > d){
                    if (b == a - 2){
                        System.out.println(b + " и " + a);
                        // System.out.println(a + " = a; " + d + " = d; kva = " + kva);
                        n -= 1;
                    }
                    b = a;
                    
                }
            
            a += 2; 
            

        } while (n!=0);
    }
}