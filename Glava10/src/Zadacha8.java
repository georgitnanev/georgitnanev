import java.util.Scanner;

public class Zadacha8 {
    public static void set(int[] temp,int sum){
        int n=temp.length;

        for (int i = 0; i < (1<<n); i++)
        {  int sumTwo=0;
            int count=0;
            for (int j = 0; j < n; j++)

                if ((i & (1 << j)) > 0) {
                    System.out.print(temp[j] + " ");
                    sumTwo=sumTwo+temp[j];
                    count++;
                }
            if(sum==sumTwo){
                System.out.println(" = "+" sum :"+sumTwo +" with "+count+" element(s)");
            } else {
                System.out.println(",");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+i+" element value of array : ");
            a[i]=sc.nextInt();
            System.out.println();
        }
        System.out.println("Enter sum : ");
        sum=sc.nextInt();
        set(a,sum);
    }
}
