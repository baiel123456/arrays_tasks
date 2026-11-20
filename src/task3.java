import java.util.Scanner;
class task3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum=0;

        double[] num=new double[6];
        System.out.println("Array: ");
        for (int i=0; i<num.length; i++){
            num[i]=sc.nextInt();
            sum+=num[i];
        }
        double average=0;
        double aboveaverage=0;
        average=sum/ num.length;
        for(int i=0; i< num.length; i++){
            sum+=num[i];
            if(num[i]>average){
                aboveaverage+=1;
            }

        }
        System.out.println("Average: "+ average );
        System.out.println("Numbers above average: "+aboveaverage);

    }}