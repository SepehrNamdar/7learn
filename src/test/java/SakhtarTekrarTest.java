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

        tamamKon();
    }

    // Sakhtar while loop:
    // int neshanegar = 0;
    // while ( shart == true ) {
    //  code
    //  neshanegar++
    // }

    @Test
    void chahar_bar_salam_kon() {
        int neshanegar = 0;
        while ( neshanegar < 4 ) {
            salamKon();
            neshanegar++;
        }

        tamamKon();
    }

    // Sakhtar do while :
    // do {
    //  code
    //  } while ( shart );

    @Test
    void se_bar_salam_kon() {
        int neshanegar = 0;
        do {
            salamKon();
            neshanegar++;
        } while ( neshanegar > 3 );

        tamamKon();
    }

    private void tamamKon() {
        out.println("Payan");
    }

    private void salamKon() {
        out.println("Salam");
    }
}
