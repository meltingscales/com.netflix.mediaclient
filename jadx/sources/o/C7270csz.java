package o;

import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* renamed from: o.csz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7270csz extends C7266csv {
    private final Pair<List<OfflineAdapterData>, List<OfflineAdapterData>> a;
    private boolean b;
    private final List<OfflineAdapterData> c;

    public final List<OfflineAdapterData> b() {
        return this.c;
    }

    public final void c(boolean z) {
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7270csz(List<? extends OfflineAdapterData> list, boolean z) {
        super(list, z);
        C8632dsu.c((Object) list, "");
        this.c = list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            OfflineAdapterData offlineAdapterData = (OfflineAdapterData) obj;
            if (offlineAdapterData.a().b != OfflineAdapterData.ViewType.MOVIE || offlineAdapterData.a().a.aT_()) {
                if (offlineAdapterData.a().b == OfflineAdapterData.ViewType.SHOW) {
                    C7460cwd[] b = offlineAdapterData.b();
                    C8632dsu.a(b, "");
                    for (C7460cwd c7460cwd : b) {
                        if (!(!c7460cwd.aT_())) {
                        }
                    }
                }
                arrayList2.add(obj);
            }
            arrayList.add(obj);
        }
        this.a = new Pair<>(arrayList, arrayList2);
    }

    @Override // o.C7266csv
    public List<OfflineAdapterData> a() {
        return this.b ? e() : f();
    }

    private final List<OfflineAdapterData> f() {
        return this.a.d();
    }

    public final List<OfflineAdapterData> e() {
        return this.a.a();
    }

    public final boolean c() {
        return this.c.isEmpty();
    }
}
