package snackBar;

public class Customer
{

  private static int maxId = 0;
  private int id;
  private String name;
  private double coh;

  public Customer(String name, double coh)
  {
    maxId++;
    id = maxId;

    this.name = name;
    this.coh = coh;
  }

//getters
  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public double getCoh()
  {
    return coh;
  }

//setters
  public void setName(String name)
  {
    this.name = name;
  }

  public void setCoh(double coh)
  {
    this.coh = coh;
  }

  public void buySnack( int quant, double cost)
  {
    this.coh = getCoh() - (quant * cost);
  }
}
