package module10;

public class UseEnums {
    public static void main(String[] args) {

//      int holidaysCount =  calculateHolidaysCountByMonthName(MonthEnum.ЯНВАРЬ);


        for (MonthEnum monthEnum : MonthEnum.values()) {
            System.out.println(monthEnum.getNameOfMOnth());
        }

        MonthEnum август = MonthEnum.valueOf("АВГУСТ");
        System.out.println("В " + август.getNameOfMOnth() + " " +  август.getHolidysCount());

        System.out.println("В " + MonthEnum.МAРТ.getNameOfMOnth() + " " + MonthEnum.МAРТ.getHolidysCount() + " праздников");
    }
}
