package leetcode;

public class ImplementTrie {
	class TrieNode
	{
		TrieNode[] children ;
		boolean isEnd;
		TrieNode()
		{
			this.children =new TrieNode[26];
		}

		public boolean containsKey(char c)
		{
			return children[c-'a'] != null;
		}

		public void put(char c, TrieNode node)
		{
			children[c-'a'] = node;
		}

		public TrieNode get(char c)
		{
			return children[c-'a'];
		}

	}

	TrieNode root;
	public ImplementTrie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode current = root;
		for(int i = 0; i < word.length(); i++)
		{
			if(!current.containsKey(word.charAt(i)))
			{
				current.put(word.charAt(i), new TrieNode());
			}
			current = current.get(word.charAt(i));
		}

		current.isEnd = true;

	}
	public boolean search(String word) {
		TrieNode current = root;
		for(int i = 0; i < word.length(); i++)
		{
			if(!current.containsKey(word.charAt(i)))
			{
				return false;
			}
			current = current.get(word.charAt(i));
		}
		return current.isEnd;

	}

	public boolean startsWith(String prefix) {
		TrieNode current = root;
		for(int i = 0; i < prefix.length(); i++)
		{
			if(!current.containsKey(prefix.charAt(i)))
			{
				return false;
			}
			current = current.get(prefix.charAt(i));
		}
		return true;
	}
}
