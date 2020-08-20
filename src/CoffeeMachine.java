
import java.util.Scanner;



// this project is a project listed on JetBrains Academy
public class CoffeeMachine {
   private int water;
   private int milk;
   private int coffeeBeans;
   private int disposableCups;
   private int money;
   Scanner scanner = new Scanner(System.in);

    public CoffeeMachine(){
       defaultFill();
       while(true) {
           switchboard();
       }
    }
    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //default start of program
    public void defaultFill(){
        setMoney(550);
        setMilk(540);
        setWater(400);
        setCoffeeBeans(120);
        setDisposableCups(9);
    }

    //return current status
    public void status(){
        System.out.println("The coffee machine has:\n"
                + getWater() + " of water\n"
                + getMilk() + " of milk\n" +
                + getCoffeeBeans() + " of coffee beans\n"
                + getDisposableCups() + " of disposable cups\n"
                + "$"+getMoney() + " of money");
        System.out.println("");
    }

    //Allows users to run buy, break, or fill
    public void switchboard(){

        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String choiceOfAction = scanner.next();

        switch (choiceOfAction){
            case "buy":
                System.out.println("");
                buy();
                break;
            case "fill":
                System.out.println("");
                fill();
                break;
            case "take":
                System.out.println("");
                take();
                break;
            case "remaining":
                System.out.println("");
                status();
                break;
            case  "exit":
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public void take(){
        System.out.println("I gave you $"+getMoney());
        setMoney(0);

    }

    public void fill(){
        System.out.println("Write how many ml of water do you want to add: ");
        int fillWater = scanner.nextInt();
        setWater(getWater()+fillWater);

        System.out.println("Write how many ml of milk do you want to add: ");
        int fillMilk = scanner.nextInt();
        setMilk(getMilk()+fillMilk);

        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int fillBeans = scanner.nextInt();
        setCoffeeBeans(getCoffeeBeans()+fillBeans);

        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int fillCups =scanner.nextInt();
        setDisposableCups(getDisposableCups()+fillCups);


    }

    public void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.next();
        switch(choice){
            //For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
            case "1":
                if (getWater() < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (getCoffeeBeans() < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (getDisposableCups() < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                setWater(getWater()-250);
                setDisposableCups(getDisposableCups()-1);
                setCoffeeBeans(getCoffeeBeans()-16);
                setMoney(getMoney()+4);
                System.out.println("");
                break;
            //For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
            case "2":
                if (getWater() < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (getCoffeeBeans() < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (getDisposableCups() < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else if (getMilk() < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                setMoney(getMoney()+7);
                setDisposableCups(getDisposableCups()-1);
                setWater(getWater()-350);
                setMilk(getMilk()-75);
                setCoffeeBeans(getCoffeeBeans()-20);
                System.out.println("");
                break;
            //For the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
            case "3":
                if (getWater() < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (getCoffeeBeans() < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (getDisposableCups() < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else if (getMilk() < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                setMoney(getMoney()+6);
                setDisposableCups(getDisposableCups()-1);
                setWater(getWater()-200);
                setMilk(getMilk()-100);
                setCoffeeBeans(getCoffeeBeans()-12);
                System.out.println("");
                break;
            case "back":
                switchboard();
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
            CoffeeMachine coffeeMachine = new CoffeeMachine();




        //set ingredients needed per one cup





    }
}
