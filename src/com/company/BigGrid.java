package com.company;

import java.util.ArrayList;
import java.util.List;

public class BigGrid {
    //Setting Properties & ArrayLists
    private List<Integer> rows = new ArrayList<>();
    private List<Integer> columns = new ArrayList<>();
    private List <Integer> miniGrids = new ArrayList<>();


    //Setters & Getters

    public void setRows (List<Integer> rows) {
        this.rows = rows;
    }
    public List<Integer> getRows() {
        return rows;
    }
    public void setColumns (List<Integer> columns) {
        this.columns = columns;
    }
    public List<Integer> getColumns() {
        return columns;
    }
    public void setMiniGrids (List<Integer> miniGrids) {
        this.miniGrids = miniGrids;
    }
    public List<Integer> getMiniGrids() {
        return miniGrids;
    }


    //Constructor
    public BigGrid (List<Integer> rows, List<Integer> columns, List<Integer> miniGrids){
        this.rows = rows;
        this.columns = columns;
        this.miniGrids = miniGrids;
    }

}
