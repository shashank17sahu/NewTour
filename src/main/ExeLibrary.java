package main;

import java.io.IOException;

public class ExeLibrary  {

	public static void main(String[] args) throws InterruptedException, IOException {
		Library lb=new Library();
		lb.OpenURL("http://demo.guru99.com/test/newtours/");
		lb.Register("qwertyu", "asdfgh", "asdfgh");
		lb.Home();
		lb.CloseBrowers();
	}

}