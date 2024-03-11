package o;

import android.app.Service;
import com.netflix.partner.PService;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.dli  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractServiceC8431dli extends Service implements GeneratedComponentManagerHolder {
    private volatile ServiceComponentManager b;
    private final Object e = new Object();
    private boolean c = false;

    @Override // android.app.Service
    public void onCreate() {
        a();
        super.onCreate();
    }

    protected ServiceComponentManager c() {
        return new ServiceComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: e */
    public final ServiceComponentManager componentManager() {
        if (this.b == null) {
            synchronized (this.e) {
                if (this.b == null) {
                    this.b = c();
                }
            }
        }
        return this.b;
    }

    protected void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((dlH) generatedComponent()).a((PService) UnsafeCasts.unsafeCast(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }
}
