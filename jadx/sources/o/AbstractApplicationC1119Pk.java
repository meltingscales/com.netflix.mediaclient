package o;

import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.Pk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractApplicationC1119Pk extends AbstractApplicationC1046Mq implements GeneratedComponentManagerHolder {

    /* renamed from: o  reason: collision with root package name */
    private boolean f13389o = false;
    private final ApplicationComponentManager f = new ApplicationComponentManager(new ComponentSupplier() { // from class: o.Pk.2
        @Override // dagger.hilt.android.internal.managers.ComponentSupplier
        public Object get() {
            return OC.b().e(new ApplicationContextModule(AbstractApplicationC1119Pk.this)).d();
        }
    });

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: N */
    public final ApplicationComponentManager componentManager() {
        return this.f;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // o.AbstractApplicationC1046Mq, com.netflix.mediaclient.NetflixApplication, o.AbstractApplicationC1040Mh, android.app.Application
    public void onCreate() {
        O();
        super.onCreate();
    }

    protected void O() {
        if (this.f13389o) {
            return;
        }
        this.f13389o = true;
        ((InterfaceC1118Pj) generatedComponent()).d((ApplicationC1117Pi) UnsafeCasts.unsafeCast(this));
    }
}
