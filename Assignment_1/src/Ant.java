/**
 * Created by tech on 2016-09-27.
 */

public class  Ant extends Organism
{

    private final int Steps_b4_Breed = 3;



 //Ants information
    public Ant (Main Grid,int pos_X, int pos_Y)
    {
        super (Grid, pos_X, pos_Y, Steps_b4_Breed);
    }

    public String toString()
    {
        return "ant";
    }


    //Return boolean
    public boolean checkMove()
    {

        return true;
    }

    public void Create( int newX, int newY)
    {
        Grid.setAt(newX, newY, new Ant (Grid, newX, newY));
        return;
    }



}

