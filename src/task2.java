import java.util.Scanner;
class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num=new int[8];

        System.out.print("Enter your 8 numbers: ");
        for (int i=0; i<num.length; i++){
            num[i]=sc.nextInt();
        }
        int largest=num[0];
        int smallest=num[0];
        int largestindex=0;
        int smallestindex=0;

        for( int i=1; i<num.length; i++){

                if(num[i]>largest){
                    largest=num[i];
                    largestindex=i+1;

                }
                if(num[i]<smallest || num[i]==smallest){
                    smallest=num[i];
                    smallestindex=i+1;
                }
                }


        System.out.println("Largest: "+largest+" at index "+largestindex);
        System.out.println("Smallest: "+smallest +" at index "+smallestindex);




    }}



