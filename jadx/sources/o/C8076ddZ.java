package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.commander.api.TargetsDiscovery;
import com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;
import io.reactivex.functions.Action;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import o.C1812aPd;
import o.C8076ddZ;
import o.C8632dsu;
import o.InterfaceC5844cKl;
import o.aIB;
import o.bBI;
import o.dpR;

/* renamed from: o.ddZ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8076ddZ extends C1045Mp {
    private static int a = 1;
    public static final C8076ddZ d;
    private static int e;
    private static byte e$ss2$552;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.ddZ$a */
    /* loaded from: classes5.dex */
    public interface a {
        InterfaceC3549bBz d();
    }

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.ddZ$b */
    /* loaded from: classes5.dex */
    public interface b {
        TargetsDiscovery w();
    }

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.ddZ$c */
    /* loaded from: classes5.dex */
    public interface c {
        bBI t();
    }

    /* renamed from: o.ddZ$d */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TargetsDiscovery.NextAction.values().length];
            try {
                iArr[TargetsDiscovery.NextAction.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetsDiscovery.NextAction.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.ddZ$e */
    /* loaded from: classes5.dex */
    public interface e {
        bBG a();
    }

    static {
        c();
        d = new C8076ddZ();
    }

    static void c() {
        e$ss2$552 = (byte) 24;
    }

    private C8076ddZ() {
        super("CdxUtils");
    }

    public static final boolean e(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        return C8153dex.l() && !netflixActivity.isPlayerActivity();
    }

    public static final void n(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        if (netflixActivity.isPlayerActivity()) {
            return;
        }
        C8076ddZ c8076ddZ = d;
        c8076ddZ.getLogTag();
        if (!C8153dex.l()) {
            c8076ddZ.l(netflixActivity);
        } else {
            c8076ddZ.r(netflixActivity);
        }
    }

    public static final int d(NetflixActivity netflixActivity, boolean z) {
        C8632dsu.c((Object) netflixActivity, "");
        if (C8153dex.l()) {
            Pair<Integer, Integer> i2 = i((Activity) netflixActivity);
            return o((Activity) netflixActivity) ? i2.c().intValue() : C6539cfH.c(netflixActivity) ? C6539cfH.b(netflixActivity, z) : i2.b().intValue();
        }
        return C6539cfH.b(netflixActivity, z);
    }

    public static final boolean h(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        return e(netflixActivity) && !C6539cfH.c(netflixActivity);
    }

    public static final boolean g(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        return e(netflixActivity) && (o((Activity) netflixActivity) || !C6539cfH.c(netflixActivity));
    }

    public static final void b(NetflixActivity netflixActivity, boolean z, boolean z2, ServiceManager serviceManager) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) serviceManager, "");
        if (e(netflixActivity)) {
            aIB.e.c(netflixActivity, new h(netflixActivity, z, serviceManager, z2));
        }
    }

    /* renamed from: o.ddZ$h */
    /* loaded from: classes.dex */
    public static final class h implements aIB.e {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ ServiceManager d;
        final /* synthetic */ NetflixActivity e;

        h(NetflixActivity netflixActivity, boolean z, ServiceManager serviceManager, boolean z2) {
            this.e = netflixActivity;
            this.b = z;
            this.d = serviceManager;
            this.a = z2;
        }

        @Override // o.aIB.e
        public void run(ServiceManager serviceManager) {
            C8632dsu.c((Object) serviceManager, "");
            if (C8076ddZ.d.d(this.e, this.b, this.d)) {
                C8076ddZ.d((Activity) this.e).e(this.a);
            }
        }
    }

    public static final void a(NetflixActivity netflixActivity, boolean z) {
        C8632dsu.c((Object) netflixActivity, "");
        if (!e(netflixActivity) || e((Activity) netflixActivity).e()) {
            return;
        }
        e((Activity) netflixActivity).b(z);
    }

    public static final void i(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        if (e(netflixActivity)) {
            e((Activity) netflixActivity).j();
        }
    }

    public static final void a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        if (!C8153dex.l() || c(activity).c()) {
            return;
        }
        d.getLogTag();
        h(activity).e();
    }

    private static final void d(Activity activity, TargetsDiscovery targetsDiscovery) {
        aIB.e.c(activity, new j(targetsDiscovery));
    }

    /* renamed from: o.ddZ$j */
    /* loaded from: classes.dex */
    public static final class j implements aIB.e {
        final /* synthetic */ TargetsDiscovery d;

        j(TargetsDiscovery targetsDiscovery) {
            this.d = targetsDiscovery;
        }

        @Override // o.aIB.e
        public void run(ServiceManager serviceManager) {
            C8632dsu.c((Object) serviceManager, "");
            C8076ddZ.d.getLogTag();
            this.d.b();
        }
    }

    private static final Pair<Integer, Integer> i(Activity activity) {
        return d(activity).d();
    }

    private static final boolean o(Activity activity) {
        return C8153dex.l() && h(activity).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(NetflixActivity netflixActivity, boolean z, ServiceManager serviceManager) {
        return b(netflixActivity, z, serviceManager) && o((Activity) netflixActivity) && !c((Activity) netflixActivity).c();
    }

    public static final boolean j(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return o(activity);
    }

    public static final void d(Activity activity, String str) {
        C8632dsu.c((Object) activity, "");
        if (C8153dex.l()) {
            d.getLogTag();
            if (str == null || !C8168dfL.i(str)) {
                return;
            }
            d(activity).b(str);
        }
    }

    private final void l(final NetflixActivity netflixActivity) {
        final aOV d2 = AbstractApplicationC1040Mh.getInstance().i().d();
        if (d2 instanceof C1812aPd) {
            final C1812aPd.d dVar = new C1812aPd.d() { // from class: o.dee
                @Override // o.C1812aPd.d
                public final void d(Status status) {
                    C8076ddZ.b(NetflixActivity.this, status);
                }
            };
            if (netflixActivity.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                ((C1812aPd) d2).a(dVar);
                netflixActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.util.CdxUtils$addConfigurationChangeListener$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onDestroy(LifecycleOwner lifecycleOwner) {
                        C8632dsu.c((Object) lifecycleOwner, "");
                        NetflixActivity.this.getLifecycle().removeObserver(this);
                        ((C1812aPd) d2).c(dVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (o.C8054ddD.f() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        r1 = o.AbstractApplicationC1040Mh.d().getSystemService(com.netflix.model.leafs.originals.interactive.Moment.TYPE.NOTIFICATION);
        o.C8632dsu.d(r1);
        r1 = (android.app.NotificationManager) r1;
        r4 = r1.getNotificationChannel("cdx_notification_channel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        androidx.media3.common.util.NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
        r4 = r6.getString(com.netflix.mediaclient.ui.R.o.aq);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r4.startsWith("'!#+") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        r5 = new java.lang.Object[1];
        s(r4.substring(4), r5);
        r4 = ((java.lang.String) r5[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        r1.createNotificationChannel(androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("cdx_notification_channel", r4, 2));
        r1 = o.C8076ddZ.a + 89;
        o.C8076ddZ.e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (o.C8054ddD.f() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.netflix.mediaclient.android.activity.NetflixActivity r6, com.netflix.mediaclient.android.app.Status r7) {
        /*
            r7 = 2
            int r0 = r7 % r7
            int r0 = o.C8076ddZ.e
            int r0 = r0 + 77
            int r1 = r0 % 128
            o.C8076ddZ.a = r1
            int r0 = r0 % r7
            java.lang.String r1 = ""
            if (r0 == 0) goto L8d
            o.C8632dsu.c(r6, r1)
            o.ddZ r0 = o.C8076ddZ.d
            r0.getLogTag()
            boolean r1 = e(r6)
            if (r1 == 0) goto L89
            int r1 = o.C8076ddZ.e
            int r1 = r1 + 41
            int r2 = r1 % 128
            o.C8076ddZ.a = r2
            int r1 = r1 % r7
            r2 = 0
            if (r1 != 0) goto L34
            boolean r1 = o.C8054ddD.f()
            r3 = 35
            int r3 = r3 / r2
            if (r1 == 0) goto L85
            goto L3a
        L34:
            boolean r1 = o.C8054ddD.f()
            if (r1 == 0) goto L85
        L3a:
            android.content.Context r1 = o.AbstractApplicationC1040Mh.d()
            java.lang.String r3 = "notification"
            java.lang.Object r1 = r1.getSystemService(r3)
            o.C8632dsu.d(r1)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            java.lang.String r3 = "cdx_notification_channel"
            android.app.NotificationChannel r4 = androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline1.m(r1, r3)
            if (r4 != 0) goto L85
            androidx.media3.common.util.NotificationUtil$$ExternalSyntheticApiModelOutline1.m()
            int r4 = com.netflix.mediaclient.ui.R.o.aq
            java.lang.String r4 = r6.getString(r4)
            java.lang.String r5 = "'!#+"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L75
            r5 = 4
            java.lang.String r4 = r4.substring(r5)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            s(r4, r5)
            r2 = r5[r2]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r2.intern()
        L75:
            android.app.NotificationChannel r2 = androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(r3, r4, r7)
            androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline0.m(r1, r2)
            int r1 = o.C8076ddZ.a
            int r1 = r1 + 89
            int r2 = r1 % 128
            o.C8076ddZ.e = r2
            int r1 = r1 % r7
        L85:
            r0.r(r6)
            goto L8c
        L89:
            r6.invalidateOptionsMenu()
        L8c:
            return
        L8d:
            o.C8632dsu.c(r6, r1)
            o.ddZ r7 = o.C8076ddZ.d
            r7.getLogTag()
            e(r6)
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8076ddZ.b(com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.android.app.Status):void");
    }

    private final void r(final NetflixActivity netflixActivity) {
        if (e(netflixActivity)) {
            ((CompletableSubscribeProxy) NetflixApplication.getInstance().j().as(AutoDispose.b(AndroidLifecycleScopeProvider.c(netflixActivity)))).e(new Action() { // from class: o.deb
                @Override // io.reactivex.functions.Action
                public final void run() {
                    C8076ddZ.q(NetflixActivity.this);
                }
            });
        }
    }

    /* renamed from: o.ddZ$i */
    /* loaded from: classes5.dex */
    public static final class i implements TargetsDiscovery.d {
        final /* synthetic */ NetflixActivity b;

        i(NetflixActivity netflixActivity) {
            this.b = netflixActivity;
        }

        @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery.d
        @SuppressLint({"CheckResult"})
        public void b() {
            C8076ddZ.d.getLogTag();
            C6498ceT.c();
            this.b.showFullScreenDialog(new CastSheetDialogFrag());
        }

        @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery.d
        public void c(InterfaceC5283bvo interfaceC5283bvo) {
            C8632dsu.c((Object) interfaceC5283bvo, "");
            C8076ddZ.d.getLogTag();
            bBI c = C8076ddZ.c((Activity) this.b);
            NetflixActivity netflixActivity = this.b;
            InterfaceC5844cKl.a aVar = InterfaceC5844cKl.b;
            Context d = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d, "");
            new C8130dea(c, netflixActivity, aVar.b(d), ProcessLifecycleOwner.Companion.get()).b(interfaceC5283bvo);
        }

        @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery.d
        public void a() {
            C8076ddZ.d.getLogTag();
            C8076ddZ.m(this.b);
        }

        @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery.d
        public void a(final boolean z, int i) {
            C8076ddZ.d.getLogTag();
            ViewGroup viewGroup = (ViewGroup) this.b.findViewById(16908290);
            C9726vo.d(viewGroup, viewGroup != null ? (ViewGroup) viewGroup.findViewById(i) : null, new drX<ViewGroup, ViewGroup, dpR>() { // from class: com.netflix.mediaclient.util.CdxUtils$handleTtrCompleted$callback$1$updateImportantForAccessibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(ViewGroup viewGroup2, ViewGroup viewGroup3) {
                    a(viewGroup2, viewGroup3);
                    return dpR.c;
                }

                public final void a(ViewGroup viewGroup2, ViewGroup viewGroup3) {
                    C8632dsu.c((Object) viewGroup2, "");
                    C8632dsu.c((Object) viewGroup3, "");
                    AccessibilityUtils.d(viewGroup2, viewGroup3, z);
                }
            });
        }

        @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery.d
        public void e() {
            this.b.updateCdxIconMenu();
        }
    }

    public static final void e(NetflixActivity netflixActivity, int i2) {
        C8632dsu.c((Object) netflixActivity, "");
        if (!C8153dex.l() || e((Activity) netflixActivity).e()) {
            return;
        }
        d.getLogTag();
        if (i2 > 0 && !e((Activity) netflixActivity).a()) {
            e((Activity) netflixActivity).b();
        } else if (i2 >= 0 || e((Activity) netflixActivity).d()) {
        } else {
            e((Activity) netflixActivity).c();
        }
    }

    public static final boolean f(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return o(activity);
    }

    public static final Dialog a(NetflixActivity netflixActivity, bBI.a aVar) {
        C8632dsu.c((Object) netflixActivity, "");
        if (C8153dex.l()) {
            return netflixActivity.displayDialog(c(netflixActivity, aVar));
        }
        return null;
    }

    public static final String b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return d(activity).b();
    }

    private static final AlertDialog.Builder c(Activity activity, bBI.a aVar) {
        return c(activity).a(aVar);
    }

    public static final void f(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        if (C8153dex.l()) {
            d.getLogTag();
            if (o((Activity) netflixActivity)) {
                c((Activity) netflixActivity).a();
            } else if (p(netflixActivity)) {
                if (d((Activity) netflixActivity).c()) {
                    netflixActivity.showDeviceSheet();
                    return;
                }
                int i2 = d.a[h((Activity) netflixActivity).d().ordinal()];
                if (i2 == 1) {
                    netflixActivity.showDeviceSheet();
                } else if (i2 == 2) {
                    netflixActivity.setupCdxControllerSheet();
                } else {
                    m(netflixActivity);
                }
            }
        }
    }

    public static final void g(Activity activity) {
        C8632dsu.c((Object) activity, "");
        if (C8153dex.l()) {
            d.getLogTag();
            c(activity).e();
        }
    }

    public static final boolean c(NetflixActivity netflixActivity, Intent intent) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        if (j(netflixActivity)) {
            return d(e(intent));
        }
        return false;
    }

    public static final boolean d(Map<String, String> map) {
        C8632dsu.c((Object) map, "");
        if (C8153dex.l() && map.containsKey("cdxDeviceId") && map.containsKey("profileId")) {
            String str = map.get("cdxDeviceId");
            String str2 = map.get("profileId");
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        return (!C8153dex.l() || o((Activity) netflixActivity) || C6539cfH.c(netflixActivity)) ? false : true;
    }

    public static final void d(NetflixActivity netflixActivity, Intent intent) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) intent, "");
        if (!C8153dex.l() || netflixActivity.isDialogFragmentVisible() || C9849xj.a(netflixActivity)) {
            return;
        }
        Map<String, String> e2 = e(intent);
        if (d((Activity) netflixActivity).a(e2.get("cdxDeviceId"), e2.get("profileId"))) {
            netflixActivity.showDeviceSheet();
        }
    }

    private static final Map<String, String> e(Intent intent) {
        Bundle extras = intent.getExtras();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (extras != null) {
            if (extras.containsKey("cdxDeviceId")) {
                String string = extras.getString("cdxDeviceId", "");
                C8632dsu.a(string, "");
                linkedHashMap.put("cdxDeviceId", string);
            }
            if (extras.containsKey("profileId")) {
                String string2 = extras.getString("profileId", "");
                C8632dsu.a(string2, "");
                linkedHashMap.put("profileId", string2);
            }
        }
        return linkedHashMap;
    }

    private static final boolean p(NetflixActivity netflixActivity) {
        return (!C8153dex.l() || C8126deW.a() || netflixActivity.isDialogFragmentVisible() || C9849xj.a(netflixActivity)) ? false : true;
    }

    public static final void m(final NetflixActivity netflixActivity) {
        NetflixActionBar netflixActionBar;
        final C1205Ss k;
        C8632dsu.c((Object) netflixActivity, "");
        if (!C8153dex.l() || !d((Activity) netflixActivity).a() || (netflixActionBar = netflixActivity.getNetflixActionBar()) == null || (k = netflixActionBar.k()) == null) {
            return;
        }
        k.post(new Runnable() { // from class: o.deg
            @Override // java.lang.Runnable
            public final void run() {
                C8076ddZ.b(C1205Ss.this, netflixActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1205Ss c1205Ss, NetflixActivity netflixActivity) {
        C8632dsu.c((Object) c1205Ss, "");
        C8632dsu.c((Object) netflixActivity, "");
        int childCount = c1205Ss.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c1205Ss.getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                ActionMenuView actionMenuView = (ActionMenuView) childAt;
                int childCount2 = actionMenuView.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt2 = actionMenuView.getChildAt(i3);
                    if (childAt2.getId() == com.netflix.mediaclient.ui.R.g.a) {
                        InterfaceC3549bBz d2 = d((Activity) netflixActivity);
                        C9872yF c9872yF = netflixActivity.composeViewOverlayManager;
                        C8632dsu.a(c9872yF, "");
                        C8632dsu.d(childAt2);
                        d2.b(c9872yF, childAt2);
                        return;
                    }
                }
                continue;
            }
        }
    }

    public static final void k(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        if (e(netflixActivity) && C8153dex.S()) {
            d.getLogTag();
            b(netflixActivity);
        }
    }

    public static final void b(final NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        if (e(netflixActivity)) {
            long j2 = (!C8153dex.G() || C9737vz.d(netflixActivity)) ? 500L : 0L;
            d.getLogTag();
            netflixActivity.getHandler().postDelayed(new Runnable() { // from class: o.ddY
                @Override // java.lang.Runnable
                public final void run() {
                    C8076ddZ.o(NetflixActivity.this);
                }
            }, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        f(netflixActivity);
        netflixActivity.setupCdxControllerSheet();
    }

    public static final InterfaceC3549bBz d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((a) EntryPointAccessors.fromActivity(activity, a.class)).d();
    }

    public static final bBG e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((e) EntryPointAccessors.fromActivity(activity, e.class)).a();
    }

    public static final bBI c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((c) EntryPointAccessors.fromActivity(activity, c.class)).t();
    }

    public static final TargetsDiscovery h(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((b) EntryPointAccessors.fromActivity(activity, b.class)).w();
    }

    public static final void d(NetflixActivity netflixActivity, boolean z, boolean z2, ServiceManager serviceManager) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) serviceManager, "");
        d.getLogTag();
        if (e(netflixActivity)) {
            d((Activity) netflixActivity).a(e(netflixActivity, z, serviceManager), z2);
        }
    }

    public static final boolean d(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        d.getLogTag();
        return e(netflixActivity) && e((Activity) netflixActivity).f();
    }

    public static final boolean a(NetflixActivity netflixActivity, boolean z, ServiceManager serviceManager) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) serviceManager, "");
        d.getLogTag();
        if (C8153dex.l()) {
            return b(netflixActivity, z, serviceManager);
        }
        return e(netflixActivity, z, serviceManager);
    }

    private static final boolean e(NetflixActivity netflixActivity, boolean z, ServiceManager serviceManager) {
        C8076ddZ c8076ddZ = d;
        c8076ddZ.getLogTag();
        if (z) {
            if (serviceManager.c()) {
                if (serviceManager.E()) {
                    if (!C6193cXh.a(netflixActivity, serviceManager.x()) && C8153dex.D()) {
                        c8076ddZ.getLogTag();
                        return C8129deZ.d((Activity) netflixActivity) || C8183dfa.e(netflixActivity.getServiceManager().q());
                    }
                    return false;
                }
                c8076ddZ.getLogTag();
                return false;
            }
            return false;
        }
        c8076ddZ.getLogTag();
        return false;
    }

    private static final boolean b(Activity activity, boolean z, ServiceManager serviceManager) {
        C8076ddZ c8076ddZ = d;
        c8076ddZ.getLogTag();
        if (z) {
            if (serviceManager.c()) {
                if (serviceManager.E()) {
                    if (C6193cXh.a(activity, serviceManager.x())) {
                        return false;
                    }
                    return C8153dex.l();
                }
                c8076ddZ.getLogTag();
                return false;
            }
            return false;
        }
        c8076ddZ.getLogTag();
        return false;
    }

    private final void t(final NetflixActivity netflixActivity) {
        getLogTag();
        i iVar = new i(netflixActivity);
        final TargetsDiscovery h2 = h((Activity) netflixActivity);
        if (netflixActivity.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            h2.b(iVar);
            d(netflixActivity, h2);
            netflixActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.util.CdxUtils$handleTtrCompleted$2
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    C8632dsu.c((Object) lifecycleOwner, "");
                    C8076ddZ.d.getLogTag();
                    NetflixActivity.this.getLifecycle().removeObserver(this);
                    h2.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        C8076ddZ c8076ddZ = d;
        c8076ddZ.getLogTag();
        c8076ddZ.t(netflixActivity);
    }

    private static void s(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$552);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
