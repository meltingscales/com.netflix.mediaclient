package o;

import android.content.Context;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.InterfaceC3825bMa;
import o.bAG;

/* renamed from: o.bBb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3525bBb extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    public static final d d = new d(null);
    public drO<? extends TrackingInfo> b;
    private AppView c = AppView.UNKNOWN;
    private InterfaceC3825bMa.a g;
    private String h;
    private String i;
    private CharSequence j;

    @Override // o.AbstractC3073as
    public int a() {
        return bAG.b.g;
    }

    public final void a(String str) {
        this.h = str;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        return this.c;
    }

    public final void b(CharSequence charSequence) {
        this.j = charSequence;
    }

    public final void d(String str) {
        this.i = str;
    }

    public final CharSequence k() {
        return this.j;
    }

    public final String l() {
        return this.h;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.g;
    }

    public final String o() {
        return this.i;
    }

    /* renamed from: o.bBb$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("CollectTasteTitleCardModel");
        }
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC3525bBb.a r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3525bBb.e(o.bBb$a):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.b().onViewRecycled();
        aVar.c(null);
        super.b((AbstractC3525bBb) aVar);
    }

    /* renamed from: o.bBb$a */
    /* loaded from: classes4.dex */
    public static class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private ST b;
        private final dsZ d = bIF.d(this, bAG.a.A, false, 2, null);

        @EntryPoint
        @InstallIn({SingletonComponent.class})
        /* renamed from: o.bBb$a$c */
        /* loaded from: classes4.dex */
        public interface c {
            InterfaceC9639uG U();
        }

        public final NetflixImageView b() {
            return (NetflixImageView) this.d.getValue(this, c[0]);
        }

        public final boolean d() {
            return b().isImageLoaded();
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            super.a(view);
            Context context = view.getContext();
            C8632dsu.a(context, "");
            ST st = new ST(context);
            Context context2 = view.getContext();
            C8632dsu.a(context2, "");
            InterfaceC9639uG U = ((c) EntryPointAccessors.fromApplication(context2, c.class)).U();
            Context context3 = view.getContext();
            C8632dsu.a(context3, "");
            C3524bBa.e(context3, st, Integer.valueOf(U.e()));
            this.b = st;
        }

        public final void c(String str) {
            ST st = this.b;
            ST st2 = null;
            if (st == null) {
                C8632dsu.d("");
                st = null;
            }
            st.d(str);
            if (str == null) {
                b().setImageDrawable(null);
                return;
            }
            NetflixImageView b = b();
            ST st3 = this.b;
            if (st3 == null) {
                C8632dsu.d("");
            } else {
                st2 = st3;
            }
            b.setImageDrawable(st2);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).d();
    }
}
