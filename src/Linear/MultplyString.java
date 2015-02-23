package Linear;

public class MultplyString {
	public String multiply(String num1, String num2) {
        int lth1 = num1.length();
        int lth2 = num2.length();
        int rst[] = new int[lth1+lth2];
        int carry = 0;
        for (int i = 0; i < lth1; i++){
            for (int j = 0; j < lth2; j++){
                int mul = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j)) + carry;
                rst[j+i] = mul%10;
                carry = mul/10;
            }
            rst[i+lth2] += carry;
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < rst.length; i++){
            if (!flag && rst[i] == 0) continue;
            flag = true;
            sb.append(rst[i]);
        }
        return sb.toString();
    }
}
