abstract class Price {
    abstract int getPriceCode() {
    }



    class ChildrensPrice extends Price {
        int getPriceCode() {
            Return Movie.CHILDREN;
        }
    }

    class NewReleasePrice extends Price {
        int getPriceCode() {
            Return Movie.NEW_RELEASE;
        }
    }

    class RegularPrice extends Price {
        int getPriceCode() {
            Return Movie.REGULAR;
        }
    }

    abstract double getCharge(int daysRented);


    int getFrequentRenterPoints(int daysRented){
        return 1;
    }

}