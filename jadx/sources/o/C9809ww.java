package o;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.concurrent.TimeUnit;
import o.AbstractC9766wb;
import o.C8632dsu;
import o.C9809ww;
import o.InterfaceC9810wx;
import o.dpR;

/* renamed from: o.ww  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9809ww extends AbstractC9709vX {
    public static final b e = new b(null);
    private int a;
    private Disposable c;
    private final InterfaceC9810wx d;

    public final InterfaceC9810wx a() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9809ww(InterfaceC9810wx interfaceC9810wx, Observable<AbstractC9766wb> observable) {
        super(interfaceC9810wx, observable);
        C8632dsu.c((Object) interfaceC9810wx, "");
        C8632dsu.c((Object) observable, "");
        this.d = interfaceC9810wx;
        interfaceC9810wx.c(new drO<dpR>() { // from class: com.netflix.android.mdxpanel.controls.MdxControlsUIPresenter$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }

            public final void e() {
                Disposable disposable;
                disposable = C9809ww.this.c;
                if (disposable != null) {
                    disposable.dispose();
                }
            }
        });
    }

    /* renamed from: o.ww$b */
    /* loaded from: classes2.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MdxControlsUIPresenter");
        }
    }

    @Override // o.AbstractC9940zU
    public void onEvent(final AbstractC9766wb abstractC9766wb) {
        C8632dsu.c((Object) abstractC9766wb, "");
        if (abstractC9766wb instanceof AbstractC9766wb.C9780n) {
            this.d.f();
        } else if (abstractC9766wb instanceof AbstractC9766wb.C9778l) {
            this.d.l();
            this.d.h();
            this.d.b();
            Disposable disposable = this.c;
            if (disposable != null) {
                disposable.dispose();
            }
        } else if (abstractC9766wb instanceof AbstractC9766wb.C9786u) {
            this.d.b();
            Disposable disposable2 = this.c;
            if (disposable2 != null) {
                disposable2.dispose();
            }
        } else if (abstractC9766wb instanceof AbstractC9766wb.O) {
            this.d.d();
        } else if (abstractC9766wb instanceof AbstractC9766wb.C9771e) {
            this.d.k();
            this.d.o();
        } else if (abstractC9766wb instanceof AbstractC9766wb.A) {
            this.d.e(false);
            this.d.d();
        } else if (abstractC9766wb instanceof AbstractC9766wb.C9787v) {
            this.d.e(true);
            this.d.d();
        } else if (abstractC9766wb instanceof AbstractC9766wb.Q) {
            AbstractC9766wb.Q q = (AbstractC9766wb.Q) abstractC9766wb;
            this.d.d(q.c(), q.b());
            Integer c = q.c();
            if (c != null) {
                final int intValue = c.intValue();
                Disposable disposable3 = this.c;
                if (disposable3 != null) {
                    disposable3.dispose();
                }
                this.a = 0;
                Observable<Long> interval = Observable.interval(1L, TimeUnit.SECONDS, AndroidSchedulers.mainThread());
                final drM<Long, Boolean> drm = new drM<Long, Boolean>() { // from class: com.netflix.android.mdxpanel.controls.MdxControlsUIPresenter$onEvent$1$1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: e */
                    public final Boolean invoke(Long l) {
                        C8632dsu.c((Object) l, "");
                        return Boolean.valueOf((C9809ww.this.a().j() || C9809ww.this.a().i()) ? false : true);
                    }
                };
                Observable<Long> filter = interval.filter(new Predicate() { // from class: o.wv
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Object obj) {
                        boolean e2;
                        e2 = C9809ww.e(drM.this, obj);
                        return e2;
                    }
                });
                C8632dsu.a(filter, "");
                this.c = SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<Long, dpR>() { // from class: com.netflix.android.mdxpanel.controls.MdxControlsUIPresenter$onEvent$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Long l) {
                        d(l);
                        return dpR.c;
                    }

                    public final void d(Long l) {
                        int i;
                        int i2;
                        System.out.println("artificialTimerSubscription ran");
                        C9809ww c9809ww = C9809ww.this;
                        i = c9809ww.a;
                        c9809ww.a = i + 1;
                        InterfaceC9810wx a = C9809ww.this.a();
                        int i3 = intValue;
                        i2 = C9809ww.this.a;
                        a.d(Integer.valueOf(i3 + i2), ((AbstractC9766wb.Q) abstractC9766wb).b());
                    }
                }, 3, (Object) null);
                System.out.println("artificialTimerSubscription started");
            }
        } else if (abstractC9766wb instanceof AbstractC9766wb.X) {
            this.d.g();
        } else if (abstractC9766wb instanceof AbstractC9766wb.R) {
            this.d.m();
        } else if (abstractC9766wb instanceof AbstractC9766wb.z) {
            this.d.a();
        } else if (abstractC9766wb instanceof AbstractC9766wb.D) {
            this.d.c();
        } else if (abstractC9766wb instanceof AbstractC9766wb.M) {
            AbstractC9766wb.M m = (AbstractC9766wb.M) abstractC9766wb;
            this.d.c(m.c(), m.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }
}
