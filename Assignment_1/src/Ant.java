/**
 * Created by tech on 2016-09-27.
 */
public abstract class  Ant extends Organism
{

    private final int Steps_b4_Breed = 3;



 //Ants information
    public Ant (World world,int pos_X, int pos_Y)
    {
        super (world, pos_X, pos_Y, Steps_b4_Breed);
    }

    public String toString()
    {
        return "ant";
    }


    public boolean checkMove()
    {

        return true;
    }

    public void Multiply( int newX, int newY)
    {
        world.setAt(newX, newY, new Ant (world, newX, newY));
        return;
    }



}

