import java.util.Date;

public class TestDate2 {
    public static void main (String []args)     {
        Date fecha1, fecha2;
        long diferencia = 0;
        fecha1 = new Date(112,7,1,10,30,15);
        fecha2 = new Date(112,7,7,18,25,12);
        diferencia = fecha2.getTime()-fecha1.getTime();
        System.out.println("Diferencias en dias: "+diferencia/(3600000*24));
    }
}
