package o;

import android.app.Application;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_QoE_Metrics;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import javax.inject.Inject;

/* renamed from: o.dgC  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8212dgC implements ApplicationStartupListener {
    private final InterfaceC9643uK b;
    private final C8219dgJ c;

    @Inject
    public C8212dgC(InterfaceC9643uK interfaceC9643uK, C8219dgJ c8219dgJ) {
        C8632dsu.c((Object) interfaceC9643uK, "");
        C8632dsu.c((Object) c8219dgJ, "");
        this.b = interfaceC9643uK;
        this.c = c8219dgJ;
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        if (Config_FastProperty_QoE_Metrics.Companion.d()) {
            this.b.d(this.c);
        }
    }
}
