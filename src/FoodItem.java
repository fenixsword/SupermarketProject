/**
 * Maman 12 - This class represents a Food Item
 *
 * @author Sergei Stepinsky
 * @version 14.12.19
 */
//This class represents a Date object:
public class FoodItem
{

//variables:
    public String _name;
    public long _catalogueNumber;
    public int _quantity;
    public int _minTemperature;
    public int _maxTemperature;
    public Date _productionDate;
    public Date _expiryDate;
    public int _price;

//Default:

//Valid:

//Constructor:

    /**
     * creates a new food item objects
     * @param name - name of the item
     * @param catalogueNumber - catalogue number of food item
     * @param quantity - quantity of food item
     * @param maxTemperature - maximum storage temperature
     * @param minTemperature - minimum storage temperature
     * @param productionDate - production date
     * @param expiryDate - expiry date
     * @param price - unit price
     */

    public FoodItem(java.lang.String name, long catalogueNumber,
                    int quantity, Date productionDate,
                    Date expiryDate, int minTemperature,
                    int maxTemperature, int price)
    {
        _name = name;
        _catalogueNumber = catalogueNumber;
        _quantity = quantity;
        _maxTemperature = maxTemperature;
        _minTemperature = minTemperature;
        _productionDate = productionDate;
        _expiryDate = expiryDate;
        _price = price;
    }//end of FoodItem constructor

    /**
     * copy constructor
     * @param other - the food item to be copied
     */

//copy constructor:

    public FoodItem(FoodItem other)
    {
        _name = other._name;
        _catalogueNumber = other._catalogueNumber;
        _quantity = other._quantity;
        _maxTemperature = other._maxTemperature;
        _minTemperature = other._minTemperature;
        _productionDate = other._productionDate;
        _expiryDate = other._expiryDate;
        _price = other._price;
    }

}