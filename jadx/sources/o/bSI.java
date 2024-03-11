package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public final class bSI {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + " ";
        }
        return str;
    }

    public static final InterfaceC3825bMa.a c(LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        return new InterfaceC3825bMa.a(loMo.getListId(), loMo.getRequestId(), Integer.valueOf(loMo.getTrackId()));
    }
}
