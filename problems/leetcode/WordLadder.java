package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord)) {
			return 0;
		}
		Set<String> temp = new HashSet<>();
		for (int i = 0; i < wordList.size(); i++) {
			temp.add(wordList.get(i));
		}

		Queue<String> current = new LinkedList<>();
		current.add(beginWord);
		int depth = 0;
		while (!current.isEmpty()) {
			depth += 1;
			int size = current.size();
			for (int i = 0; i < size; i++) {
				String word = current.poll();
				if (word.equalsIgnoreCase(endWord)) {
					return depth;
				}

				for (int j = 0; j < word.length(); j++) {
					for (int k = 'a'; k <= 'z'; k++) {
						char arr[] = word.toCharArray();
						arr[j] = (char) k;
						String str = new String(arr);
						if (temp.contains(str)) {
							current.offer(str);
							temp.remove(str);
						}
					}
				}
			}
		}

		return 0;

	}
}
