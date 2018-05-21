package cumt.edu.cn.cumtordersys.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import cumt.edu.cn.cumtordersys.R;
import cumt.edu.cn.cumtordersys.App;
import cumt.edu.cn.cumtordersys.entity.User;
import cumt.edu.cn.cumtordersys.service.UserService;

/**
 *@date:2018年5月21日
 *@author:chenjibao
 *@description:
 */
public class LoginActivity extends BasicActivity {
	
	private EditText codeEdt;//用户编号
	private EditText passwordEdt;//密码
	private Button loginBtn;//登录按钮
	private Button cancelBtn;//取消按钮
	private UserService userService;//用户业务对象
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		userService=new UserService();
		
		codeEdt= (EditText)findViewById(R.id.codeEdt);
		passwordEdt= (EditText)findViewById(R.id.passwordEdt);
		loginBtn=(Button)findViewById(R.id.loginBtn);
		cancelBtn=(Button)findViewById(R.id.cancelBtn);
		
		loginBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String code=codeEdt.getText().toString().trim();
				String password=passwordEdt.getText().toString().trim();
				if(code.length()==0 || password.length()==0) {
					showMessageDialog("编号或密码不能为空！", R.drawable.warning, null);
					return;
				}
				User user =new UserService().login(code, password);
				if(user==null) {
					showMessageDialog("编号或密码错误", R.drawable.warning, null);
					return;
				}
				showMessageDialog("登录成功", R.drawable.info, null);
				App app=(App)getApplication();
				app.user=user;
				//TODO 转向主菜单界面
			}
		});
		
		cancelBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
	@Override
	protected String getName() {
		return "登录";
	}
}
