/**
 * Created by tech on 2016-09-27.
 */
public class DoodleBugs extends Organism
{

    //Representation of when the doodlebug will starve and die.
    public int StarveCount= 0;

    //Steps to breed
    private final int  Steps_b4_Breed;





    public DoodleBugs(World world, int pos_X, int pos_Y)
    {
       super(world, x, y, Steps_b4_Breed);

    }


    public String toString()
    {
        return "DoodleBug";
    }



    public boolean CheckMove()
    {
        if(eatAnt(x = 1, y)) return false;
        else if (eatAnt(x - 1, y)) return false;
        else if (eatAnt(x, y + 1)) return false;
        else if (eatAnt(x, y -1)) return false;

        StarveCount ++;
        if(StarveCount==3)
        {
            Starve();
            return false;
        }

    }

    private boolean eatAnt(int maybeX, int maybeY)
    {
        Organism maybeOrg = world.getAt(maybeX, maybeY);
        if (world.pointInGrid(maybeX,maybeY) && maybeOrg != null && maybeOrg.toString() =="ant")
        {
            StarveCount = 0;
            world.setAt(x, y, null);
            world.setAt(maybeX,maybeY, this);
            this.x = maybeX;
            this.y=maybeY;
            return true;
        }

        return false;

    }

    public void Multiply (int newX, int newY)
    {
        world.setAt(newX, newY, new DoodleBugs(world, newX, newY));
        return;





    }

    public void Starve()
    {
        world.setAt(x,y, null);
    }

}
