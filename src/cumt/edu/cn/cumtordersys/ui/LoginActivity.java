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
 *@date:2018��5��21��
 *@author:chenjibao
 *@description:
 */
public class LoginActivity extends BasicActivity {
	
	private EditText codeEdt;//�û����
	private EditText passwordEdt;//����
	private Button loginBtn;//��¼��ť
	private Button cancelBtn;//ȡ����ť
	private UserService userService;//�û�ҵ�����
	
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
					showMessageDialog("��Ż����벻��Ϊ�գ�", R.drawable.warning, null);
					return;
				}
				User user =new UserService().login(code, password);
				if(user==null) {
					showMessageDialog("��Ż��������", R.drawable.warning, null);
					return;
				}
				showMessageDialog("��¼�ɹ�", R.drawable.info, null);
				App app=(App)getApplication();
				app.user=user;
				//TODO ת�����˵�����
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
		return "��¼";
	}
}
