package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;
import java.util.concurrent.CancellationException;
import o.C6388ccP;
import o.C6399cca;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cca  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6399cca extends C6388ccP<InterfaceC5223buh> {
    private final InterfaceC6394ccV f;
    private C6392ccT g;
    private Integer i;
    private final LolomoRecyclerViewAdapter j;
    private boolean k;
    private boolean l;
    private final a m;
    private final TrackingInfoHolder n;
    public static final b c = new b(null);
    public static final int b = 8;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cca$e */
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC5363bxO u();
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void d(boolean z) {
        this.k = z;
    }

    public final C6392ccT k() {
        return this.g;
    }

    public final Integer o() {
        return this.i;
    }

    /* renamed from: o.cca$g */
    /* loaded from: classes4.dex */
    public static final class g implements View.OnLayoutChangeListener {
        public g() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            view.removeOnLayoutChangeListener(this);
            String annotation = C6399cca.this.f().getAnnotation("num_rated_items");
            if (annotation != null) {
                C8632dsu.d((Object) annotation);
                i9 = Integer.parseInt(annotation);
            } else {
                i9 = 0;
            }
            RecyclerView b = C6399cca.this.b();
            RecyclerView.LayoutManager layoutManager = b != null ? b.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                C6399cca.c.getLogTag();
                C1332Xp c1332Xp = C1332Xp.b;
                linearLayoutManager.scrollToPositionWithOffset(i9, (int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
                RecyclerView b2 = C6399cca.this.b();
                if (b2 != null) {
                    b2.post(new j(linearLayoutManager, i9));
                }
            }
            C6399cca.this.d(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6399cca(Context context, final LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) lolomoRecyclerViewAdapter, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) interfaceC6394ccV, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.j = lolomoRecyclerViewAdapter;
        this.f = interfaceC6394ccV;
        this.n = trackingInfoHolder;
        this.m = new a();
        final NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(context, NetflixActivity.class);
        if (netflixActivity != null) {
            CompletableSubject j2 = NetflixApplication.getInstance().j();
            Observable subscribeOn = Observable.create(new d(netflixActivity)).subscribeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(subscribeOn, "");
            j2.takeUntil(Completable.fromObservable(subscribeOn)).subscribe(new Action() { // from class: o.ccd
                @Override // io.reactivex.functions.Action
                public final void run() {
                    C6399cca.e(NetflixActivity.this, loMo);
                }
            });
        }
    }

    /* renamed from: o.cca$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("BulkRaterListAdapter");
        }
    }

    /* renamed from: o.cca$a */
    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6392ccT k = C6399cca.this.k();
            if (k != null) {
                C6399cca.c.getLogTag();
                k.h().d();
            }
            Integer o2 = C6399cca.this.o();
            if (o2 == null || o2.intValue() != 0) {
                C6399cca.this.c(true);
                C8187dfe.a(this, 100L);
                return;
            }
            C6399cca.this.c(false);
        }
    }

    /* renamed from: o.cca$d */
    /* loaded from: classes4.dex */
    public static final class d<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner b;

        public d(LifecycleOwner lifecycleOwner) {
            this.b = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.b;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.b.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.lolomo.BulkRaterListAdapter$_init_$lambda$1$$inlined$createDestroyObservable$1$1
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6388ccP, o.AbstractC6337cbR
    public void b(List<InterfaceC5222bug<InterfaceC5223buh>> list) {
        C6392ccT c6392ccT;
        InterfaceC5366bxR h;
        C8632dsu.c((Object) list, "");
        super.b(list);
        if (!n() || (c6392ccT = this.g) == null || (h = c6392ccT.h()) == null) {
            return;
        }
        h.e(list.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    public void c(List<InterfaceC5222bug<InterfaceC5223buh>> list, boolean z) {
        C8632dsu.c((Object) list, "");
        super.c(list, z);
        c.getLogTag();
        if (n()) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    public int c(Context context, int i) {
        C8632dsu.c((Object) context, "");
        return n() ? super.c(context, i) : i;
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (n()) {
            return super.getItemViewType(i);
        }
        return 1;
    }

    private final void m() {
        RecyclerView b2;
        if (this.k || (b2 = b()) == null) {
            return;
        }
        b2.addOnLayoutChangeListener(new g());
    }

    private final boolean n() {
        String annotation = f().getAnnotation("is_payoff");
        if (annotation != null) {
            return Boolean.parseBoolean(annotation);
        }
        return false;
    }

    @Override // o.AbstractC6337cbR, o.AbstractC9900yh
    public void e(RecyclerView recyclerView, BaseVerticalRecyclerViewAdapter.d dVar) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) dVar, "");
        super.e(recyclerView, dVar);
        c.getLogTag();
        C6392ccT c6392ccT = (C6392ccT) dVar;
        InterfaceC5366bxR h = c6392ccT.h();
        String g2 = this.j.g();
        LoMo f = f();
        C8632dsu.a(f, "");
        h.d(g2, f);
        if (n()) {
            c6392ccT.h().e(f().getLength() == 0);
            m();
        } else if (f().getLength() == 0) {
            c6392ccT.h().e(true);
        } else {
            c6392ccT.h().b(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.BulkRaterListAdapter$onRowViewHolderBound$2$1
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }

                public final void d() {
                    C6399cca.this.a(false);
                }
            });
            c6392ccT.h().b();
        }
        RecyclerView b2 = b();
        if (b2 != null) {
            C8632dsu.d(b2);
            d(recyclerView, b2, recyclerView.getScrollState());
        }
        this.g = c6392ccT;
    }

    @Override // o.C6388ccP
    protected C6388ccP.c b(ViewGroup viewGroup, C1220Th c1220Th, InterfaceC1732aMe interfaceC1732aMe) {
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) c1220Th, "");
        C8632dsu.c((Object) interfaceC1732aMe, "");
        return new c(viewGroup, c1220Th, this);
    }

    @Override // o.AbstractC9900yh
    public void c(RecyclerView recyclerView, BaseVerticalRecyclerViewAdapter.d dVar) {
        InterfaceC5366bxR h;
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) dVar, "");
        super.c(recyclerView, dVar);
        C6392ccT c6392ccT = this.g;
        if (c6392ccT != null && (h = c6392ccT.h()) != null) {
            h.b(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.BulkRaterListAdapter$onRowViewHolderUnbound$1
                public final void a() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }
            });
        }
        this.g = null;
    }

    @Override // o.C6388ccP, o.AbstractC9900yh
    public void d(RecyclerView recyclerView, RecyclerView recyclerView2, int i) {
        InterfaceC5366bxR h;
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) recyclerView2, "");
        super.d(recyclerView, recyclerView2, i);
        this.i = Integer.valueOf(i);
        C6392ccT c6392ccT = this.g;
        if (c6392ccT != null && (h = c6392ccT.h()) != null) {
            h.d();
        }
        if (this.l) {
            return;
        }
        this.l = true;
        C8187dfe.a(this.m, 100L);
    }

    /* renamed from: o.cca$c */
    /* loaded from: classes4.dex */
    public static class c extends C6388ccP.c {
        private final ViewGroup d;
        private final C1220Th i;

        @Override // o.AbstractC9900yh.c
        public boolean e() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup, C1220Th c1220Th, InterfaceC1732aMe interfaceC1732aMe) {
            super(viewGroup, c1220Th, interfaceC1732aMe);
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) c1220Th, "");
            C8632dsu.c((Object) interfaceC1732aMe, "");
            this.d = viewGroup;
            this.i = c1220Th;
        }

        @Override // o.AbstractC6379ccG.d
        public AppView al_() {
            return AppView.rewardItemArt;
        }
    }

    /* renamed from: o.cca$j */
    /* loaded from: classes4.dex */
    static final class j implements Runnable {
        final /* synthetic */ LinearLayoutManager b;
        final /* synthetic */ int d;

        j(LinearLayoutManager linearLayoutManager, int i) {
            this.b = linearLayoutManager;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinearLayoutManager linearLayoutManager = this.b;
            int i = this.d;
            C1332Xp c1332Xp = C1332Xp.b;
            linearLayoutManager.scrollToPositionWithOffset(i, (int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActivity netflixActivity, LoMo loMo) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) loMo, "");
        ((e) EntryPointAccessors.fromApplication(netflixActivity, e.class)).u().b(ProcessLifecycleOwner.Companion.get(), loMo);
    }
}
