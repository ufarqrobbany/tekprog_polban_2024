public class NewReleasePrice {
    double charge(int daysRented){
        return daysRented * 3;
    }

    int getFrequentRenterPoints(int daysRented){
        return (daysRented > 1) ? 2: 1;
    }
}
