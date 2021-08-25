package qbit.engine.ui;

import javax.swing.*;
import java.awt.*;

public class View extends JPanel {
    public View(){
        this.setBackground(new Color(70,70,70));
        this.setLayout(null);
    }
    public void draw(Component c){
        add(c);
    }
}
