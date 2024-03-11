package o;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.dpR;

/* renamed from: o.daG  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7898daG implements cYB {
    private final Map<Integer, Integer> a;
    private final Map<Integer, Integer> b;
    private Map<Integer, Integer> c;
    private Map<Integer, Integer> e;
    private final C7905daN f = new C7905daN();
    private final C7966dbV d = new C7966dbV();

    @Inject
    public C7898daG() {
        Map<Integer, Integer> d;
        Map<Integer, Integer> d2;
        d = dqE.d();
        this.e = d;
        d2 = dqE.d();
        this.c = d2;
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
    }

    @Override // o.cYB
    public void b() {
        this.a.clear();
        this.b.clear();
    }

    @Override // o.cYB
    public void d() {
        Map<Integer, Integer> l;
        Map<Integer, Integer> l2;
        l = dqE.l(this.a);
        this.e = l;
        l2 = dqE.l(this.b);
        this.c = l2;
    }

    @Override // o.cYB
    public void d(Context context, InterfaceC2023aX interfaceC2023aX, List<TrailerItem.a> list, final drM<? super Integer, dpR> drm) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) drm, "");
        this.f.a(context, interfaceC2023aX, list, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextGpsImpl$buildHeaders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                b(num.intValue());
                return dpR.c;
            }

            public final void b(int i) {
                drm.invoke(Integer.valueOf(i));
            }
        });
    }

    @Override // o.cYB
    public void b(InterfaceC2023aX interfaceC2023aX, LoMo loMo, int i, int i2, boolean z, boolean z2, drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) dro, "");
        e(loMo.getListPos(), i2);
        C7966dbV c7966dbV = this.d;
        int listPos = loMo.getListPos();
        C7966dbV.a(c7966dbV, interfaceC2023aX, "section-" + listPos + "-pos-" + i, z2 || z, 0L, dro, 8, null);
    }

    @Override // o.cYB
    public InterfaceC6234cYv c(Activity activity, C9935zP c9935zP, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, C6652chO c6652chO, bLW blw, bLU blu, boolean z, cYA cya, InterfaceC5303bwH interfaceC5303bwH) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) c6652chO, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) cya, "");
        C8632dsu.c((Object) interfaceC5303bwH, "");
        return new cZH((NetflixActivity) activity, c9935zP, miniPlayerVideoGroupViewModel, c6652chO, blw, blu, z, cya, interfaceC5303bwH);
    }

    @Override // o.cYB
    public boolean e(LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        return C8632dsu.c((Object) loMo.getListContext(), (Object) "mostWatched");
    }

    @Override // o.cYB
    public boolean a(LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        return C8632dsu.c((Object) loMo.getListContext(), (Object) "comingSoon");
    }

    @Override // o.cYB
    public Integer b(int i) {
        return this.e.get(Integer.valueOf(i));
    }

    @Override // o.cYB
    public Integer c(int i) {
        return this.c.get(Integer.valueOf(i));
    }

    @Override // o.cYB
    public void e(int i, int i2) {
        this.a.putIfAbsent(Integer.valueOf(i), Integer.valueOf(i2));
        this.b.put(Integer.valueOf(i2), Integer.valueOf(i));
    }

    @Override // o.cYB
    public void b(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        bKU bku = new bKU();
        bku.d((CharSequence) "top-spacer");
        C1332Xp c1332Xp = C1332Xp.b;
        bku.a(Integer.valueOf((int) TypedValue.applyDimension(1, 18, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku);
        C7966dbV.a(this.d, interfaceC2023aX, "initial-loading-shimmer-1", true, 1L, null, 16, null);
        C7966dbV.a(this.d, interfaceC2023aX, "initial-loading-shimmer-2", true, 2L, null, 16, null);
        C7966dbV.a(this.d, interfaceC2023aX, "initial-loading-shimmer-3", true, 3L, null, 16, null);
    }
}
