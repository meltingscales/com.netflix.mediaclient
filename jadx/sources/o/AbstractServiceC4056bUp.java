package o;

import android.app.Service;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.bUp  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractServiceC4056bUp extends Service implements GeneratedComponentManagerHolder {
    private final Object c = new Object();
    private boolean d = false;
    private volatile ServiceComponentManager e;

    @Override // android.app.Service
    public void onCreate() {
        a();
        super.onCreate();
    }

    protected ServiceComponentManager b() {
        return new ServiceComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: e */
    public final ServiceComponentManager componentManager() {
        if (this.e == null) {
            synchronized (this.c) {
                if (this.e == null) {
                    this.e = b();
                }
            }
        }
        return this.e;
    }

    protected void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((InterfaceC4055bUo) generatedComponent()).a((ServiceC4053bUm) UnsafeCasts.unsafeCast(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }
}
