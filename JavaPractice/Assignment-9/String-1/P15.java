//  WAP check if a String contains only digits?
class Check {
    private String str;

    public Check(String str) {
        this.str = str;
    }

    public Check() {
    }

    public void setStr(String str) {
        this.str = str;
    }

    public boolean checkDigits() {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }

        }
        return true;
    }

}

class Main {
    public static void main(String[] args) {
        String str = "1234n5";
        Check ch = new Check(str);
        if (ch.checkDigits()) {
            System.out.println("The String : " + str + "\n contains only digits. ");
        } else {
            System.out.println("The string : " + str + " does not contains only digits.");
        }
    }
}