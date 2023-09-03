package idv.lance;

public class Person {
  private final String name;
	private final Location location;

  public Person(String name, Location location) {
	this.name = name;
	this.location = location;
  }

  public String name() {
	return name;
  }
}
