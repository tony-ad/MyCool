package Adapter;

import java.util.List;

import com.example.mycool.R;

import android.content.Context;
  
public class MyAdapter<T> extends AllAdapter<String>{  

    public MyAdapter(Context context, List<String> mDatas)  
    {  
        super(context, mDatas);  
    }  
  
    
	@Override
	public void convert(ViewHolder vHolder, String t) {
		// TODO Auto-generated method stub
		vHolder.setText(R.id.text, t);
	}
}  
