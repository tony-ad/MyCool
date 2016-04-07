package Adapter;

import android.R.integer;
import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.gesture.GestureOverlayView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewHolder  
{  
	private SparseArray<View> mViews;
	private int mPosition;
	private View mConvertView;
	
	public ViewHolder
	(Context context,ViewGroup parent,int layoutId,int position){
		this.mPosition=position;
		this.mViews=new SparseArray<View>();
		mConvertView=LayoutInflater.from(context).inflate(layoutId, parent,false);
		mConvertView.setTag(this);
	}
	
	/**
	 * 
	 * @param context
	 * @param convertView
	 * @param parent
	 * @param layoutId, ��item�Ĳ���Id
	 * @param position
	 * @return
	 */
	public static ViewHolder get(Context context,View convertView,
			ViewGroup parent,int layoutId,int position){
		if(convertView==null){
			return new ViewHolder(context, parent, layoutId, position);
		}else {
			ViewHolder holder = (ViewHolder) convertView.getTag();
			holder.mPosition=position;
			return holder;
		}
				
	}
	
	/**
	 * ͨ��ViewId��ȡ�ؼ�
	 * @param ViewId
	 * @return
	 */
	public <T extends View> T getView(int ViewId){
		View view = mViews.get(ViewId);
		if(view==null){
			view=mConvertView.findViewById(ViewId);
			mViews.put(ViewId, view);
		}
		return (T) view;
	}
	
	public View getConvertView(){
		return mConvertView;
	}
	
	/**
	 * 
	 * @param viewId���ؼ���id
	 * @param text����ʾ������
	 * @return
	 */
	public ViewHolder setText(int viewId,String text){
		TextView tView = getView(viewId);
		tView.setText(text);
		return this;
	}
	
}  
