import java.util.*;
public class initialize {
    public static void init(int a[]) {
        Scanner in= new Scanner(System.in);
        int n=a.length;
             for(int i=0;i<n;i++)
             {
                 a[i]=new int[];
                 a[i]=in.nextInt();
    }}
    public static void print(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }

}
