package segundocodigo;
    public class main {
        private String nombre;
        private String matricula;
        private String grupo;
        private String carrera;
        private double calificacion1;
        private double calificacion2;
        private double calificacion3;
        private double calificacion4;
        private double promedio;
    
        public main(String matricula, String nombre, String grupo, String carrera, double calificacion1, double calificacion2, double calificacion3, double calificacion4) {
            this.nombre = nombre;
            this.matricula = matricula;
            this.grupo = grupo;
            this.carrera = carrera;
            this.calificacion1 = calificacion1;
            this.calificacion2 = calificacion2;
            this.calificacion3 = calificacion3;
            this.calificacion4 = calificacion4;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getMatricula() {
            return matricula;
        }
    
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    
        public String getGrupo() {
            return grupo;
        }
    
        public void setGrupo(String grupo) {
            this.grupo = grupo;
        }
    
        public String getCarrera() {
            return carrera;
        }
    
        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }
    
        public double getCalificacion1() {
            return calificacion1;
        }
    
        public void setCalificacion1(double calificacion1) {
            this.calificacion1 = calificacion1;
        }
    
        public double getCalificacion2() {
            return calificacion2;
        }
    
        public void setCalificacion2(double calificacion2) {
            this.calificacion2 = calificacion2;
        }
    
        public double getCalificacion3() {
            return calificacion3;
        }
    
        public void setCalificacion3(double calificacion3) {
            this.calificacion3 = calificacion3;
        }
    
        public double getCalificacion4() {
            return calificacion4;
        }
    
        public void setCalificacion4(double calificacion4) {
            this.calificacion4 = calificacion4;
        }
    
        public double getPromedio() {
            return promedio;
        }
    
        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }
    
        public double promedio() {
            return (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;
        }
    
        public String estado() {
            if (promedio() >= 8) {
                return "Aprobado";
            } else {
                return "Reprobado";
            }
        }
    
        public String getInformacion() {
            return "Nombre: " + nombre + "\nMatricula: " + matricula + "\nGrupo: " + grupo + "\nCarrera: " + carrera + "\nCalificacion1: " + calificacion1 + "\nCalificacion2: " + calificacion2 + "\nCalificacion3: " + calificacion3 + "\nCalificacion4: " + calificacion4 + "\nPromedio: " + promedio() + "\nEstado: " + estado();
        }


        public static void main(String[] args) {
            
            main alumno1 = new main("2019-0001", "Juan Perez", "A", "ing", 9, 8, 9, 10);
            main alumno2 = new main("2019-0002", "Maria Lopez", "B", "ing", 8, 7, 8, 9);
            main alumno3 = new main("2019-0003", "Pedro Martinez", "C", "ing", 7, 6, 7, 8);
            main alumno4 = new main("2019-0004", "Luisa Garcia", "D", "ing", 6, 5, 6, 7);
            main alumno5 = new main("2019-0005", "Jose Rodriguez", "E", "ing", 5, 4, 5, 6);
            main alumno6 = new main("2019-0006", "Ana Hernandez", "F", "ing", 4, 3, 4, 5);
            main alumno7 = new main("2019-0007", "Luis Ramirez", "G", "ing", 3, 2, 3, 4);
            main alumno8 = new main("2019-0008", "Maria Torres", "H", "ing", 2, 1, 2, 3);
            main alumno9 = new main("2019-0009", "Rosa Sanchez", "I", "ing", 1, 0, 1, 2);
            main alumno10 = new main("2019-0010", "Carlos Jimenez", "J", "ing", 0, 0, 0, 0);
    
            System.out.println(alumno1.getInformacion());
            System.out.println(alumno2.getInformacion());
            System.out.println(alumno3.getInformacion());
            System.out.println(alumno4.getInformacion());
            System.out.println(alumno5.getInformacion());
            System.out.println(alumno6.getInformacion());
            System.out.println(alumno7.getInformacion());
            System.out.println(alumno8.getInformacion());
            System.out.println(alumno9.getInformacion());
            System.out.println(alumno10.getInformacion());

            




        }




    }
    