package com.research;

/**
 *����
 */
public class Dog1 extends Animal1 {
	public Dog1() {}
	public Dog1(int age) {
		this.age = age;
	}
	public Dog1(int age,String name) {
		//this()����еĻ���������ڹ��췽���ĵ�һ������Ȼ����벻ͨ����
		this(age);
		this.name= name;
	}
}
