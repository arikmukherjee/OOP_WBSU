class A20 {

    // Declare native method
    public native void display();

    // Load native library
    static {
        System.loadLibrary("A20");
    }

    public static void main(String args[]) {

        A20 obj = new A20();

        obj.display();
    }
}