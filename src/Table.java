import java.util.ArrayList;
import java.util.List;

class Table {
    private List<TableHeader> headers;
    private List<List<TableData>> row;

    public Table() {
        headers = new ArrayList<TableHeader> ();
        row = new ArrayList<List<TableData>> ();
    }

    public void addRow() {
        List<TableData> row = new ArrayList<TableData> ();
        for (TableHeader col : headers) {
            row.add (col.GetTableData ());
        }
        this.row.add (row);
    }

    public void addCol(TableHeader type) {
        headers.add (type);
        for (List<TableData> row : row) {
            row.add (type.GetTableData ()); // wywołanie metody fabrykującej
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder ();
        for (TableHeader header : headers)
            result.append ("| " + header + " ");
        result.append ("|\n");
        for (TableHeader header : headers)
            result.append ("+----");
        result.append ("+\n");
        for (List<TableData> data : row) {
            for (TableData cell : data)
                result.append ("| " + cell + " ");
            result.append ("|\n");
        }
        return result.toString ();
    }
}
