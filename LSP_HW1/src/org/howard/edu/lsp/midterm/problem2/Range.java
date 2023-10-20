package org.howard.edu.lsp.midterm.problem2;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean isValuesInRange(int value) {
        return value >= start && value <= end;
    }

    public boolean doRangesOverlap(Range Range2) {
        return this.start <= Range2.end && Range2.start <= this.end;
    }

    public int size() {
        return Math.abs(end - start) + 1;
    }
}


