class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        /*
            if(condición) { BLOQUE DE CODIGO }
            else { BLOQUE DE CODIGO }
        */
        
        int edad = 23;
        
        if(edad > 18) {
            System.out.println("Puedes ingresar a la fiesta");
        } else {
            System.out.println("No puedes ingresar a la fiesta");
        }
        
        /*
            for(inicialización; condición; aumento/decremento) {
                Blopque de codigo
            }
        */
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Renso");
        }
        
        /*
            while(condicion) {
                BLOQUE DE CODIGO
            }
        */
        
        int vidas_del_jugador = 3;
        while(vidas_del_jugador > 0) {
            System.out.println("El jugador aun sigue vivo tiene " + vidas_del_jugador + " vidas");
            
            // !IMPORTANTE!
            vidas_del_jugador = vidas_del_jugador - 1;
        }
        
        
    }
}