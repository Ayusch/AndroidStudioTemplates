package ${PACKAGE_NAME};

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

#parse("File Header.java")
public class ${NAME} extends BaseAdapter {

    #parse("Header_Data.java")    
    private Context mContext;
    private List<$type> mList;
    
    #parse("Header_Constructor.java")    
    
    public ${NAME}(android.content.Context ctx, java.util.List<$type> mList) {
        this.mContext = ctx;
        if (mList == null) {
            this.mList = new java.util.ArrayList<>();
        } else {
            this.mList = new java.util.ArrayList<>(mList);
        }
    }
    
    public void updateList(java.util.List<$type> mList) {
        this.mList = new ArrayList<>(mList);
        this.notifyDataSetChanged();
    }
    
    #parse("Header_Adapter.java")    
    
    //region Adapter
    
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.$layout, parent, false);
            convertView.setTag(new ViewHolder(convertView));
        }

        viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.update(position, mList.get(position));
        return convertView;
    }
    
    //endregion
    
    #parse("Header_ViewHolder.java")
    
    //region ViewHolder
    class ViewHolder {     
        #parse("Header_Widgets.java")
        
        private View mView;
    
        #parse("Header_Constructor.java")
         
        //region Constructor
        public ViewHolder(View itemView) {
            mView = itemView;
            // TODO: findViewByID
        }
        
        //endregion
        
        #parse("Header_Update.java")
    
        //region Update
        public void update(int position, $type s) {
            
        }
        
        //endregion    
    }    
    
    //endregion
}