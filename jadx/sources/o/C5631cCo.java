package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.leafs.originals.interactive.BaseLayout;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import o.C5631cCo;
import o.C5650cDg;
import o.C5651cDh;
import o.cBO;
import o.cHR;
import o.dpR;

/* renamed from: o.cCo */
/* loaded from: classes4.dex */
public final class C5631cCo extends cBY {
    private boolean g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5631cCo(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5631cCo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final boolean k() {
        return this.g;
    }

    public /* synthetic */ C5631cCo(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5631cCo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.cBZ
    public void l() {
        o().c();
        b(C5651cDh.a.a);
    }

    @Override // o.cBZ
    public void s() {
        o().a();
        b(C5651cDh.i.b);
    }

    @Override // o.cBY
    public void d(aJY ajy, InterfaceC9638uF interfaceC9638uF, cHR chr, Moment moment, BaseLayout baseLayout, InteractiveMoments interactiveMoments, int i) {
        C8632dsu.c((Object) ajy, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) baseLayout, "");
        C8632dsu.c((Object) interactiveMoments, "");
        super.d(ajy, interfaceC9638uF, chr, moment, baseLayout, interactiveMoments, i);
        a(C5639cCw.e.d(ajy, moment));
    }

    @Override // o.cBY
    public void setupUI() {
        e(q(), c());
        dpR dpr = dpR.c;
        String subType = q().subType();
        this.g = subType.hashCode() == -2054695778 && subType.equals("streakCounter");
    }

    @Override // o.cBY
    public void setupObservable() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC5649cDf abstractC5649cDf : b()) {
            arrayList.add(abstractC5649cDf.n());
        }
        Observable merge = Observable.merge(arrayList);
        final drM<C5650cDg, dpR> drm = new drM<C5650cDg, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTemplateNotificationView$setupObservable$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5650cDg c5650cDg) {
                b(c5650cDg);
                return dpR.c;
            }

            public final void b(C5650cDg c5650cDg) {
                cHR u;
                if (!(c5650cDg instanceof C5650cDg.h) || (u = C5631cCo.this.u()) == null) {
                    return;
                }
                u.b(new cBO.A(((C5650cDg.h) c5650cDg).a()));
            }
        };
        setPlayerUIEventsObservable(merge.subscribe(new Consumer() { // from class: o.cCn
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5631cCo.a(drM.this, obj);
            }
        }));
    }

    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* renamed from: o.cCo$d */
    /* loaded from: classes4.dex */
    public static final class d extends cCS {
        final /* synthetic */ long c;

        d(long j) {
            C5631cCo.this = r1;
            this.c = j;
        }

        @Override // o.cCS, o.cCK
        public void e() {
            C5631cCo.this.c(Audio.TYPE.notificationAppear);
        }

        @Override // o.cCS, o.cCK
        public void b() {
            String subType = C5631cCo.this.q().subType();
            if (subType.hashCode() == 1902848200 && subType.equals("livesIndicator")) {
                C5631cCo.this.e(this.c);
            } else {
                C5631cCo.this.d(this.c);
            }
        }
    }

    private final void a(long j) {
        o().b(true, new d(j));
    }

    /* renamed from: o.cCo$c */
    /* loaded from: classes4.dex */
    public static final class c extends cCS {
        final /* synthetic */ long b;

        c(long j) {
            C5631cCo.this = r1;
            this.b = j;
        }

        @Override // o.cCS, o.cCK
        public void e() {
            final C5631cCo c5631cCo = C5631cCo.this;
            c5631cCo.postDelayed(new Runnable() { // from class: o.cCp
                @Override // java.lang.Runnable
                public final void run() {
                    C5631cCo.c.d(C5631cCo.this);
                }
            }, 100L);
        }

        public static final void d(C5631cCo c5631cCo) {
            C8632dsu.c((Object) c5631cCo, "");
            c5631cCo.b(new C5651cDh.h(0, "update"));
        }

        @Override // o.cCS, o.cCK
        public void b() {
            C5631cCo.this.d(this.b);
        }
    }

    public final void e(long j) {
        o().g(new c(j));
    }

    public static /* synthetic */ void c(C5631cCo c5631cCo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        c5631cCo.d(j);
    }

    public final void d(long j) {
        postDelayed(new Runnable() { // from class: o.cCm
            @Override // java.lang.Runnable
            public final void run() {
                C5631cCo.e(C5631cCo.this);
            }
        }, j);
    }

    public static final void e(C5631cCo c5631cCo) {
        C8632dsu.c((Object) c5631cCo, "");
        if (c5631cCo.g()) {
            return;
        }
        c5631cCo.o().b(false, null);
        c5631cCo.a(true);
    }

    @Override // o.cBY, o.cBZ
    public void e() {
        super.e();
        setVisibility(8);
    }
}
