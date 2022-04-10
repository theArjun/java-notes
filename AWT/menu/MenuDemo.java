import java.awt.*;

public class MenuDemo extends Frame {
    MenuDemo (String title){
        super(title);

        setSize(400,400);
        setVisible(true);

        MenuBar menubar = new MenuBar();

        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu saveAs = new Menu("Save As");
        menubar.add(file);
        menubar.add(edit);
        setMenuBar(menubar);

        MenuItem newItem = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        MenuItem asPng = new MenuItem("PNG");
        MenuItem asJpg = new MenuItem("JPG");
        MenuItem asBmp = new MenuItem("BMP");
        MenuItem asPsd = new MenuItem("PSD");

        saveAs.add(asPng);
        saveAs.add(asJpg);
        saveAs.add(asBmp);
        saveAs.add(asPsd);

        file.add(newItem);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(exit);
    }

    public static void main(String[] args) {
        new MenuDemo("Menu Demo");
    }
}