package frq;

public class SignedText {

    private String first = "";
    private String last = "";
    private String temp = "";

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
        int index = text.indexOf(getSignature());
        if (index == -1) {
            return text + getSignature();
        } else if (text.indexOf(getSignature()) == text.length() - getSignature().length()) {
            return text;
        } else {
            String[] tmp = text.split(getSignature());
            // int start = text.indexOf(getSignature());

            return (tmp[1] + getSignature());
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
