package com.journaldev.design.bridge;

import com.journaldev.design.bridge.GreenColor;
import com.journaldev.design.bridge.Pentagon;
import com.journaldev.design.bridge.RedColor;
import com.journaldev.design.bridge.Shape;
import com.journaldev.design.bridge.Triangle;

public class TestBridgePattern {

	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		
		Shape pentagon = new Pentagon(new GreenColor());
		pentagon.applyColor();
	}
}
