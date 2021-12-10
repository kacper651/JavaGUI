import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Panel extends JPanel {

    public Panel(){
        setBorder(new LineBorder(new Color(0, 0, 0), 1, false));
        setBackground(Color.white);
        setLayout(null);
    }
}
