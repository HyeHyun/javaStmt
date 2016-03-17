package forloop;

public class Tax {
	private String name;
	private int salary, tax;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setTax() {
		this.tax = (int) (salary * 0.1 / 12);
	}

	@Override
	public String toString() {
		return "Tax [이름=" + name + ", 연봉=" + salary + "만원, 세금=" + tax + "만원]";
	}
}
