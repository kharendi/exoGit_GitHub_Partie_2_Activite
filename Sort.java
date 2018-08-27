package pack.example;

public class Sort {
    public void stringsort(String[] names) {
        int n = names.length;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                if (names[i].compareTo(names[i + 1]) > 0) {
                    final String tmp = names[i + 1];
                    names[i + 1] = names[i];
                    names[i] = tmp;
                }
            }
            n--;
        }
    }
}
