/**
 * 
 */
package com.junge.demo.features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 键盘输入测试
 * @author liuxj
 *
 */
public class KeyboardInputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//systemInRead();
		//bufferRead();
		//scanner();
		scanner1();
	}
	
	public static void systemInRead() {
		try {
			char ch = (char)(System.in.read());
			do {
				System.out.println(ch);
				ch = (char)(System.in.read());
			} while('q' != ch);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void bufferRead() {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(in);
		try {
			String cmd = bufferedReader.readLine();
			while(!"q".equalsIgnoreCase(cmd.trim())) {
				System.out.println(cmd);
				cmd = bufferedReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void scanner() {
		Scanner sc = new Scanner(System.in);
		String cmd = sc.nextLine();
		while(!"q".equalsIgnoreCase(cmd)) {
			System.out.println(cmd);
			cmd = sc.nextLine();
		}
		sc.close();
		
	}
	
	public static void scanner1() {
		Scanner sc = new Scanner(System.in);
		int cmd = sc.nextInt();
		while(0 != cmd) {
			System.out.println(cmd);
			cmd = sc.nextInt();
		}
		sc.close();
		
	}

}
