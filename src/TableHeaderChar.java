public class TableHeaderChar implements TableHeader {
    private String name;

    public TableHeaderChar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public TableData GetTableData() {
        return new TableDataChar ();
    }

}
