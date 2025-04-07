package shop.db;

public class SQL {
	
	// customer
	public static final String INSERT_CUSTOMER = "insert into `customer` set "
												+ "`custId`=?,"
												+ "`name`=?,"
												+ "`hp`=?,"
												+ "`addr`=?,"
												+ "`rdate`=NOW()";
	
	public static final String SELECT_CUSTOMER = "select * from `customer` where `custId`=?";
	public static final String SELECT_CUSTOMERS = "select * from `customer`";
	public static final String UPDATE_CUSTOMER = "update `coustomer` set "
												+ "`name`=?,"
												+ "`hp`=?, "
												+ "`addr`=? "
												+ "where `custId`=?";
					
	public static final String DELETE_CUSTOMER = "delete from `customer` where `custId`";

	
	// ORDER
	public static final String INSERT_ORDER = "insert into `order` set "
											+ "`orderNo`=?,"
											+ "`orderId`=?,"
											+ "`orderProduct`=?,"
											+ "`orderCount`=?, "
											+ "`orderDate`=NOW()";
	public static final String SELECT_ORDER = "select * from `order` where `orderNo`=?";
	public static final String SELECT_ORDER_BY_ORDERID = "select * from `order` where `orderId`=?";
	public static final String SELECT_ORDERS = "select * from `order`";
	public static final String UPDATE_ORDER = "update `order` set "
											+ "`orderId`=?, "
											+ "`orderProduct`=?, "
											+ "`orderCount`=?, "
											+ "where `orderNo`=?";
	public static final String DELETE_ORDER = "delete from `order` where `orderNo`";
				
	
	//Product
	public static final String INSERT_PRODUCT = "insert into `product` set "
												+ "`proNo`=?,"
												+ "`proName`=?,"
												+ "`stock`=?,"
												+ "`price`=?,"
												+ "`company`=?";
	
	public static final String SELECT_PRODUCT = "select * from `product` where `proNo`=?";
	public static final String SELECT_PRODUCTS = "select * from `product`";
	public static final String UPDATE_PRODUCT = "update `product` set "
												+ "`proname`=?,"
												+ "`stock`=?, "
												+ "`price`=?, "
												+ "`company`=?, "
												+ "where `proNo`=?";			
			
	public static final String DELETE_PRODUCT = "delete from `product` where `proNo`";
	
}
