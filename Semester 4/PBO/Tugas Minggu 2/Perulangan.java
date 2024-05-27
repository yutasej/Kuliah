public class Perulangan{
    public static void main(String[] args) {
        int a, i;

        for (a = 1; a <= 5; a++){
            System.out.println(a+ " ");
        }
        System.out.println("===========================");
        for (a = 1; a <= 5; a++){
            for(i = 1; i <=a; i++){
                System.out.print(i+ " ");
            } 
            System.out.println("\n");
        }
        System.out.println("===========================");
        for (a = 1; a <= 5; a++){
            for(i = 0; i <=5 - a; i++){
                System.out.print((i + a) + " ");
            } 
            System.out.println("\n");
        }
    } 
}