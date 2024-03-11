package o;

import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3827bMc;
import o.C3796bKz;

/* loaded from: classes4.dex */
public abstract class bLS extends bLN<a> {
    private SX g;
    private long j = 2000;
    public static final d c = new d(null);
    public static final int d = 8;
    private static final int b = C3796bKz.a.l;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.H;
    }

    public final void a_(SX sx) {
        this.g = sx;
    }

    public final void d(long j) {
        this.j = j;
    }

    public final long k() {
        return this.j;
    }

    public final SX o() {
        return this.g;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("TinyMaturityRatingModel");
        }
    }

    @Override // o.bLN, o.AbstractC3336ax
    /* renamed from: c */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        super.e((bLS) aVar);
        SU e = aVar.e();
        int i = b;
        if (!C8632dsu.c(e.getTag(i), Long.valueOf(b()))) {
            aVar.e().setTag(i, Long.valueOf(b()));
            aVar.e().setData(this.g, true);
            return;
        }
        aVar.e().setData(this.g, false);
    }

    @Override // o.bLN, o.AbstractC3336ax, o.AbstractC3073as
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.e().setData(null, false);
        super.b((bLS) aVar);
    }

    @Override // o.bLN
    /* renamed from: c */
    public void a(a aVar, AbstractC3827bMc abstractC3827bMc) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) abstractC3827bMc, "");
        SU e = aVar.e();
        if (C8632dsu.c(abstractC3827bMc, AbstractC3827bMc.j.c)) {
            e.a(this.j);
        } else if (C8632dsu.c(abstractC3827bMc, AbstractC3827bMc.b.e)) {
            e.b();
        } else if (C8632dsu.c(abstractC3827bMc, AbstractC3827bMc.a.b)) {
            e.b();
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(a.class, "rating", "getRating()Lcom/netflix/mediaclient/android/widget/TinyMaturityRating;", 0))};
        public static final int c = 8;
        private final dsZ d = bIF.d(this, C3796bKz.a.m, false, 2, null);

        public final SU e() {
            return (SU) this.d.getValue(this, b[0]);
        }
    }
}
