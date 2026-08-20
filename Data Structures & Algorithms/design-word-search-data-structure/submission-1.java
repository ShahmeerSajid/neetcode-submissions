class WordDictionary {

    class Node {
        Node[] children = new Node[26];
        boolean isWord;
    }

    Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node current = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node();
            }

            current = current.children[index];
        }

        current.isWord = true;
    }

    public boolean search(String word) {
        return searchHelper(word, 0, root);
    }

    private boolean searchHelper(String word, int index, Node current) {

        // We reached the end of the word
        if (index == word.length()) {
            return current.isWord;
        }

        char c = word.charAt(index);

        // If we see '.', try every possible letter
        if (c == '.') {

            for (int i = 0; i < 26; i++) {

                if (current.children[i] != null) {

                    if (searchHelper(word, index + 1, current.children[i])) {
                        return true;
                    }
                }
            }

            return false;
        }

        // Normal letter
        int childIndex = c - 'a';

        if (current.children[childIndex] == null) {
            return false;
        }

        return searchHelper(word, index + 1, current.children[childIndex]);
    }
}