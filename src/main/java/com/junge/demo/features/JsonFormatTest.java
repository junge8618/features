/**
 * 
 */
package com.junge.demo.features;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * json数据格式工具
 * 
 * @author liuxj
 *
 */
public class JsonFormatTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		tk.addAWTEventListener(new ImplAWTEventListener(), AWTEvent.KEY_EVENT_MASK);
		try {
			TimeUnit.MINUTES.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class ImplAWTEventListener implements AWTEventListener {
	@Override
	public void eventDispatched(AWTEvent event) {
		System.out.println("sdfasdfsadfsa");
		if (event.getClass() == KeyEvent.class) {
			// 被处理的事件是键盘事件.
			KeyEvent keyEvent = (KeyEvent) event;
			if (keyEvent.getID() == KeyEvent.KEY_PRESSED) {
				keyPressed(keyEvent);
			} else if (keyEvent.getID() == KeyEvent.KEY_RELEASED) {
				// 放开时你要做的事情
				keyReleased(keyEvent);
			}
		}
	}

	private void keyPressed(KeyEvent keyEvent) {
		System.out.println("dddddddddddddddd");
	}

	private void keyReleased(KeyEvent event) {
		System.out.println("fffffffffffffff");
	}
}
