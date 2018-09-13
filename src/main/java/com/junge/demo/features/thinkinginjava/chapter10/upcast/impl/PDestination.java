package com.junge.demo.features.thinkinginjava.chapter10.upcast.impl;

import com.junge.demo.features.thinkinginjava.chapter10.upcast.Destination;

public class PDestination {

	protected class InnerDestination implements Destination {
		private String label;
		public InnerDestination(String label) {
			this.label = label;
		}
		
		@Override
		public String getReadLabel() {
			return this.label;
		}

		@Override
		public void setReadLabel(String label) {
			this.label = label;
			
		}
		
	}
	
	public Destination getDestination(String lable) {
		return new InnerDestination(lable);
	}
}
