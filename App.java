import java.util.Scanner;
public class App {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Ingrese la cantidad de alumnos:");
      int cantidad = sc.nextInt();
      Alumno[] alumnos = new Alumno[cantidad];

      for (int i = 0; i < cantidad; i++) {
        sc.nextLine();
        System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
        String nombre = sc.nextLine();
        System.out.println(
          "Ingrese el número de cuenta del alumno " + (i + 1) + ":"
        );
        String numero = sc.nextLine();
        System.out.println("Ingrese el grupo del alumno " + (i + 1) + ":");
        String grupo = sc.nextLine();
        System.out.println("Ingrese la carrera del alumno " + (i + 1) + ":");
        String carrera = sc.nextLine();
        System.out.println(
          "ingrese las calificaciones del alumno " + (i + 1) + ":"
        );
        double calificacion = sc.nextDouble();
        double calificacion2 = sc.nextDouble();
        double calificacion3 = sc.nextDouble();

        alumnos[i] =
          new Alumno(
            numero,
            nombre,
            carrera,
            grupo,
            calificacion,
            calificacion2,
            calificacion3
          );
      }

      while (true) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Mostrar todos los alumnos");
        System.out.println("2. Buscar un alumno por número de cuenta");
        System.out.println("3. Salir");
        System.out.println("4.mostrar calificaciones del alumnos");  

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
          case 1:
            for (int i = 0; i < cantidad; i++) {
              System.out.println(alumnos[i].toString());
            }
            break;
          case 2:
            System.out.println(
              "Ingrese el número de cuenta del alumno a buscar:"
            );
            String numero = sc.nextLine();
            for (int i = 0; i < cantidad; i++) {
              if (alumnos[i].getnumero().equals(numero)) {
                System.out.println(alumnos[i].toString());
                break;
              }
              if (i == cantidad - 1) {
                System.out.println(
                  "No se encontró un alumno con ese número de cuenta."
                );
              }
            }
            break;
          case 3:
            System.out.println("Saliendo del programa...");
            System.exit(0);
            break;
          default:
            System.out.println("Opción no válida.");
            break;

          case 4:
          System.out.println("ingrese el numero de cuenta del alumno");
          String numero2 = sc.nextLine();
          for (int i = 0; i < cantidad; i++) {
            if (alumnos[i].getnumero().equals(numero2)) {
              System.out.println(alumnos[i].getpromedio());
              break;
            }
            if (i == cantidad - 1) {
              System.out.println("No se encontró un alumno con ese número de cuenta.");
            }
          }
          break; 
        }
      }
    }
  }  
}
