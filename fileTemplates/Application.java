package ${PACKAGE_NAME};

import android.app.Application;

#parse("File Header.java")
public class ${NAME} extends Application {

     #parse("Header_Lifecycle.java")

    //region LifeCycle Methods
    @Override
    public void onCreate() {
        super.onCreate();

    }
    //endregion
}