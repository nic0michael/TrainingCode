public class PlayWithCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int potatoes = 3;
        int tomatoes = 2;
        int numberOfVegetables = calculator.add(potatoes, tomatoes);
        System.out.println("The number of vegetables " + numberOfVegetables);

        long webPageHits = 1234567L;
        long youtubeSubscribers = 4567890L;
        long numberOfPotentialCustomers = calculator.add(webPageHits, youtubeSubscribers);

        System.out.println("The number of potential customers " + numberOfPotentialCustomers);



        double price = 28.50;
        double tax = 2.55;
        double amountToPay = calculator.add(price, tax);
        System.out.println("The amount to pay is $" + amountToPay);
    }
}

