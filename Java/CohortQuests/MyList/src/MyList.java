public class MyList<T> {
    private T[] array;
    private int size;
    private int capacity;

    public MyList() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            expandCapacity();
        }
        array[size++] = data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedData = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
        return removedData;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T replacedData = array[index];
        array[index] = data;
        return replacedData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void expandCapacity() {
        int newCapacity = capacity * 2;
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        capacity = newCapacity;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            return null;
        }
        MyList<T> sublist = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}