public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan",5000, false);
        System.out.println("Nombre persona = " + persona.getNombre());
        
        persona.setNombre("Carlos");
        System.out.println("Nombre persona = " + persona.getNombre());
        
    }
}
