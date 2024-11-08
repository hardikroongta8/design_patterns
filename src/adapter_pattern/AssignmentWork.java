package adapter_pattern;

class AssignmentWork {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignment(String str) {
        setP(new PenAdapter());
        p.write(str);
    }
}
