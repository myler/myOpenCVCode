package org.myl.test;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class TestOpenCV {

	public static void main(String[] args) {
		System.out.println("Welcome to OpenCV " + Core.VERSION);
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat m = Mat.eye(6, 6, CvType.CV_8UC1);
		System.out.println("m = \n" + m.dump());
	}
}