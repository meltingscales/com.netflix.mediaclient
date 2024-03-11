package o;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.netflix.mediaclient.latencytracker.impl.UiLatencyStatus;
import com.netflix.mediaclient.latencytracker.impl.UiLatencyTrackerImpl;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.C1579aGn;
import o.C8632dsu;
import o.InterfaceC8358diq;
import o.dpR;

/* renamed from: o.aGn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1579aGn implements InterfaceC1575aGj {
    private final boolean a;
    private String b;
    private C1580aGo c;
    private Map<String, String> d;
    private final UiLatencyTrackerImpl e;
    private final e f;
    private Disposable g;
    private InterfaceC8358diq j;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.aGn$a */
    /* loaded from: classes3.dex */
    public interface a {
        InterfaceC8358diq aL();
    }

    public final Disposable a() {
        return this.g;
    }

    public final void a(InterfaceC8358diq interfaceC8358diq) {
        this.j = interfaceC8358diq;
    }

    @Override // o.InterfaceC1575aGj
    public InterfaceC1575aGj b(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        return this;
    }

    public final void b(C1580aGo c1580aGo) {
        this.c = c1580aGo;
    }

    @Override // o.InterfaceC1575aGj
    public InterfaceC1575aGj c(Map<String, String> map) {
        C8632dsu.c((Object) map, "");
        this.d = map;
        return this;
    }

    public final C1580aGo c() {
        return this.c;
    }

    public final void d(Disposable disposable) {
        this.g = disposable;
    }

    public final InterfaceC8358diq e() {
        return this.j;
    }

    public C1579aGn(UiLatencyTrackerImpl uiLatencyTrackerImpl, boolean z) {
        C8632dsu.c((Object) uiLatencyTrackerImpl, "");
        this.e = uiLatencyTrackerImpl;
        this.a = z;
        Map<String, String> emptyMap = Collections.emptyMap();
        C8632dsu.a(emptyMap, "");
        this.d = emptyMap;
        this.f = new e();
    }

    @Override // o.InterfaceC1575aGj
    public InterfaceC1577aGl c(Boolean bool) {
        List<C5165btc> i;
        C8166dfJ.e(null, false, 3, null);
        if (this.e.e()) {
            this.e.a(this.a ? UiLatencyStatus.e : UiLatencyStatus.d, bool, this.b, this.d);
            if (!this.a) {
                UiLatencyTrackerImpl uiLatencyTrackerImpl = this.e;
                UiLatencyStatus uiLatencyStatus = UiLatencyStatus.d;
                i = C8569dql.i();
                uiLatencyTrackerImpl.e(uiLatencyStatus, "TTI Failed", i);
            }
            return this.f;
        }
        return this.f;
    }

    /* renamed from: o.aGn$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC1577aGl {
        private drO<dpR> e;

        /* renamed from: o.aGn$e$e  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class C0090e {
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[InteractiveTrackerInterface.Reason.values().length];
                try {
                    iArr[InteractiveTrackerInterface.Reason.success.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InteractiveTrackerInterface.Reason.canceled.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InteractiveTrackerInterface.Reason.failed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                b = iArr;
            }
        }

        @Override // o.InterfaceC1577aGl
        public void a() {
        }

        @Override // o.InterfaceC1577aGl
        public InterfaceC1577aGl b(drO<dpR> dro) {
            C8632dsu.c((Object) dro, "");
            this.e = dro;
            return this;
        }

        e() {
        }

        @Override // o.InterfaceC1577aGl
        public void e() {
            List<C5165btc> i;
            if (C1579aGn.this.e.f()) {
                InteractiveTrackerInterface.Reason reason = InteractiveTrackerInterface.Reason.success;
                i = C8569dql.i();
                d(reason, "success", i);
            }
        }

        @Override // o.InterfaceC1577aGl
        public void e(ImageLoader imageLoader, drO<? extends View> dro, Lifecycle lifecycle) {
            C8632dsu.c((Object) dro, "");
            C8632dsu.c((Object) lifecycle, "");
            if (!C1579aGn.this.e.f() || imageLoader == null) {
                return;
            }
            e(dro, lifecycle);
            C1580aGo c1580aGo = new C1580aGo(C1579aGn.this.e.c(), imageLoader);
            C1579aGn.this.b(c1580aGo);
            c1580aGo.a(new InteractiveTrackerInterface.c() { // from class: o.aGm
                @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface.c
                public final void c(InteractiveTrackerInterface.Reason reason, String str, List list) {
                    C1579aGn.e.e(C1579aGn.e.this, reason, str, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(e eVar, InteractiveTrackerInterface.Reason reason, String str, List list) {
            C8632dsu.c((Object) eVar, "");
            C8632dsu.c((Object) reason, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            eVar.d(reason, str, list);
        }

        @Override // o.InterfaceC1577aGl
        public void d(InteractiveTrackerInterface interactiveTrackerInterface, drO<? extends View> dro, Lifecycle lifecycle) {
            C8632dsu.c((Object) interactiveTrackerInterface, "");
            C8632dsu.c((Object) dro, "");
            C8632dsu.c((Object) lifecycle, "");
            if (C1579aGn.this.e.f()) {
                e(dro, lifecycle);
                interactiveTrackerInterface.a(new InteractiveTrackerInterface.c() { // from class: o.aGt
                    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface.c
                    public final void c(InteractiveTrackerInterface.Reason reason, String str, List list) {
                        C1579aGn.e.b(C1579aGn.e.this, reason, str, list);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(e eVar, InteractiveTrackerInterface.Reason reason, String str, List list) {
            C8632dsu.c((Object) eVar, "");
            C8632dsu.c((Object) reason, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            eVar.d(reason, str, list);
        }

        private final void d(InteractiveTrackerInterface.Reason reason, String str, List<C5165btc> list) {
            UiLatencyStatus uiLatencyStatus;
            if (C1579aGn.this.e.f()) {
                int i = C0090e.b[reason.ordinal()];
                if (i == 1) {
                    uiLatencyStatus = UiLatencyStatus.e;
                } else if (i == 2) {
                    uiLatencyStatus = UiLatencyStatus.b;
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    uiLatencyStatus = UiLatencyStatus.d;
                }
                C1579aGn.this.e.e(uiLatencyStatus, str, list);
                C1579aGn.this.e.j();
                drO<dpR> dro = this.e;
                if (dro != null) {
                    dro.invoke();
                }
            }
        }

        private final void e(drO<? extends View> dro, Lifecycle lifecycle) {
            if (ConfigFastPropertyFeatureControlConfig.Companion.z()) {
                C1579aGn.this.e.a(true);
                if (C1579aGn.this.e() != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                InterfaceC8358diq aL = ((a) EntryPointAccessors.fromApplication(C1579aGn.this.e.b(), a.class)).aL();
                C1579aGn.this.a(aL);
                if (C1579aGn.this.a() != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C1579aGn c1579aGn = C1579aGn.this;
                Single b = InterfaceC8358diq.a.b(aL, dro, lifecycle, null, 4, null);
                final C1579aGn c1579aGn2 = C1579aGn.this;
                final drM<InterfaceC8358diq.c, dpR> drm = new drM<InterfaceC8358diq.c, dpR>() { // from class: com.netflix.mediaclient.latencytracker.impl.UiLatencyTrackerTTIEnderImpl$uiLatencyTrackerTTREnder$1$startViewPortTtrTracking$1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(InterfaceC8358diq.c cVar) {
                        d(cVar);
                        return dpR.c;
                    }

                    public final void d(InterfaceC8358diq.c cVar) {
                        UiLatencyTrackerImpl uiLatencyTrackerImpl = C1579aGn.this.e;
                        C8632dsu.d(cVar);
                        uiLatencyTrackerImpl.c(cVar);
                        C1579aGn.this.e.j();
                    }
                };
                c1579aGn.d(b.subscribe(new Consumer() { // from class: o.aGq
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C1579aGn.e.a(drM.this, obj);
                    }
                }));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }
    }
}
