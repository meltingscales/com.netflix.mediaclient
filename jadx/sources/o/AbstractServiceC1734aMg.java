package o;

import android.app.Service;
import com.netflix.mediaclient.service.NetflixService;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.aMg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1734aMg extends Service implements GeneratedComponentManagerHolder {
    private volatile ServiceComponentManager c;
    private final Object e = new Object();
    private boolean d = false;

    @Override // android.app.Service
    public void onCreate() {
        c();
        super.onCreate();
    }

    protected ServiceComponentManager d() {
        return new ServiceComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: a */
    public final ServiceComponentManager componentManager() {
        if (this.c == null) {
            synchronized (this.e) {
                if (this.c == null) {
                    this.c = d();
                }
            }
        }
        return this.c;
    }

    protected void c() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((aMB) generatedComponent()).d((NetflixService) UnsafeCasts.unsafeCast(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }
}
