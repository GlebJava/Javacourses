public class Cat
{
    public static final int LEGS_COUNT = 4;
    public static final int EYE_COUNT = 2;
    private double originWeight;
    private double weight;
    private static final double MinWeight = 1000.0;
    private static final double MaxWeight = 5000.0;
    private double totalFoodConsumed;
    private double totalDrinkConsumed;
    private String name;
    private String color;
    public Cat()
{
    weight = 1100.0 + 1500.0 * Math.random();
    originWeight = weight;
}
    private double WeightGen;
    public Cat(double WeightGen)
    {
        this();
        this.WeightGen = WeightGen;
    }

    public void meow()
    {
        weight = weight - 1;
        //System.out.println("Meow");
    }
    public void feed(Double amount)
    {
        weight = weight + amount;
        totalFoodConsumed += amount;
    }
    public void drink(Double amount)
    {
        weight = weight + amount;
        totalDrinkConsumed += amount;
    }
    public Double getWeight()
    {
        return weight;
    }
    public String pee(double amount)
    {
        weight = weight - amount;
        return (getStatus());
    }
    public double getTotalFoodConsumed() {
        return totalFoodConsumed;
    }
    public double getTotalDrinkConsumed() {
        return totalDrinkConsumed;
    }
    public void setCatColor(CatColor type)
    {}
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public Cat(String name)
    {
        this();
        this.name = name;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
    public String getStatus()
    {
        if(weight < MinWeight) {
            return "Dead";
        }
        else if(weight > MaxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}