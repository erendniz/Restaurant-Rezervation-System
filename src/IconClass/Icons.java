package IconClass;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Icons {
    // İkonlar
    private Icon leftarrow2 = new ImageIcon(getClass().getResource("/Images/back-button1.png"));
    private Icon leftarrow = new ImageIcon(getClass().getResource("/Images/back-button2.png"));
    private Icon cancel = new ImageIcon(getClass().getResource("/Images/close.png"));
    private Icon minus= new ImageIcon(getClass().getResource("/Images/minus.png"));
    private Icon alldirections = new ImageIcon(getClass().getResource("/Images/all-directions.png"));
    private Icon minus2 = new ImageIcon(getClass().getResource("/Images/minus(1).png"));
    private Icon cancel2 = new ImageIcon(getClass().getResource("/Images/close(1).png"));
    private Icon alldirections2 = new ImageIcon(getClass().getResource("/Images/all-directions2.png"));


    public Icon getCancel() {
        return cancel;
    }

    public Icon getMinus() {
        return minus;
    }
    public Icon getAlldirections() {
        return alldirections;
    }
    public Icon getMinus2() {
        return minus2;
    }
    public Icon getCancel2() {
        return cancel2;
    }
    public Icon getLeftarrow2() {
        return leftarrow2;
    }
    public Icon getLeftarrow() {
        return leftarrow;
    }
    public Icon getAlldirections2() {
        return alldirections2;
    }
    
}
