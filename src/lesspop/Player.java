package lesspop;

import sun.awt.geom.AreaOp;

import java.net.StandardProtocolFamily;

public class Player {
    int number = 0;
    public  void  guess(){
        number = (int) (Math.random()*10);
        System.out.println("Думаю, это число " + number);
    }
}
