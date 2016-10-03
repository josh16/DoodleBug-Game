/**
 * Created by tech on 2016-09-27.
 */
public class  Ant extends Organism
{

    public final int Steps_b4_Breed =3;



 //Ants information
    public Ant (Grid grid,int pos_X, int pos_Y)
    {
        super (world, x, y, Steps_b4_Breed);
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
        world.setAt(newX, newY, new Ant(world, newX, newY));
        return;
    }



}

