/**
 * Created by tech on 2016-09-27.
 */
public abstract class Organism {


    public World world;
    public int x;
    public int y;
    public boolean simulated;
    public int stepsTaken = 0;
    public int breedInterval;
    public RandomGenerator rgen= randomGenerator.getInstance();







   public Organism(World world, int x, int y, int breedInterval)
   {
    this.world = world;
       this.x = x;
       this.y = y;
       this.breedInterval = breedInterval;
       simulated = true;
   }

    public abstract String toString();

    public abstract boolean CheckMove();

    public void Move();







    public void Starve()
    {

    }




    public void Breed()
    {

    }





}


