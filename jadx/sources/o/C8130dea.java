package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.util.CdxProfileSwitchHelper$fetchUxConfig$1;
import com.netflix.mediaclient.util.CdxProfileSwitchHelper$onProfileSelected$2;
import com.netflix.mediaclient.util.CdxProfileSwitchHelper$profileSelect$2;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import kotlin.Result;
import o.InterfaceC8743dwx;
import o.cNW;
import o.dpR;

/* renamed from: o.dea  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8130dea {
    public static final e b = new e(null);
    public static final int c = 8;
    private final NetflixActivity a;
    private final LifecycleOwner d;
    private final InterfaceC5844cKl e;
    private final C6706ciP f;
    private InterfaceC5283bvo g;
    private final bBI i;
    private InterfaceC5847cKo j;

    @EntryPoint
    @InstallIn({aFU.class})
    /* renamed from: o.dea$b */
    /* loaded from: classes5.dex */
    public interface b {
        InterfaceC8351dij d();
    }

    public C8130dea(bBI bbi, NetflixActivity netflixActivity, InterfaceC5844cKl interfaceC5844cKl, LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) bbi, "");
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5844cKl, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        this.i = bbi;
        this.a = netflixActivity;
        this.e = interfaceC5844cKl;
        this.d = lifecycleOwner;
        this.f = new C6706ciP("CdxProfileSwitchDuration");
    }

    /* renamed from: o.dea$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("CdxProfileSwitchHelper");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        if (!this.a.getServiceManager().c()) {
            return C8589dre.e(false);
        }
        InterfaceC5283bvo a = C8126deW.a(this.a);
        if (a == null) {
            return C8589dre.e(false);
        }
        b.getLogTag();
        return c(a, interfaceC5283bvo, interfaceC8585dra);
    }

    private final Object c(InterfaceC5283bvo interfaceC5283bvo, InterfaceC5283bvo interfaceC5283bvo2, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return dwY.b(new CdxProfileSwitchHelper$profileSelect$2(this, interfaceC5283bvo2, interfaceC5283bvo, null), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(cNW.b bVar, InterfaceC5283bvo interfaceC5283bvo) {
        int a = bVar.a();
        if (a == 0) {
            d(this.a, interfaceC5283bvo);
            a(bVar.e());
            return true;
        }
        if (a == 1) {
            b.getLogTag();
            e();
            Status c2 = bVar.c();
            if (c2 != null && !this.a.isDestroyed()) {
                InterfaceC1640aIu.d.c(this.a, c2, false);
            }
        } else if (a == 2) {
            b.getLogTag();
            e();
        } else if (a == 3) {
            b.getLogTag();
            e();
            NetflixActivity netflixActivity = this.a;
            ContextCompat.startActivity(netflixActivity, HomeActivity.b((Context) netflixActivity, AppView.moreTab, false), null);
            this.a.finish();
        }
        return false;
    }

    private final void d(Context context, InterfaceC5283bvo interfaceC5283bvo) {
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this.d), null, null, new CdxProfileSwitchHelper$fetchUxConfig$1(context, interfaceC5283bvo, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC5847cKo interfaceC5847cKo = this.j;
        if (interfaceC5847cKo != null) {
            interfaceC5847cKo.a();
        }
        this.j = null;
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b2;
        Object e2;
        Object e3;
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(com.netflix.mediaclient.ui.R.g.aZ);
        if (viewGroup == null || (!interfaceC5283bvo.isKidsProfile() && !C8153dex.G())) {
            return dpR.c;
        }
        b2 = C8590drf.b(interfaceC8585dra);
        final C8741dwv c8741dwv = new C8741dwv(b2, 1);
        c8741dwv.h();
        this.j = this.e.g().d(viewGroup, null, interfaceC5283bvo.isKidsProfile(), interfaceC5283bvo.getAvatarUrl(), new drO<dpR>() { // from class: com.netflix.mediaclient.util.CdxProfileSwitchHelper$showSplash$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                if (c8741dwv.d()) {
                    InterfaceC8743dwx<dpR> interfaceC8743dwx = c8741dwv;
                    Result.c cVar = Result.e;
                    interfaceC8743dwx.resumeWith(Result.e(dpR.c));
                }
            }
        });
        if (this.j == null && c8741dwv.d()) {
            Result.c cVar = Result.e;
            c8741dwv.resumeWith(Result.e(dpR.c));
        }
        Object b3 = c8741dwv.b();
        e2 = C8586drb.e();
        if (b3 == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        e3 = C8586drb.e();
        return b3 == e3 ? b3 : dpR.c;
    }

    public final void b(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        b.getLogTag();
        if (this.g == null) {
            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this.d), null, null, new CdxProfileSwitchHelper$onProfileSelected$2(this, interfaceC5283bvo, null), 3, null);
        }
    }

    private final void a(boolean z) {
        b.getLogTag();
        NetflixActivity.finishAllActivities(this.a);
        NetflixActivity netflixActivity = this.a;
        netflixActivity.startActivity(ActivityC4183bZh.c(netflixActivity, AppView.accountMenu, false, z).addFlags(67108864).putExtra(NetflixActivity.EXTRA_ENABLE_TRANSITION_ANIMATION, false));
        this.a.finish();
        this.a.overridePendingTransition(0, 0);
    }
}
