import java.util.Random;

public class Poker {

    public Poker() {
        System.out.println(getPitch());
        System.out.printf("%d %d %d %d %d\n",
        getPitch(),
        getPitch(),
        getPitch(),
        getPitch(),
        getPitch()
        );
    }
    public int getPitch(){
        Random random =new Random();
        int randInt=random.nextInt(6)+1;

        return randInt;
    }
    
}
