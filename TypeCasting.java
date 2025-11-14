public class TypeCasting{
    public static void main (String args[]){
        byte b = 127;
        int a = b;
        byte k = (byte)a;
        System.out.println(k);
        float f = 5.6f;
        int t = (int)f;
        System.out.println(t);
    }
}