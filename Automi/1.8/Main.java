public class Main {
    public static boolean scan(String s) {
        int state = 0;
        int i = 0;
        while (state >= 0 && i < s.length()) {
            final char ch = s.charAt(i++);
            switch (state) {
                case 0:
                    if (ch == 'v')
                        state = 1;
                    else
                        state = 6;
                    break;
                case 1:
                    if (ch == 'i')
                        state = 2;
                    else
                        state = 7;
                    break;
                case 2:
                    if (ch == 't')
                        state = 3;
                    else
                        state = 8;
                    break;
                case 3:
                    if (ch == 't')
                        state = 4;
                    else
                        state = 9;
                    break;
                case 4:
                    if (ch == 'o')
                        state = 5;
                    else
                        state = 10;
                    break;
                case 5:
                    state = -1;
                    break;
                case 6:
                    if (ch == 'i')
                        state = 7;
                    else
                        state = -1;
                    break;
                case 7:
                    if (ch == 't')
                        state = 8;
                    else
                        state = -1;
                    break;
                case 8:
                    if (ch == 't')
                        state = 9;
                    else
                        state = -1;
                    break;
                case 9:
                    if (ch == 'o')
                        state = 10;
                    else
                        state = -1;
                    break;
                case 10:
                    state = -1;
                    break;
            }
        }
        return (state == 5) || (state == 10);
    }

    public static void main(String[] args) {
        System.out.println(scan(args[0]) ? "OK" : "NOPE");
    }
}
