import java.util.Scanner;
public class Loader
{
    public static void main(String[] args)
    {
        Cat masha = new Cat("masha");
        masha.setCatColor(CatColor.BLACK);
        System.out.println(masha.getName());
        masha.setName("f");
        /*private static Cat getKitty()
        {
        }*/
        System.out.println(masha.getName());//.length());
        masha.setColor("Black and white");
        System.out.println(masha.getColor());
        System.out.println(masha.getWeight());
        masha.pee(20.0);
        System.out.println(masha.getWeight());
        while (masha.getWeight() <= 5000)
        {
            masha.feed(20.0);
        }
        System.out.println(masha.getStatus());
        if (masha.getWeight() >= 5000)
        {
        while (masha.getStatus() != "Dead")
        {
            masha.meow();
        }
        }
        System.out.println(masha.getWeight());
        System.out.println(masha.getStatus());
        System.out.println(masha.getTotalDrinkConsumed());
        System.out.println(masha.getTotalFoodConsumed());

        /*Scanner in = new Scanner(System.in);
        String str = new String();
        String str = in.nextLine();
        System.out.println(str.length());*/
    }
}