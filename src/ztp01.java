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