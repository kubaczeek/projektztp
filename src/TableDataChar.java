public class TableDataChar implements TableData {

    public char data;

    public TableDataChar() {
        data = (char) (rnd.nextInt (93) + 33);
    }

    public String toString() {

        return Character.toString (data);
    }


    public TableData GetTableData() {
        return new TableDataChar ();
    }

}
