package ${PACKAGE_NAME};

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

#parse("File Header.java")
public class ${NAME} extends Fragment {

    #parse("Header_Data.java")
    public static final String TAG = ${NAME}.class.getSimpleName();

    #parse("Header_Widgets.java") 
    
    private View mView;

    #parse("Header_Constructor.java")

    //region Constructor
    public static ${NAME} newInstance() {
        Bundle args = new Bundle();
        
        ${NAME} fragment = new ${NAME}();
        fragment.setArguments(args);
        return fragment;
    }

    //endregion

    #parse("Header_Lifecycle.java")

    //region LifeCycle Methods
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.$layout, container, false);

        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    //endregion

    #parse("Header_OnClick.java")

    //region OnClick

    //endregion

    #parse("Header_Auxiliar.java")

    //region Auxiliar 

    //endregion
}