package com.java14features.textsblocks;

public class Example1 {

  public static void main(String[] args) {

    //Without Text Block
    String html = "<html>\n" +
                  "    <body>\n" +
                  "        <p>Hello, world</p>\n" +
                  "    </body>\n" +
                  "</html>\n";
    System.out.println(html);

    // Text Block
    String htmlTag = """ 
                      <html> 
                          <body> 
                              <p>Hello, world</p> 
                          </body> 
                      </html> 
                      """;
// Without Text Block
    String literal = "two escape sequences first is for newlines " +
                     "and, second is to signify white space " +
                     "or single space.";
//  Text Block
    String text = """ 
                two escape sequences first is for newlines \
                and, second is to signify white space \
                or single space.\
                """;
    // SQL example
    //Without Text Block
    String query = "SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`\n" +
                   "WHERE `CITY` = 'INDIANAPOLIS'\n" +
                   "ORDER BY `EMP_ID`, `LAST_NAME`;\n";

    String query1 = """ 
                       SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB` 
                       WHERE `CITY` = 'INDIANAPOLIS' 
                       ORDER BY `EMP_ID`, `LAST_NAME`; 
                   """;
  }
}
