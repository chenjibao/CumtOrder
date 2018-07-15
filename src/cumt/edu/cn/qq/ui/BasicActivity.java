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
 *@date:2018��5��21��
 *@author:chenjibao
 *@description:����Activity�ĸ���
 */
public abstract class BasicActivity extends Activity {
	
	AlertDialog.Builder dialogBuilder;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//��ȡӦ�ó������
		String title="CumtOrder";//��ȡӦ�ó������
		App app=(App)getApplication();
		User user=app.user;//��ȡ��ǰ��¼�û�ʵ��
		if(user!=null) {
			title+=""+user.getUsercode();
		}
		title+=""+getName();
		setTitle(title);
		dialogBuilder=new AlertDialog.Builder(this);
	}
	
	protected void showMessageDialog(String message,int iconId,DialogInterface.OnClickListener onClickListener) {
		dialogBuilder.setIcon(iconId);//����ͼ��
		dialogBuilder.setCancelable(false);//������������Ի�����ʧ
		dialogBuilder.setMessage(message);//������Ϣ
		dialogBuilder.setPositiveButton("ȷ��", onClickListener);//ȷ����ť�¼�
		dialogBuilder.create().show();//��ʾ�Ի���
		
		
	}
	/**
	 * @return ��������
	 */
	protected abstract String getName();
	/**
	 * ��ʾActivity
	 * @param context ������
	 * @param contextClass ��Ҫ��ʾ�Ľ���class
	 */
	protected void showActivity(Context context,Class<? extends Context> contextClass) {
		Intent intent=new Intent(context, contextClass);
		startActivity(intent);
	}
}
