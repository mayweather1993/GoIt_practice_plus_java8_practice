package module10;

import java.util.Arrays;

public class ElementAdder<T extends CanBeFeeded> {
    public <E> T[] addElementToArray(T[] animals, T element, E some) {
        T[] newarray = Arrays.copyOf(animals, animals.length + 1);
        newarray[newarray.length - 1] = element;
        element.feed();
        return newarray;
    }
}
