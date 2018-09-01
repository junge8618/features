/**
 * 
 */
package com.junge.demo.features.timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer定时 任务：
 * 指定时间调度一次
 * 指定时间开始调度，每2miao再调度一次
 * 
 * @author liuxj
 * @date 2018年8月31日
 */
public class TimerTest1 {

	/**
	 * 描述方法功能和使用场景
	 * @author liuxj
	 * @date 2018年8月31日
	 * @param args
	 */
	public static void main(String[] args) {
		scheduleDelay();
		scheduleDelayPeriod();

	}

	public static void scheduleDelay() {
		System.out.println("任务scheduleDelay开始时间:" + Calendar.getInstance().get(Calendar.SECOND));
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("当前线程名称:" + Thread.currentThread().getName() + "指定时间调度:" + Calendar.getInstance().get(Calendar.SECOND));
				
			}
			
		}, 2000);
	}
	
	public static void scheduleDelayPeriod() {
		System.out.println("任务scheduleDelayPeriod开始时间:" + Calendar.getInstance().get(Calendar.SECOND));
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("当前线程名称:" + Thread.currentThread().getName() + "指定时间调度:" + Calendar.getInstance().get(Calendar.SECOND));
				
			}
			
		}, 2000, 2000);
	}

}
