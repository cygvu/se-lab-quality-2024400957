public class Before {
    // 坏味道1：极度重复代码（两段几乎完全一样）
    public static void printOrderDetails(int orderId, double amount) {
        System.out.println("订单ID: " + orderId);
        System.out.println("订单金额: " + amount);
        if (amount > 1000) {
            System.out.println("大额订单，需要人工审核");
        } else {
            System.out.println("小额订单，自动处理");
        }
        System.out.println("订单处理完成");
    }

    public static void printRefundDetails(int refundId, double amount) {
        System.out.println("退款ID: " + refundId);
        System.out.println("退款金额: " + amount);
        if (amount > 1000) {
            System.out.println("大额退款，需要人工审核");
        } else {
            System.out.println("小额退款，自动处理");
        }
        System.out.println("退款处理完成");
    }

    // 坏味道2：超长方法（超过100行，CodeQL必报）
    public static void processEverything() {
        System.out.println("=== 初始化系统 ===");
        System.out.println("加载配置文件...");
        System.out.println("连接数据库...");
        System.out.println("验证用户权限...");
        System.out.println("读取订单数据...");
        System.out.println("读取用户数据...");
        System.out.println("读取商品数据...");
        System.out.println("=== 处理订单 ===");
        System.out.println("订单1：金额 500");
        System.out.println("订单1：状态 已支付");
        System.out.println("订单1：状态 已发货");
        System.out.println("订单1：状态 已签收");
        System.out.println("订单2：金额 1500");
        System.out.println("订单2：状态 已支付");
        System.out.println("订单2：状态 待发货");
        System.out.println("订单3：金额 200");
        System.out.println("订单3：状态 已取消");
        System.out.println("=== 处理退款 ===");
        System.out.println("退款1：金额 300");
        System.out.println("退款1：状态 已申请");
        System.out.println("退款1：状态 已审核");
        System.out.println("退款1：状态 已到账");
        System.out.println("退款2：金额 1200");
        System.out.println("退款2：状态 已申请");
        System.out.println("退款2：状态 待审核");
        System.out.println("=== 生成报表 ===");
        System.out.println("总订单数：3");
        System.out.println("总退款数：2");
        System.out.println("总金额：500+1500+200=2200");
        System.out.println("总退款金额：300+1200=1500");
        System.out.println("=== 结束流程 ===");
        System.out.println("关闭数据库连接...");
        System.out.println("释放系统资源...");
        System.out.println("程序运行结束");
    }

    public static void main(String[] args) {
        printOrderDetails(1, 500);
        printRefundDetails(101, 300);
        processEverything();
    }
}
