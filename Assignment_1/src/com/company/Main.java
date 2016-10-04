package com.company;
import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Random;

public class Main
{

//ignore out and idea

    //2D array 20 by 20
    public static Organism[][] Grid = new Organism[20][20];


    //Grid Variable
    static String EmptyBox = " - ";

    //Creature Variables
    public String Ants = "X";
    public String DoodleBugs ="Y";

    public static void main(String[] args) {


        for(int row = 0; row < Grid.length; row++)
        {
            for(int Col = 0; Col < Grid.length; Col++)
            {
                //Setting rows and cols to the Emptybox variable
                //Grid[row][Col] = EmptyBox;
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









