package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DiscreteEvent;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.Vb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1266Vb implements InterfaceC1267Vc {
    @Override // o.InterfaceC1267Vc
    public void b(DiscreteEvent discreteEvent) {
        C8632dsu.c((Object) discreteEvent, "");
        Logger.INSTANCE.logEvent(discreteEvent);
    }
}
