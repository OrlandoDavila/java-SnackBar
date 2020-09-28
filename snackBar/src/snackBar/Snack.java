package snackBar;

public class Snack
{
  //fields (know)
  private static int maxId = 0;
  private int id;
  private String name;
  private int quant;
  private double cost;
  private int vendingMachineId;

  //constructor
    public Snack(String name, int quant, double cost, int vendingMachineId)
    {
    maxId++;
    id = maxId;

    this.name = name;
    this.quant = quant;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
    }

    //methods
    public int getId()
    {
      return id;
    }

    public String getName()
    {
      return name;
    }

    public double getCost()
    {
      return cost;
    }

    public int getQuant()
    {
      return quant;
    }

    public int getVendingMachineId()
    {
      return vendingMachineId;
    }

    //setters
    public void setName(String name)
    {
      this.name = name;
    }

    public void setCost(double cost)
    {
      this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
      this.vendingMachineId = vendingMachineId;
    }
    

    public int addQuant(int add)
    {
      return this.quant = quant + add;
    }

    public int buySnack(int numberOfSnacks)
    {
      return this.quant = this.quant-numberOfSnacks;
    }

    public double getTotalCost(int quant)
    {
      return  this.cost * quant;
    }

}
