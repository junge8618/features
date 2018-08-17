/**
 * 
 */
package com.junge.demo.features;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.FlavorEvent;
import java.awt.datatransfer.FlavorListener;
import java.awt.event.AWTEventListener;
import java.awt.event.AWTEventListenerProxy;
import java.util.concurrent.TimeUnit;

/**
 * @author liuxj
 *
 */
public class ClipboardTest {

	public static void main(String[] args) {
		Toolkit.getDefaultToolkit().getSystemClipboard().addFlavorListener(new FlavorListener() {

			@Override
			public void flavorsChanged(FlavorEvent e) {

			}
		});

		Toolkit.getDefaultToolkit()
				.addAWTEventListener(new AWTEventListenerProxy(AWTEvent.KEY_EVENT_MASK, new AWTEventListener() {

					@Override
					public void eventDispatched(AWTEvent event) {
						System.out.println("ddddddddddd");

					}
				}), AWTEvent.KEY_EVENT_MASK);

		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getClipboardContent());
		}
	}

	public static String getClipboardContent() {

		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();

		DataFlavor flavor = DataFlavor.stringFlavor;
		if (clip.isDataFlavorAvailable(flavor)) {
			try {
				String s = (String) clip.getData(flavor);
				return s;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;

	}
}
