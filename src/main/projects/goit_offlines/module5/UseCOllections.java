package module5;

import java.util.*;
import java.util.stream.Collectors;

public class UseCOllections {
    public static final int ID_CODE = 232324295;

    public static void main(String[] args) {
        Map<Integer, PersonTO> map = new HashMap<>();
        map.put(123123123, new PersonTO("Пугачев Н,G", "Some street", "Female"));
        map.put(234324292, new PersonTO("Пугачев Н,П", "Some street", "Female"));
        map.put(234324293, new PersonTO("Алеев К,Т", "Some street", "Female"));
        map.put(234324294, new PersonTO("Мирон В,О", "Some street", "Female"));
        map.put(232324295, new PersonTO("Никитина Т,П", "Best place", "Female"));
        map.put(234324296, new PersonTO("Олька А,Ц", "Some street", "Male"));
        map.put(234324297, new PersonTO("Олька А,Ц", "Some street", "Male"));

        String address = getAddressByIdCode(ID_CODE , map);
        System.out.println("Adress to find " + address);

        Collection<PersonTO>personTOS = map.values();

        ArrayList<PersonTO>sortedList = new ArrayList<PersonTO>(personTOS);

        Comparator<PersonTO>fioComparator = (o1 , o2) -> o1.getFio().compareTo(o2.getFio());
        Collections.sort(sortedList , fioComparator);

        List<PersonTO>filterPersonWtMale = map.values().stream().sorted(fioComparator).collect(Collectors.toList());
        printPersonList(filterPersonWtMale);
    }


    private static void printPersonList(List<PersonTO> sortedList) {
        for (PersonTO personTO :
                sortedList) {
            System.out.println(personTO);
        }
    }

    static String getAddressByIdCode(int idcode, Map<Integer, PersonTO> map) {
        printPersonList(new ArrayList<PersonTO>(map.values()));
        return map.get(idcode).getStreet();
    }
}
