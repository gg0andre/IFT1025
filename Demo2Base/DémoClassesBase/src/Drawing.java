/**
 * Created by Shocky on 2019-09-15.
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Drawing extends  Canvas{

    //private Firefighter firefighter;
    private Tree tree;

    public static void main (String[] args){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(500, 500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public Drawing(){

        /// Ligne pour faire apparaître l'arbre
        //tree = new Tree(125, false);

        /// Ligne pour montrer façon naive de mettre l'arbre en feu.
        //tree.onFire = true;

        /// Demander à l'objet de faire quelque chose.
        //tree.burn();

        // Demander au pompier d'éteindre le feu.
        //firefighter = new Firefighter(65);

        //Passer l'arbre au pompier pour qu'il éteindre le feu.
        //firefighter.extinguishFire(tree);
    }

    public void paint(Graphics g){

        BufferedImage img = null;
        BufferedImage fireImg = null;
        BufferedImage fireFighterImg = null;
        //BufferedImage bucheronImg = null;

        try{
            img = ImageIO.read(new File(new File("").getAbsolutePath().concat(this.tree.getTreeImg())));
            if(this.tree.getFireImg() != null){
                fireImg = ImageIO.read(new File(new File("").getAbsolutePath().concat(this.tree.getFireImg())));
            }
            fireFighterImg = ImageIO.read(new File(new File("").getAbsolutePath().concat("\\Img\\fireFighter.png")));
            //bucheronImg = ImageIO.read(new File(new File("").getAbsolutePath().concat(bucheron.getImgPath())));
        } catch (Exception e){
            System.out.print(e.getMessage());
        }

        if(tree.isTreeShowing()){
            g.drawImage(img, tree.getPos(), 125, 250, 250, null);
        }

        if (tree.getFireImg() != null){
            g.drawImage(fireImg, tree.getPos() + 75, 150, 100, 100, null);
        }

        /*if (firefighter.isFFShowing()){
            g.drawImage(fireFighterImg, firefighter.getPosX(), 275, 100, 100, null);
        }*/

        /*if (bucheron.getImgPath() != null){
            g.drawImage(bucheronImg, bucheron.getPosX(), 275, 100, 100, null);
        }*/
    }
}


