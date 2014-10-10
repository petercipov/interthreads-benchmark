package com.petercipov.holders;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

/**
 *
 * @author pcipov
 */
@State(Scope.Group)
public class SynchronizedHolder {
	private Object reference;
	
	public Object  get() {
		synchronized(this) {
			return reference;
		}
	}
	
	public void set(Object value) {
		synchronized(this) {
			this.reference = value;
		}
	}
	
}
