import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("input your row");
        int rows = sc.nextInt();
        System.out.println("input your column");
        int column = sc.nextInt();
        
        
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < rows; j++){
        //         if ((i == 0 && j == 0) || (i == 0 && j == rows-1)) {
        //             System.out.print("-");
        //         }else if ((i == rows-1 && j == 0) || (i == rows-1 && j == rows-1)) {
        //             System.out.print("-");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
        for(int i = 0; i < rows; i++){
            for(int j = 1; j <= column; j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
}