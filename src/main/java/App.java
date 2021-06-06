/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String carSilent = app.readAnswer();
        app.printOutput(carSilent);
    }

    private void printOutput(String carSilent) {
        if(carSilent.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            String batteries = in.nextLine();
            if(batteries.equals("y"))
                System.out.println("Clean terminals and try starting again.");
            else if(batteries.equals("n"))
                System.out.println("Replace cables and try again.");
        }
        else{
            System.out.println("Does the car make a slicking noise?");
            String slicking = in.nextLine();
            if(slicking.equals("y"))
                System.out.println("Replace the battery.");
            else if (slicking.equals("n")){
                System.out.println("Does the car crank up but fail to start?");
                String crank = in.nextLine();
                if(crank.equals("y"))
                    System.out.println("Check spark plug connections.");
                else if(crank.equals("n")){
                    System.out.println("Does the engine start and then die?");
                    String engineDie = in.nextLine();
                    if(engineDie.equals("y")){
                        System.out.println("Does your car have fuel injection?");
                        String fuelInject = in.nextLine();
                        if(fuelInject.equals("y"))
                            System.out.println("Get it in for service.");
                        else if(fuelInject.equals("n"))
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else if(engineDie.equals("n"))
                        System.out.println("This should not be possible.");
                }
            }
        }
    }

    private String readAnswer() {
        System.out.print("Is the car silent when you turn the key? ");
        String answer = in.nextLine();
        return answer;
    }
}