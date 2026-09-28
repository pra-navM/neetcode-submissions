class DynamicArray {

    private int[] arr;
    private int cap;
    private int len;
    

    public DynamicArray(int capacity) {
        this.cap = capacity;
        this.len = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(len==cap){
            resize();
        }
        arr[len] = n;
        len++;
    }

    public int popback() {
        if(len>0){
            len--;
        }
        return arr[len];
    }

    private void resize() {
        cap*=2;
        int[] newarr = new int[cap];
        for(int i=0; i<len; i++){
            newarr[i]=arr[i];
        }
        arr=newarr;
    }

    public int getSize() {
        return len;
    }

    public int getCapacity() {
        return cap;
    }
}
