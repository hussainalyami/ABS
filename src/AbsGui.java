
import java.awt.EventQueue;
import javax.swing.JFrame;

public class AbsGui extends JFrame {

    public AbsGui() {

        initUI();
    }

    private void initUI() {

        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            AbsGui ex = new AbsGui();
            ex.setVisible(true);
        });
    }
}