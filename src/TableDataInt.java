class TableDataInt implements TableData {
    private int data;

    public TableDataInt() {
        data = rnd.nextInt (100);
    }

    public String toString() {
        return Integer.toString (data);
    }

    public TableData GetTableData() {
        return new TableDataInt ();
    }
}
