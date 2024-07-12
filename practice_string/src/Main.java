public class Main {
    public static void main(String[] args) {
//        String str = "www.examplk.com";
//        //String sub = str.substring(4).toUpperCase();
//        String fqdn = str.replace('k', 'e');
//        System.out.println(fqdn.compareTo(str));
//        System.out.println("WWW.EXAMPLE.COM".equalsIgnoreCase(fqdn));
//        System.out.println(str.equals("www.example.com"));
//        System.out.println(fqdn);
//        System.out.println(fqdn.charAt(3));
//        System.out.println(fqdn.compareTo(str));

          //Java Student Challenge 1

//        String email = "youssef.abbih@gmail.com";
//        int at_idx = email.indexOf('@');
//        int point_idx = email.indexOf('.', at_idx);
//        String user_name = email.substring(0, at_idx);
//        String domain_name = email.substring(at_idx + 1, email.length());
//        System.out.println(domain_name);
//        String name = email.substring(at_idx + 1, point_idx);
//        System.out.println(name.equals("gmail"));

          //Java Student Challenge 2

//        String str = "";
//        str.matches("^[01]+$");
//        str.matches("^[0-9A-Fa-f]+$");
//        str.matches("^(\\d{1,2})\\/(\\d{1,2})\\/(\\d{2,4})$");
        // java student challenge 3
        String s = "            Abbih           Youssef  ";
        String s1 =  "azdfzdcv654'-(-_fgb684é(EFFGFF'";
        String s2 = "Java is one of the worst programming languages";
        String pattern = "\\s+";
        String pattern1 = "[^\\w]";
        String s_without_extra_spaces = s.replaceAll(pattern, " ").trim();
        String s_without_special_chars = s1.replaceAll(pattern1, "");
        // if string have extra spaces remove them then trim the string and finaly do as below
        int wc = s2.split("\\s").length;
        System.out.println(s_without_extra_spaces);
        System.out.println(s_without_special_chars);
        System.out.println(wc);
        
    }
}