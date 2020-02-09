import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @id 609
 * @author ranley
 * @level middle
 * @runtime 14ms faster than 99.7%
 */
public class FindDuplicateFileInSystem {
	public List<List<String>> findDuplicate(String[] paths) {
		if (paths == null || paths.length == 0) return new ArrayList<>();
		Map<String, List<String>> pathsByContent = new HashMap<>();
		for (String token : paths) process(token, pathsByContent);

		List<List<String>> duplicates = new ArrayList<>();
		for (String key : pathsByContent.keySet()) {
			if (pathsByContent.get(key).size() > 1) duplicates.add(pathsByContent.get(key));
		}
		return duplicates;
	}

	private void process(String token, Map<String, List<String>> pathsByContent) {
		char[] arr = token.toCharArray();
		StringBuilder dirSb = new StringBuilder();
		int i = parse(arr, dirSb, ' ', 0, 1);
		String directory = dirSb.append("/").toString();

		while (i < token.length()) {
			StringBuilder pathSb = new StringBuilder().append(directory), contentSb = new StringBuilder();
			int j = parse(arr, pathSb, '(', i, 1);
			i = parse(arr, contentSb, ')', j, 2);

			String content = contentSb.toString(); /* represents the current file content, add the path to the list of paths that has the same content */
			List<String> paths = pathsByContent.getOrDefault(content, new ArrayList<>());
			paths.add(pathSb.toString());
			pathsByContent.put(content, paths);
		}
	}

	private int parse(char[] arr, StringBuilder sb, char delimiter, int i, int skip) {
		while (i < arr.length && arr[i] != delimiter) sb.append(arr[i++]);
		return skip + i;
	}
}
