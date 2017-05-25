package dongting.bwei.com.getuidemo;

import android.app.Application;

import com.igexin.sdk.PushManager;

import dongting.bwei.com.getuidemo.services.PushIntentService;
import dongting.bwei.com.getuidemo.services.PushService;

public class IApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PushManager.getInstance().initialize(this, PushService.class);

        PushManager.getInstance().registerPushIntentService(this, PushIntentService.class);

    }
}
