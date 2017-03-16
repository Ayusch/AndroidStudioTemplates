package ${PACKAGE_NAME};

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

#parse("File Header.java")
public class ${NAME} extends AppCompatActivity {

    #parse("Header_Data.java")
    
    public static final String TAG = ${NAME}.class.getSimpleName();

    #parse("Header_Widgets.java")

    #parse("Header_Lifecycle.java")
    
    //region LifeCycle Methods
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.$layout);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //endregion

    #parse("Header_OnClick.java")
    
    //region OnClick

    //endregion

    #parse("Header_Auxiliar.java")
    
    //region Auxiliar 

    //endregion
}