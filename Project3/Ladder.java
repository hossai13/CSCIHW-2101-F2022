package Project3;
import java.util.Scanner;
import java.util.ArrayList;

public class Ladder {
    
    public int panels;
    
    public int[][] ladder;
    
    public int round = 1;

    public Ladder(){
        this.panels = 5;
    }

    public Ladder(int panels){
        this.panels = panels;
    }

    ArrayList <Integer> selections = new ArrayList<Integer>();
    public int getSelection(){
        int convertedSelection;
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter L or R: ");
            String selection = scan.nextLine();
       if (selection.equals("L") || selection.equals("l")){
           convertedSelection = 0;
           System.out.println("You selected: " + selection);
           return convertedSelection;
       }
       else if (selection.equals("R") || selection.equals("r")){
           convertedSelection = 1;
           System.out.println("You selected: " + selection);
           return convertedSelection;
       }
           System.out.println("\nSelection is invalid, please try again");
        }
       }

    public int [][] createLadder(){
        ladder = new int [panels][2];
        for (int i = 0; i < ladder.length; i++){
            for (int j = 0; j < ladder[i].length; j++){
                ladder[i][j] = (int)(2 * Math.random());
            }
            if (ladder[i][0] == ladder[i][1] && ladder[i][0] == 0){
                ladder[i][0] = 1;
            }
            else {
                ladder[i][0] = 0;
            }
        }
        return ladder;
    }

    public boolean calcPanel(int [][] ladder, ArrayList <Integer> selections){
        int size = selections.size();
        System.out.println("Round: " + round);
        int [] temp = new int [2];
        for (int i = 0; i < ladder[0].length; i++){
            temp[i] = ladder[size][i];
        }
        int currentSelection = getSelection();
        selections.add(currentSelection);
        int choice = selections.get(size);
        if (temp[choice] == 1){
            System.out.println("\nAnswer is correct!");
            round++;
            return true;
        }
        else {
            selections.remove(size);
            round++;
            System.err.println("\nAnswer is incorrect!");
            System.out.println("You lose 1 life!");
            return false;
        }
        }
    
    public void printLadderBlank(){
        try {
            System.out.println("|||||| ---- Start");
            for (int i = 0; i < ladder.length; i++) {
                System.out.print("|"+" || "+"|");
                System.out.println();
            }
            System.out.println("|||||| ---- Finish");
        } catch (Exception e) {
            System.out.println("ERROR LADDER IS NOT CREATED OR IS NULL...");
        }
    }

    public void printLadder() {
        try {
          System.out.println("|||||| ---- Start");
          for (int i = 0; i < this.ladder.length; i++) {
            for (int j = 0; j < (this.ladder[i]).length; j++)
                System.out.print("|" + this.ladder[i][j] + "|"); 
                System.out.println();
          } 
            System.out.println("|||||| ---- Finish");
        } catch (Exception e) {
          System.out.println("ERROR LADDER IS NOT CREATED OR IS NULL...");
        } 
      }

    public void printCurrentLadder() {
        System.out.println("|||||| ---- Start");
        for (int i = 0; i < this.selections.size(); i++) {
          for (int j = 0; j < (this.ladder[i]).length; j++)
            System.out.print("|" + this.ladder[i][j] + "|"); 
            System.out.println();
        } 
        System.out.println("|?||?|");
      }
    }

