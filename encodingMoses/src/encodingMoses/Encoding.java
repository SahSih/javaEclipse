package encodingMoses;

import java.util.*;

public static Set<String> morseCodes(int m, int n) {
    Set<String> result = new TreeSet<>();
    StringBuilder sb = new StringBuilder();
    ArrayList<String> elem = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      elem.add(".");
    }
    for (int i = 0; i < n; i++) {
      elem.add("-");
    }
    boolean[] used = new boolean[elem.size()];
    dfs(elem, used, sb, result);
    return result;
}
public static void dfs(ArrayList<String> elem, boolean[] used, StringBuilder sb, Set<String> result) {
      if (elem.size() == sb.length()){
          result.add(sb.toString());
          return;
      }
      for(int i = 0; i < elem.size(); i++){
          if (used[i]) continue;
          if (i > 0 && elem.get(i - 1) == elem.get(i) && !used[i-1]) continue;
          used[i] = true;
          sb.append(elem.get(i));
          dfs(elem, used, sb, result);
          used[i] = false;
          sb.deleteCharAt(sb.length() - 1);
      }
  }