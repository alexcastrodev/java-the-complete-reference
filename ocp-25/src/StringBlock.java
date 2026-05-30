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
            \"deer\"""
            """;

        IO.println("*" + block + "*");


        // MagicData
        // var magic = 1_329_.0; DOES NOT COMPILE
//         var magic = 3_1; // COMPILE
        // var magic = 3_13.0_; DOES NOT COMPILE
        // var magic = 5_291._2; // DOES NOT COMPILE
          var magic = 2_234.0_0; // COMPILE
//        var magic = 9___6; // COMPILE
        // var magic = _1_3_5_0; // DOES NOT COMPILE
        //
        IO.println(magic);
    }
}
