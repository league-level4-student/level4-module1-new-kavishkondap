package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String text = unfunkifiedText.toLowerCase();
		String [] arr = new String [text.length()];
		String answer ="";
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 ==0) {
				arr [i] = text.substring(i, i+1);
			}else {
				arr[i] = text.substring(i, i+1).toUpperCase();
			}
		}
		for (String x : arr) {
			answer = answer+x;
		}
		return answer;
	}
	


}
