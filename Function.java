import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    public static void functionone(book demo,ArrayList<book> list){
        boolean findit=false;
        for (int i=0;i<list.size();i++){
            if (demo.getBookNo().equals(list.get(i).getBookNo())){
                findit=true;
            }
        }
        if (findit==false) {
            boolean restult = list.add(demo);
            if (restult == true) {
                System.out.println("添加成功！");
            } else {
                System.out.println("添加失败");
            }
        }else {
            System.out.println("请勿重复添加书籍！");
        }
    }
    public static void functiontwo(ArrayList<book> list){
        for (int i=0;i<list.size();i++){
            System.out.println("图书编号为："+list.get(i).getBookNo()+"---"+"图书名为："+list.get(i).getBookName()+"---"+"作者为："+list.get(i).getBookAuthor()+"---"+"售价为："+list.get(i).getBookPrice());
        }
    }
    public static void functionthree(ArrayList<book> list){
        System.out.println("请输入作者姓名：");
        Scanner in=new Scanner(System.in);
        String name=in.next();
        for (int index=0;index<list.size();index++){
            if(name.equals(list.get(index).getBookAuthor())){
                System.out.println("图书编号为："+list.get(index).getBookNo()+"———————————————————"+"图书名为："+list.get(index).getBookName()+"——————————————————"+"作者为："+list.get(index).getBookAuthor()+"—————————————————————————————————————"+"售价为："+list.get(index).getBookPrice());
            }
        }
    }
    public static void functionfour(ArrayList<book> list){
        System.out.println("请输入要删除的图书（编号）");
        Scanner in=new Scanner(System.in);
        String number=in.next();
        for (int index=0;index<list.size();index++) {
            if (number.equals(list.get(index).getBookNo())) {
                list.remove(index);
                System.out.println("修改成功");
            }else {
                System.out.println("没有相应的图书");
            }
        }
    }
    public static void functionfive(ArrayList<book> list){
        System.out.println("请输入要修改的图书编号：");
        Scanner in=new Scanner(System.in);
        String number=in.next();
        boolean find=false;
        for (int index=0;index<list.size();index++) {
            if (number.equals(list.get(index).getBookNo())) {
                find=true;
                System.out.println("请输入要修改的项目");
                System.out.println("1、图书名字");
                System.out.println("2、图书作者");
                System.out.println("3、图书价格");
                System.out.println("0、退出");
                String opt=in.next();
                System.out.println("请输入：");
                if(opt.equals("1")){
                    String bookname=in.next();
                    list.get(index).setBookName(bookname);
                    System.out.println("修改成功！");
                }else if(opt.equals("2")){
                    String bookauthor=in.next();
                    list.get(index).setBookAuthor(bookauthor);
                    System.out.println("修改成功！");
                }else if(opt.equals("3")){
                    String bookprice=in.next();
                    list.get(index).setBookPrice(bookprice);
                    System.out.println("修改成功");
                }else if(opt.equals("0")){
                    break;
                }else {
                    System.out.println("输入错误");
                    break;
                }
            }
        }
        if(find==false){
            System.out.println("暂无相应编号书籍");
        }
    }

}
