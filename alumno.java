public class alumno {
    private String nombre;
    private String numero;
    private String grupo;
    private String carrera;
    private double calificacion1 = 0;
    private double calificacion2 =0;
    private double calificacion3 =0;

    public alumno(String numero ,String name){
        this.numero = numero;
        this.nombre = name;
    }
    public alumno(String carrera , String grupo , String numero , String name){
        this.carrera = carrera;
        this.grupo = grupo;
        this.numero = numero;
        this.nombre = name;
    }
    public String getnumero(){
        return numero;
    }
    public String getnombre(){
        return nombre;
    }
    public void setgrupo(String grupo){
        this.grupo = grupo;
    }
    public  void setcarrera(String carrera){
        this.carrera = carrera;
    }
    public String getgrupo(){
        return grupo;
    }
    public String getcarrera(){
        return carrera;
    }
    public double getpromedio(){
        return (calificacion1 + calificacion2 + calificacion3)/3;
    }
    public String toString(){
        return 
        "alumno:"+ this.nombre+
        "\nnumero de cuenta:"+ this.numero+
        "\ncarrera:"+ this.carrera+
        "\ngrupo:"+ this.grupo+
        "\ncalificacion 1:"+ this.calificacion1+
        "\ncalificacion 2:"+ this.calificacion2+
        "\ncalificacion 3:"+ this.calificacion3+
        "\npromedio:"+ this.getpromedio();
    }
    public String toCSV() {
        return this.nombre + "," + this.numero + "," + this.carrera + "," + this.grupo + "," + this.calificacion1 + "," + this.calificacion2 + "," + this.calificacion3 + "," + this.getpromedio();
    }
    public void setnombre(String nombre2) {
    }
    

}

    

