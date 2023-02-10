public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i : Range.fromTo(0, 10)) {
            System.out.println(i);
        }
    }
    private static class Range implements Iterable<Integer>{
        int start;
        int end;
        public static Range fromTo (int from, int to) {
            return new Range(from, to);
        }
        private Range (int start, int end) {
            System.out.println("Range");
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator iterator() {
            System.out.println("Range.iterator");
            return new Iterator(start);
        }
        public class Iterator implements java.util.Iterator<Integer> {
            int current;
            public Iterator (int current) {
                System.out.println("Iterator");
                this.current = current;
            }
            @Override
            public boolean hasNext() {
                System.out.println("hasNext");
                return current <= end;
            }
            @Override
            public Integer next() {
                System.out.println("next");
                return current++;
            }
        }
    }
}