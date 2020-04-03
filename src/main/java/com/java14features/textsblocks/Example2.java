package com.java14features.textsblocks;

public class Example2 {

  public static void main(String[] args) {

    /*
      String text = """"""; // illegal text block start
      String text  = """ """; // illegal text block start
     * line-terminator) denoted by \
     * white space (single space) denoted by /s.
     * Parameter using %s
     */
    String html1 = """ 
              <html> 
                  <body> 
                      <p>%s, %s</p> 
                  </body> 
              </html> 
        """;
    String print = html1.formatted("Hello1", "Java 14");

    String html2 =
        String.format(""" 
                  <html> 
                      <body> 
                          <p>%s, %s</p> 
                      </body> 
                  </html> 
            """, "Hello2", "Java 14");

    String html3 = """ 
          <html> 
            <body> 
                <p>%s, %s</p> 
            </body> 
        </html> 
          """.formatted("Hello3", "Java 14");

    System.out.println(print);
    System.out.println(html2);
    System.out.println(html3);
  }
}
