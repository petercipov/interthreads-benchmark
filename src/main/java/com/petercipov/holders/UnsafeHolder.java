package com.petercipov.holders;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

/**
 *
 * @author pcipov
 */
@State(Scope.Group)
public class UnsafeHolder {
	private Object reference;
	
	public Object  get() {
		return reference;
	}
	
	public void set(Object value) {
		this.reference = value;
	}
}
