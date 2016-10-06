import com.company.Organism;

/**
 * Created by tech on 2016-09-27.
 */


public class DoodleBugs extends Organism
{


    //Representation of when the doodlebug will starve and die.
    public int StarveCount= 0;

    //Steps to breed
   private static final int  Steps_b4_Breed = 8;





    public DoodleBugs(Organism Grid, int pos_X, int pos_Y)
    {
       super(Main Grid, pos_X, pos_Y, Steps_b4_Breed);

    }


    public String toString()
    {
        return "DoodleBug";
    }



    public boolean CheckMove()
    {
        if(eatAnt(x_Pos = 1, y_Pos)) return false;
        else if (eatAnt(x_Pos - 1, y_Pos)) return false;
        else if (eatAnt(x_Pos, y_Pos + 1)) return false;
        else if (eatAnt(x_Pos, y_Pos -1)) return false;

        StarveCount ++;
        if(StarveCount==3)
        {
            Starve();
            return false;
        }

        return true;
    }

    private boolean eatAnt(int maybeX, int maybeY)
    {
        Organism maybeOrg = Grid.getCreature(maybeX, maybeY);
        if (Grid.pointInGrid(maybeX,maybeY) && maybeOrg != null && maybeOrg.toString() =="ant")
        {
            StarveCount = 0;
            Grid.SetCreature(x_Pos,y_Pos, null);
            Grid.SetCreature(maybeX,maybeY, this);
            this.x_Pos= maybeX;
            this.y_Pos=maybeY;
            return true;
        }

        return false;

    }

    public void Create (int newX, int newY)
    {
        Grid.SetCreature(newX, newY, new DoodleBugs(Grid, newX, newY));
        return;





    }

    public void Starve()
    {
        Grid.SetCreature(x_Pos,y_Pos, null);
    }



}


