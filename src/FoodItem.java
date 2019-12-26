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
    private String _name;
    private long _catalogueNumber;
    private int _quantity;
    private int _minTemperature;
    private int _maxTemperature;
    private Date _productionDate;
    private Date _expiryDate;
    private int _price;

//Default:
    private String DEFAULT_NAME = "ITEM";
    private long DEFAULT_CATALOGNUMBER = 9999;
    private int DEFAULT_QUANTITY = 0;
    private int DEFAULT_PRICE = 1;

//Valid:
    private long MAX_CATALOGNUMBER = 9999;
    private long MIN_CATALOGNUMBER = 1000;
    private int MIN_QUANTITY = 0;
    private int MIN_PRICE = 1;

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
        isValidExpiry();
        isValidTemperature();
        isValidName();
        isValidCatalogNumber();
        isValidQuantity();
        isValidPrice();

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
        isValidExpiry();
        isValidTemperature();
        isValidName();
        isValidCatalogNumber();
        isValidQuantity();
        isValidPrice();

    }//end of copy constructor

//check if production date is before expiry date:
    public void isValidExpiry()
    {
        if (_productionDate.getYear() >= _expiryDate.getYear())
        {
            _expiryDate.setYear(_productionDate.getYear());
                if (_productionDate.getMonth() >= _expiryDate.getMonth())
                {
                    _expiryDate.setMonth(_productionDate.getMonth());
                        if (_productionDate.getDay() >= _expiryDate.getDay())
                            _expiryDate.setDay(_productionDate.getDay()+1);
                }
        }
    }// end ef isValidExpiry

//check temperatures:
    public void isValidTemperature()
    {
        if (_minTemperature > _maxTemperature)
        {
            int temp = _maxTemperature;
            _maxTemperature = _minTemperature;
            _minTemperature = temp;
        }
    }// end of check temp

//check item name:
    public void isValidName()
    {
        int length = _name.length();
        if (length == 0)
            _name = DEFAULT_NAME;
    }//end of check name

//check catalog number:
    public void isValidCatalogNumber()
    {
        if ((_catalogueNumber < MIN_CATALOGNUMBER)
                || (_catalogueNumber > MAX_CATALOGNUMBER))
            _catalogueNumber = DEFAULT_CATALOGNUMBER;
    }

//check quantity:
    public void isValidQuantity()
    {
        if (_quantity < MIN_QUANTITY)
            _quantity = DEFAULT_QUANTITY;
    }// end of check quantity

    public void isValidPrice()
    {
        if (_price < MIN_PRICE)
            _price = DEFAULT_PRICE;
    }
//gets & sets:
//gets:
    /**
     * gets the catalogue number
     * @return _catalogueNumber
     */
    public long getCatalogueNumber()
    {return _catalogueNumber;}

    /**
     * gets the expiry date
     * @return _expiryDate
     */
    public Date getExpiryDate()
    {return _expiryDate;}

    /**
     * gets the maximum storage temperature
     * @return _maxTemperature
     */
    public int getMaxTemperature()
    {return _maxTemperature;}

    /**
     * gets the minimum storage temperature
     * @return _minTemperature
     */
    public int getMinTemperature()
    {return _minTemperature;}

    /**
     * gets the name
     * @return _name
     */
    public java.lang.String getName()
    {return _name;}

    /**
     * gets the unit price
     * @return _unitPrice
     */
    public int getPrice()
    {return _price;}

    /**
     * gets the production date
     * @return _productionDate
     */
    public Date getProductionDate()
    {return _productionDate;}

    /**
     * gets the quantity
     * @return _quantity
     */
    public int getQuantity()
    {return _quantity;}

//sets:
    /**
     * set the expiry date (only if not before production date )
     * @param d - expiry date value to be set
     */
    public void setExpiryDate(Date d)
    {_expiryDate = d;}

    /**
     * set the price (only if positive)
     * @param n - price value to be set
     */
    public void setPrice(int n)
    {_price = n;}

    /**
     *set the production date (only if not after expiry date )
     * @param d - production date value to be set
     */
    public void setProductionDate(Date d)
    {_productionDate = d;}

    /**
     * set the quantity (only if not negative)
     * @param n - the quantity value to be set
     */
    public void setQuantity(int n)
    {_quantity = n;}
//end of gets & sets



//    public boolean equals(FoodItem other)
//    {
//        boolean _equals = true;
//        if ()
//    }



}