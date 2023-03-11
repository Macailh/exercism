import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Integer> binaryNumbers = new ArrayList<>();
        List<Signal> listSignal = new ArrayList<>();

        while (number != 0) {
            int mod = number % 2;
            number /= 2;

            binaryNumbers.add(mod);
        }

        for (int i = 0; i < binaryNumbers.size(); i++) {
            if (binaryNumbers.get(i) == 1) {
                if (i == 0) {
                    listSignal.add(Signal.WINK);
                } else if (i == 1) {
                    listSignal.add(Signal.DOUBLE_BLINK);
                } else if (i == 2) {
                    listSignal.add(Signal.CLOSE_YOUR_EYES);
                } else if (i == 3) {
                    listSignal.add(Signal.JUMP);
                } else if (i == 4) {
                    listSignal.sort(Comparator.reverseOrder());
                }
            }
        }
        return listSignal;
    }

}
