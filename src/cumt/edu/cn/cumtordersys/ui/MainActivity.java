package cumt.edu.cn.cumtordersys.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import cumt.edu.cn.cumtordersys.R;

/**
 *@date:2018��5��21��
 *@author:chenjibao
 *@description:
 */
public class MainActivity extends BasicActivity {
	int [] icons= {R.drawable.icon1,R.drawable.icon2,
			R.drawable.icon3,
			R.drawable.icon4,
			R.drawable.icon5};
	String [] iconTexts= {"���","����","����","��������","����"};
	GridView gdv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gdv=(GridView)findViewById(R.id.gdv);
		List<Map<String,Object>> iconList=new ArrayList<Map<String,Object>>();
		for (int i = 0,j=icons.length; i <j; i++) {
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("imageView", icons[i]);
			map.put("imageTitle",iconTexts[i]);
			iconList.add(map);
		}
		gdv.setAdapter(new SimpleAdapter(this,
				iconList,
				R.layout.main_menu_item, 
				new String[] {"imageView","imageTitle"},
				new int[] {R.id.imageView,R.id.imageTitle}));
		
		gdv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				switch(position) {
					case 0:
						showMessageDialog("���", R.drawable.info, null);
						break;
					case 1:
						showMessageDialog("����", R.drawable.info, null);
						break;
					case 2:
						showMessageDialog("����", R.drawable.info, null);
						break;
					case 3:
						showMessageDialog("��������", R.drawable.info, null);
						break;
					case 4:
						showMessageDialog("����", R.drawable.info, null);
						break;
				
				}
			}
		});
	}

	@Override
	protected String getName() {
		return "���˵�";
	}
}
