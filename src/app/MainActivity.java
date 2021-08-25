package app;

import qbit.engine.Activity;
import qbit.engine.movement.Gravity;
import qbit.engine.ui.Label;
import qbit.engine.ui.Obj;
import qbit.engine.ui.View;
import qbit.engine.ui.WindowManager;

import javax.swing.*;
import java.awt.*;


public class MainActivity extends Activity {
    View view = new View();
    public void startApp(){
        startRender();
        view.setSize(300,400);
        WindowManager.createWindow(800,600);
        WindowManager.getWindow().setView(view);
        Obj obj = new Obj(50,50,new ImageIcon("racks.png"));
        obj.setLocation(125,0);
        view.draw(obj);
        Gravity g = new Gravity(obj);
        g.setGroundY(350);
        g.setPullSpeed(9);
        g.setTime_interval(10);
        g.start();
    }
    public void update(){
      view.repaint();
    }
}
