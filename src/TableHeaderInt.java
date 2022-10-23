public class TableHeaderInt implements TableHeader {

    private String name;

    public TableHeaderInt(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public TableData GetTableData() {
        return new TableDataInt ();
    }

}
