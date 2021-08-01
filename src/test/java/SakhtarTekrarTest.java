import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class SakhtarTekrarTest {

    // Sakhtar tekrar :
    // 1 : for loop
    // 2 : while
    // 3 do while

    // for loop sakhtar :
    // for ( int neshanegar = 0; shart == true; neshanegar++ ) {
    //  code
    //}

    @Test
    void panj_bar_salam_kon() {
        for ( int neshanegar = 0; neshanegar < 5; neshanegar++ ) {
            salamKon();
        }

        out.println("Payan");
    }

    private void salamKon() {
        out.println("Salam");
    }
}
