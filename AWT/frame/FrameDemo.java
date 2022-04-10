import java.awt.*;

class ExtendingFrameDemo extends Frame{
    ExtendingFrameDemo() {
        Label name = new Label("Name");
        add(name);
        setVisible(true);
    }

    public static void main(String[] args) {
        ExtendingFrameDemo objectOne = new ExtendingFrameDemo();
    }
}