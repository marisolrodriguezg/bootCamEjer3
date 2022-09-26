package bootcampejer3;

public class BootCampEjer3 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Marisol");
        persona.setEdad(32);
        persona.setNumero(261571808);
      
        System.out.println("nombre: " + persona.getNombre() + " edad: " + persona.getEdad() + " numero: "+ persona.getNumero()  );
        
    }
}

class Persona {

    private int edad;
    private String nombre;
    private long numero;

    public int getEdad() {
        return edad;
    }

    public long getNumero() {
        return numero;
    }

    

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }   

}
