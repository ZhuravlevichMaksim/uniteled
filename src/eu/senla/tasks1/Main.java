package eu.senla.tasks1;

public class Main {
    static byte bByte;
    static short bShort;
    static int bInt;
    static long bLong;
    static float bFloat;
    static double bDouble;
    static char bChar;
    static boolean bBoolean;
    static String bString;

    static Byte bsByte;
    static Short bsShort;
    static Integer bsInt;
    static Long bsLong;
    static Float bsFloat;
    static Double bsDouble;
    static Character bsChar;
    static Boolean bsBoolean;


    public static void main(String[] args) {

        Number number = new Number();

        number.setaByte((byte) 124);
        System.out.println("byte:"+number.getaByte());

        number.setaShort((short) 775);
        System.out.println("short:"+number.getaShort());

        number.setaInt(456787);
        System.out.println("int:"+number.getaInt());

        number.setaLong(98998);
        System.out.println("long:"+number.getaLong());

        number.setaFloat((float) 8780.989);
        System.out.println("float:"+number.getaFloat());

        number.setaDouble((double) 4353.989);
        System.out.println("double:"+ number.getaDouble());

        number.setaBoolean((boolean) false);
        System.out.println("boolean:"+ number.isaBoolean());

        number.setaChar((char) 'f');
        System.out.println("char:"+ number.getaChar());

        byte a=23;
        short b=1456;
        int c=132445457;
        long d=18797809;
        float e=3899.4f;
        double f=88.2;
        char j='n';
        boolean h=false;
        int s=a;
        int n=b;
        byte m = number.getaByte();
        int ln= (int) d;
        long z = c;
        int fl=(int) e;

        System.out.println(s);
        System.out.println(n);
        System.out.println(m);
        System.out.println(z);
        System.out.println(fl);



}
}
