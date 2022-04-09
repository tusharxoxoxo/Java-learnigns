public class string_stuff{
  public static void main(String[] args){
    String message = "using string in jAAAAa" + "!! $$ %%";
    System.out.println(message);
    System.out.println(message.endsWith("%%"));
    System.out.println(message.startsWith("sl"));
    System.out.println(message.length());
    System.out.println(message.indexOf("j"));
    System.out.println(message.indexOf("sky"));
    System.out.println(message.replace("!", "*"));
    System.out.println(message);
    System.out.println(message.toLowerCase());
    System.out.println(message.toUpperCase());
    String sessage = "        slkfjdlkj sdlfkj sldfsdSDFAWF";
    System.out.println(sessage.trim());
    System.out.println(sessage);
  }
}
