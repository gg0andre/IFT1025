/**
 * Created by Shocky on 2019-09-16.
 */
public class Firefighter {

    private static final String WATER_CODE = "12345";
    private static final String SMOKE_PATH = "\\Img\\smokeCloud.png";
    private int posX;
    private Water water;
    private boolean show;

    public Firefighter (int posX){
        this.posX = posX;
        show = true;
    }

    public int getPosX(){
        return posX;
    }

    public void extinguishFire(Tree burningTree){
        water = new Water(WATER_CODE);
        burningTree.unBurn(water, SMOKE_PATH);
    }
    
    public boolean isFFShowing(){
        return this.show;
    }
}
