// Java 25
//ocp-25/src/Main.java:35: error: this case label is dominated by a preceding case label
//            case null -> "nope";
//                    ^
//                    1 error

//void main() {
//    final int score1 = 7, score2 = 3;
//    Integer myScore = 7;
//
//    var goal = switch (myScore) {
//        case score1, score2, 7 -> "good";
//        case Integer i when i < 10 -> "better";
//        case Integer i when i >= 10 -> "best";
//        default -> { yield "unknown"; }
//        case null -> "nope"; -------> WILL NOT COMPILE
//    };
//
//    IO.println(goal);
//}


// Java 21
class Main {
    static void main() {
        final int score1 = 8, score2 = 3;
        Integer myScore = 7;

        var goal = switch (myScore) {
            case score1, score2, 7 -> "good";
            case Integer i when i < 10 -> "better";
            case Integer i when i >= 10 -> "best";
            default -> { yield "unknown"; }
        };

        System.out.println(goal);
    }
}