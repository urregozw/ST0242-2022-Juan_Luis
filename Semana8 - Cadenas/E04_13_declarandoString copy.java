public class PrincipalString{
    
    public static void main(String args[]){
        String msj = "Bienvenido al curso 035";
        System.out.println(msj);
        PrincipalString.cambio(msj);
        System.out.println(msj);
    }

    public static void cambio(String m){
        m = "Bienvenido a EAFIT";
    }
}

