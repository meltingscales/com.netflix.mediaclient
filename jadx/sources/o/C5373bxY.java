package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$showRater$2;
import com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$prefetchImages$1;
import com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$prefetchImages$2;
import com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import o.C0962Jh;
import o.C5373bxY;
import o.C5431byd;
import o.C5438byk;
import o.C8054ddD;
import o.C8206dfx;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.InterfaceC5157btU;
import o.InterfaceC5182btt;
import o.InterfaceC5198buI;
import o.aLN;
import o.dpR;
import o.drM;
import o.drO;

/* renamed from: o.bxY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5373bxY implements InterfaceC5363bxO {
    public static final d e = new d(null);

    /* renamed from: o.bxY$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("BulkRaterImpl");
        }
    }

    @Override // o.InterfaceC5363bxO
    public void b(LifecycleOwner lifecycleOwner, LoMo loMo) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) loMo, "");
        String annotation = loMo.getAnnotation("is_payoff");
        if (annotation == null || !Boolean.parseBoolean(annotation)) {
            e(lifecycleOwner, (String) null, loMo);
        }
    }

    /* renamed from: o.bxY$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC5366bxR {
        final /* synthetic */ Context a;
        private final aLP c;
        private C5431byd d;
        private String e;
        private final DisplayMetrics f;
        private LoMo h;
        private final RaterRowView i;
        private boolean j;
        private final int[] b = new int[2];
        private drO<dpR> g = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$refreshListener$1
            public final void e() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }
        };

        @Override // o.InterfaceC5366bxR
        public void b(drO<dpR> dro) {
            C8632dsu.c((Object) dro, "");
            this.g = dro;
        }

        public final aLP e() {
            return this.c;
        }

        public final RaterRowView f() {
            return this.i;
        }

        @Override // o.InterfaceC5366bxR
        /* renamed from: g */
        public RaterRowView a() {
            return this.i;
        }

        public final LoMo h() {
            return this.h;
        }

        public final drO<dpR> i() {
            return this.g;
        }

        public final String j() {
            return this.e;
        }

        /* renamed from: o.bxY$c$e */
        /* loaded from: classes4.dex */
        public static final class e<T> implements ObservableOnSubscribe {
            final /* synthetic */ LifecycleOwner a;

            public e(LifecycleOwner lifecycleOwner) {
                this.a = lifecycleOwner;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
                C8632dsu.c((Object) observableEmitter, "");
                LifecycleOwner lifecycleOwner = this.a;
                if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    observableEmitter.onNext(dpR.c);
                    observableEmitter.onComplete();
                    return;
                }
                this.a.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$special$$inlined$createDestroyObservable$1$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onDestroy(LifecycleOwner lifecycleOwner2) {
                        C8632dsu.c((Object) lifecycleOwner2, "");
                        if (!ObservableEmitter.this.isDisposed()) {
                            ObservableEmitter.this.onNext(dpR.c);
                            try {
                                ObservableEmitter.this.onComplete();
                            } catch (CancellationException unused) {
                            }
                        }
                        super.onDestroy(lifecycleOwner2);
                    }
                });
            }
        }

        c(ViewGroup viewGroup, LifecycleOwner lifecycleOwner, Context context) {
            this.a = context;
            this.f = viewGroup.getResources().getDisplayMetrics();
            aLN.b bVar = aLN.a;
            Observable<dpR> subscribeOn = Observable.create(new e(lifecycleOwner)).subscribeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(subscribeOn, "");
            this.c = bVar.a(subscribeOn);
            RaterRowView raterRowView = new RaterRowView(context, null, 0, 6, null);
            raterRowView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            raterRowView.setRaterRowListener(new b(raterRowView, this, context));
            if (m()) {
                raterRowView.setDismissState();
            }
            this.i = raterRowView;
        }

        /* renamed from: o.bxY$c$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC5405byD {
            final /* synthetic */ Context a;
            final /* synthetic */ RaterRowView b;
            private boolean c;
            final /* synthetic */ c d;
            private final AtomicInteger e = new AtomicInteger();

            public final AtomicInteger e() {
                return this.e;
            }

            b(RaterRowView raterRowView, c cVar, Context context) {
                this.b = raterRowView;
                this.d = cVar;
                this.a = context;
            }

            @Override // o.InterfaceC5405byD
            public void a(int i, int i2) {
                if (this.b.b() == RaterRowView.State.b) {
                    this.d.k().a(i, i2);
                }
            }

            @Override // o.InterfaceC5405byD
            @SuppressLint({"CheckResult"})
            public void e(int i, int i2, int i3, boolean z) {
                C5373bxY.e.getLogTag();
                final C5431byd.c a = this.d.k().a(i, i2, i3);
                this.c = z;
                b(i2, i3, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$rateTitleRow$1$1$onTitleRated$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        b(th);
                        return dpR.c;
                    }

                    public final void b(Throwable th) {
                        if (th == null) {
                            C5431byd.c.a.c(C5431byd.c.this, true, null, 2, null);
                        } else {
                            C5431byd.c.this.b(false, th.getMessage());
                        }
                        this.d();
                    }
                });
            }

            @Override // o.InterfaceC5405byD
            public void e(int i, int i2, boolean z) {
                C5373bxY.e.getLogTag();
                this.c = z;
                this.e.incrementAndGet();
                this.d.k().b(i, i2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$rateTitleRow$1$1$onTitleSkipped$2
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        b();
                        return dpR.c;
                    }

                    public final void b() {
                        C5373bxY.c.b.this.e().decrementAndGet();
                        C5373bxY.c.b.this.d();
                    }
                });
            }

            @Override // o.InterfaceC5405byD
            @SuppressLint({"CheckResult"})
            public void b(int i, int i2, Integer num) {
                this.c = false;
                final C5431byd.c e = this.d.k().e(i, i2);
                if (num != null && num.intValue() != 0) {
                    b(i2, 0, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$rateTitleRow$1$1$onRatingUndone$1
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Throwable th) {
                            d(th);
                            return dpR.c;
                        }

                        public final void d(Throwable th) {
                            if (th == null) {
                                C5431byd.c cVar = C5431byd.c.this;
                                if (cVar != null) {
                                    C5431byd.c.a.c(cVar, true, null, 2, null);
                                    return;
                                }
                                return;
                            }
                            C5431byd.c cVar2 = C5431byd.c.this;
                            if (cVar2 != null) {
                                cVar2.b(false, th.getMessage());
                            }
                        }
                    });
                } else if (e != null) {
                    C5431byd.c.a.c(e, true, null, 2, null);
                }
            }

            @Override // o.InterfaceC5405byD
            public void c(boolean z) {
                this.d.k().c(z);
                this.d.b(z);
            }

            @SuppressLint({"CheckResult"})
            private final void b(final int i, final int i2, final drM<? super Throwable, dpR> drm) {
                this.e.incrementAndGet();
                SubscribersKt.subscribeBy$default(this.d.e().e(new C1004Kx(String.valueOf(i), i2, c())), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$rateTitleRow$1$1$setRating$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        d(th);
                        return dpR.c;
                    }

                    public final void d(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C5373bxY.d dVar = C5373bxY.e;
                        C5373bxY.c.b.this.e().decrementAndGet();
                        drm.invoke(th);
                    }
                }, (drO) null, new drM<Pair<? extends InterfaceC5157btU, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$rateTitleRow$1$1$setRating$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5157btU, ? extends Status> pair) {
                        d(pair);
                        return dpR.c;
                    }

                    public final void d(Pair<? extends InterfaceC5157btU, ? extends Status> pair) {
                        C8632dsu.c((Object) pair, "");
                        C5373bxY.e.getLogTag();
                        C5373bxY.c.b.this.e().decrementAndGet();
                        drm.invoke(null);
                    }
                }, 2, (Object) null);
            }

            private final int c() {
                LoMo h = this.d.h();
                if (h != null) {
                    return h.getTrackId();
                }
                return -580;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void d() {
                if (this.c && this.e.get() == 0) {
                    b();
                }
            }

            private final void b() {
                String j = this.d.j();
                LoMo h = this.d.h();
                final c cVar = this.d;
                final RaterRowView raterRowView = this.b;
                final Context context = this.a;
                C9726vo.d(j, h, new drX<String, LoMo, Disposable>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$rateTitleRow$1$1$fetchPayoffList$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    /* renamed from: a */
                    public final Disposable invoke(String str, LoMo loMo) {
                        C8632dsu.c((Object) str, "");
                        C8632dsu.c((Object) loMo, "");
                        Observable e = C5373bxY.c.this.e().e(new C0962Jh(str, loMo));
                        final RaterRowView raterRowView2 = raterRowView;
                        final C5373bxY.c cVar2 = C5373bxY.c.this;
                        drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$rateTitleRow$1$1$fetchPayoffList$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Throwable th) {
                                a(th);
                                return dpR.c;
                            }

                            public final void a(Throwable th) {
                                C8632dsu.c((Object) th, "");
                                C5373bxY.d dVar = C5373bxY.e;
                                RaterRowView.b(RaterRowView.this, true, cVar2.k().d(), 0L, 4, null);
                            }
                        };
                        final C5373bxY.c cVar3 = C5373bxY.c.this;
                        final Context context2 = context;
                        final RaterRowView raterRowView3 = raterRowView;
                        return SubscribersKt.subscribeBy$default(e, drm, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$rateTitleRow$1$1$fetchPayoffList$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Boolean bool) {
                                e(bool.booleanValue());
                                return dpR.c;
                            }

                            public final void e(boolean z) {
                                if (!z) {
                                    if (C8206dfx.a()) {
                                        C8054ddD.a(context2, "Payoff came back with no payoff annotation", 1);
                                    }
                                    C5373bxY.e.getLogTag();
                                    RaterRowView.b(raterRowView3, true, C5373bxY.c.this.k().d(), 0L, 4, null);
                                    return;
                                }
                                C5373bxY.e.getLogTag();
                                C5373bxY.c.this.i().invoke();
                            }
                        }, 2, (Object) null);
                    }
                });
            }
        }

        @Override // o.InterfaceC5366bxR
        public int c() {
            return this.i.c();
        }

        @Override // o.InterfaceC5366bxR
        public void d(String str, LoMo loMo) {
            C8632dsu.c((Object) loMo, "");
            this.e = str;
            this.h = loMo;
            C5431byd c5431byd = this.d;
            if (c5431byd == null) {
                this.d = new C5431byd(this.c, str, loMo);
            } else {
                c5431byd.d(str, loMo);
            }
        }

        @Override // o.InterfaceC5366bxR
        @SuppressLint({"CheckResult"})
        public void b() {
            LoMo loMo = this.h;
            if (loMo == null) {
                throw new IllegalArgumentException("you must call setupRow before calling showRater".toString());
            }
            if (!m()) {
                this.i.a();
            }
            Observable e2 = this.c.e(new C0955Ja(this.e, loMo.getId(), 0, loMo.getLength() - 1, null, 16, null));
            final drM<List<? extends InterfaceC5198buI>, dpR> drm = new drM<List<? extends InterfaceC5198buI>, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$showRater$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(List<? extends InterfaceC5198buI> list) {
                    b(list);
                    return dpR.c;
                }

                public final void b(List<? extends InterfaceC5198buI> list) {
                    int d;
                    RaterRowView f = C5373bxY.c.this.f();
                    C8632dsu.d(list);
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC5198buI interfaceC5198buI : list) {
                        InterfaceC5182btt bQ_ = interfaceC5198buI.bQ_();
                        Pair pair = bQ_ != null ? new Pair(interfaceC5198buI, bQ_) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    d = C8572dqo.d(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(d);
                    int i = 0;
                    for (Object obj : arrayList) {
                        if (i < 0) {
                            C8569dql.h();
                        }
                        Pair pair2 = (Pair) obj;
                        InterfaceC5182btt interfaceC5182btt = (InterfaceC5182btt) pair2.c();
                        String id = ((InterfaceC5198buI) pair2.b()).getId();
                        C8632dsu.a(id, "");
                        C8632dsu.d(interfaceC5182btt);
                        C5438byk c5438byk = new C5438byk(i, id, interfaceC5182btt);
                        c5438byk.c();
                        arrayList2.add(c5438byk);
                        i++;
                    }
                    f.setTitles(arrayList2);
                }
            };
            Consumer consumer = new Consumer() { // from class: o.bye
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5373bxY.c.c(drM.this, obj);
                }
            };
            final BulkRaterImpl$createRaterView$1$showRater$2 bulkRaterImpl$createRaterView$1$showRater$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$showRater$2
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    C5373bxY.d dVar = C5373bxY.e;
                }
            };
            e2.subscribe(consumer, new Consumer() { // from class: o.byf
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5373bxY.c.a(drM.this, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }

        @Override // o.InterfaceC5366bxR
        public void e(boolean z) {
            if (m()) {
                return;
            }
            RaterRowView.b(this.i, z, k().d(), 0L, 4, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // o.InterfaceC5366bxR
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                r8 = this;
                com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r0 = r8.i
                int r0 = r0.getHeight()
                if (r0 == 0) goto L43
                com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r0 = r8.i
                boolean r0 = r0.isAttachedToWindow()
                if (r0 != 0) goto L11
                goto L43
            L11:
                com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r0 = r8.i
                int r0 = r0.getMeasuredHeight()
                double r0 = (double) r0
                r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r0 = r0 * r2
                com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r2 = r8.i
                int[] r3 = r8.b
                r2.getLocationInWindow(r3)
                int[] r2 = r8.b
                r3 = 1
                r2 = r2[r3]
                double r4 = (double) r2
                double r6 = -r0
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 < 0) goto L3d
                android.util.DisplayMetrics r2 = r8.f
                int r2 = r2.heightPixels
                double r6 = (double) r2
                double r6 = r6 - r0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 > 0) goto L3d
                o.bxY$d r0 = o.C5373bxY.e
                r0.getLogTag()
                goto L49
            L3d:
                o.bxY$d r0 = o.C5373bxY.e
                r0.getLogTag()
                goto L48
            L43:
                o.bxY$d r0 = o.C5373bxY.e
                r0.getLogTag()
            L48:
                r3 = 0
            L49:
                boolean r0 = r8.j
                if (r3 == r0) goto L5b
                r8.j = r3
                com.netflix.mediaclient.ui.bulkrater.impl.view.RaterRowView r0 = r8.i
                r0.b(r3)
                o.byd r0 = r8.k()
                r0.b(r3)
            L5b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C5373bxY.c.d():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C5431byd k() {
            C5431byd c5431byd = this.d;
            if (c5431byd != null) {
                return c5431byd;
            }
            throw new IllegalArgumentException("loggingData should not be null at this point.  That means that setupRow wasn't called yet.".toString());
        }

        private final String l() {
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            String g = k != null ? k.g() : null;
            return g + "_Dismissed";
        }

        private final boolean m() {
            return System.currentTimeMillis() - this.a.getSharedPreferences("BulkRaterPrefs", 0).getLong(l(), 0L) < 259200000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"CheckResult"})
        public final void b(final boolean z) {
            if (m() != z) {
                SharedPreferences sharedPreferences = this.a.getSharedPreferences("BulkRaterPrefs", 0);
                if (z) {
                    sharedPreferences.edit().putLong(l(), System.currentTimeMillis()).apply();
                } else {
                    sharedPreferences.edit().remove(l()).apply();
                }
                SubscribersKt.subscribeBy$default(this.c.e(new C5446bys(z)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$setDismissedState$1
                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        b(th);
                        return dpR.c;
                    }

                    public final void b(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C5373bxY.d dVar = C5373bxY.e;
                    }
                }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$createRaterView$1$setDismissedState$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Boolean bool) {
                        d(bool.booleanValue());
                        return dpR.c;
                    }

                    public final void d(boolean z2) {
                        C5373bxY.e.getLogTag();
                    }
                }, 2, (Object) null);
            }
        }
    }

    /* renamed from: o.bxY$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner c;

        public a(LifecycleOwner lifecycleOwner) {
            this.c = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.c;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.c.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$prefetchImages$$inlined$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    @SuppressLint({"CheckResult"})
    public final void e(LifecycleOwner lifecycleOwner, String str, LoMo loMo) {
        C8632dsu.c((Object) lifecycleOwner, "");
        aLN.b bVar = aLN.a;
        Observable<dpR> subscribeOn = Observable.create(new a(lifecycleOwner)).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        Observable e2 = bVar.a(subscribeOn).e(new C0955Ja(str, loMo != null ? loMo.getId() : null, 0, 0, null, 16, null));
        final BulkRaterImpl$prefetchImages$1 bulkRaterImpl$prefetchImages$1 = new drM<List<? extends InterfaceC5198buI>, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$prefetchImages$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends InterfaceC5198buI> list) {
                a(list);
                return dpR.c;
            }

            public final void a(List<? extends InterfaceC5198buI> list) {
                C8632dsu.d(list);
                ArrayList arrayList = new ArrayList();
                for (InterfaceC5198buI interfaceC5198buI : list) {
                    InterfaceC5182btt bQ_ = interfaceC5198buI.bQ_();
                    Pair pair = bQ_ != null ? new Pair(interfaceC5198buI, bQ_) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                int i = 0;
                for (Object obj : arrayList) {
                    if (i < 0) {
                        C8569dql.h();
                    }
                    Pair pair2 = (Pair) obj;
                    InterfaceC5182btt interfaceC5182btt = (InterfaceC5182btt) pair2.c();
                    String id = ((InterfaceC5198buI) pair2.b()).getId();
                    C8632dsu.a(id, "");
                    C8632dsu.d(interfaceC5182btt);
                    new C5438byk(i, id, interfaceC5182btt).c();
                    i++;
                }
            }
        };
        Consumer consumer = new Consumer() { // from class: o.bxW
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5373bxY.e(drM.this, obj);
            }
        };
        final BulkRaterImpl$prefetchImages$2 bulkRaterImpl$prefetchImages$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.BulkRaterImpl$prefetchImages$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                C5373bxY.d dVar = C5373bxY.e;
            }
        };
        e2.subscribe(consumer, new Consumer() { // from class: o.bxZ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5373bxY.b(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC5363bxO
    public InterfaceC5366bxR e(Context context, ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        return new c(viewGroup, lifecycleOwner, context);
    }
}
