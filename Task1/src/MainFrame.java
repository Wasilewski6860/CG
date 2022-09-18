import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private DrawingPanel dp;

    public MainFrame() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setSize(1920, 1080);
        //setResizable(false);
        dp = new DrawingPanel();
        this.add(dp);
    }
}