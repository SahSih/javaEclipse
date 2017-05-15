
public class Utility {
	

static boolean[] findMaximalClique(Graph g) {
	//if (g.size() == 0) return null;
	int i;
	for (i = g.size(); i >= 1; i--) {
	 if (g.hasClique(i) == true) {
	  break;
	 }
	} 
	boolean[] out = new boolean[g.size()];
	 for (int j = 0; j < g.size() - 1; j++) {
	  if (g.removeVertex(j).hasClique(i)) {
	   out[j] = true;
	  }
	 }
	 return out;
	}
}
