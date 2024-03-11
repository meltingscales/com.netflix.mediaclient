package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.more.ProfileSelectionManager$fetchUxconfig$1;
import com.netflix.mediaclient.ui.more.ProfileSelectionManager$handleProfileSelection$1;
import com.netflix.mediaclient.ui.more.ProfileSelectionManager$profileSelect$2;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlinx.coroutines.channels.BufferOverflow;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC1640aIu;
import o.InterfaceC8743dwx;
import o.SA;
import o.bBI;
import o.cNW;
import o.dpR;

/* renamed from: o.ciO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6705ciO {
    private final LifecycleOwner b;
    private final NetflixActivity d;
    private final InterfaceC5844cKl e;
    private final SA f;
    private final C6706ciP g;
    private bBI.a h;
    private InterfaceC5283bvo i;
    private final InterfaceC8810dzj<a> j;
    private InterfaceC5847cKo k;
    public static final d c = new d(null);
    public static final int a = 8;

    @EntryPoint
    @InstallIn({aFU.class})
    /* renamed from: o.ciO$c */
    /* loaded from: classes4.dex */
    public interface c {
        InterfaceC8351dij d();
    }

    public final View e() {
        return this.f;
    }

    public C6705ciO(NetflixActivity netflixActivity, InterfaceC5844cKl interfaceC5844cKl, SA sa, LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5844cKl, "");
        C8632dsu.c((Object) sa, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        this.d = netflixActivity;
        this.e = interfaceC5844cKl;
        this.f = sa;
        this.b = lifecycleOwner;
        this.j = C8820dzt.b(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        this.g = new C6706ciP("MoreProfileSwitchDuration");
        sa.setProfileSelectedListener(new SA.c() { // from class: o.ciO.1
            @Override // o.SA.c
            public void c(InterfaceC5283bvo interfaceC5283bvo, View view) {
                C8632dsu.c((Object) interfaceC5283bvo, "");
                if (C8076ddZ.f((Activity) C6705ciO.this.d)) {
                    C6705ciO.this.b(interfaceC5283bvo, view);
                } else {
                    C6705ciO.this.e(interfaceC5283bvo, view);
                }
            }
        });
        sa.setAddProfileListener(new View.OnClickListener() { // from class: o.ciR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6705ciO.b(C6705ciO.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C6705ciO c6705ciO, View view) {
        C8632dsu.c((Object) c6705ciO, "");
        c6705ciO.e.c().b(c6705ciO.d);
    }

    public final Observable<a> a() {
        return C7672dBb.d(this.j, null, 1, null);
    }

    public final InterfaceC8814dzn<a> c() {
        return dyR.e((InterfaceC8810dzj) this.j);
    }

    public final boolean b() {
        InterfaceC5847cKo interfaceC5847cKo = this.k;
        if (interfaceC5847cKo != null) {
            return interfaceC5847cKo.c();
        }
        return false;
    }

    public final boolean d() {
        Map d2;
        Map k;
        Throwable th;
        ServiceManager serviceManager = this.d.getServiceManager();
        if (serviceManager.c()) {
            InterfaceC5283bvo a2 = C8126deW.a(this.d);
            if (a2 != null) {
                List<? extends InterfaceC5283bvo> e = serviceManager.e();
                List<? extends InterfaceC5283bvo> G = e != null ? C8576dqs.G(e) : null;
                if (G != null && !G.isEmpty()) {
                    if (G.size() > 5) {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d2 = dqE.d();
                        k = dqE.k(d2);
                        C1596aHd c1596aHd = new C1596aHd("More than 5 profiles!", null, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                String c2 = errorType.c();
                                c1596aHd.a(c2 + " " + b2);
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
                        InterfaceC1598aHf a3 = dVar.a();
                        if (a3 != null) {
                            a3.e(c1596aHd, th);
                        } else {
                            dVar.e().b(c1596aHd, th);
                        }
                        G = G.subList(0, 5);
                    }
                    InterfaceC5283bvo interfaceC5283bvo = this.i;
                    SA sa = this.f;
                    if (interfaceC5283bvo != null && serviceManager.F()) {
                        a2 = interfaceC5283bvo;
                    }
                    sa.setProfiles(G, a2);
                    this.f.requestFocus();
                    return true;
                }
                c.getLogTag();
                return false;
            }
            c.getLogTag();
            return false;
        }
        return false;
    }

    public final Object d(InterfaceC5283bvo interfaceC5283bvo, View view, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        if (!this.d.getServiceManager().c()) {
            return C8589dre.e(false);
        }
        InterfaceC5283bvo a2 = C8126deW.a(this.d);
        if (a2 == null) {
            return C8589dre.e(false);
        }
        c.getLogTag();
        return c(a2, interfaceC5283bvo, view, interfaceC8585dra);
    }

    private final Object c(InterfaceC5283bvo interfaceC5283bvo, InterfaceC5283bvo interfaceC5283bvo2, View view, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return dwY.b(new ProfileSelectionManager$profileSelect$2(this, interfaceC5283bvo2, interfaceC5283bvo, view, null), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(cNW.b bVar, InterfaceC5283bvo interfaceC5283bvo) {
        int a2 = bVar.a();
        if (a2 == 0) {
            if (C8153dex.V()) {
                d(this.d, interfaceC5283bvo);
            }
            d(bVar.e());
            return true;
        }
        if (a2 == 1) {
            c.getLogTag();
            b(interfaceC5283bvo);
            if (bVar.c() != null && !this.d.isDestroyed()) {
                InterfaceC1640aIu.b bVar2 = InterfaceC1640aIu.d;
                NetflixActivity netflixActivity = this.d;
                Status c2 = bVar.c();
                C8632dsu.d(c2);
                bVar2.c(netflixActivity, c2, false);
            }
        } else if (a2 == 2) {
            c.getLogTag();
            b(interfaceC5283bvo);
        } else if (a2 == 3) {
            c.getLogTag();
            b(interfaceC5283bvo);
            NetflixActivity netflixActivity2 = this.d;
            ContextCompat.startActivity(netflixActivity2, HomeActivity.b((Context) netflixActivity2, AppView.moreTab, false), null);
            this.d.finish();
        }
        return false;
    }

    private final void d(boolean z) {
        this.j.a(a.b.b);
        c.getLogTag();
        NetflixActivity.finishAllActivities(this.d);
        NetflixActivity netflixActivity = this.d;
        netflixActivity.startActivity(ActivityC4183bZh.c(netflixActivity, AppView.accountMenu, false, z).addFlags(67108864).putExtra(NetflixActivity.EXTRA_ENABLE_TRANSITION_ANIMATION, false));
        this.d.finish();
        this.d.overridePendingTransition(0, 0);
    }

    private final void d(Context context, InterfaceC5283bvo interfaceC5283bvo) {
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this.b), null, null, new ProfileSelectionManager$fetchUxconfig$1(context, interfaceC5283bvo, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC5283bvo interfaceC5283bvo) {
        this.j.a(a.c.e);
        InterfaceC5847cKo interfaceC5847cKo = this.k;
        if (interfaceC5847cKo != null) {
            interfaceC5847cKo.a();
        }
        this.k = null;
        SA sa = this.f;
        String profileGuid = interfaceC5283bvo.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        sa.setSelected(profileGuid);
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(InterfaceC5283bvo interfaceC5283bvo, View view, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b2;
        Object e;
        Object e2;
        ViewGroup viewGroup = (ViewGroup) this.d.findViewById(com.netflix.mediaclient.ui.R.g.aZ);
        if (viewGroup == null || (!interfaceC5283bvo.isKidsProfile() && !C8153dex.G())) {
            return dpR.c;
        }
        b2 = C8590drf.b(interfaceC8585dra);
        final C8741dwv c8741dwv = new C8741dwv(b2, 1);
        c8741dwv.h();
        this.k = this.e.g().d(viewGroup, view, interfaceC5283bvo.isKidsProfile(), interfaceC5283bvo.getAvatarUrl(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.more.ProfileSelectionManager$showSplash$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                if (c8741dwv.d()) {
                    InterfaceC8743dwx<dpR> interfaceC8743dwx = c8741dwv;
                    Result.c cVar = Result.e;
                    interfaceC8743dwx.resumeWith(Result.e(dpR.c));
                }
            }
        });
        if (this.k == null && c8741dwv.d()) {
            Result.c cVar = Result.e;
            c8741dwv.resumeWith(Result.e(dpR.c));
        }
        Object b3 = c8741dwv.b();
        e = C8586drb.e();
        if (b3 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        e2 = C8586drb.e();
        return b3 == e2 ? b3 : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(InterfaceC5283bvo interfaceC5283bvo, View view) {
        if (this.i == null) {
            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this.b), null, null, new ProfileSelectionManager$handleProfileSelection$1(this, interfaceC5283bvo, view, null), 3, null);
        }
    }

    /* renamed from: o.ciO$b */
    /* loaded from: classes4.dex */
    public static final class b implements bBI.a {
        final /* synthetic */ View a;
        final /* synthetic */ InterfaceC5283bvo e;

        b(InterfaceC5283bvo interfaceC5283bvo, View view) {
            this.e = interfaceC5283bvo;
            this.a = view;
        }

        @Override // o.bBI.a
        public void c() {
            C6705ciO.this.e(this.e, this.a);
            C6705ciO.this.h = null;
        }

        @Override // o.bBI.a
        public void e() {
            C6705ciO.this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC5283bvo interfaceC5283bvo, View view) {
        b bVar = new b(interfaceC5283bvo, view);
        this.h = bVar;
        if (C8076ddZ.a(this.d, bVar) == null) {
            e(interfaceC5283bvo, view);
            this.h = null;
            return;
        }
        C8076ddZ.g((Activity) this.d);
    }

    /* renamed from: o.ciO$a */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.ciO$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final c e = new c();

            private c() {
                super(null);
            }
        }

        private a() {
        }

        /* renamed from: o.ciO$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final b b = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: o.ciO$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0116a extends a {
            public static final C0116a e = new C0116a();

            private C0116a() {
                super(null);
            }
        }
    }

    /* renamed from: o.ciO$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ProfileSelectionManager");
        }
    }
}
