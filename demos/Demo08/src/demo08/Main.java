package demo08;

import demo08.GrandParent.Parent;
import demo08.GrandParent.Parent.Child;

public class Main {
public static void main(String[] args) {
	GrandParent gp = new GrandParent();
	Parent pr = gp.getParent();
	Child child = pr.getChild();
	
	}
}
