package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.android.widgetry.widget.tabs.BottomTabView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import dagger.Lazy;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cuW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7347cuW extends C7348cuX {
    private final Lazy<InterfaceC5844cKl> h;
    private final ViewGroup i;
    private final InterfaceC7221csC j;
    public static final a f = new a(null);
    public static final int c = 8;

    /* renamed from: o.cuW$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DownloadState.values().length];
            try {
                iArr[DownloadState.InProgress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadState.Complete.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            e = iArr;
        }
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cuW$e */
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC7345cuU aG();
    }

    /* renamed from: o.cuW$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("VideoDetailsOfflineListener_Ab24021");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7347cuW(ViewGroup viewGroup, boolean z, Lazy<InterfaceC5844cKl> lazy, InterfaceC7221csC interfaceC7221csC) {
        super(viewGroup, z);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) interfaceC7221csC, "");
        this.i = viewGroup;
        this.h = lazy;
        this.j = interfaceC7221csC;
    }

    @Override // o.C7348cuX, o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void c(InterfaceC5206buQ interfaceC5206buQ, int i) {
        super.c(interfaceC5206buQ, i);
        d(interfaceC5206buQ);
    }

    @Override // o.C7348cuX, o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, StopReason stopReason) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        super.d(interfaceC5206buQ, stopReason);
        d(interfaceC5206buQ);
    }

    @Override // o.C7348cuX, o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void a(InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        d(interfaceC5206buQ);
    }

    @Override // o.C7348cuX, o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(String str, Status status, boolean z) {
        View findViewWithTag;
        super.b(str, status, z);
        if (str == null || (findViewWithTag = this.i.findViewWithTag(bFN.a.c(str))) == null) {
            return;
        }
        View findViewById = findViewWithTag.findViewById(com.netflix.mediaclient.ui.R.g.bJ);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = findViewWithTag.findViewById(com.netflix.mediaclient.ui.R.g.bj);
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setVisibility(8);
    }

    private final void d(InterfaceC5206buQ interfaceC5206buQ) {
        CharSequence charSequence = null;
        String aH_ = interfaceC5206buQ != null ? interfaceC5206buQ.aH_() : null;
        if (aH_ == null) {
            return;
        }
        boolean z = interfaceC5206buQ.C() == WatchState.WATCHING_ALLOWED;
        View findViewWithTag = this.i.findViewWithTag(bFN.a.c(aH_));
        if (findViewWithTag == null) {
            return;
        }
        C1204Sr c1204Sr = (C1204Sr) findViewWithTag.findViewById(com.netflix.mediaclient.ui.R.g.bh);
        if (c1204Sr != null) {
            DownloadState au_ = interfaceC5206buQ.au_();
            int i = au_ == null ? -1 : d.e[au_.ordinal()];
            if (i == 1) {
                charSequence = C8168dfL.d(this.i.getContext(), C1333Xq.d(com.netflix.mediaclient.ui.R.o.fx).d("progress", Integer.valueOf(interfaceC5206buQ.aD_())).c(), com.netflix.mediaclient.ui.R.c.e);
            } else if (i != 2) {
                charSequence = C7353cuc.a(this.i.getContext(), interfaceC5206buQ);
            }
            c1204Sr.setText(charSequence);
        }
        View findViewById = findViewWithTag.findViewById(com.netflix.mediaclient.ui.R.g.bj);
        C8632dsu.d(findViewById);
        findViewById.setVisibility(interfaceC5206buQ.au_() != DownloadState.Complete ? 0 : 8);
        View findViewById2 = findViewWithTag.findViewById(com.netflix.mediaclient.ui.R.g.ff);
        if (findViewById2 != null) {
            findViewById2.setVisibility(z ? 0 : 8);
        }
        View findViewById3 = findViewWithTag.findViewById(com.netflix.mediaclient.ui.R.g.bJ);
        if (findViewById3 == null) {
            return;
        }
        findViewById3.setVisibility((findViewById.getVisibility() == 0) ^ true ? 0 : 8);
    }

    @Override // o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(String str) {
        View view;
        C9843xd c2;
        BottomTabView a2;
        C8632dsu.c((Object) str, "");
        super.b(str);
        NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(this.i.getContext(), NetflixActivity.class);
        if (netflixActivity == null || netflixActivity.isDpLiteDialogFragmentVisible()) {
            return;
        }
        View findViewById = netflixActivity.findViewById(16908290);
        C8632dsu.a(findViewById, "");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        NetflixBottomNavBar bottomNavBar = netflixActivity.getBottomNavBar();
        if (bottomNavBar == null || (a2 = bottomNavBar.a()) == null) {
            view = null;
        } else {
            view = a2.findViewById(C8153dex.B() ? this.h.get().j() : InterfaceC7303ctf.b);
        }
        if (!this.j.b() || frameLayout == null || view == null || (c2 = ((e) EntryPointAccessors.fromApplication(netflixActivity, e.class)).aG().c(view, netflixActivity)) == null) {
            return;
        }
        c2.e((ViewGroup) frameLayout);
    }
}
