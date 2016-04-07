package Adapter;

import java.util.List;

import com.example.mycool.R;

import android.content.Context;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.BaseAdapter;
import android.widget.TextView;  
  
public abstract class AllAdapter<T> extends BaseAdapter  
{  
    protected LayoutInflater mInflater;  
    protected Context mContext;  
    protected List<T> mDatas;  
  
    public AllAdapter(Context context, List<T> mDatas)  
    {  
        this.mContext = context;  
        this.mInflater = LayoutInflater.from(mContext);  
        this.mDatas = mDatas;  
    }  
  
    @Override  
    public int getCount()  
    {  
        return mDatas.size();  
    }  
  
    @Override  
    public T getItem(int position)  
    {  
        return mDatas.get(position);  
    }  
  
    @Override  
    public long getItemId(int position)  
    {  
        return position;  
    }   
  
    @Override  
    public View getView(int position, View convertView, ViewGroup parent){
    	 ViewHolder viewHolder = 
    			 ViewHolder.get(mContext, convertView, parent,  
                 R.layout.item, position); 
    	 
    	 
    	 convert(viewHolder,getItem(position));
         
         
         
         return viewHolder.getConvertView(); 
    } 
  
    
    public abstract void convert(ViewHolder vHolder,T t);
    
  
} 
