package com.company;

import java.util.ArrayList;
import java.util.List;

public class GridBuilder {
    //Method for gridBuilder

    BigGrid largeGrid = new BigGrid();
    final int SIZE = 9;
    final int MINI = 3;
    int[] rows1 = {0,2,0,8,0, 0,0,1,5};
    int[] rows2 = {3,0,0,4,6, 5,2,0,0};
    int[] rows3 = {5,6,9,0,0, 2,0,3,0};
    /*
    int[] rows4 = {0,7,6,0,4, 0,0,8,0};
    int[] rows5 = {0,0,0,8,0, 0,0,1,5};
    int[] rows6 = {0,2,0,8,0, 0,0,1,5};
    int[] rows7 = {0,2,0,8,0, 0,0,1,5};
    int[] rows8 = {0,2,0,8,0, 0,0,1,5};
    int[] rows9 = {0,2,0,8,0, 0,0,1,5};
    */

    //int[] columns = {0,3,5,0,0,9,0,7,0};
    //int[] miniGrids ={0, 2, 0, 3, 0, 0, 5, 6, 9};



    public BigGrid buildGrid(){
    //input the row values
    for(int i = 0; i< MINI; i++)
    {
        largeGrid.setRows(rows1[i]);
        //System.out.println(largeGrid.getRows(rows1[i]));

    }
        return largeGrid;
       // return largeGrid;
    //input the column values


}//end buildGrid method



}
