
package servlets;

import static java.lang.System.out;


public class PesosFranco implements IConversorMoneda{
    @Override
    public void convertir(){
        out.print("<h2>Franco...</h2>");
    }
}
