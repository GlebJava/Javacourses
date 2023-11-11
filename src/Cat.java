public class Cat
{
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double totalFoodConsumed;
    private double totalDrinkConsumed;
    public Cat()
{
    weight = 1100.0 + 1500.0 * Math.random();
    originWeight = weight;
    minWeight = 1000.0;
    maxWeight = 5000.0;
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
    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
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