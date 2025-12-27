package frq;

public class SignedText {

    private String first = "";
    private String last = "";

    public SignedText(String a, String b) {
        first = a;
        last = b;
    }

    public String getSignature() {
        if (!("".equals(first))) {
            return first.substring(0, 1) + "-" + last;
        } else {
            return last;
        }
    }

    public String addSignature(String text) {
        String signature = getSignature();
        int index = text.indexOf(signature);
        if (index == -1) {
            // case 1
            return text + signature;
        } else if (index == 0) {
            // case 3
            return (text.split(signature)[1] + signature);
        } else {
            // case 2
            return text;
        }
    }

    public static void main(String[] args) {

        String na = "Mister";

        SignedText st2 = new SignedText("henri", "jones");

        String temp = st2.getSignature();

        System.out.println(temp);

        System.out.println(st2.addSignature(na));
    }
}