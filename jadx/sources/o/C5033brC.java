package o;

import com.netflix.mediaclient.servicemgr.Logblob;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.brC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5033brC {
    private final List<Logblob> b = new ArrayList();
    private InterfaceC5090bsG d;

    public void c(InterfaceC5090bsG interfaceC5090bsG) {
        synchronized (this) {
            this.d = interfaceC5090bsG;
            for (Logblob logblob : this.b) {
                e(logblob);
            }
            this.b.clear();
        }
    }

    public void a(Logblob logblob) {
        synchronized (this) {
            if (this.d != null) {
                e(logblob);
            } else {
                this.b.add(logblob);
            }
        }
    }

    private void e(Logblob logblob) {
        this.d.a(logblob);
    }
}
