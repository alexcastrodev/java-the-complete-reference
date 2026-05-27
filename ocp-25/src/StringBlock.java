public class StringBlock {
    public static void main() {
        String tbl = "users";
        String query = """
                SELECT * FROM\s""" + tbl + """
                 left join "something"
                blah
                """;

        IO.println(query);

        // 1 Line
        String block = """
            doe \
            deer""";

        IO.println(block);

        // 4 Line
        block = """
            doe \n
            deer""";

        IO.println(block);
        IO.println("========\n");
        // 4 Line
        block = """
            "doe"\"\"\"
            """;

        IO.println(block);
    }
}
