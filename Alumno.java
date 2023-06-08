public class Alumno {

  private String nombre;
  private String numero;
  private String grupo;
  private String carrera;
  private double calificacion1;
  private double calificacion2;
  private double calificacion3;

  public Alumno(
    String numero,
    String name,
    String carrera,
    String grupo,
    double calificacion1,
    double calificacion2,
    double calificacion3
  ) {
    this.carrera = carrera;
    this.grupo = grupo;
    this.numero = numero;
    this.nombre = name;
    this.calificacion1 = calificacion1;
    this.calificacion2 = calificacion2;
    this.calificacion3 = calificacion3;
  }

  public String getnumero() {
    return numero;
  }

  public String getnombre() {
    return nombre;
  }

  public void setnombre(String nombre) {
    this.nombre = nombre;
  }

  public void setnumero(String numero) {
    this.numero = numero;
  }

  public void setcalificacion1(double calificacion1) {
    this.calificacion1 = calificacion1;
  }

  public void setcalificacion2(double calificacion2) {
    this.calificacion2 = calificacion2;
  }

  public void setcalificacion3(double calificacion3) {
    this.calificacion3 = calificacion3;
  }

  public void setgrupo(String grupo) {
    this.grupo = grupo;
  }

  public void setcarrera(String carrera) {
    this.carrera = carrera;
  }

  public String getgrupo() {
    return grupo;
  }

  public String getcarrera() {
    return carrera;
  }

  public double getpromedio() {
    return (calificacion1 + calificacion2 + calificacion3) / 3;
  }

  public String toString() {
    return (
      "alumno:" +
      this.nombre +
      "\nnumero de cuenta:" +
      this.numero +
      "\ncarrera:" +
      this.carrera +
      "\ngrupo:" +
      this.grupo +
      "\ncalificacion 1:" +
      this.calificacion1 +
      "\ncalificacion 2:" +
      this.calificacion2 +
      "\ncalificacion 3:" +
      this.calificacion3 +
      "\npromedio:" +
      this.getpromedio()
    );
  }

  public String toCSV() {
    return (
      this.nombre +
      "," +
      this.numero +
      "," +
      this.carrera +
      "," +
      this.grupo +
      "," +
      this.calificacion1 +
      "," +
      this.calificacion2 +
      "," +
      this.calificacion3 +
      "," +
      this.getpromedio()
    );
  }
}
