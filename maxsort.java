import java.util.Scanner;
public class maxsort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n= sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int tmp=0;
        int c=0;
        for (int l= 0;l <k ; l++) {
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar.length - 1; j++) {
                    if (ar[j] > ar[j + 1]) {
                        tmp = ar[j];
                        ar[j] = ar[j + 1];
                        ar[j + 1] = tmp;
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}