package o;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.CellularDataUsageLevel;
import com.netflix.cl.model.StorageLocationKind;
import com.netflix.cl.model.VideoQualityLevel;
import com.netflix.cl.model.event.discrete.AccountSettingsReported;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadVideoQuality;

/* renamed from: o.dcM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8010dcM extends C1045Mp {
    public static final C8010dcM a = new C8010dcM();

    private C8010dcM() {
        super("SettingsCLHelper");
    }

    public static final void e(ServiceManager serviceManager) {
        InterfaceC4251baw p;
        C8632dsu.c((Object) serviceManager, "");
        InterfaceC4208baF t = serviceManager.t();
        if (t == null || (p = serviceManager.p()) == null) {
            return;
        }
        Context f = serviceManager.f();
        C8632dsu.a(f, "");
        Logger.INSTANCE.logEvent(new AccountSettingsReported(Boolean.valueOf(C1825aPq.b(f)), Boolean.valueOf(p.b()), Boolean.valueOf(t.o()), Boolean.valueOf(InterfaceC7407cvd.d.d(f).b()), d(f), d(t), e(t)));
    }

    private static final CellularDataUsageLevel d(Context context) {
        return C1613aHu.b(context) ? CellularDataUsageLevel.automatic : C1613aHu.j(context) ? CellularDataUsageLevel.wifiOnly : C1613aHu.f(context) ? CellularDataUsageLevel.maximumData : CellularDataUsageLevel.saveData;
    }

    private static final VideoQualityLevel e(InterfaceC4208baF interfaceC4208baF) {
        if (interfaceC4208baF.m().equals(DownloadVideoQuality.BEST)) {
            return VideoQualityLevel.high;
        }
        return VideoQualityLevel.standard;
    }

    private static final StorageLocationKind d(InterfaceC4208baF interfaceC4208baF) {
        InterfaceC5204buO l = interfaceC4208baF.l();
        C8632dsu.a(l, "");
        if (l.a(l.b())) {
            return StorageLocationKind.external;
        }
        return StorageLocationKind.internal;
    }
}
