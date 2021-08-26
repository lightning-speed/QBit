package app;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;
import qbit.engine.Activity;
import qbit.engine.movement.Animation;
import qbit.engine.movement.Colision;
import qbit.engine.movement.Gravity;
import qbit.engine.ui.Obj;
import qbit.engine.ui.View;
import qbit.engine.ui.WindowManager;

import javax.swing.*;


public class MainActivity extends Activity {
    View view = new View();
    Obj obj;
    Obj obj2;
    Gravity g;
    public void startApp(){
        view.setSize(600,400);
        WindowManager.createWindow("Test",800,600);
        WindowManager.getWindow().setView(view);
        WindowManager.getWindow().setMinimumSize(view.getSize());
        obj = new Obj(100,100,new ImageIcon("racks.png"));
        obj.setLocation(250,0);
        obj2 = new Obj(100,100,new ImageIcon("racks.png"));
        obj2.setLocation(150,150);
        view.draw(obj);
        view.draw(obj2);
        Gravity g = new Gravity(obj);
        g.setPullSpeed(1);
        g.setTime_interval(10);
        g.setGroundY(300);
        g.start();
        startRender();
    }
    public void update(){
        view.repaint();
        view.setBack(new ImageIcon("racks.png"),view.getWidth(),view.getHeight());
    }
}
