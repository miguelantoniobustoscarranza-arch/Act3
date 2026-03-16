
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Miguel", 22, "Ingeniería");
        Estudiante e2 = new Estudiante("Ana", 20, "Matemáticas");

        e1.mostrarInfo();
        e2.mostrarInfo();

        e1.actualizarCarrera("Física");
        e1.mostrarInfo();
    }
}