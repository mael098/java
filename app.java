public class app {
    private String numero;
    private String name;
    private String grupos;
    private String carrera;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double calificacionFinal;
    
    public app(String numero, String name, String grupos, String carrera, double calificacion1, double calificacion2, double calificacion3, double calificasionFinal){
    this.numero = numero;
    this.name = name;
    this.grupos = grupos;
    this.carrera = carrera;
    this.calificacion1 = calificacion1;
    this.calificacion2 = calificacion2;
    this.calificacion3 = calificacion3;
    this.calificacionFinal = calificacionFinal;
    }

    public String getNumero(){
        return numero;
    }
    public String getName(){
        return name;
    }
    public String getGrupos(){
        return grupos;
    }
    public String getCarrera(){
        return carrera;
    }
    public double getCalificacion1(){
        return calificacion1;
    }
    public double getCalificacion2(){
        return calificacion2;
    }
    public double getCalificacion3(){
        return calificacion3;
    }
    public double getCalificacionFinal(){
        return calificacionFinal;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setGrupos(String grupos){
        this.grupos = grupos;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setCalificacion1(double calificacion1){
        this.calificacion1 = calificacion1;
    }
    public void setCalificacion2(double calificacion2){
        this.calificacion2 = calificacion2;
    }
    public void setCalificacion3(double calificacion3){
        this.calificacion3 = calificacion3;
    }
    public void setCalificacionFinal(double calificacionFinal){
        this.calificacionFinal = calificacionFinal;
    }
    public double promedio(){
        return (calificacion1 + calificacion2 + calificacion3)/3;
    }
    public double calificacionFinal(){
        return (promedio() + calificacionFinal)/2;
    }
    public String toString(){
        return "Numero de control: " + numero + "   Nombre: " + name + "   Grupo: " + grupos + "   Carrera: " + carrera + "   Calificacion 1: " + calificacion1 + "   Calificacion 2: " + calificacion2 + "   Calificacion 3: " + calificacion3 + "   Calificacion Final: " + calificacionFinal;

    
}
// Path: main.java
    

}
