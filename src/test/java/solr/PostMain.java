package solr;

import org.apache.solr.util.SimplePostTool;

public class PostMain {

	public static void main(String[] args) {
		SimplePostTool spt = new SimplePostTool();
		String [] arg = new String[1];
		arg[0] = "-c gettingstarted docs";
		spt.main(arg);
	}
}
