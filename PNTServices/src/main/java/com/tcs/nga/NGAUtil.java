//package com.tcs.nga;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class NGAUtil {
//
//	public String ReadFromfile() {
//
//		File file = new File(".\\jsonloctfr.txt"); 
//
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader(file));
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} 
//
//		String st = ""; 
//		String fullText = "";
//		try {
//			while ((st = br.readLine()) != null) {
//				System.out.println(st); 
//				fullText = fullText + st;
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		return fullText;
//	}
//	
//	public static void main(String args[]) {
//		NGAUtil ngaUtil = new NGAUtil();
//		ngaUtil.ReadFromfile();
//	}
//
//}
