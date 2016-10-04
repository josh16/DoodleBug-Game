import java.util.Random;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Josh on 2016-10-02.
 */
public class Grid
{

// The Gird rows and Columns
    public int Row = 20;
    public int Col = 20;


    //Booleans declared
    private boolean Start = true;




    public Organism [][] Creatures = new Organism [Row][Col];

    public void Grid()
    {
       //Random number generating
        Random Num_Gen = new Random();

        for (int row =0; row < Row; row++)

        {
            for (int col = 0; col < Col; col++)
            {
                int randNum = Num_Gen.nextInt(100);

                //The ants number
                if(randNum > 50)
                {
                    Creatures[row][col] = new Ant(this,row, col);
                }

                //The doodleBugs
                else if (randNum < 5)
                {
                    Creatures[row][col] = new DoodleBugs(this, row, col);
                }
            }
        }
    }



    public void keyPressed (KeyEvent e)
    {
        if(e.getKeyCode()== KeyEvent.VK_Q)
        {

        }
    }



    public void Start()
    {
        for(int row = 0; row < Row; row++)
        {
                for(int col =0; col < Col; col++)
                {

                    if(Creatures[row][col] != null && Creatures[row][col].toString().equals(type))
                    {
                        Creatures[row][col].Start();
                    }
                }
        }
    }




    public void Show_On_Screen()
    {
        removeAll();

        double y = 0;

        for (int row = 0; row < Row; row++)
        {
            double x = 0;

            for(int col = 0; col < Col; col++)
            {
                Organism Creature = Creatures[row][col];

                if(Creatures != null)
                {
                    x += 50;
                    y += 50;
                }
            }
        }

    }

    public Organism getAnt( )

}
