package iterator.after;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    private List<MenuItem> itemList;
    private int position;

    public PancakeHouseMenuIterator(List<MenuItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public boolean hasNext() {
        if (position >= itemList.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem result = itemList.get(position);
        position++;
        return result;
    }
}
