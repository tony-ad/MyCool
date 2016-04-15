/*
 * @Title MyAdapterWithCommViewHolder.java
 * @Copyright Copyright 2010-2015 Yann Software Co,.Ltd All Rights Reserved.
 * @Description��
 * @author Yann
 * @date 2015-8-5 ����10:03:45
 * @version 1.0
 */
package Adapter;

import java.util.List;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

/** 
 * ��ע��
 * @author Yann
 * @date 2015-8-5 ����10:03:45
 */
public class MyAdapter extends CommonAdapter<String>
{
	public MyAdapter(Context context, List<String> datas, int layoutId)
	{
		super(context, datas, layoutId);
	}

	@Override
	public void convert(ViewHolder holder, final String bean)
	{
		holder.setText(-1,bean);

	}

}
