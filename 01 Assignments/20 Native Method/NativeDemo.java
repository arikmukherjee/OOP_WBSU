class NativeDemo {

    // Declare native method
    public native void showMessage();

    // Load the shared library
    static {
        System.loadLibrary("NativeLib");
    }

    public static void main(String[] args) {
        NativeDemo obj = new NativeDemo();
        obj.showMessage();
    }
}