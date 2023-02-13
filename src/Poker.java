import java.util.Random;

import javax.sound.midi.VoiceStatus;
import javax.swing.UIDefaults.ProxyLazyValue;

public class Poker {
    public void osztas(){
        System.out.println(getPitch());
        System.out.printf("%d %d %d %d %d\n",
        getPitch(),
        getPitch(),
        getPitch(),
        getPitch(),
        getPitch()
        );
    }
    public Poker() {
       osztas();
    }
    public int getPitch(){
        Random random =new Random();
        int randInt=random.nextInt(6)+1;

        return randInt;
    }
    
}
