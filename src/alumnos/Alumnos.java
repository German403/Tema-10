package alumnos;

public class Alumnos {
    private String nombre;
    private String apellido;
    private int numero;

    public Alumnos(){

    }

    public Alumnos(String nombre, String apellido, int numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    //Metodos getter & setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }
     
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Metodos propios
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumeros:");
        sb.append(numero);
        sb.append("\nNombre:");
        sb.append(nombre);
        sb.append("\nApellidos");
        sb.append(apellido);
        return sb.toString();
    }
}
