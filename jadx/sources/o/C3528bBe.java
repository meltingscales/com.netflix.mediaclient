package o;

import com.netflix.mediaclient.ui.collecttaste.api.CollectTasteData;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.RefreshState;
import java.util.List;
import kotlin.Pair;
import o.C1346Yd;

/* renamed from: o.bBe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3528bBe implements InterfaceC8888fH {
    private final CollectTasteData a;
    private final AbstractC8918fl<RefreshState> b;
    private final AbstractC8918fl<Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3528bBe copy$default(C3528bBe c3528bBe, CollectTasteData collectTasteData, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, int i, Object obj) {
        if ((i & 1) != 0) {
            collectTasteData = c3528bBe.a;
        }
        if ((i & 2) != 0) {
            abstractC8918fl = c3528bBe.d;
        }
        if ((i & 4) != 0) {
            abstractC8918fl2 = c3528bBe.b;
        }
        return c3528bBe.a(collectTasteData, abstractC8918fl, abstractC8918fl2);
    }

    public final C3528bBe a(CollectTasteData collectTasteData, AbstractC8918fl<? extends Pair<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, ? extends List<C1346Yd.e>>> abstractC8918fl, AbstractC8918fl<? extends RefreshState> abstractC8918fl2) {
        C8632dsu.c((Object) collectTasteData, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        return new C3528bBe(collectTasteData, abstractC8918fl, abstractC8918fl2);
    }

    public final AbstractC8918fl<RefreshState> a() {
        return this.b;
    }

    public final AbstractC8918fl<Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>>> b() {
        return this.d;
    }

    public final CollectTasteData c() {
        return this.a;
    }

    public final CollectTasteData component1() {
        return this.a;
    }

    public final AbstractC8918fl<Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>>> component2() {
        return this.d;
    }

    public final AbstractC8918fl<RefreshState> component3() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3528bBe) {
            C3528bBe c3528bBe = (C3528bBe) obj;
            return C8632dsu.c(this.a, c3528bBe.a) && C8632dsu.c(this.d, c3528bBe.d) && C8632dsu.c(this.b, c3528bBe.b);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        CollectTasteData collectTasteData = this.a;
        AbstractC8918fl<Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>>> abstractC8918fl = this.d;
        AbstractC8918fl<RefreshState> abstractC8918fl2 = this.b;
        return "CollectTasteState(collectTasteData=" + collectTasteData + ", collectTestDataQueryResult=" + abstractC8918fl + ", collectTasteRefreshState=" + abstractC8918fl2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3528bBe(CollectTasteData collectTasteData, AbstractC8918fl<? extends Pair<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, ? extends List<C1346Yd.e>>> abstractC8918fl, AbstractC8918fl<? extends RefreshState> abstractC8918fl2) {
        C8632dsu.c((Object) collectTasteData, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        this.a = collectTasteData;
        this.d = abstractC8918fl;
        this.b = abstractC8918fl2;
    }

    public /* synthetic */ C3528bBe(CollectTasteData collectTasteData, AbstractC8918fl abstractC8918fl, AbstractC8918fl abstractC8918fl2, int i, C8627dsp c8627dsp) {
        this(collectTasteData, (i & 2) != 0 ? C8974go.e : abstractC8918fl, (i & 4) != 0 ? C8974go.e : abstractC8918fl2);
    }

    public final boolean e() {
        return this.d instanceof InterfaceC8881fA;
    }
}
