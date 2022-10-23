public class TableDataDouble implements TableData {

    private double data;

    public TableDataDouble() {
        data = rnd.nextDouble ();
    }

    public String toString() {
        return Double.toString (data).substring (0, 5);
    }

    @Override
    public TableData GetTableData() {
        return new TableDataDouble ();
    }

}
