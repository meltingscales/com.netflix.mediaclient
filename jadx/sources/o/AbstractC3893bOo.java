package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.games.impl.billboard.GameBillboardBackgroundModel$bindHeroImage$resultObserver$1$onSuccess$1;
import com.netflix.mediaclient.ui.games.impl.billboard.GameBillboardBackgroundModel$loadBillboardGradients$2;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;
import o.C6472cdu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3825bMa;

/* renamed from: o.bOo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3893bOo extends AbstractC3336ax<b> implements InterfaceC3829bMe {
    private final C9879yM<C6472cdu.b> b = new C9879yM<>();
    public AppView c;
    public drO<? extends TrackingInfo> d;
    private String f;
    private InterfaceC3825bMa.a g;
    private dwU h;
    private String i;
    private View.OnClickListener j;
    private boolean k;
    private boolean l;
    private Integer m;
    private String n;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.c;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public void b(InterfaceC3825bMa.a aVar) {
        this.g = aVar;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public final void e(dwU dwu) {
        this.h = dwu;
    }

    public final View.OnClickListener k() {
        return this.j;
    }

    public final String l() {
        return this.f;
    }

    public final void l_(Integer num) {
        this.m = num;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.g;
    }

    public final String o() {
        return this.i;
    }

    public final dwU p() {
        return this.h;
    }

    public final String q() {
        return this.n;
    }

    public final boolean r() {
        return this.l;
    }

    public final boolean s() {
        return this.k;
    }

    public final Integer t() {
        return this.m;
    }

    public final void t_(boolean z) {
        this.k = z;
    }

    public final void u_(String str) {
        this.i = str;
    }

    public final void u_(boolean z) {
        this.l = z;
    }

    public final void v_(String str) {
        this.n = str;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.d;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.c;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        b2(bVar);
        String c = C1333Xq.d(C3895bOq.e.k).d("gameTitle", this.n).c();
        e2(bVar);
        View r = bVar.r();
        View.OnClickListener onClickListener = this.j;
        r.setOnClickListener(onClickListener);
        r.setClickable(onClickListener != null);
        bVar.r().setContentDescription(c);
    }

    /* renamed from: e  reason: avoid collision after fix types in other method */
    protected void e2(b bVar) {
        Map d;
        Map k;
        Throwable th;
        boolean g;
        C8632dsu.c((Object) bVar, "");
        String str = this.i;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                ShowImageRequest d2 = new ShowImageRequest().a(this.i).c(ShowImageRequest.Priority.a).e(Integer.valueOf(C3895bOq.a.b)).d();
                if (this.k) {
                    d2.a(new e(bVar));
                }
                bVar.d().showImage(d2);
                return;
            }
        }
        bVar.d().setImageResource(C3895bOq.a.b);
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        String str2 = "heroImageUrl is empty for gameId:" + this.f;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd(str2, null, null, false, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                c1596aHd.a(errorType.c() + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    /* renamed from: o.bOo$e */
    /* loaded from: classes4.dex */
    public static final class e implements SingleObserver<ShowImageRequest.a> {
        final /* synthetic */ b b;

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            C8632dsu.c((Object) th, "");
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            C8632dsu.c((Object) disposable, "");
        }

        e(b bVar) {
            this.b = bVar;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: e */
        public void onSuccess(ShowImageRequest.a aVar) {
            BitmapDrawable bitmapDrawable;
            dwU p;
            TransitionDrawable transitionDrawable;
            C8632dsu.c((Object) aVar, "");
            if (AbstractC3893bOo.this.o() == null || !this.b.d().isImageLoaded()) {
                return;
            }
            Drawable drawable = this.b.d().getDrawable();
            if (drawable instanceof TransitionDrawable) {
                Drawable drawable2 = ((TransitionDrawable) drawable).getDrawable(transitionDrawable.getNumberOfLayers() - 1);
                if (drawable2 instanceof BitmapDrawable) {
                    bitmapDrawable = (BitmapDrawable) drawable2;
                }
                bitmapDrawable = null;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    bitmapDrawable = (BitmapDrawable) drawable;
                }
                bitmapDrawable = null;
            }
            if (bitmapDrawable == null || (p = AbstractC3893bOo.this.p()) == null) {
                return;
            }
            C8737dwr.c(p, null, null, new GameBillboardBackgroundModel$bindHeroImage$resultObserver$1$onSuccess$1(AbstractC3893bOo.this, bitmapDrawable, this.b, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Bitmap bitmap, String str, boolean z, InterfaceC8585dra<? super C6472cdu.b> interfaceC8585dra) {
        return this.b.c(new GameBillboardBackgroundModel$loadBillboardGradients$2(bitmap, str, z, null), interfaceC8585dra);
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    protected void b2(b bVar) {
        int intValue;
        C8632dsu.c((Object) bVar, "");
        Context context = bVar.r().getContext();
        if (this.l) {
            intValue = C6469cdr.c(context, true);
        } else {
            Integer num = this.m;
            intValue = (int) ((num != null ? num.intValue() : bVar.r().getContext().getResources().getDisplayMetrics().widthPixels) * 1.25f);
        }
        View r = bVar.r();
        ViewGroup.LayoutParams layoutParams = r.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = intValue;
            r.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        View r = bVar.r();
        r.setOnClickListener(null);
        r.setClickable(false);
        NetflixImageView d = bVar.d();
        d.setBackground(null);
        d.setForeground(null);
        d.onViewRecycled();
        super.b((AbstractC3893bOo) bVar);
    }

    /* renamed from: o.bOo$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(b.class, "overlayGradient", "getOverlayGradient()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(b.class, "heroImage", "getHeroImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ d = bIF.d(this, C3895bOq.b.aa, false, 2, null);
        private final dsZ e = bIF.d(this, C3895bOq.b.y, false, 2, null);

        public final View a() {
            return (View) this.d.getValue(this, a[0]);
        }

        public final NetflixImageView d() {
            return (NetflixImageView) this.e.getValue(this, a[1]);
        }

        public final boolean b() {
            return d().isImageLoaded();
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((b) C9726vo.d(abstractC3179au, b.class)).b();
    }
}
