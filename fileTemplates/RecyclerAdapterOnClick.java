package ${PACKAGE_NAME};

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.List;

#parse("File Header.java")
public class ${NAME} extends RecyclerView.Adapter<${NAME}.ViewHolder> {

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
    public int getItemCount() {
        return mList.size();
    }
    
    @Override
    public int getItemViewType(int position) {
        return R.layout.$layout;
    }
    
    @Override
    public ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int viewType) {
        View v = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(viewType, viewGroup, false);
        return new ViewHolder(v);
    }
    
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.update(position, mList.get(position));
    }
    
    //endregion
    
    #parse("Header_ViewHolder.java")
    
    //region ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {     
        #parse("Header_Widgets.java")
        
        private View mView;
    
        #parse("Header_Constructor.java")
         
        //region Constructor
        public ViewHolder(View itemView) {
            super(itemView);
            mView.setOnClickListener(this);
        }
        
        //endregion
        
        #parse("Header_Update.java")
    
        //region Update
        public void update(int position, $type s) {
            
        }
        
        //endregion
    
        #parse("Header_OnClick.java")
    
        //region OnClick
         @Override
        public void onClick(android.view.View v) {
            switch (v.getId()) {
                case 0:
                    break;
            }
        }
        //endregion
    }    
    
    //endregion
}