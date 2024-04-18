
        
package com.mycompany.horadosistema;

import java.util.Calendar;
import java.util.Date;
import javax.xml.crypto.Data;

public class HoraDoSistema {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        Data relogio = (Data) new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());*/
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println("Year: "+ year);
    }
}
