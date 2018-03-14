package collections;

public class UniqueBankAccount {
	int id;
	String Name;

	public UniqueBankAccount(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}

	@Override
	public String toString() {
		return "UniqueBankAccount [id=" + id + ", Name=" + Name + "]";
	}

}
