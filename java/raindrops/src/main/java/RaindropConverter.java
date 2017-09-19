class RaindropConverter {

    String convert(int number) {
        String rainDrop = "";

        if (number % 7 == 0) {
            rainDrop = "Plong";
        } else if (number % 5 == 0){
            rainDrop = "Plang";
        } else {
            rainDrop = "Pling";
        }
        return rainDrop;
    }

}