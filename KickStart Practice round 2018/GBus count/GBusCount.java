import java.util.Scanner;

public class GBusCount {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int testcase=s.nextInt();
        for(int i=0;i<testcase;i++){
            System.out.print("Case #"+(i+1)+": ");
            int count=0;
            int n=s.nextInt();
            int a[][]=new int[n][2];
            for(int x=0;x<n;x++){
                for(int y=0;y<2;y++){
                    a[x][y]=s.nextInt();
                }
            }
            int p=s.nextInt();
            int b[]=new int[p];
            for(int x=0;x<p;x++)
            {
                b[x]=s.nextInt();
            }
            for(int z=0;z<p;z++){
                count=0;
                    for(int x=0;x<n;x++){
                        if(b[z]>=a[x][0] && b[z]<=a[x][1]){
                            count++;
                            
                        }
                    }
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    
}
