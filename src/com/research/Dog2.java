package com.research;

/**
 *����
 */
public class Dog2 extends Animal2{
	
	public Dog2(){
		
	}
	public Dog2(int age) {
		this.age = age;
	}
	public Dog2(int age,String name) {
		//this()����еĻ���������ڹ��췽���ĵ�һ������Ȼ����벻ͨ����
		this(age);
		this.name= name;
	}
}
