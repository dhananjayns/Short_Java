package java9;
import java.util.*;
import java9.*;


public class raw{
	Scanner scan=new Scanner(System.in);
	public static int input(String data,int value){
		Scanner scan=new Scanner(System.in);
		System.out.println(data);
		int v=scan.nextInt();
		return v;
	}

	public static String input(String data,String value){
		Scanner scan=new Scanner(System.in);
		System.out.println(data);
		String v=scan.nextLine();
		return v;
	}
	
	public static double input(String data,double value)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        double v;
        v = key.nextDouble();
        return v;
    }
    public static float input(String data,float value)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        float v;
        v = key.nextFloat();
        return v;
    }
    public static byte input(String data,byte value)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        byte v;
        v=key.nextByte();
        return v;
    }
    public static short input(String data,short value)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        short v;
        v = key.nextShort();
        return v;
    }
    public static long input(String data,long value)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        long v;
        v = key.nextLong();
        return v;
    }


}