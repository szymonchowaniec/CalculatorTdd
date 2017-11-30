public class Calculator {
    public int add(String s) {

        if(s.length()==0)
            return 0;

        String[] split = s.split(",");

        return sum(split);
    }

    public int sum(String ... digits){
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum+=Integer.valueOf(digits[i]);
        }
        return sum;
    }
}
