public class TestApp {

    public static void main(String[] args) {
        ServletFilter filter=new Autentication();
        ServletFilter filter1=new Autentication1();
        ServletFilter filter2=new Autentication2();

        Request request=new Request("www.abc.com/a.jsp", "www.abc.com/a.jsp?username=abc & password=123");

        filter.nextFilter(filter1);
        filter1.nextFilter(filter2);

        filter.filter(request);

    }

}
abstract class ServletFilter{

    protected ServletFilter filter;

    public void nextFilter(ServletFilter filter) {
        this.filter = filter;
    }

    public abstract void filter(Request request);

}

class Request{

    String url;
    String parameter;

    public Request(String url, String parameter) {
        this.url = url;
        this.parameter = parameter;
    }


}

class Autentication extends ServletFilter{

    @Override
    public void filter(Request request) {

        String text= request.url;

        if(text.contains(".jsp")){
            System.out.println("URL Validated....");

            this.filter.filter(request);

        }else{
            System.out.println("invalid URL....");
        }

    }


}

class Autentication1 extends ServletFilter{

    @Override
    public void filter(Request request) {

        String text= request.parameter;

        if(text.contains("username") && text.contains("password")){
            System.out.println("Parameter Contains Correctly....");

            this.filter.filter(request);

        }else{
            System.out.println("Invalid parameters.....");
        }

    }


}

class Autentication2 extends ServletFilter{

    @Override
    public void filter(Request request) {

        String text= request.parameter;

        if(text.contains("username=abc") && text.contains("password=123")){
            System.out.println("Login Success....");


        }else{
            System.out.println("Invalid Username and password.....");
        }

    }


}
