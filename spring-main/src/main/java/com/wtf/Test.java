package com.wtf;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) throws MalformedURLException {
		Set set = new HashSet();  //定义Set集合对象
		set.add("apple");  //向集合中添加对象
		set.add("book");
		set.add("apple");
//		System.out.println(set.add("1"));
		String systemRootUrl = new File("").toURI().toURL().toString();
		System.out.println(systemRootUrl);
	}
}
