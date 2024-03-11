package o;

import android.content.Context;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;

/* renamed from: o.ccq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6415ccq extends C6388ccP<InterfaceC5223buh> {
    @Override // o.AbstractC9900yh
    public boolean c() {
        return true;
    }

    @Override // o.AbstractC6337cbR
    public boolean l() {
        return true;
    }

    public C6415ccq(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6415ccq(Context context, LoMo loMo, String str, ServiceManager serviceManager, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, str, serviceManager, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
    }

    @Override // o.AbstractC6337cbR
    protected void c(Context context, ServiceManager serviceManager, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        serviceManager.j().a(i, i2, j().e(), j().c(), interfaceC5094bsK);
    }
}
