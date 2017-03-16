package ${PACKAGE_NAME};

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;

#parse("File Header.java")
public class ${NAME} extends RecyclerView.ViewHolder implements OnClickListener {

    #parse("Header_Data.java")
    private Context mContext;
    
    #parse("Header_Widgets.java")
    
    private View mView;

    #parse("Header_Constructor.java")
     
    //region Constructor
    public ${NAME}(View itemView) {
        super(itemView);
        mView.setOnClickListener(this);
    }
    
    //endregion
    
    #parse("Header_Update.java")

    //region Update
    public void update(int position, $value s) {
        
    }
    
    //endregion

    #parse("Header_OnClick.java")

    //region OnClick
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case 0:
            break;
        }
    }
    
    //endregion

} 