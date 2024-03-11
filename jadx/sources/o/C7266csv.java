package o;

import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import java.util.List;

/* renamed from: o.csv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7266csv {
    private final boolean a;
    private final List<OfflineAdapterData> b;

    public List<OfflineAdapterData> a() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7266csv(List<? extends OfflineAdapterData> list, boolean z) {
        C8632dsu.c((Object) list, "");
        this.b = list;
        this.a = z;
    }
}
