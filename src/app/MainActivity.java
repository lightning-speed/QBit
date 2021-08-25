package app;

import qbit.engine.Activity;
import qbit.engine.Animation;
import qbit.engine.movement.Gravity;
import qbit.engine.movement.Movement;
import qbit.engine.ui.Obj;
import qbit.engine.ui.View;
import qbit.engine.ui.WindowManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainActivity extends Activity {
    View view = new View();
    Obj obj;
    Gravity g;
    public void startApp(){
        startRender();
        view.setSize(600,800);
        WindowManager.createWindow("Test",800,600);
        WindowManager.getWindow().setView(view);
        obj = new Obj(100,100,new ImageIcon("racks.png"));
        obj.setLocation(250,0);
        view.draw(obj);
        ImageIcon img[]={new ImageIcon("1.png"),new ImageIcon("2.png"),new ImageIcon("3.png")};
        Animation an = new Animation(obj,img,100);

        an.start();

    }
    public void update(){
            view.repaint();
    }
}
