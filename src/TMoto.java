public class TMoto {
    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        Cilindrada = cilindrada;
        /**
         * AÑADO CONDICIONALES DESPUES DE PASAR EL PRIMER TEST PARA ARREGLAR POSBLES ERRORES COMO MENOR O MAYO CILINDRADA Y ASI PODER VOLVER A PASARLO
         */
        if (Cilindrada <=49){
            Cilindrada=49;
        } else if (Cilindrada>=1200) {
            Cilindrada=1200;

        }
    }

    private int Cilindrada;

    private int Marchas;
    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int ruedas) {
        Ruedas = ruedas;
        /**
         * AÑADO CONDICIONALES DESPUES DE PASAR EL PRIMER TEST PARA ARREGLAR POSBLES ERRORES COMO NO HAY RUEDAS O HAY DEMASIADAS Y ASI PODER VOLVER A PASARLO
         */
        if (Ruedas <=2){
            Ruedas=2;
        } else if (Ruedas>=4) {
            Ruedas=4;

        }
    }

    private int Ruedas;


    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.Velocidad = velocidad;
        /**
         * AÑADO CONDICIONALES DESPUES DE PASAR EL PRIMER TEST PARA ARREGLAR POSBLES ERRORES COMO MENOR O MAYOR VELOCIDAD DE LA ESPERADA Y ASI PODER VOLVER A PASARLO
         */
            if (Velocidad <=0){
                Velocidad=0;
            } else if (Velocidad >=230) {
                Velocidad=230;
            }
    }

    private int Velocidad;

    public int getMarchas() {
        return Marchas;
    }

    public void setMarchas(int marchas) {
        this.Marchas = marchas;
        /**
         * AÑADO CONDICIONALES DESPUES DE PASAR EL PRIMER TEST PARA ARREGLAR POSBLES ERRORES COMO QUE NO HAY MARCHAS O NO EXISTEN Y ASI PODER VOLVER A PASARLO
         */
        if(Marchas <=0){
            Marchas=0;
        } else if (Marchas>=6) {
            Marchas=6;
        }
    }

    public void subirmarcha() {
        /**
         * CREO EL METODO PARA SUBIR MARCHAS YA QUE EL TEST ME LO PIDE
         */
        int lamarcha;
        lamarcha=Marchas+1;
        setMarchas(lamarcha);
    }

    public void aceleracion(int Kmh) {
        /**
         * CREO EL METODO PARA ACELERAR YA QUE EL TEST ME LO PIDE
         */
        int velmas;
        velmas=Kmh+Velocidad;
        setVelocidad(velmas);
    }

    public void bajarmarcha() {
        /**
         * CREO EL METODO PARA BAJAR MARCHAS YA QUE EL TEST ME LO PIDE
         */
        int lamarcha;
        lamarcha=Marchas-1;
        setMarchas(lamarcha);
    }

    public void decelerar(int Kmh) {
        /**
         * CREO EL METODO PARA DECELERAR YA QUE EL TEST ME LO PIDE
         */
        int velmas;
        velmas=Velocidad-Kmh;
        setVelocidad(velmas);
    }
}
