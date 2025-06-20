package linear_search;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Dinesh";
        char target = 'i';
        Boolean ans = search(name, target);
        System.out.println(ans);
    }

    public static boolean search(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
