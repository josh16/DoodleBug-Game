package com.company;

public class Main {




    public static void main(String[] args) {

        //Grid Variable
        String EmptyBox = " - ";


        //Doodlebugs and Ants
        int DoodleBugNum = 5;
        int Ants = 100;


    // Inserting Doodlebugs randomly into the Grid
    for (int i=0; i < DoodleBugNum; i++)
    {
        int NewPosition;


            //Random rand = new Random();
            do
            {
                Random rand = new Random();
                NewPosition = rand.nextInt
            }
            while

    }

    }


    //Inserting Ants randomly into the Grid

    for(int i = 0; i < Ants; i++)
    {

    }




        //2D array 20 by 20
        String[][] Grid = new String [20][20];

        for (int row = 0; row < Grid.length; row++)
        {
            for(int Col = 0; Col < Grid.length; Col++)
            {
               //Setting rows and cols to the Emptybox variable
                Grid[row][Col] = EmptyBox;
            }

        }


        for (int row = 0; row < Grid.length; row++)
        {
            for(int Col = 0; Col < Grid.length; Col++)
            {
                System.out.print( " " + Grid[row][Col] + " ");
            }
            System.out.println();
        }






    }








}
