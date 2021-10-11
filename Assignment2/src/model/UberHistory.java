/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kashr
 */
public class UberHistory {
    private ArrayList<Uber> history;
    
    public UberHistory(){
         this.history=new ArrayList<Uber>();
    }

    public ArrayList<Uber> getHistory() {
        return history;
    }
    
 public void setHistory(ArrayList<Uber> uberHistory) {
        this.history = uberHistory;
 }
    
    public Uber addNewUbers(){
       //created new method newUbers to put data into Uber
        Uber newUbers=new Uber();
        history.add(newUbers);
        return newUbers;
    }
    
    public void deleteUbers(Uber u){
        history.remove(u);
    }
}
