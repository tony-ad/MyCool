//package Menu.MenuDrawer;
//
//public class 说明 {
//
//	1.倒入依赖类
//	
//	
//	一般使用：
//
//    //创建
//    mMenuDrawer = MenuDrawer.attach(this, MenuDrawer.MENU_DRAG_CONTENT, Position.LEFT);        
//    //打开形式-抽屉
//    mMenuDrawer.setTouchMode(MenuDrawer.TOUCH_MODE_FULLSCREEN);  
//
//  mMenuDrawer.setContentView(R.layout.main);  
//  mMenuDrawer.setMenuView(R.layout.menu);  
//
//  //设置阴影
////mMenuDrawer.setDropShadow(R.drawable.shadow);  
//
//  //设置阴影大小
////mMenuDrawer.setDropShadowSize((int)getResources().getDimension(R.dimen.shadow_width));  
//
//  //设置动画的最大持续时间
////mMenuDrawer.setMaxAnimationDuration(3000);  
//
//  //是否启动硬件层
//  mMenuDrawer.setHardwareLayerEnabled(false);  
//
////mMenuDrawer.setMenuSize((int)getResources().getDimension(R.dimen.slidingmenu_offset));  
//
//	
//	
//	
//	1、将MenuDrawer绑定到当前的Activity中，并返回MenuDrawer对象
//	这几个方法是静态方法，是创建MenuDrawer对象的方法，注意：MenuDrawer没有构造方法
//	MenuDrawer.attch(Activity activity, int dragMode, Position position, boolean attachStatic) 
//	参数：
//	1.活动
//	2.菜单视图的加载模式
//	    2.1.普通模式：MenuDrawer.MENU_DRAG_CONTENT
//	    2.2.填充窗口模式：MenuDrawer.MENU_DRAG_WINDOW
//	3.位置
//	4.是否静态的显示一个Menu视图，即菜单不能够滑动
//
//
//
//
//	2、向MenuDrawer中添加内容视图
//	setContentView(int layoutResId)  通过布局文件的ID加载
//	setContentView(View view)         直接通过View加载
//	setContentView(View view, LayoutParams params)
//
//
//
//	3、向MenuDrawer中添加菜单视图 （一般是加载ListView）
//	setMenuView(int layoutResId)
//	setMenuView(View view)
//	setMenuView(View view, LayoutParams params)
//
//
//
//	4、向当前的选中项中添加 "指针" 用来标定当前的活动项
//	setActiveView(View view, int position) 
//	参数 View ： 当前的菜单项对应的View
//	参数position： 当前View在adapter中的位置
//	注意：想要在程序中使用“指针”的功能的话，应该有三步：
//	①在Manifest.xml文件中为当前的Activity配置主题含有“指针”图片的Theme主题
//	②在Adapter的getView（）方法中调用setTag（R.id.mdActiveViewPosition, position）方法
//	③调用上面的setActiveView（）方法
//
//
//
//	5、关闭选项菜单/打开选项菜单
//	closeMenu();
//	closeMenu(boolean animate）； 是否使用动画，但是和上面的方法在效果上基本没有什么分别
//	toggleMenu(); 这个是一个开关选项，当菜单视图处于打开模式时，调用这个方法，那么菜单视图就会关闭，反之，菜单就会打开
//
//
//
//	6、返回当前的菜单视图的状态
//	int  getDrawerState()
//	比如正在展开、正在关闭、已经展开、已经关闭等等
//
//
//
//	7、设置菜单视图的大小
//	setMenuSize（int size）
//	我们亦可以在style文件中更改这个属性，一会儿你就秒懂了
//
//
//	8、重新绘制当前的MenuDrawer对象
//	invalidate()
//
//	9、自动开启菜单视图
//	peekDrawer();
//
//	这个方法并不是将菜单视图整个显示出来，而是讲菜单视图轻轻的抻出一小条，这样为的是能够让用户发现在左边隐藏着一个菜单视图，这个方法一般放在Activity的onCreate（）方法中，并且一般只使用一次
//
//
//
//
//
//
//
//	
//}
