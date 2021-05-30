package com.research;

public class Dog3 extends Animal3 {
	public Dog3() {
		//这里默认调用父类的无参构造方法
	}

	public Dog3(int age) {
		//这里默认调用父类的无参构造方法
		this.age = age;
	}

	public Dog3(int age, String name) {
		//this(age);this和super不能同时出现
		super(age);//必须要放在第一句
		this.name = name;
	}
}
