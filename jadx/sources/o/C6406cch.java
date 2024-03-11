package o;

import android.content.Context;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import o.InterfaceC6419ccu;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.cch  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6406cch extends C6415ccq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6406cch(Context context, LoMo loMo, String str, ServiceManager serviceManager, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, str, serviceManager, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
    }

    @Override // o.AbstractC6337cbR
    int h() {
        return InterfaceC6419ccu.a.b(g().size(), d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC6337cbR
    public int c(Context context, int i) {
        return InterfaceC6419ccu.a.d(context, i);
    }

    @Override // o.C6415ccq, o.AbstractC6337cbR
    protected void c(Context context, ServiceManager serviceManager, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        serviceManager.j().a(i, i2, null, null, interfaceC5094bsK);
    }
}
