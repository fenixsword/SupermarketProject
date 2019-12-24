/**
 * Maman 12 - This class represents a Date object
 *
 * @author Sergei Stepinsky
 * @version 14.12.19
 */
//This class represents a Date object:
public class Date
{
//variables:
    private int _day;
    private int _month;
    private int _year;
//Default dates:
    private final int DEFAULT_DAY = 1;
    private final int DEFAULT_MONTH = 1;
    private final int DEFAULT_YEAR = 2000;
//Valid dates limit:
    private final int MAX_DAYS = 31;
    private final int MAX_MONTH = 12;
    private final int MAX_YEAR = 9999;
    private final int MIN_YEAR = 1000;

//constructors:

    /**
     * creates a new Date object
     * if date is invalid, changes it to the default: 1/1/2000
     * @param day the day in the month(1-31)
     * @param month the month in the year
     * @param year the year (in 4 digits)
     */

//creates a new Date:
    public Date(int day, int month, int year)
    {
        boolean _isValid;
        _day = day;
        _month = month;
        _year = year;
        _isValid = isValidDate(_day ,_month,_year);
        if(_isValid==true)
        {
            _day = day;
            _month = month;
            _year = year;
        }
        else
            {
            _day = DEFAULT_DAY;
            _month = DEFAULT_MONTH;
            _year = DEFAULT_YEAR;
        }
    }//end of Date

    /**
     * Copy constructor
     * other - the date to be copied
     * @param other date copied
     */
//copy constructor
    public Date (Date other)
    {
        boolean _isValid;
        _day = other._day;
        _month = other._month;
        _year = other._year;
        _isValid = isValidDate(_day ,_month,_year);
        if(_isValid)
        {
            _day = other._day;
            _month = other._month;
            _year = other._year;
        }
        else
            {
            _day = DEFAULT_DAY;
            _month = DEFAULT_MONTH;
            _year = DEFAULT_YEAR;
        }
    }//end of Date.other
//checks if date is valid:

    public boolean isValidDate(int _day, int _month, int _year)
    {
        boolean _isValid=true;
//sets as default if date is wrong - overall:
        if ((_day < DEFAULT_DAY) || (_day > MAX_DAYS) || (_month > MAX_MONTH)
                || (_month < DEFAULT_MONTH) || (_year < MIN_YEAR) || (_year > MAX_YEAR))
        { _isValid=false; }
//sets as default if date is wrong - excluding Febuary:
        //january, march, may, july, august, october and december
        if ((_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12)
                && (_isValid))
        {
        if ((_day < DEFAULT_DAY) || (_day > MAX_DAYS))
        { _isValid=false; }
    }
        //april, june, september and november
        if ((_month == 2 || _month== 4 ||_month == 6 ||_month == 9 ||_month == 11) && (_isValid))
        {
            if ((_day < DEFAULT_DAY) || (_day > (MAX_DAYS - 1)))
            { _isValid=false; }
        }
//sets as default if date is wrong - ONLY Febuary:
        if ((_month == 2) && (_isValid == true))
        {
            if (((_year%4==0) && (_year%100 !=0)) || (_year%400 ==0) && (_isValid))
            {
                if ((_day < DEFAULT_DAY) || (_day > (MAX_DAYS - 2)))
                { _isValid = false; }
            }
            if (((_year%4!=0) && (_year%100 ==0)) || (_year%400 ==0) && (_isValid))
            {
                if ((_day < DEFAULT_DAY) || (_day > (MAX_DAYS - 2)))
                { _isValid = false; }
            }
            }
        return _isValid;
        }//end of isValidDate

        /**
     * check if this date equals other date
     * @param other date to compare this date to
     * @return true if this date is equals other date
     */
    public boolean equals(Date other) {
        boolean equals=true;
            if (_year == other._year)
            {equals = true;}
            else equals = false;
            if (_month == other._month)
            {equals = true;}
            else equals = false;
            if (_day == other._day)
            {equals = true;}
            else equals = false;
            return equals;
    }//end of equals

    /**
     * check if this date is after other date
     * @param other date to compare this date to
     * @return true if this date is after other date
     */
    public boolean after(Date other) {
        boolean after=true;
        if (_year < other._year)
        {after = true;}
        else after = false;
        if (_month < other._month)
        {after = true;}
        else after = false;
        if (_day < other._day)
        {after = true;}
        else after = false;
        return after;
    }//end of after

    /**
     * check if this date is before other date
     * @param other date to compare this date to
     * @return true if this date is before other date
     */
    public boolean before(Date other) {
        boolean before=after(other);
        before=!before;
        return before;
    }//end of before

    /**
     * returns a String that represents this date
     * @return String that represents this date in the format: DD/MM/YYYY
     */
    public String toString()
    {
        String dayS=""+_day;
        String monthS=""+_month;
        String yearS=""+_year;
        String dateToReturn;
        if(dayS.length()==1)
        {
            dayS="0"+dayS;
        }
        if(monthS.length()==1)
        {
            monthS="0"+monthS;
        }
        dateToReturn=dayS+"/"+monthS+"/"+yearS;
        return dateToReturn;
    }//end of toString

   /** gets the year */
    public int getYear()
        {
        return _year;
    }

    /** gets the month */
    public int getMonth(){
        return _month;
    }

    /** gets the Day */
    public int getDay(){
        return _day;
    }

    /** sets the year
     * @param yearToSet - the year value to be set
     */
    public void setYear(int yearToSet){
        _year = yearToSet;
    }

    /** set the month
     * @param monthToSet - the month value to be set
     */
    public void setMonth(int monthToSet){
        _month = monthToSet;
    }

    /** sets the day
     *  @param dayToSet - the day value to be set
     */
    public void  setDay(int dayToSet){
        _day = dayToSet;
    }

    /**
     * check the difference between dates in days
     * @param other - the difference between dates
     * @return the difference in days
     */
//Check the difference in days:
    public int difference(Date other)
    {
        int absDay = (31 * (Math.abs(_day - other._day)));
        int absMonth =(12 * (Math.abs(_month - other._month)));
        int absYear = (365 * (Math.abs(_year - other._year)));
        return (absDay + absMonth + absYear);
    } //end of difference

    /**
     * calculate the date of tomorrow
     * @return tomorrow's date
     */
//tomorrow's date return
    public Date tomorrow()
    {
        boolean _isValid;
        _isValid = isValidDate(_day +1,_month,_year);
        if (_isValid)
        {
            _year = _year;
            _month = _month;
            _day = _day + 1;
        }
        else {
            _year = _year;
            _month = _month + 1;
            _day = 01;
            _isValid = isValidDate(_day, _month, _year);
            if (_isValid);
                //do nothing' date is valid
             else {
                _year = _year + 1;
                _month = 01;
                _day = 01;
                _isValid = isValidDate(_day, _month, _year);
                if (_isValid);
                    //do nothing' date is valid
                 else {
                    _day = DEFAULT_DAY;
                    _month = DEFAULT_MONTH;
                    _year = DEFAULT_YEAR;
                }
            }
        }
        //return (_day + "/" + _month + "/" + _year);
        return new Date(_day,_month,_year);
        }//end of tomorrow
    /**
     * calculate the day of the week that this date occurs on 0-Saturday 1-Sunday 2-Monday etc.
     * @return the day of the week that this date occurs on
     */
//Day in Week:
    public int dayInWeek()
    {
        int D=_day;
        int M=_month;
        int Y=_year%100;
        int C=_year/100;
        if(_month<3)
        {
            M=_month+12;
            Y--;
        }
        int calculateDay=(D+(26*(M+1))/10+Y+Y/4+C/4-2*C)%7;
        if(calculateDay<0)
            calculateDay=Math.floorMod(calculateDay,7);
        return calculateDay;
    }
    //
}//end of public