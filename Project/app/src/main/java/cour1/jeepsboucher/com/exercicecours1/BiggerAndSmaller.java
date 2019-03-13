package cour1.jeepsboucher.com.exercicecours1;

public class BiggerAndSmaller {

    public enum guessState{ONEBIGGER,TWOBIGGER,EQUAL};

    public static guessState findBigger(int txt1, int txt2) {
        if(txt1 > txt2) {
            return guessState.ONEBIGGER;
        } else if (txt2 > txt1) {
            return guessState.TWOBIGGER;
        } else {
            return guessState.EQUAL;
        }
    }
}
