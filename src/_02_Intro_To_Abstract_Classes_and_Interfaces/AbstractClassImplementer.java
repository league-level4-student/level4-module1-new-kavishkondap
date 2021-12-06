package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class AbstractClassImplementer extends AbstractClassDemo implements InterfaceDemo, DemoInterface{

	@Override
	public void abstractDemo() {
		// TODO Auto-generated method stub
		System.out.println("IMPLEMENTING COOL THINGS");
	}

	@Override
	public int abstractNumDemo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String faceDemo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double interDemo() {
		// TODO Auto-generated method stub
		return 0;
	//super.num=1;

}}
