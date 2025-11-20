
import tmPkBiotech.tmPkProterozoico.tmTurtles;

public class tmAppBiotech {
    
    public static void imprimirMutacion(String animal, String apellido) {
        int radonActual = (int)(Math.random() * 901) + 100;
        int radonTotal = (int)(Math.random() * 901) + 100;
        System.out.println("Mutación en proceso: ----------------------------- " + radonActual + " de " + radonTotal + " (mSv)");
        System.out.println("|-");
        System.out.println("|---------------- " + animal);
        System.out.println("|---------------- " + animal + apellido);
    }

    public static void animacionCargaImpar() {
        System.out.println("Animación de carga:");
        for (int i = 0; i <= 100; i += 10) {
            System.out.print("o0o " + i + "%\r");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void iniciarSistema() {
        animacionCargaImpar();

        // Instanciar o crear los objetos todas las clases de tmPkProterozoico
        tmPkBiotech.tmPkProterozoico.tmGnathostomata gnathostomata = new tmPkBiotech.tmPkProterozoico.tmGnathostomata();
        tmPkBiotech.tmPkProterozoico.tmOsteichyes osteichyes = new tmPkBiotech.tmPkProterozoico.tmOsteichyes();
        tmPkBiotech.tmPkProterozoico.tmSarcopterygil sarcopterygil = new tmPkBiotech.tmPkProterozoico.tmSarcopterygil();
        tmPkBiotech.tmPkProterozoico.tmTetrapoda tetrapoda = new tmPkBiotech.tmPkProterozoico.tmTetrapoda();
        tmPkBiotech.tmPkProterozoico.tmAminota aminota = new tmPkBiotech.tmPkProterozoico.tmAminota();

        // Crear una instancia de tmTurtles
        tmTurtles miTortuga = new tmTurtles();
        miTortuga.setNombre("Dalila");
        System.out.println("El nombre de la tortuga es: "  + miTortuga.getNombre());
        System.out.println(miTortuga.comer());
        System.out.println();
        
        // Validar mutación
        tmPkBiotech.tmMutacion mutacion = new tmPkBiotech.tmMutacion();
        boolean resultado = mutacion.validarMutacion("tortuga", "Montaluisa");
        if (resultado) {
            imprimirMutacion(miTortuga.getNombre(), "Montaluisa");
        } else {
            System.out.println("Mutación fallida");
        }
    }

    public static void main(String[] args) {
        iniciarSistema();
    }
}
