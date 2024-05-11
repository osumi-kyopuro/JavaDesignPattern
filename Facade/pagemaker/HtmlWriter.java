package Facade.pagemaker;

import java.io.Writer;
import java.io.IOException;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer){
        this.writer=writer;
    }

    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n"); // \n を使用する
        writer.write("<h1>" + title + "</h1>\n"); // \n を使用する
    }
    

    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>\n"); // \n を使用する
    }
    
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>"); // 修正
    }
    
    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }

    public void close() throws IOException{
        writer.write("</body>");
        writer.write("</html>\n"); // \n を使用する
        writer.close();
    }
}
