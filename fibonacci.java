import java.util.*;
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=0,b=1,c,i,n;
        System.out.println("Enter the range till u want to print : ");
        n=in.nextInt();
        System .out.println(a);
        System .out.println(b);
        for(i=1;i<=n;i++)
        {
            c=a+b;
            System .out.println(c);
            a=b;
            b=c;
        }
    }
}