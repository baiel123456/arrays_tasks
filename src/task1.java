import java.lang.reflect.Array;
import java.util.Scanner;
class task1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] num=new int[10];
        System.out.print("Enter numbers: ");
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0; i<10; i++){
            num[i] = sc.nextInt();
            if(num[i]>0){
                pos+=1;
            }
            else if(num[i]<0){
                neg+=1;
            }
            else if(num[i]==0){
                zero+=1;
            }








        }





        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);



    }}