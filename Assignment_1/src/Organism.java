import java.util.Random;

/**
 * Created by tech on 2016-09-27.
 */
public abstract class Organism {


    public World world;
    public int x;
    public int y;
    public boolean Started;
    public int stepsTaken = 0;
    public int breedInterval;
    public Random Num_Gen  = Random Num_Gen.getInstance();







   public Organism(World world, int x, int y, int breedInterval)
   {
    this.world = world;
       this.x = x;
       this.y = y;
       this.breedInterval = breedInterval;
       Started = true;
   }

    public abstract String toString();

    public abstract boolean CheckMove();

    public void Move()
    {
            int new_X = x + Num_Gen.nextInt(-1,1);
            int new_Y = y + Num_Gen.nextInt(-1, 1);


        if(world.pointInGrid(newX, newY) && world.getAt(newX, newY) == null)
        {
            world.setAt(newX, newY, this);
            world.setAt(x, y, null);
            x = newX;
            y = newY;

        }

        return;

    };

    //
    public abstract void Create(int newX, int newY);

    public void Breed()
    {
        if(world.pointInGrid(x + 1, y)) && world.getAt(x + 1, y) == null)
        {
            Create(x + 1, y);
            return;
        }

        else if(world.pointInGrid(x - 1, y) && world.getAt(x - 1, y) == null)
    {
        Create(x - 1, y);
        return;
    }
    else if(world.pointInGrid(x, y + 1) && world.getAt(x, y + 1) == null)
    {
        Create(x, y + 1);
        return;
    }
    else if(world.pointInGrid(x, y - 1) && world.getAt(x, y - 1) == null)
    {
        Create(x, y - 1);
        return;
    };

        return;

    }


    public void Start()
    {
        //The game will Start
        if(Started) return;
        Started = true;

        stepsTaken++;


        if(stepsTaken !=0 && stepsTaken % breedInterval == 0)
        {
            Breed();
            return;
        }

    }

    public void Restart()
    {
        Started = false;
    }
}


