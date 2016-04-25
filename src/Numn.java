public class Numn {
    private double n;

    public void setN(double n) {
        this.n = n;
    }
    public int getMin() {
        int min = 9;
        String s = Double.toString(n);
        char[] chArray = s.toCharArray();
        for (int i = 0; i<chArray.length; i++) {
            if (chArray[i] != '.') {
                if (Character.digit(chArray[i],10) < min) min = Character.digit(chArray[i],10);
            }
        }
        return min;
    }
    public int getMax() {
        int max = 0;
        String s = Double.toString(n);
        char[] chArray = s.toCharArray();
        for (int i = 0; i<chArray.length; i++) {
            if (chArray[i] != '.') {
                if (Character.digit(chArray[i],10) > max) max = Character.digit(chArray[i],10);
            }
        }
        return max;
    }
}
