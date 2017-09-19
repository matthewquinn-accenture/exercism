class RaindropConverter {

    String convert(int number) {
        String rainDrop = "";

        if (number % 3 == 0) {
            rainDrop = "Pling";
        } else {
            rainDrop = "Plang";
        }
        return rainDrop;
    }

}
