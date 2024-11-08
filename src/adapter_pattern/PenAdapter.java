package adapter_pattern;

class PenAdapter implements Pen {
    private PilotPen pp;

    PenAdapter() {
        pp = new PilotPen();
    }

    @Override
    public void write(String s) {
        pp.mark(s);
    }
}
