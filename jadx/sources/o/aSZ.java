package o;

import android.app.job.JobService;
import com.netflix.mediaclient.service.job.NetflixJobService;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class aSZ extends JobService implements GeneratedComponentManagerHolder {
    private volatile ServiceComponentManager e;
    private final Object c = new Object();
    private boolean b = false;

    @Override // android.app.Service
    public void onCreate() {
        e();
        super.onCreate();
    }

    protected ServiceComponentManager d() {
        return new ServiceComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: b */
    public final ServiceComponentManager componentManager() {
        if (this.e == null) {
            synchronized (this.c) {
                if (this.e == null) {
                    this.e = d();
                }
            }
        }
        return this.e;
    }

    protected void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC1939aTw) generatedComponent()).a((NetflixJobService) UnsafeCasts.unsafeCast(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }
}
