package com.company;

import java.util.Random;

/**
 * Created by Josh on 2016-10-04.
 */

public abstract class Organism {

    //
    public String type;
    public int x_Pos;
    public int y_Pos;
    public boolean timestep;
    public int stepsTaken = 0;
    public int breedInterval;
    public Random Num_Gen  = new Random();

    public static Organism[][] Grid;

    public abstract String string();


    public abstract boolean movePos();


    public Organism(Main Grid, int x_Pos, int y_Pos, int breedInterval)
    {

        //
        timestep = true;
        this.breedInterval = breedInterval;
        this.Grid = Grid;
        this.x_Pos = x_Pos;
        this.y_Pos = y_Pos;
    }





    //Move Method for the Organisms
    public void Move()
    {
        int new_X = x_Pos + Num_Gen.nextInt(1);
        int new_Y = y_Pos + Num_Gen.nextInt(1);

        //
        String Creature  = grid.getAt(x_Pos, y_Pos);


        //Setting the new Organisms to a new position for x and y.
        if(Grid.pointInGrid(x_Pos, y_Pos) && Grid.getCreature(x_Pos,y_Pos ) == null)
        {
            Grid.SetCreature(newX, newY, this);
            Grid.SetCreature(x_Pos, y_Pos, null);
            x_Pos= newX;
            y_Pos = newY;

        }

        return;

    };

    //Create new Organisms function



    public void Breed()
    {


        if(grid.Grid [x_Pos - 1 ][y_Pos].type == ".")
        {
            Organism temp = new Organism(grid,x_Pos + 1, y_Pos, 0);
            grid.Grid[x_Pos -1][y_Pos] = temp;
            return;
        }


        else if(Grid.pointInGrid(x_Pos - 1, y_Pos) && Grid.getAt(x_Pos - 1, y_Pos) == null)
        {
            Create(x_Pos - 1, y_Pos);
            return;
        }
        else if(Grid.pointInGrid(x_Pos, y_Pos + 1) && Grid.getAt(x_Pos, y_Pos + 1) == null)
        {
            Create(x_Pos, y_Pos + 1);
            return;
        }
        else if(Grid.pointInGrid(x_Pos, y_Pos - 1) && Grid.getAt(x_Pos, y_Pos - 1) == null)
        {
            Create(x_Pos, y_Pos - 1);
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
