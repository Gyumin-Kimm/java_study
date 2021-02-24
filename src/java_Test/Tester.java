package java_Test;

public class Tester {
	int testerID;
	String testerName;

	public Tester() {

	}

	public Tester(int testerID, String testerName) {
		this.testerID = testerID;
		this.testerName = testerName;
	}
	
	public void printTester() {
		System.out.println(testerID + ", " + testerName);
	}

	public int getTesterID() {
		return testerID;
	}

	public void setTesterID(int testerID) {
		this.testerID = testerID;
	}

	public String getTesterName() {
		return testerName;
	}

	public void setTesterName(String testerName) {
		this.testerName = testerName;
	}

}
