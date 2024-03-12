public class MathOperations {

    
    public int add(int a, int b) {
        return a + b;
    }

   
    public double add(double a, double b, double c) {
        return a + b + c;
    }

   
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

       
        int sumIntegers = mathOps.add(5, 7);
        System.out.println("Sum of two integers: " + sumIntegers);

      
        double sumDoubles = mathOps.add(2.5, 3.7, 1.8);
        System.out.println("Sum of three doubles: " + sumDoubles);

       
        String resultString = mathOps.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + resultString);
    }
}
