/**
 * 
 */
package com.junge.demo.features.timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务调度
 * 调用任务，第一次调用后2s再调用第二次，3s后再调用第三次，2s再调用第四次，交叉调用。
 * @author liuxj
 * @date 2018年8月31日
 */
public class TimerTest2 {
	
	private static int count = 0;

	/**
	 * 描述方法功能和使用场景
	 * @author liuxj
	 * @date 2018年8月31日
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("调用时间:" + Calendar.getInstance().get(Calendar.SECOND));
		
		class MyTimerTask extends TimerTask {
			@Override
			public void run() {
				count = (count + 1) % 2;
				System.out.println("线程名称:" + Thread.currentThread().getName() + "调用时间:" + Calendar.getInstance().get(Calendar.SECOND));
				new Timer().schedule(new MyTimerTask(), 2000 + 1000 * count);
			}
		}
		
		new Timer().schedule(new MyTimerTask(), 2000);

	}

}
