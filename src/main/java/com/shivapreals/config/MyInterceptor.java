package com.shivapreals.config;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
public class MyInterceptor extends EmptyInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) 
	{
		System.out.println(entity+"**");
		return false;
	}
}
