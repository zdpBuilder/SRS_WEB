package cn.zdp.domain;

/***
 * 
 * @ClassName:  Person   
 * @Description: Person抽象类  
 * @author: zdpBuilder
 * @date:   2020年9月21日 下午8:00:49      
 * @Copyright:
 */
public abstract class Person {
	
	private String name;
	private String ID;
	
	
	public Person(String name, String ssn) {
		this.setID(ssn);
		this.setName(name);
	}
	
	public Person() {
		this.setID("");
		this.setName("");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Person [姓名=" + name + ",证号=" + ID + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
