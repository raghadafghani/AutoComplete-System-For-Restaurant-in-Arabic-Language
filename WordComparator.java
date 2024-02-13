package application;

import java.util.Comparator;

class WordComparator implements Comparator<WordProbabilityPair> {
    public int compare(WordProbabilityPair pair1, WordProbabilityPair pair2) {
        if (pair1.record.getProbability() < pair2.record.getProbability()) {
            return -1;
        }
        if (pair1.record.getProbability() > pair2.record.getProbability()) {
            return 1;
        }
        return 0;
    }
}
