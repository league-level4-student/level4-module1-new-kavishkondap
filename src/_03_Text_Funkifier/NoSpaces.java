package _03_Text_Funkifier;

public class NoSpaces implements TextFunkifier{
    private String unfunkifiedText;

    public NoSpaces (String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    
	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String [] noSpace = unfunkifiedText.split(" ");
		String ans = "";
		for (String x : noSpace) {
			ans = ans + x;
		}
		return ans;
	}

}
