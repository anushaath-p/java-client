import java.util.Map;

public class ContainerMetrics {
  private String name;
  private Map<String, Quantity> usage;

  public String getName() {
    return name;
  }

  public Map<String, Quantity> getUsage() {
    return usage;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsage(Map<String, Quantity> usage) {
    this.usage = usage;
  }
}
