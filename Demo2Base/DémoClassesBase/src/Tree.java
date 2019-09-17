import java.awt.*;

/**
 * Created by Shocky on 2019-09-15.
 */
public class Tree {

    private  String tree_Img_path = "\\Img\\tree.png";

    private String fire_Img_path;

    private boolean show;

    private int xPos;

    // Rendre private
    public boolean onFire;

    public Tree(int x, boolean onFire){
        xPos = x;
        this.onFire = onFire;
        show = true;
    }

    public void burn(){
        this.onFire = true;
        this.fire_Img_path = "\\Img\\fire.png";
    }

    public void unBurn(Water water, String smokePath){
        if(water.code == "12345"){
            onFire = false;
            fire_Img_path = smokePath;
        }
    }

    public String getTreeImg(){
        return this.tree_Img_path;
    }

    public String getFireImg(){
        return this.fire_Img_path;
    }

    public int getPos(){
        return xPos;
    }

    public boolean treeBurning(){
        return onFire;
    }

    public boolean isTreeShowing(){
        return this.show;
    }
}
