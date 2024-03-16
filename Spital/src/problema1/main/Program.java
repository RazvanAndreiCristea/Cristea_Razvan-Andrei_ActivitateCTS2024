package problema1.main;

import problema1.classes.Pacient;
import problema1.classes.PacientBuilder;

public class Program {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder1 = new PacientBuilder("Ionescu", 22);

        Pacient pacient1 = pacientBuilder1.setHasPatRabatabil(true).setHasHalat(true)
                .setHasMicDejunInclus(true).build();

        System.out.println(pacient1);

        System.out.println("=========================================\n");

        PacientBuilder pacientBuilder2 = new PacientBuilder("Popescu", 78);
        Pacient pacient2 = pacientBuilder2.build();

        System.out.println(pacient2);
    }
}