
public class APIGateway {
    UserService userService;
    OrderService orderService;

    public APIGateway(){
        this.userService=new UserService();
        this.orderService=new OrderService();
    }

    public String getFulldetail(String orderId,String userId){
        String userdetail= userService.getUserDetails(userId);
        String orderdetail= orderService.getOrderDetails(orderId);
        return userdetail + "\n"+orderdetail;
    }
    
}
