import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTMoto {
    @Test
    /**
     *
     * Creamos el test y nos dice que falta la clase
     */
    public void Test_CrearTMoto(){
    TMoto nuevaTMoto=new TMoto();
        /**
         * Añado valores erroneos para futura AutoCorreccion
         */
    nuevaTMoto.setRuedas(0);
    nuevaTMoto.setCilindrada(0);
    nuevaTMoto.setMarchas(-1);
    nuevaTMoto.setVelocidad(-5);



        /**
         *Creo el atributo velociad y al ser privado creo el getter y el setter
         */
        Assertions.assertEquals(0,nuevaTMoto.getVelocidad());
        /**
         * Creo el atributo ruedas y sus getter y setters
         */
        Assertions.assertEquals(2,nuevaTMoto.getRuedas());
        /**
         * Creo el atributo marcha y sus getter y setters
         */
        Assertions.assertEquals(0,nuevaTMoto.getMarchas());
        /**
         *  Creo el atributo Cilindrada y los getter y setters
         */
        Assertions.assertEquals(49,nuevaTMoto.getCilindrada());

    }

    @Test
    public void Test_Acelero(){
        /**
         * Al ACELERAR HAY QUE SUBIR MARCHAR Y VELOCIDAD ASIQUE AL CREAR EL TEST ME PIDE CREAR LOS METODOS
         */
        TMoto nuevaTMoto=new TMoto();
        nuevaTMoto.subirmarcha();
        nuevaTMoto.aceleracion(25);
        /**
         * Despues de crear el metodo Pruebo que funcione correctamente INCLUSO TENIENDO EN MENTE LOS CONDICIONALES DE LOS SETTERS
         */
        Assertions.assertEquals(1,nuevaTMoto.getMarchas());
        Assertions.assertEquals(25,nuevaTMoto.getVelocidad());



    }
    @Test
    public void Test_Decelero(){
        /**
         * Al DECELERAR HAY QUE BAJAR MARCHAS Y VELOCIDAD ASIQUE AL CREAR EL TEST ME PIDE CREAR LOS METODOS
         */
        TMoto nuevaTMoto=new TMoto();
        nuevaTMoto.aceleracion(50);
        nuevaTMoto.subirmarcha();
        nuevaTMoto.subirmarcha();
        nuevaTMoto.bajarmarcha();
        nuevaTMoto.decelerar(30);
        /**
         * COMPRUEBO QUE LA MARCHA SE QUEDA EN 1 Y QUE LA VELOCIDAD BAJA A 20
         */
        Assertions.assertEquals(1,nuevaTMoto.getMarchas());
        Assertions.assertEquals(20,nuevaTMoto.getVelocidad());
    }

    /**
     * Al pasar los Test REFACTORIZO LO NECESARIO
     */

}
