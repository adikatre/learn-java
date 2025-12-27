package frq;

public class SignedText {

    private String first;
    private String last;

    public SignedText(String a, String b) {
        first = a;
        last = b;
    }

    public String getSignature() {
        if (!first.equals("")) {
            return first.substring(0, 1) + "-" + last;
        }
        return last;
    }

    public String addSignature(String text) {
        String sig = getSignature();
        int index = text.indexOf(sig);

        // Case 1: signature not present
        if (index == -1) {
            return text + sig;
        }
        // Case 2: signature at start
        else if (index == 0) {
            return text.substring(sig.length()) + sig;
        }
        // Case 3: signature already at end
        else {
            return text;
        }
    }
}
