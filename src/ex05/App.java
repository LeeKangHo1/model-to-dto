package ex05;

public class App {
    public static void main(String[] args) {
        ControllerAdvice controllerAdvice = new ControllerAdvice();
        // 어노테이션 이름이 다른 이유 -> Controller보다 Service가 먼저 IoC에 들어가야 하니까
        Repository repository = new Repository();
        Service service = new Service(repository);
        Controller con = new Controller(service);
        DispatcherServlet ds = new DispatcherServlet(con, controllerAdvice);

        ds.route("/board");
    }
}