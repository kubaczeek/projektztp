public class TableHeaderDouble implements TableHeader {

    private String name;

    public TableHeaderDouble(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public TableData GetTableData() {
        return new TableDataDouble ();
    }

}
