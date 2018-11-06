public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder myTodo = new StringBuilder(todoText);
        myTodo.insert(0, "My todo: \n");

        StringBuilder games = new StringBuilder(myTodo);
        games.append(" - Download games \n");

        StringBuilder wholeText = new StringBuilder(games);
        wholeText.append("      - Diablo");

        System.out.println(wholeText);
    }
}