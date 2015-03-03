package a1datetostring;
public class StringUtils {
    // if illegal month, this method return null
    static public String month2string( String month ) {
        return month2string( Integer.parseInt(month) );
    }
    static public String month2string( int month ) {
        switch ( month ) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
        }
        //return "Unknown";
        return null;
    }//month2string

    static public String day2string( String day ) {
        //int intDay = Integer.parseInt(day);
        return number2words( (Integer.parseInt(day)) );
    }

    // expecting YYYY as input
    static public String year2words( String year ) {
        // print century
        int intYear = Integer.parseInt(year);
        int century = intYear / 100;
        int decadeYear = intYear % 100;
        return number2words( century ) + " " + number2words( decadeYear );
    }

    // number in range 0, 1, 2, 3, 4, ... 20, ..., 99
    static public String number2words( int number ) {
        if ( 0 <= number && number <= 19 ) {
            return zero2nineteen[ number ];
        }

        // 20 -> 0
        // 20 / 10 -> 2
        // 2 - 2 -> 0
        String words = decades[ number / 10 - 2 ];
        if ( number % 10 == 0 ) {
            return words;
        }
        return words + " " + zero2nineteen[ number % 10 ];
    }

    static String[] zero2nineteen = {
        "Zero", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen", "Seventeen",
        "Eighteen", "Nineteen"
    };
    static String[] decades = {
        "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
        "Seventy", "Eighty", "Ninety"
    };
}//class Date2StringConverter
