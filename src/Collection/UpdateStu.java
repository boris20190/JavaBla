package Collection;

public class UpdateStu implements Comparable {

  private final String name;
  private final long id;

  public UpdateStu(String name, long id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public long getId() {
    return id;
  }

  public int compareTo(Object o) {
    UpdateStu ups = (UpdateStu) o;
    return Long.compare(id, ups.id);
  }
}
