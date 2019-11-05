
package servlets;

import static java.lang.System.out;


public class PesosLibra implements IConversorMoneda{

    @Override
    public void convertir() {
        out.print("<h2>libra...</h2>");
    }
    
}
