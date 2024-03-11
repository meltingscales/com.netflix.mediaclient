package o;

import android.annotation.SuppressLint;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C5451byx;
import o.C8632dsu;
import o.dpR;

@SuppressLint({"CheckResult"})
/* renamed from: o.byx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5451byx {
    public static final a e = new a(null);
    private Long c;
    private final Observable<dpR> d;

    private final boolean d() {
        return this.d != null;
    }

    public C5451byx(Observable<dpR> observable) {
        this.d = observable;
        if (observable != null) {
            SubscribersKt.subscribeBy$default(observable, (drM) null, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.AnimationState$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    a(dpr);
                    return dpR.c;
                }

                public final void a(dpR dpr) {
                    C8632dsu.c((Object) dpr, "");
                    C5451byx.this.c = Long.valueOf(System.currentTimeMillis());
                }
            }, 3, (Object) null);
        }
    }

    /* renamed from: o.byx$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("AnimationState");
        }
    }

    private final boolean a() {
        Long l = this.c;
        return l == null || l.longValue() + 1200 > System.currentTimeMillis();
    }

    public final boolean e() {
        return d() && a();
    }

    public final boolean c() {
        return d() && a();
    }
}
