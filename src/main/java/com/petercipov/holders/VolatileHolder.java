package com.petercipov.holders;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

/**
 *
 * @author pcipov
 */
@State(Scope.Group)
public class VolatileHolder {
	
	private volatile Object ref;
	
	public Object get() {
		return ref;
	}
	
	public void set(Object value) {
		this.ref = value;
	}
	
}
