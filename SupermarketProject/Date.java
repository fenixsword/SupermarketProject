/**
 * Maman 12 - This class represents a Date object
 *
 * @author Sergei Stepinsky
 * @version 14.12.19
 */
//This class represents a Date object
public class Date
{
    private int _day;
    private int _month;
    private int _year;
    private final int DEFAULT_DAY = 1;
    private final int DEFAULT_MONTH = 1;
    private final int DEFAULT_YEAR = 2000;
//constructors:
    /**
     * Construct a new date
     * creates a new Date object if the date is valid, otherwise creates the date 1/1/2000
     * @param day   The day
     * @param month The month
     * @param year  The year
     */
//creates a new Date
    public Date (int day, int month, int year)
    {

    }
        /**
         * Copy constructor for Date
         * Construct a date the same as other date
         * @param other The date object from which to construct the new date
         */
//copy constructor
        public Date (Date other)
        {
            _day = other._day;
            _month = other._month;
            _year = other._year;
        }
    }