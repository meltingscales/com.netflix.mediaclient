package o;

import android.app.Activity;
import android.text.format.DateUtils;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$observeNotifications$1;
import com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$observeNotifications$2;
import com.netflix.model.leafs.social.NotificationsListSummary;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.AbstractC3073as;
import o.AbstractC5164btb;
import o.C5904cMr;
import o.C5907cMu;
import o.C5909cMw;
import o.C5950cOj;
import o.C8569dql;
import o.C8632dsu;
import o.InterfaceC1570aGe;
import o.InterfaceC1571aGf;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC5125bsp;
import o.InterfaceC7084cpY;
import o.InterfaceC8612dsa;
import o.InterfaceC8812dzl;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.duS;

/* renamed from: o.cMu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5907cMu {
    public static final d a = new d(null);
    public static final int c = 8;
    private BehaviorSubject<Boolean> b;
    private final Activity d;
    private final InterfaceC1570aGe e;
    private final BehaviorSubject<Boolean> f;
    private final InterfaceC8554dpx g;
    private final Lazy<C5904cMr> h;
    private final InterfaceC7084cpY i;
    private final InterfaceC8812dzl<Boolean> j;

    /* renamed from: o  reason: collision with root package name */
    private final BehaviorSubject<List<String>> f13683o;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i;
    }

    @Inject
    public C5907cMu(Activity activity, InterfaceC1570aGe interfaceC1570aGe, InterfaceC7084cpY interfaceC7084cpY, Lazy<C5904cMr> lazy) {
        InterfaceC8554dpx b;
        List i;
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC1570aGe, "");
        C8632dsu.c((Object) interfaceC7084cpY, "");
        C8632dsu.c((Object) lazy, "");
        this.d = activity;
        this.e = interfaceC1570aGe;
        this.i = interfaceC7084cpY;
        this.h = lazy;
        Boolean bool = Boolean.FALSE;
        this.j = dzB.d(bool);
        b = dpB.b(new drO<InterfaceC1571aGf>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$imageRepository$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final InterfaceC1571aGf invoke() {
                InterfaceC1570aGe interfaceC1570aGe2;
                interfaceC1570aGe2 = C5907cMu.this.e;
                return interfaceC1570aGe2.a();
            }
        });
        this.g = b;
        BehaviorSubject<Boolean> createDefault = BehaviorSubject.createDefault(bool);
        C8632dsu.a(createDefault, "");
        this.f = createDefault;
        i = C8569dql.i();
        BehaviorSubject<List<String>> createDefault2 = BehaviorSubject.createDefault(i);
        C8632dsu.a(createDefault2, "");
        this.f13683o = createDefault2;
        C8187dfe.c(new Runnable() { // from class: o.cMx
            @Override // java.lang.Runnable
            public final void run() {
                C5907cMu.i(C5907cMu.this);
            }
        });
    }

    /* renamed from: o.cMu$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    private final InterfaceC1571aGf d() {
        return (InterfaceC1571aGf) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C5907cMu c5907cMu) {
        C8632dsu.c((Object) c5907cMu, "");
        c5907cMu.e();
    }

    private final void e() {
        Map k;
        Throwable th;
        C8166dfJ.e(null, false, 3, null);
        Activity activity = this.d;
        C8632dsu.d(activity);
        Fragment h = ((MO) activity).h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag == null) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("primaryFrag is null in MyNetflixNotificationsManager.", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c3 = dVar2.c();
            if (c3 != null) {
                c3.d(c1596aHd, th);
                return;
            } else {
                dVar2.e().b(c1596aHd, th);
                return;
            }
        }
        BehaviorSubject<Boolean> createDefault = BehaviorSubject.createDefault(Boolean.valueOf(netflixFrag.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED));
        C8632dsu.a(createDefault, "");
        this.b = createDefault;
        ((MO) this.d).registerFragmentLifecycleCallbacks(new c(netflixFrag, this));
        b();
    }

    /* renamed from: o.cMu$c */
    /* loaded from: classes4.dex */
    public static final class c extends MM {
        final /* synthetic */ C5907cMu a;
        final /* synthetic */ NetflixFrag c;

        c(NetflixFrag netflixFrag, C5907cMu c5907cMu) {
            this.c = netflixFrag;
            this.a = c5907cMu;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            C8632dsu.c((Object) fragmentManager, "");
            C8632dsu.c((Object) fragment, "");
            if (C8632dsu.c(this.c, fragment)) {
                BehaviorSubject behaviorSubject = this.a.b;
                if (behaviorSubject == null) {
                    C8632dsu.d("");
                    behaviorSubject = null;
                }
                behaviorSubject.onNext(Boolean.TRUE);
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
            C8632dsu.c((Object) fragmentManager, "");
            C8632dsu.c((Object) fragment, "");
            if (C8632dsu.c(this.c, fragment)) {
                BehaviorSubject behaviorSubject = this.a.b;
                if (behaviorSubject == null) {
                    C8632dsu.d("");
                    behaviorSubject = null;
                }
                behaviorSubject.onNext(Boolean.FALSE);
            }
        }

        @Override // o.MM
        public void e(NetflixFrag netflixFrag, boolean z) {
            C8632dsu.c((Object) netflixFrag, "");
            if (C8632dsu.c(this.c, netflixFrag)) {
                BehaviorSubject behaviorSubject = this.a.b;
                if (behaviorSubject == null) {
                    C8632dsu.d("");
                    behaviorSubject = null;
                }
                behaviorSubject.onNext(Boolean.valueOf(!z));
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            C8632dsu.c((Object) fragmentManager, "");
            C8632dsu.c((Object) fragment, "");
            if (C8632dsu.c(this.c, fragment)) {
                BehaviorSubject behaviorSubject = this.a.b;
                if (behaviorSubject == null) {
                    C8632dsu.d("");
                    behaviorSubject = null;
                }
                behaviorSubject.onComplete();
            }
        }
    }

    private final void b() {
        BehaviorSubject<Boolean> behaviorSubject = this.b;
        if (behaviorSubject == null) {
            C8632dsu.d("");
            behaviorSubject = null;
        }
        BehaviorSubject<Boolean> behaviorSubject2 = this.f;
        Observable<List<String>> distinctUntilChanged = this.f13683o.distinctUntilChanged();
        final MyNetflixNotificationsManager$observeNotifications$1 myNetflixNotificationsManager$observeNotifications$1 = new InterfaceC8612dsa<Boolean, Boolean, List<? extends String>, Boolean>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$observeNotifications$1
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
                if ((!r4.isEmpty()) != false) goto L7;
             */
            @Override // o.InterfaceC8612dsa
            /* renamed from: e */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke(java.lang.Boolean r2, java.lang.Boolean r3, java.util.List<java.lang.String> r4) {
                /*
                    r1 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r2, r0)
                    o.C8632dsu.c(r3, r0)
                    o.C8632dsu.c(r4, r0)
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L20
                    boolean r2 = r3.booleanValue()
                    if (r2 == 0) goto L20
                    boolean r2 = r4.isEmpty()
                    r3 = 1
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L20
                    goto L21
                L20:
                    r3 = 0
                L21:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$observeNotifications$1.invoke(java.lang.Boolean, java.lang.Boolean, java.util.List):java.lang.Boolean");
            }
        };
        Observable debounce = Observable.combineLatest(behaviorSubject, behaviorSubject2, distinctUntilChanged, new Function3() { // from class: o.cMv
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Boolean d2;
                d2 = C5907cMu.d(InterfaceC8612dsa.this, obj, obj2, obj3);
                return d2;
            }
        }).debounce(OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME, TimeUnit.MILLISECONDS);
        final MyNetflixNotificationsManager$observeNotifications$2 myNetflixNotificationsManager$observeNotifications$2 = new drM<Boolean, Boolean>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$observeNotifications$2
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(Boolean bool) {
                C8632dsu.c((Object) bool, "");
                return bool;
            }
        };
        Observable filter = debounce.filter(new Predicate() { // from class: o.cMz
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean d2;
                d2 = C5907cMu.d(drM.this, obj);
                return d2;
            }
        });
        Activity activity = this.d;
        C8632dsu.d(activity);
        Object as = filter.as(AutoDispose.b(AndroidLifecycleScopeProvider.c((ComponentActivity) activity)));
        C8632dsu.a(as, "");
        C9725vn.a((ObservableSubscribeProxy) as, null, null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$observeNotifications$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                a(bool);
                return dpR.c;
            }

            public final void a(Boolean bool) {
                BehaviorSubject behaviorSubject3;
                Activity activity2;
                InterfaceC8812dzl interfaceC8812dzl;
                InterfaceC5125bsp j;
                behaviorSubject3 = C5907cMu.this.f13683o;
                List<String> list = (List) behaviorSubject3.getValue();
                if (list != null) {
                    C5907cMu c5907cMu = C5907cMu.this;
                    activity2 = c5907cMu.d;
                    ServiceManager c2 = ServiceManager.c(activity2);
                    if (c2 != null && (j = c2.j()) != null) {
                        j.c(list, new b(c5907cMu));
                    }
                    interfaceC8812dzl = c5907cMu.j;
                    interfaceC8812dzl.d(Boolean.TRUE);
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends AbstractC5164btb {
                final /* synthetic */ C5907cMu e;

                b(C5907cMu c5907cMu) {
                    this.e = c5907cMu;
                }

                @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
                public void l(List<NotificationSummaryItem> list, Status status) {
                    Activity activity;
                    InterfaceC5125bsp j;
                    C8632dsu.c((Object) status, "");
                    activity = this.e.d;
                    ServiceManager c = ServiceManager.c(activity);
                    if (c == null || (j = c.j()) == null) {
                        return;
                    }
                    j.c(true);
                }
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean d(InterfaceC8612dsa interfaceC8612dsa, Object obj, Object obj2, Object obj3) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c(obj, "");
        C8632dsu.c(obj2, "");
        C8632dsu.c(obj3, "");
        return (Boolean) interfaceC8612dsa.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public final void e(InterfaceC2023aX interfaceC2023aX, final NotificationsListSummary notificationsListSummary, final TrackingInfoHolder trackingInfoHolder) {
        List i;
        final duS<C5950cOj> a2;
        int d2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        if (notificationsListSummary != null) {
            List<NotificationSummaryItem> notifications = notificationsListSummary.notifications();
            if (notifications == null) {
                return;
            }
            List e = C8202dft.e(notifications, 0, 2, null);
            ArrayList<NotificationSummaryItem> arrayList = new ArrayList();
            for (Object obj : e) {
                NotificationSummaryItem notificationSummaryItem = (NotificationSummaryItem) obj;
                if (notificationSummaryItem.isValid() && notificationSummaryItem.header() != null && notificationSummaryItem.body() != null) {
                    arrayList.add(obj);
                }
            }
            d2 = C8572dqo.d(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(d2);
            for (NotificationSummaryItem notificationSummaryItem2 : arrayList) {
                C8632dsu.d(notificationSummaryItem2);
                arrayList2.add(new C5950cOj(notificationSummaryItem2));
            }
            a2 = duO.a(arrayList2);
        } else {
            i = C8569dql.i();
            a2 = duO.a(i);
        }
        ArrayList arrayList3 = new ArrayList();
        for (C5950cOj c5950cOj : a2) {
            String eventGuid = c5950cOj.d().eventGuid();
            if (eventGuid != null) {
                arrayList3.add(eventGuid);
            }
        }
        this.f13683o.onNext(arrayList3);
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        C2322ae c2 = C2437ag.c("my-notifications-row", Arrays.copyOf(strArr, strArr.length), ComposableLambdaKt.composableLambdaInstance(487761206, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$addNotificationsRow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return dpR.c;
            }

            public final void b(Composer composer, int i2) {
                if ((i2 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(487761206, i2, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager.addNotificationsRow.<anonymous> (MyNetflixNotificationsManager.kt:217)");
                }
                C5907cMu.this.b(a2, notificationsListSummary, trackingInfoHolder, composer, 4672);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        c2.a((CharSequence) "my-notifications-row");
        AbstractC3073as<?> a3 = c2.a(new AbstractC3073as.b() { // from class: o.cMq
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int e2;
                e2 = C5907cMu.e(i2, i3, i4);
                return e2;
            }
        });
        C8632dsu.a(a3, "");
        interfaceC2023aX.add(a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final duS<C5950cOj> dus, final NotificationsListSummary notificationsListSummary, final TrackingInfoHolder trackingInfoHolder, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1571828517);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1571828517, i, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager.NotificationsRow (MyNetflixNotificationsManager.kt:232)");
        }
        C1572aGg.b(d(), ComposableLambdaKt.composableLambda(startRestartGroup, -108862668, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$NotificationsRow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }

            public final void c(Composer composer2, int i2) {
                Activity activity;
                InterfaceC8812dzl interfaceC8812dzl;
                Activity activity2;
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-108862668, i2, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager.NotificationsRow.<anonymous> (MyNetflixNotificationsManager.kt:234)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    final C5907cMu c5907cMu = C5907cMu.this;
                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, new drM<LayoutCoordinates, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$NotificationsRow$1.1
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(LayoutCoordinates layoutCoordinates) {
                            e(layoutCoordinates);
                            return dpR.c;
                        }

                        public final void e(LayoutCoordinates layoutCoordinates) {
                            BehaviorSubject behaviorSubject;
                            BehaviorSubject behaviorSubject2;
                            C8632dsu.c((Object) layoutCoordinates, "");
                            long positionInWindow = LayoutCoordinatesKt.positionInWindow(layoutCoordinates);
                            if (!layoutCoordinates.isAttached() || !Offset.m1140isValidimpl(positionInWindow) || Offset.m1138getYimpl(positionInWindow) <= 0.0f) {
                                behaviorSubject = C5907cMu.this.f;
                                behaviorSubject.onNext(Boolean.FALSE);
                                return;
                            }
                            behaviorSubject2 = C5907cMu.this.f;
                            behaviorSubject2.onNext(Boolean.TRUE);
                        }
                    });
                    final C5907cMu c5907cMu2 = C5907cMu.this;
                    final NotificationsListSummary notificationsListSummary2 = notificationsListSummary;
                    duS<C5950cOj> dus2 = dus;
                    final TrackingInfoHolder trackingInfoHolder2 = trackingInfoHolder;
                    composer2.startReplaceableGroup(-483455358);
                    final int i3 = 0;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    drO<ComposeUiNode> constructor = companion2.getConstructor();
                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(onGloballyPositioned);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1009constructorimpl = Updater.m1009constructorimpl(composer2);
                    Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    activity = c5907cMu2.d;
                    String string = activity.getResources().getString(R.o.hH);
                    C8632dsu.a(string, "");
                    C5909cMw.d(null, string, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$NotificationsRow$1$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            d();
                            return dpR.c;
                        }

                        public final void d() {
                            Activity activity3;
                            InterfaceC7084cpY interfaceC7084cpY;
                            Activity activity4;
                            TrackingInfoHolder trackingInfoHolder3 = TrackingInfoHolder.this;
                            TrackingInfo e = trackingInfoHolder3 != null ? TrackingInfoHolder.e(trackingInfoHolder3, null, 1, null) : null;
                            CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                            AppView appView = AppView.accountMenu;
                            cLv2Utils.d(appView, CommandValue.ViewNotificationsCommand, e, new Focus(appView, e), null, true, null);
                            activity3 = c5907cMu2.d;
                            interfaceC7084cpY = c5907cMu2.i;
                            activity4 = c5907cMu2.d;
                            activity3.startActivity(interfaceC7084cpY.a(activity4));
                        }
                    }, composer2, 0, 1);
                    composer2.startReplaceableGroup(283509116);
                    if (notificationsListSummary2 != null) {
                        interfaceC8812dzl = c5907cMu2.j;
                        boolean booleanValue = ((Boolean) SnapshotStateKt.collectAsState(interfaceC8812dzl, null, composer2, 8, 1).getValue()).booleanValue();
                        composer2.startReplaceableGroup(-1468728031);
                        if (!dus2.isEmpty()) {
                            SpacerKt.Spacer(SizeKt.m295size3ABfNKs(companion, Dp.m2492constructorimpl(4)), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        for (C5950cOj c5950cOj : dus2) {
                            if (i3 < 0) {
                                C8569dql.h();
                            }
                            final C5950cOj c5950cOj2 = c5950cOj;
                            activity2 = c5907cMu2.d;
                            C5909cMw.b(booleanValue, c5950cOj2, DateUtils.getRelativeTimeSpanString(activity2, c5950cOj2.d().timestamp()).toString(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$NotificationsRow$1$2$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // o.drO
                                public /* synthetic */ dpR invoke() {
                                    a();
                                    return dpR.c;
                                }

                                public final void a() {
                                    Lazy lazy;
                                    lazy = C5907cMu.this.h;
                                    ((C5904cMr) lazy.get()).a(c5950cOj2.d(), notificationsListSummary2, i3);
                                }
                            }, composer2, 0);
                            i3++;
                        }
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixNotificationsManager$NotificationsRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i2) {
                    C5907cMu.this.b(dus, notificationsListSummary, trackingInfoHolder, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
