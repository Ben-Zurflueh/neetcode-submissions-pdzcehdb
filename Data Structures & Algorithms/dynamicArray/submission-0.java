class DynamicArray {

    int[] array;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        array = new int[capacity];
        size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        array[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return array[size];
    }

    private void resize() {
        int[] newArray = new int[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        this.capacity = capacity * 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
