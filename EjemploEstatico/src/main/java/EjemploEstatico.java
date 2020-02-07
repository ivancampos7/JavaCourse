public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println(persona1);
        
        Persona persona2 = new Persona("Karla");
        System.out.println(persona2);
        
        System.out.println("contadorPersonas:" + Persona.getContadorPersonas());
    }
}
