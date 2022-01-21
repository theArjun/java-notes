import java.awt.*;

class CreatingFrameDemo{
    CreatingFrameDemo() {
        Label name = new Label("Name");
        Frame frame = new Frame();
        frame.add(name);
        frame.setVisible(true);
        frame.setSize(300,300); // for size
    }

    public static void main(String[] args) {
        CreatingFrameDemo objectOne = new CreatingFrameDemo();
    }
}