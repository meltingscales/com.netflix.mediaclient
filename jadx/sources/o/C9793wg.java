package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.netflix.android.mdxpanel.MdxPanelController;
import com.netflix.android.mdxpanel.bif.MdxBifPreviewUIPresenter$onEvent$2;
import com.netflix.android.mdxpanel.bif.MdxBifPreviewUIPresenter$onEvent$4;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import o.AbstractC9766wb;
import o.C8174dfR;
import o.C8632dsu;
import o.C9793wg;
import o.InterfaceC9799wm;
import o.dpR;

/* renamed from: o.wg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9793wg extends AbstractC9709vX {
    public static final d b = new d(null);
    private static final ColorDrawable d = new ColorDrawable(0);
    private final InterfaceC9799wm a;
    private MdxPanelController.a c;

    public final MdxPanelController.a c() {
        return this.c;
    }

    public final InterfaceC9799wm e() {
        return this.a;
    }

    public final void e(MdxPanelController.a aVar) {
        this.c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9793wg(InterfaceC9799wm interfaceC9799wm, Observable<AbstractC9766wb> observable) {
        super(interfaceC9799wm, observable);
        C8632dsu.c((Object) interfaceC9799wm, "");
        C8632dsu.c((Object) observable, "");
        this.a = interfaceC9799wm;
    }

    /* renamed from: o.wg$d */
    /* loaded from: classes2.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MdxBifPreviewUIPresenter");
        }
    }

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC9766wb abstractC9766wb) {
        C8632dsu.c((Object) abstractC9766wb, "");
        if (abstractC9766wb instanceof AbstractC9766wb.X) {
            this.a.a();
            Observable<Integer> distinctUntilChanged = ((AbstractC9766wb.X) abstractC9766wb).c().distinctUntilChanged();
            final drM<Integer, dpR> drm = new drM<Integer, dpR>() { // from class: com.netflix.android.mdxpanel.bif.MdxBifPreviewUIPresenter$onEvent$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Integer num) {
                    c(num);
                    return dpR.c;
                }

                public final void c(Integer num) {
                    C8174dfR d2;
                    InterfaceC9799wm e = C9793wg.this.e();
                    d2 = C9793wg.this.d();
                    C8632dsu.d(num);
                    e.c(d2.d(num.intValue()));
                }
            };
            Observable<Integer> observeOn = distinctUntilChanged.doOnNext(new Consumer() { // from class: o.wh
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9793wg.h(drM.this, obj);
                }
            }).observeOn(Schedulers.io());
            final MdxBifPreviewUIPresenter$onEvent$2 mdxBifPreviewUIPresenter$onEvent$2 = new drM<Integer, Integer>() { // from class: com.netflix.android.mdxpanel.bif.MdxBifPreviewUIPresenter$onEvent$2
                @Override // o.drM
                /* renamed from: b */
                public final Integer invoke(Integer num) {
                    C8632dsu.c((Object) num, "");
                    return Integer.valueOf(num.intValue() / 10);
                }
            };
            Observable distinctUntilChanged2 = observeOn.map(new Function() { // from class: o.wf
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Integer j;
                    j = C9793wg.j(drM.this, obj);
                    return j;
                }
            }).distinctUntilChanged();
            final drM<Integer, Drawable> drm2 = new drM<Integer, Drawable>() { // from class: com.netflix.android.mdxpanel.bif.MdxBifPreviewUIPresenter$onEvent$3
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final Drawable invoke(Integer num) {
                    ColorDrawable colorDrawable;
                    Drawable b2;
                    C8632dsu.c((Object) num, "");
                    MdxPanelController.a c = C9793wg.this.c();
                    if (c == null || (b2 = c.b(num.intValue() * 10000)) == null) {
                        colorDrawable = C9793wg.d;
                        return colorDrawable;
                    }
                    return b2;
                }
            };
            Observable map = distinctUntilChanged2.map(new Function() { // from class: o.wn
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Drawable i;
                    i = C9793wg.i(drM.this, obj);
                    return i;
                }
            });
            final MdxBifPreviewUIPresenter$onEvent$4 mdxBifPreviewUIPresenter$onEvent$4 = new drM<Drawable, Boolean>() { // from class: com.netflix.android.mdxpanel.bif.MdxBifPreviewUIPresenter$onEvent$4
                @Override // o.drM
                /* renamed from: a */
                public final Boolean invoke(Drawable drawable) {
                    ColorDrawable colorDrawable;
                    C8632dsu.c((Object) drawable, "");
                    colorDrawable = C9793wg.d;
                    return Boolean.valueOf(!C8632dsu.c(drawable, colorDrawable));
                }
            };
            Observable observeOn2 = map.filter(new Predicate() { // from class: o.wj
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean f;
                    f = C9793wg.f(drM.this, obj);
                    return f;
                }
            }).observeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(observeOn2, "");
            SubscribersKt.subscribeBy$default(observeOn2, (drM) null, (drO) null, new drM<Drawable, dpR>() { // from class: com.netflix.android.mdxpanel.bif.MdxBifPreviewUIPresenter$onEvent$5
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Drawable drawable) {
                    e(drawable);
                    return dpR.c;
                }

                public final void e(Drawable drawable) {
                    C9793wg.b.getLogTag();
                    C9793wg.this.e().c(drawable);
                }
            }, 3, (Object) null);
        } else if (abstractC9766wb instanceof AbstractC9766wb.R) {
            this.a.c();
            this.a.c((CharSequence) null);
            this.a.c((Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Integer) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Drawable) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }
}
