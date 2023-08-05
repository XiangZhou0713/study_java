import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        ArrayList<book> books=new ArrayList<>();
        try {
            Scanner in = new Scanner(System.in);
            while (true){
                System.out.println("—————————————————————————欢迎来到图书管理系统！——————————————————————");
                System.out.println("1、添加图书");
                System.out.println("2、查询全部图书信息");
                System.out.println("3、按书名查询图书");
                System.out.println("4、删除图书（按编号）");
                System.out.println("5、修改图书信息" );
                System.out.println("0、退出系统");
                System.out.println("————————————————————————————————————————————————————————————————————————————————————————————————");
                System.out.println("请输入你的指令数字：");
                String number = in.next();
                if(number.equals("1")){
                    book demo = new book();
                    System.out.println("请输入书籍编号：");
                    String book_num = in.next();
                    System.out.println("请输入书籍名字：");
                    String book_name = in.next();
                    System.out.println("请输入书籍作者：");
                    String book_author = in.next();
                    System.out.println("请输入书籍价格：");
                    String book_price = in.next();
                    demo.setBookNo(book_num);
                    demo.setBookName(book_name);
                    demo.setBookAuthor(book_author);
                    demo.setBookPrice(book_price);
                    Function.functionone(demo, books);
                }else if (number.equals("2")) {
                    Function.functiontwo(books);
                }
                else if (number.equals("3")) {
                    Function.functionthree(books);
                }else if (number.equals("4")) {
                    Function.functionfour(books);
                }else if (number.equals("5")) {
                    Function.functionfive(books);
                }else if (number.equals("0")){
                    break;
                }else
                    System.out.println("输入指令不符合要求！");
            }
        }catch(Exception e){
            System.out.println("系统出错！！！");
        }

    }
}
