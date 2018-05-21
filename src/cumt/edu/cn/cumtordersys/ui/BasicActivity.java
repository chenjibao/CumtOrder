package cumt.edu.cn.cumtordersys.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import cumt.edu.cn.cumtordersys.App;
import cumt.edu.cn.cumtordersys.entity.User;

/**
 *@date:2018年5月21日
 *@author:chenjibao
 *@description:其他Activity的父类
 */
public abstract class BasicActivity extends Activity {
	
	AlertDialog.Builder dialogBuilder;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//获取应用程序标题
		String title="CumtOrder";//获取应用程序标题
		App app=(App)getApplication();
		User user=app.user;//获取当前登录用户实例
		if(user!=null) {
			title+=""+user.getUsercode();
		}
		title+=""+getName();
		setTitle(title);
		dialogBuilder=new AlertDialog.Builder(this);
	}
	
	protected void showMessageDialog(String message,int iconId,DialogInterface.OnClickListener onClickListener) {
		dialogBuilder.setIcon(iconId);//设置图标
		dialogBuilder.setCancelable(false);//单击其他区域对话框不消失
		dialogBuilder.setMessage(message);//设置信息
		dialogBuilder.setPositiveButton("确定", onClickListener);//确定按钮事件
		dialogBuilder.create().show();//显示对话框
		
		
	}
	/**
	 * @return 界面名称
	 */
	protected abstract String getName();
}
