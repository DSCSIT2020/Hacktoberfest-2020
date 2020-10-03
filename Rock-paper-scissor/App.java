import java.util.Scanner;

import javax.lang.model.element.Element;

import java.util.Random;

class StonePaperScissor{
    private String userName = "";
    private String choice ="";
    private int choiceNumber ;
    private int points;
    
    public StonePaperScissor(String name){
        this.userName = name;
        this.points = 0;
    }

    public void choose(int choiceNumber){
        this.choiceNumber = choiceNumber; 
        if(choiceNumber == 0){
            this.choice = "Rock";
        }else if(choiceNumber == 1){
            this.choice = "Paper";
        }else{
            this.choice = "Scissor";
        }
    }

    public String getUserName(){
        return this.userName;
    }
    public String getChoice(){
        return this.choice;
    }
    public int getChoiceNumber(){
        return this.choiceNumber;
    }
    public void incrementPoints(){
        this.points++;
    }
    public int getPoints(){
        return this.points;
    }
}

class Compare{
    public static void findWinner(StonePaperScissor player,StonePaperScissor comp){
        int playerNo = player.getChoiceNumber();
        int compNo = comp.getChoiceNumber();

        if((playerNo == 0 && compNo == 2) || (playerNo == 1 && compNo == 0) || (playerNo == 2 && compNo == 1)){
            System.out.println("Hurray !! You got a point!! :)");
            player.incrementPoints();
        }else if((compNo == 0 && playerNo == 2) || (compNo == 1 && playerNo == 0) || (compNo == 2 && playerNo == 1)){
            System.out.println("Ops !! Computer got a point! :(");
            comp.incrementPoints();
        }else{
            System.out.println("Well it was a tie !");
        }
    }
}

public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int choice;
        System.out.println("Enter your name : ");
        String userName = sc.next();
        StonePaperScissor player = new StonePaperScissor(userName);
        StonePaperScissor comp = new StonePaperScissor("Computer");
        System.out.println("Hello "+player.getUserName()+" !!");

        int rounds = 0;
        
        do{
            System.out.println("\n"+player.getUserName()+" : "+player.getPoints()+"       |vs|       "+comp.getUserName()+" : "+comp.getPoints()+"\n\n");
            System.out.println("Make a choice : \n1)Rock\n2)Paper\n3)Scissor\n");
            choice = sc.nextInt();
            if(choice ==1 || choice == 2 || choice == 3){
                player.choose(choice -1);
                comp.choose(ran.nextInt(3));
                System.out.println("\nYou chose : "+player.getChoice()+"  |   "+"Computer chose : "+comp.getChoice()+"\n");
                Compare.findWinner(player, comp);
                rounds++;
            }else{
                System.out.println("\nInvalid choice\n");
            }
        }while(rounds<5);

        System.out.println("\n"+player.getUserName()+" : "+player.getPoints()+"       |vs|       "+comp.getUserName()+" : "+comp.getPoints()+"\n\n");
        
        if(player.getPoints() > comp.getPoints()){
            System.out.println("\n\n------ You Won!!! --------\n\n");
        }else if(player.getPoints() < comp.getPoints()){
            System.out.println("\n\n------ Oops Computer Won :( ------\n\n");
        }else{
            System.out.println("\n\n------ It was a Tie ------\n\n");
        }
    }
}