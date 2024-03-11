package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C4022bTi;
import o.InterfaceC3825bMa;
import o.aLX;

/* renamed from: o.bVq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4084bVq extends AbstractC3336ax<d> implements InterfaceC3829bMe {
    public drO<? extends TrackingInfo> b;
    private AppView c = AppView.UNKNOWN;
    private Float d;
    private InterfaceC3825bMa.a g;
    private String h;
    private View.OnClickListener i;
    private String j;

    @Override // o.AbstractC3073as
    public int a() {
        return C4022bTi.a.B;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        return this.c;
    }

    public void b(InterfaceC3825bMa.a aVar) {
        this.g = aVar;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final void f_(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final String k() {
        return this.h;
    }

    public final Float l() {
        return this.d;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.g;
    }

    public final View.OnClickListener o() {
        return this.i;
    }

    public final String s() {
        return this.j;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.b;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x013e  */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC4084bVq.d r15) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC4084bVq.e(o.bVq$d):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        View r = dVar.r();
        r.setOnClickListener(null);
        r.setClickable(false);
        dVar.d().onViewRecycled();
        super.b((AbstractC4084bVq) dVar);
    }

    /* renamed from: o.bVq$d */
    /* loaded from: classes4.dex */
    public static class d extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(d.class, "characterArt", "getCharacterArt()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "characterName", "getCharacterName()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ b = bIF.d(this, C4022bTi.e.e, false, 2, null);
        private final dsZ c = bIF.d(this, C4022bTi.e.p, false, 2, null);

        public final NetflixImageView d() {
            return (NetflixImageView) this.b.getValue(this, e[0]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.c.getValue(this, e[1]);
        }

        public final boolean b() {
            return d().isImageLoaded();
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            super.a(view);
            view.setTag(aLX.a.e, Boolean.TRUE);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((d) C9726vo.d(abstractC3179au, d.class)).b();
    }
}
