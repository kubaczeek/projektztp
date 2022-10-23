public class TableDataBoolean implements TableData {

    private boolean data;

    public TableDataBoolean() {
        data = rnd.nextBoolean ();
    }

    public String toString() {
        return Boolean.toString (data);
    }

    @Override
    public TableData GetTableData() {
        return new TableDataBoolean ();
    }

}