class AnonymousDemo{
    public static void main(String[] args) {
        AnonymousClass objectOne = new AnonymousClass() {
            void printInfo () {
                System.out.println("My name is Arjun Adhikari.");
            }
        }; // Semicolon is needed here.

        objectOne.printInfo();
    }
}