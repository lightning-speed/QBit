package qbit.engine.ui;

import javax.swing.*;
import java.awt.*;

public class View extends JPanel {
    public View(){
        this.setLayout(null);
    }
    public void draw(Component c){
        add(c);
    }
    public void setBack(ImageIcon image,int width,int height){
        this.getGraphics().drawImage(image.getImage(),0,0,null);
    }
}
