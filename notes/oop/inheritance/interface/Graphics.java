interface Graphics{
    void draw();

    default void pencil(){
        System.out.println("This is pencil method from Graphics.");
    }
}