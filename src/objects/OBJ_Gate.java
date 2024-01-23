package objects;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Gate extends SuperObject{
        public OBJ_Gate(){
        name = "Gate";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/gate.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        collision = true;
    }
}
