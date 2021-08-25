package qbit.engine.ui;

public class WindowManager {
    public static Window curentWindow = null;
    public static void createWindow(int width,int height){
        curentWindow = new Window();
        curentWindow.setSize(width,height);
        curentWindow.setLocationRelativeTo(null);
    }
    public static Window getWindow(){
        return  curentWindow;
    }
}
