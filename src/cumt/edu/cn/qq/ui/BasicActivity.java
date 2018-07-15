package cumt.edu.cn.qq.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import cumt.edu.cn.cjb.qqlogin.App;
import cumt.edu.cn.qq.entity.User;

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
	/**
	 * 显示Activity
	 * @param context 上下文
	 * @param contextClass 需要显示的界面class
	 */
	protected void showActivity(Context context,Class<? extends Context> contextClass) {
		Intent intent=new Intent(context, contextClass);
		startActivity(intent);
	}
}
