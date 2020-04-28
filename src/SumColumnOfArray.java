import java.util.Scanner;

public class SumColumnOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so cot muon tinh tong");
        int k= sc.nextInt()-1;
        double[][] array = new double[5][5];
        for (int i =0;i< array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                array[i][j]= Math.floor(Math.random()*100);
            }
        }
        for (int m =0; m< array.length;m++){
            for (int n =0; n< array[m].length;n++){
                System.out.print(array[m][n] + "\t");
            }
            System.out.print("\n");
        }
        double sum = SumColumnOfArray(array,k);
        System.out.println(sum);


    }
    public static double SumColumnOfArray(double[][]array,int n){
        double sum =0 ;
        for (int i=0;i< array.length;i++){
            for (int j =0;j< array[i].length;j++){
               if (j ==n){sum+= array[i][j];}
            }
        }
        return sum;

    }
}
