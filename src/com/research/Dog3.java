package com.research;

public class Dog3 extends Animal3 {
	public Dog3() {
		//����Ĭ�ϵ��ø�����޲ι��췽��
	}

	public Dog3(int age) {
		//����Ĭ�ϵ��ø�����޲ι��췽��
		this.age = age;
	}

	public Dog3(int age, String name) {
		//this(age);this��super����ͬʱ����
		super(age);//����Ҫ���ڵ�һ��
		this.name = name;
	}
}
