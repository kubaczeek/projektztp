public class TableHeaderBoolean implements TableHeader {
    private String name;

    public TableHeaderBoolean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public TableData GetTableData() {
        return new TableDataBoolean ();
    }

}
