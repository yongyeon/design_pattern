package iterator.common;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	private String name;
	private int age; 
	private String job;
	private String addr;

	public Person(String name, int age, String job, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job +", addr="+addr+"]";
	}
}
