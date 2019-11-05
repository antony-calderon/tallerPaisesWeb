package paises;


public class Pais {
    ////////////los atributos de mis paises/////////////////
   private String nombre;
   private String capital;
   private String gentilicio;
   private String moneda;
   private String idioma;

   /////////////constructor normal de mis paises////////////////
    public Pais() {
    }

    /////////////constructor sobrecargado de mis paises/////////////////
    public Pais(String nombre, String capital, String gentilicio, String moneda, String idioma) {
        this.nombre = nombre;
        this.capital = capital;
        this.gentilicio = gentilicio;
        this.moneda = moneda;
        this.idioma = idioma;
    }

   
   /////////encapsulamiento, get y set para los atributos////////////////
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * @return the gentilicio
     */
    public String getGentilicio() {
        return gentilicio;
    }

    /**
     * @param gentilicio the gentilicio to set
     */
    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
   
   
}
