package flywight;

public class ConcreteWebSite extends WebSite{

    //内部状态
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        // TODO Auto-generated method stub
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
