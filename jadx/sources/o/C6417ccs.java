package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.ui.lolomo.LolomoBackgroundController$thieveAndShowBillboardGradientBackground$3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import o.C6417ccs;
import o.C6472cdu;
import o.C8632dsu;
import o.InterfaceC9907yo;
import o.dpR;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.ccs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6417ccs {
    private int b;
    private final AnimatorSet c;
    private int e;
    private final InterfaceC9907yo f;
    private b g;
    private Disposable h;
    private int i;
    private Drawable j;
    public static final d d = new d(null);
    public static final int a = 8;

    public final int a() {
        return this.i;
    }

    public final b b() {
        return this.g;
    }

    public final void c(int i) {
        this.b = i;
    }

    public C6417ccs(InterfaceC9907yo interfaceC9907yo, b bVar) {
        C8632dsu.c((Object) interfaceC9907yo, "");
        this.f = interfaceC9907yo;
        this.c = new AnimatorSet();
        this.e = C6469cdr.c(interfaceC9907yo.getContext(), true);
        this.g = bVar == null ? new b(PrivateKeyType.INVALID) : bVar;
    }

    /* renamed from: o.ccs$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("LolomoBackgroundController");
        }
    }

    /* renamed from: o.ccs$c */
    /* loaded from: classes4.dex */
    public static final class c extends RecyclerView.OnScrollListener {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8632dsu.c((Object) recyclerView, "");
            C6417ccs c6417ccs = C6417ccs.this;
            c6417ccs.d(c6417ccs.b(recyclerView));
        }
    }

    public final RecyclerView.OnScrollListener d() {
        return new c();
    }

    public final void d(Fragment fragment, final String str, int i) {
        boolean g;
        C8632dsu.c((Object) fragment, "");
        if (str != null) {
            g = C8691duz.g(str);
            if (g) {
                return;
            }
            this.i = i;
            Context requireContext = fragment.requireContext();
            C8632dsu.a(requireContext, "");
            final int p = C8150deu.p(requireContext);
            final int l = C8150deu.l(requireContext);
            GetImageRequest c2 = GetImageRequest.c.e(fragment, this.f.d()).a(str).d(p).c(l);
            Disposable disposable = this.h;
            if (disposable != null) {
                disposable.dispose();
            }
            final long currentTimeMillis = System.currentTimeMillis();
            Single<GetImageRequest.a> subscribeOn = InterfaceC9638uF.a.d(requireContext).b(c2.a()).subscribeOn(AndroidSchedulers.mainThread());
            final drM<GetImageRequest.a, SingleSource<? extends C6472cdu.b>> drm = new drM<GetImageRequest.a, SingleSource<? extends C6472cdu.b>>() { // from class: com.netflix.mediaclient.ui.lolomo.LolomoBackgroundController$thieveAndShowBillboardGradientBackground$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final SingleSource<? extends C6472cdu.b> invoke(GetImageRequest.a aVar) {
                    InterfaceC9907yo interfaceC9907yo;
                    C8632dsu.c((Object) aVar, "");
                    Bitmap c3 = aVar.c();
                    C6472cdu c6472cdu = C6472cdu.b;
                    String str2 = str;
                    Rect a2 = c6472cdu.a(c3);
                    interfaceC9907yo = this.f;
                    return c6472cdu.b(c3, str2, a2, interfaceC9907yo.d().getContext().getResources().getConfiguration().getLayoutDirection() == 1);
                }
            };
            Single observeOn = subscribeOn.flatMap(new Function() { // from class: o.ccz
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    SingleSource c3;
                    c3 = C6417ccs.c(drM.this, obj);
                    return c3;
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            final drM<C6472cdu.b, dpR> drm2 = new drM<C6472cdu.b, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.LolomoBackgroundController$thieveAndShowBillboardGradientBackground$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C6472cdu.b bVar) {
                    b(bVar);
                    return dpR.c;
                }

                public final void b(C6472cdu.b bVar) {
                    C8632dsu.c((Object) bVar, "");
                    GradientDrawable d2 = bVar.d();
                    d2.setBounds(0, 0, p, l);
                    this.d(d2, System.currentTimeMillis() - currentTimeMillis);
                }
            };
            Consumer consumer = new Consumer() { // from class: o.ccx
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6417ccs.d(drM.this, obj);
                }
            };
            final LolomoBackgroundController$thieveAndShowBillboardGradientBackground$3 lolomoBackgroundController$thieveAndShowBillboardGradientBackground$3 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.LolomoBackgroundController$thieveAndShowBillboardGradientBackground$3
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C6417ccs.d.getLogTag();
                }
            };
            this.h = observeOn.subscribe(consumer, new Consumer() { // from class: o.ccv
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6417ccs.i(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void d(Fragment fragment, Integer num, int i) {
        C8632dsu.c((Object) fragment, "");
        if (num == null) {
            return;
        }
        GradientDrawable b2 = C6472cdu.b.b(num.intValue());
        this.i = i;
        Context requireContext = fragment.requireContext();
        C8632dsu.a(requireContext, "");
        int p = C8150deu.p(requireContext);
        int l = C8150deu.l(requireContext);
        Disposable disposable = this.h;
        if (disposable != null) {
            disposable.dispose();
        }
        b2.setBounds(0, 0, p, l);
        a(this, b2, 0L, 2, null);
    }

    static /* synthetic */ void a(C6417ccs c6417ccs, Drawable drawable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c6417ccs.d(drawable, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Drawable drawable, long j) {
        if (drawable != null) {
            this.j = drawable;
            this.f.e();
            drawable.setAlpha(this.g.d());
            if (this.g.d() == 255 && j > 100) {
                Drawable a2 = this.f.a();
                if (a2 == null) {
                    a2 = new ColorDrawable(0);
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{a2, drawable});
                transitionDrawable.startTransition(200);
                transitionDrawable.setCrossFadeEnabled(true);
                this.f.setStaticBackground(transitionDrawable);
                return;
            }
            this.f.setStaticBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i) {
        int i2 = this.e;
        int i3 = 0;
        if (i2 != 0) {
            double d2 = i2;
            i3 = C8657dts.c((int) ((1.0f - ((i - (0.25d * d2)) / (d2 * 0.75d))) * ((double) PrivateKeyType.INVALID)), 0, PrivateKeyType.INVALID);
        }
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setAlpha(i3);
        }
        this.g.b(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b(RecyclerView recyclerView) {
        int b2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        View view = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
                return 0;
            }
            Iterator<View> it = ViewGroupKt.getChildren(recyclerView).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View next = it.next();
                if (next.getId() == com.netflix.mediaclient.ui.R.g.R) {
                    view = next;
                    break;
                }
            }
            View view2 = view;
            if (view2 != null) {
                if (recyclerView.computeVerticalScrollOffset() == 0 || view2.getY() == 0.0f) {
                    return 0;
                }
                b2 = C8657dts.b(-((int) view2.getY()), 0);
                return b2;
            }
            return Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;
    }

    public final void c() {
        this.f.e();
        this.f.setStaticBackground(null);
        Disposable disposable = this.h;
        if (disposable != null) {
            disposable.dispose();
        }
        this.h = null;
    }

    public final void e() {
        if (this.c.isRunning() || this.c.isStarted()) {
            this.c.cancel();
        }
    }

    /* renamed from: o.ccs$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private int b;

        public final void b(int i) {
            this.b = i;
        }

        public final int d() {
            return this.b;
        }

        public b(int i) {
            this.b = i;
        }
    }
}
