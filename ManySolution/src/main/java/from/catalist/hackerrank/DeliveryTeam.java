package from.catalist.hackerrank;

import java.util.*;

public class DeliveryTeam {

  public static void main(String[] args) {
    DeliveryTeam result = new DeliveryTeam();
    result.start();
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);

    try {
      int size = Integer.parseInt(scanner.nextLine());
      List<String> preferenceA = Arrays.asList(scanner.nextLine().split(" "));
      List<String> preferenceB = Arrays.asList(scanner.nextLine().split(" "));

      Map<String, Integer> resources = mapDeliveryResources(size, preferenceA, preferenceB);

      StringBuilder builder = new StringBuilder();
      for (Integer teamNo: resources.values()) {
        builder.append(teamNo);
      }

      System.out.println(builder.toString());
    } catch (RuntimeException re) {
      System.out.println(re.getMessage());
    }
  }

  private Map<String, Integer> createResources(int size) {
    Map<String, Integer> resource = new LinkedHashMap<String, Integer>(6);

    for (int n = 1; n <= size; n++) {
      resource.put(Integer.toString(n), null);
    }

    return resource;
  }

  private Map<String, Integer> mapDeliveryResources(int size, List<String> preferencesA, List<String> preferencesB) {
    Map<String, Integer> resources = createResources(size);

    for (String resourceA : preferencesA) {
      if (resources.get(resourceA) == null) {
        resources.put(resourceA, 1);

        for (String resourceB : preferencesB) {
          if (resources.get(resourceB) == null) {
            resources.put(resourceB, 2);
            break;
          }
        }
      }
    }

    return resources;
  }
}
