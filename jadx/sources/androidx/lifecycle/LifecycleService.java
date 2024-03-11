package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import o.C8632dsu;

/* loaded from: classes2.dex */
public class LifecycleService extends Service implements LifecycleOwner {
    private final ServiceLifecycleDispatcher dispatcher = new ServiceLifecycleDispatcher(this);

    @Override // android.app.Service
    public void onCreate() {
        this.dispatcher.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C8632dsu.c((Object) intent, "");
        this.dispatcher.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.dispatcher.onServicePreSuperOnStart();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.dispatcher.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.dispatcher.getLifecycle();
    }
}
