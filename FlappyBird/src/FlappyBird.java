import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.random.*;
import javax.swing.JPanel;

public class FlappyBird extends JPanel{
    
    int LarguraBorda = 360;
    int AlturaBorda = 640;

    FlappyBird(){
        setPreferredSize(new Dimension(LarguraBorda,AlturaBorda));
        setBackground(Color.blue);
        
    }

}
