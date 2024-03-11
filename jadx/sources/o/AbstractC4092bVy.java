package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C4022bTi;
import o.InterfaceC3825bMa;
import o.aLX;

/* renamed from: o.bVy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4092bVy extends AbstractC3336ax<b> implements InterfaceC3829bMe {
    public static final e d = new e(null);
    public AppView b;
    public drO<? extends TrackingInfo> c;
    private InterfaceC3825bMa.a f;
    private boolean g;
    private String h;
    private View.OnClickListener i;
    private String j;
    private String l;
    private String m;

    public final void L_(String str) {
        this.j = str;
    }

    public final void M_(String str) {
        this.l = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C4022bTi.a.D;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public void c(InterfaceC3825bMa.a aVar) {
        this.f = aVar;
    }

    public final void d(String str) {
        this.h = str;
    }

    public final String k() {
        return this.h;
    }

    public final View.OnClickListener l() {
        return this.i;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.f;
    }

    public final String o() {
        return this.j;
    }

    public final boolean q() {
        return this.g;
    }

    public final String s() {
        return this.m;
    }

    public final String t() {
        return this.l;
    }

    /* renamed from: o.bVy$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("FavoritesVideoModel");
        }
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.c;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.b;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC4092bVy.b r18) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC4092bVy.e(o.bVy$b):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        View r = bVar.r();
        r.setOnClickListener(null);
        r.setClickable(false);
        bVar.a().setBackground(null);
        bVar.a().setForeground(null);
        bVar.a().onViewRecycled();
        bVar.d().setBackground(null);
        bVar.d().setForeground(null);
        bVar.d().onViewRecycled();
        bVar.b((CharSequence) null);
        super.b((AbstractC4092bVy) bVar);
    }

    /* renamed from: o.bVy$b */
    /* loaded from: classes4.dex */
    public static class b extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(b.class, "characterImageView", "getCharacterImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "tcardImageView", "getTcardImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "fallbackTextView", "getFallbackTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ e = bIF.d(this, C4022bTi.e.e, false, 2, null);
        private final dsZ c = bIF.d(this, C4022bTi.e.s, false, 2, null);
        private final dsZ a = bIF.d(this, C4022bTi.e.d, false, 2, null);

        public final NetflixImageView a() {
            return (NetflixImageView) this.e.getValue(this, b[0]);
        }

        public final NetflixImageView d() {
            return (NetflixImageView) this.c.getValue(this, b[1]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.a.getValue(this, b[2]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            view.setTag(aLX.a.e, Boolean.TRUE);
        }

        public final boolean b() {
            return d().isImageLoaded();
        }

        public final void b(CharSequence charSequence) {
            e().setText(charSequence);
            e().setVisibility(charSequence != null ? 0 : 8);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((b) C9726vo.d(abstractC3179au, b.class)).b();
    }
}
