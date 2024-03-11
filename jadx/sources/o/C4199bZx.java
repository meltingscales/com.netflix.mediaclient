package o;

import com.netflix.mediaclient.ui.lightbox.api.LightBoxItem;
import java.util.List;

/* renamed from: o.bZx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4199bZx implements InterfaceC8962gc {
    private final List<LightBoxItem> c;

    public C4199bZx() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4199bZx copy$default(C4199bZx c4199bZx, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c4199bZx.c;
        }
        return c4199bZx.d(list);
    }

    public final List<LightBoxItem> b() {
        return this.c;
    }

    public final List<LightBoxItem> component1() {
        return this.c;
    }

    public final C4199bZx d(List<? extends LightBoxItem> list) {
        C8632dsu.c((Object) list, "");
        return new C4199bZx(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4199bZx) && C8632dsu.c(this.c, ((C4199bZx) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        List<LightBoxItem> list = this.c;
        return "LightBoxState(items=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4199bZx(List<? extends LightBoxItem> list) {
        C8632dsu.c((Object) list, "");
        this.c = list;
    }

    public /* synthetic */ C4199bZx(List list, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? C8569dql.i() : list);
    }
}
