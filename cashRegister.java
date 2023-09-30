public class cashRegister {
    public static void main(String[] args) {
        keyboard userInput = new keyboard();
        int id = userInput.input();
        database producDatabase = new database();
        String[] productDetails = producDatabase.queryID(id);
        if(productDetails != null) {
            display screen = new display();
            screen.printScreen(productDetails[0], Double.parseDouble(productDetails[1]));
        } else {
            System.out.println("Product does not exist");
        }
    }
}
