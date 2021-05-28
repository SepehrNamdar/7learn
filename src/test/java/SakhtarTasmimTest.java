import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class SakhtarTasmimTest {
    @Test
    void if_else() {
        // if ( shart : boolean ) {
        //      barame i ke bayad ejra shavad agar shart ma dorost boud (true)
        // }

        int adad_zoj = 8;
        boolean shart = adad_zoj % 2 == 0;
        out.println(shart);
        if (shart) {
            out.println("in adad zoj ast");
            // ...
        } else {
            out.println("in adad fard ast");
            // ...
        }
    }
}
