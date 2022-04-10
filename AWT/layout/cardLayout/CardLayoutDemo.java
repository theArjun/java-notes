import java.awt.*;
import java.util.concurrent.TimeUnit;

public class CardLayoutDemo extends Frame{
    CardLayoutDemo(String title) {
        super(title);

        setSize(400,400);
        setVisible(true);

        setLayout(new CardLayout());

        /* Exception may arise for sleep function. */
        try{
            add(new Button("Card One"));
            TimeUnit.SECONDS.sleep(3);
            add(new Button("Card Two"));
            TimeUnit.SECONDS.sleep(3);
            add(new Button("Card Three"));
            TimeUnit.SECONDS.sleep(3);
            add(new Button("Card Four"));
            TimeUnit.SECONDS.sleep(3);
            add(new Button("Card Five"));
        }catch(InterruptedException exc) {
            exc.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CardLayoutDemo("Card Layout Demo");
    }
}

/* Though no work of sleep() method here. */