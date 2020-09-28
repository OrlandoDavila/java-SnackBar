package snackBar;

/*
Customer
  VendingMachine
  Snack
*/

public class Main
{
  private static void snackData()
  {
    System.out.println("Great, now I'm hungry!");

    //Instantiate 2 customers
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    //Instantiate 3 Vending Machines
    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    //Instantiate 5 snacks
    Snack chips = new Snack("Chips", 36, 1.75, 1);
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
    Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

    Snack soda = new Snack("Soda", 24, 2.50, 2);
    Snack water = new Snack("Water", 20, 2.75, 2);

    //processing 1
    jane.buySnack(3, soda.getCost());
    soda.buySnack(3);
    System.out.println("Jane cash on hand " + "$" + jane.getCoh());
    System.out.println("Quantity of snack 4 is " + soda.getQuant());

    //Processing 2
    jane.buySnack(1, pretzel.getCost());
    pretzel.buySnack(1);
    System.out.println("Jane cash on hand " + "$" + jane.getCoh());
    System.out.println("Quantity of snack 3 is " + pretzel.getQuant());

    // Processing 3
    bob.buySnack(2, soda.getCost());
    soda.buySnack(2);
    System.out.println("Bob cash on hand " + "$" + bob.getCoh());
    System.out.println("Quantity of snack 4 is " + soda.getQuant());

    //processing 4
    // jane.addCash(jane.getCoh() + 10);
    // System.out.println("Customer 1 cash on hand " + "$" + jane.getCoh());

    //Processing #5
    jane.buySnack(1,chocolateBar.getCost());
    chocolateBar.buySnack(1);
    System.out.println("Customer 2 cash on hand " + "$" + jane.getCoh());
    System.out.println("Quantity of snack 4 is " +chocolateBar.getQuant());

  //Processing #6
    pretzel.addQuant(12);
    System.out.println("Quantity of snack 3 is " +pretzel.getQuant());

  //Processing #7
    bob.buySnack(3,pretzel.getCost());
    pretzel.buySnack(3);
    System.out.println("Customer 1 cash on hand " + "$" + bob.getCoh());
    System.out.println("Quantity of snack 3 is " +pretzel.getQuant());
  }

  public static void main(String[] args)
  {
      snackData();
  }
}
