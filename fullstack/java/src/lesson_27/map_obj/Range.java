package lesson_27.map_obj;

import java.util.Iterator;

public record Range(int start, int end)
        implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator(){
        return new RangeIterator(start,end);
    }

    private final static class RangeIterator implements Iterator<Integer>{
        private final int end;
        private int start;

        public RangeIterator(int start, int end) {
            this.end = end;
            this.start = start;
        }

        @Override
        public boolean hasNext(){
            return start <= end;
        }
        @Override
        public Integer next(){
            return start++;
        }
    }
}
