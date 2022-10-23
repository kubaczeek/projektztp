import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ztp01 {
    public static void main(String[] args) {

        final Table table = new Table ();
        table.addCol (new TableHeaderInt ("int"));
        table.addCol (new TableHeaderDouble ("double"));
        table.addCol (new TableHeaderChar ("CHAR"));
        table.addCol (new TableHeaderBoolean ("bool"));
        table.addRow ();
        table.addRow ();
        System.out.println (table.toString ());
    }

}

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

interface TableData {
    static final Random rnd = new Random ();

    TableData GetTableData();
}

class TableDataBoolean implements TableData {

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

class TableDataChar implements TableData {

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

class TableDataDouble implements TableData {

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

interface TableHeader {
    TableData GetTableData();
}

class TableHeaderBoolean implements TableHeader {
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

class TableHeaderChar implements TableHeader {
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

class TableHeaderInt implements TableHeader {

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

class TableHeaderDouble implements TableHeader {

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