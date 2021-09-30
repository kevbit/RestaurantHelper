
/**
 * The class helps customers calculate the total
 * cost of the meal, including the tip and tax.
 *
 * @author Kevin Lo
 * @version 2020-09-24
 */
public class RestaurantHelper
{
    // instance variables - replace the example below with your own
    private double costOfMeal;
    private int qualityOfService;
    public static final int EXCELLENT_SERVICE = 3;
    public static final int GOOD_SERVICE = 2;
    public static final int FAIR_SERVICE = 1;
    public static final int POOR_SERVICE = 0;
    public static final double EXCELLENT_TIP = 0.25;
    public static final double GOOD_TIP = 0.20;
    public static final double FAIR_TIP = 0.10;
    public static final double POOR_TIP = 0.05;
    public static final double TAX_RATE = 0.09;

    /**
     * Constructor for objects of class RestaurantHelper
     * 
     * @param mealCost double that represents the cost of the meal
     * @param serviceQuality an integer from 0 to 3 which represents the quality of service
     * 
     */
    public RestaurantHelper(double mealCost, int serviceQuality)
    {
        if (mealCost < 0)
        {
            costOfMeal = 0;
        }
        else
        {
            costOfMeal = mealCost;
        }

        if (serviceQuality > EXCELLENT_SERVICE)
        {
            qualityOfService = EXCELLENT_SERVICE;
        }
        else if (serviceQuality < POOR_SERVICE)
        {
            qualityOfService = POOR_SERVICE;
        }
        else 
        {
            qualityOfService = serviceQuality;
        }

    }

    /**
     *  Gets the quality of service.
     *  
     *  @return the quality of the service
     */
    public int qualityOfService()
    {
        return qualityOfService;
    }

    /**
     * Gets the base cost of the meal (no tip or tax).
     * 
     * @return the cost of the meal before tax and tip
     */
    public double costOfMeal()
    {
        return costOfMeal;
    }

    /**
     * Gets the amount of the tip
     *
     * @return The amount of the tip
     * 
     */
    public double tip()
    {
        double tipAmount;
        if (qualityOfService == EXCELLENT_SERVICE)
        {
            tipAmount = costOfMeal * EXCELLENT_TIP;
            return tipAmount;
        }
        else if (qualityOfService == GOOD_SERVICE)
        {
            tipAmount = costOfMeal * GOOD_TIP;
            return tipAmount;
        }
        else if (qualityOfService == FAIR_SERVICE)
        {
            tipAmount = costOfMeal * FAIR_TIP;
            return tipAmount;
        }
        else if (qualityOfService == POOR_SERVICE)
        {
            tipAmount = costOfMeal * POOR_TIP;
            return tipAmount;
        }
        else
        {
            return 0.0;
        }
    }

    /**
     * Calculates and returns tax
     * 
     * @return The amount of tax
     */
    public double tax()
    {
        double tax;
        tax = costOfMeal * TAX_RATE;
        return tax;
        
    }

    /**
     * Calculates the total cost of the bill
     * 
     * @return The total cost of the bill
     */
    public double totalCost()
    {
        double totalCost;
        totalCost = costOfMeal + this.tax() + this.tip();
        return totalCost;
        
        
    }

}
