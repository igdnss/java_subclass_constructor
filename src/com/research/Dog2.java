package com.research;

/**
 *子类
 */
public class Dog2 extends Animal2{
	
	public Dog2(){
		
	}
	public Dog2(int age) {
		this.age = age;
	}
	public Dog2(int age,String name) {
		//this()如果有的话，必须放在构造方法的第一名，不然会编译不通过。
		this(age);
		this.name= name;
	}
}
