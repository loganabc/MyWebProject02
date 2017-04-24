package logan.study.domain;
/*
 * <student idcard="5555">
		<name>张三</name>
		<location>上海</location>
		<grade>10</grade>
	</student>
 */
public class Student {
	private String name;
	private String idcard;
	private String location;
	private double grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

}
