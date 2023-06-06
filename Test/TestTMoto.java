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
         *Creo el atributo velociad y al ser privado creo el getter y el setter
         */
        Assertions.assertEquals(0,nuevaTMoto.getVelocidad());

    }

}
