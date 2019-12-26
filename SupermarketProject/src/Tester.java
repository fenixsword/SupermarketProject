public class Tester
{
    public static void main(String[] args) {
      //is valid date tester:
        //check Y
        Date d1 = new Date(28,2,55);
        Date d2 = new Date(25,2,10000);
        Date d3 = new Date(31,12,2020);
        //check M
        Date d4 = new Date(24,14,2020);
        Date d5 = new Date(24,-1,2020);
        Date d6 = new Date(6,5,2020);
        //Check D
        Date d7 = new Date(40,10,2020);
        Date d8 = new Date(-1,10,2020);
        Date d9 = new Date(29,2,2020);
        Date d10 = new Date(30,2,2020);
        Date d11 = new Date(29,2,2020);
        Date d12 = new Date(28,2,2019);
        System.out.println(d1.isValidDate(d1.getDay(), d1.getMonth(), d1.getYear()));
        System.out.println(d2.isValidDate(d2.getDay(), d2.getMonth(), d2.getYear()));
        System.out.println(d3.isValidDate(d3.getDay(), d3.getMonth(), d3.getYear()));
        System.out.println(d4.isValidDate(d4.getDay(), d4.getMonth(), d4.getYear()));
        System.out.println(d5.isValidDate(d5.getDay(), d5.getMonth(), d5.getYear()));
        System.out.println(d6.isValidDate(d6.getDay(), d6.getMonth(), d6.getYear()));
        System.out.println(d7.isValidDate(d7.getDay(), d7.getMonth(), d7.getYear()));
        System.out.println(d8.isValidDate(d8.getDay(), d8.getMonth(), d8.getYear()));
        System.out.println(d9.isValidDate(d9.getDay(), d9.getMonth(), d9.getYear()));
        System.out.println(d10.isValidDate(d10.getDay(), d10.getMonth(), d10.getYear()));
        System.out.println(d11.isValidDate(d11.getDay(), d11.getMonth(), d11.getYear()));
        System.out.println(d12.isValidDate(d12.getDay(), d12.getMonth(), d12.getYear()));
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
        System.out.println(d5.toString());
        System.out.println(d6.toString());
        System.out.println(d7.toString());
        System.out.println(d8.toString());
        System.out.println(d9.toString());
        System.out.println(d10.toString());
        System.out.println(d11.toString());
        System.out.println(d12.toString());
    }
}