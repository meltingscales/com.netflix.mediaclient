package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C7350cuZ;
import o.C9833xT;
import o.C9834xU;

/* renamed from: o.crG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7172crG extends AbstractC5166btd implements InterfaceC7216cry {
    protected static final List<String> a = new ArrayList();
    protected C7310ctm b;
    private final View.OnClickListener c = new View.OnClickListener() { // from class: o.crG.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(view.getContext(), NetflixActivity.class);
            if (C8054ddD.l(netflixActivity)) {
                return;
            }
            if (NetflixActivity.getOfflineAgentOrNull(netflixActivity) != null && C7353cuc.a().g() == 0) {
                C1044Mm.a("ActivityPageOfflineAgentListener", "launchMyDownloads dismissing");
                C7172crG.this.b();
            }
            netflixActivity.startActivity(OfflineActivityV2.b(netflixActivity));
        }
    };
    private Drawable d;
    private final ViewGroup e;
    private final boolean h;

    public C7172crG(ViewGroup viewGroup, boolean z) {
        this.h = z;
        this.e = viewGroup;
    }

    @Override // o.InterfaceC7216cry
    public void d() {
        e(false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(boolean z, boolean z2) {
        InterfaceC4208baF t;
        NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(this.e.getContext(), NetflixActivity.class);
        if (netflixActivity == null || !netflixActivity.canShowDownloadProgressBar() || !this.h || (t = netflixActivity.getServiceManager().t()) == null) {
            return;
        }
        if (C7353cuc.c(this.e.getContext()) && this.b == null) {
            return;
        }
        C5207buR b = b(t);
        if (b != null) {
            d(z, b);
            if (b.b) {
                a.clear();
            }
            C7310ctm c7310ctm = this.b;
            if (c7310ctm != null) {
                if (!z2) {
                    c7310ctm.n();
                }
                this.b.a(a(), b.e);
                return;
            }
            return;
        }
        C1044Mm.a("ActivityPageOfflineAgentListener", "no message, dismiss snack-bar");
        b();
    }

    private C5207buR b(InterfaceC4208baF interfaceC4208baF) {
        return C7353cuc.a().c(this.e.getContext(), interfaceC4208baF);
    }

    private void d(boolean z, C5207buR c5207buR) {
        C7310ctm b = b(c5207buR.c, (!c5207buR.b || c5207buR.a <= 0) ? com.netflix.mediaclient.ui.R.c.d : com.netflix.mediaclient.ui.R.c.b);
        this.b = b;
        if (b != null) {
            b.a(Typeface.createFromAsset(this.e.getContext().getAssets(), "nf-icon.otf"));
            this.b.d(this.e.getLayoutDirection() == 1 ? com.netflix.mediaclient.ui.R.o.cf : com.netflix.mediaclient.ui.R.o.ck, this.c);
            if (this.b.d()) {
                return;
            }
            this.b.c(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        C7310ctm c7310ctm = this.b;
        if (c7310ctm != null) {
            c7310ctm.c();
            this.b = null;
        }
    }

    private C7310ctm b(String str, int i) {
        final NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(this.e.getContext(), NetflixActivity.class);
        if (netflixActivity != null && !C8054ddD.l(netflixActivity) && !netflixActivity.isPlayerActivity()) {
            final View findViewById = netflixActivity.findViewById(com.netflix.mediaclient.ui.R.g.aG);
            if (findViewById instanceof CoordinatorLayout) {
                int color = ContextCompat.getColor(this.e.getContext(), i);
                CharSequence a2 = a(str);
                if (this.b == null) {
                    this.b = C7310ctm.a(findViewById, a2, color, netflixActivity.hasBottomNavBar() ? netflixActivity.getResources().getDimensionPixelSize(C9834xU.a.a) : 0, -2);
                }
                C7310ctm c7310ctm = this.b;
                if (c7310ctm == null) {
                    return null;
                }
                c7310ctm.d(a2).d(color);
                this.b.a(a(), true);
                this.b.a(new C9833xT.b() { // from class: o.crG.5
                    @Override // o.C9833xT.b
                    public void c(C9833xT c9833xT, int i2) {
                        if (C8054ddD.l(netflixActivity)) {
                            return;
                        }
                        if ((i2 == 1 && C7172crG.this.a() == 100) || i2 == 0) {
                            C7172crG.this.d(netflixActivity);
                        }
                        C7172crG.this.b = null;
                    }

                    @Override // o.C9833xT.b
                    public View b() {
                        return findViewById.findViewById(com.netflix.mediaclient.ui.R.g.de);
                    }

                    @Override // o.C9833xT.b
                    public View e() {
                        return findViewById.findViewById(com.netflix.mediaclient.ui.R.g.cc);
                    }

                    @Override // o.C9833xT.b
                    public boolean c() {
                        return C8150deu.g();
                    }
                });
                return this.b;
            }
            String str2 = "SPY-10658 : No suitable parent found to attach buffetBar, current activity is " + netflixActivity;
            C1044Mm.e("ActivityPageOfflineAgentListener", str2);
            InterfaceC1598aHf.a(str2);
        } else {
            C1044Mm.a("ActivityPageOfflineAgentListener", "No buffetBar to display as activity is finishing (or in PlayerActivity). Current activity is %s", netflixActivity);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(NetflixActivity netflixActivity) {
        C7353cuc.c((Context) netflixActivity, true);
        C7353cuc.b(netflixActivity);
    }

    private CharSequence a(String str) {
        SpannableString spannableString = new SpannableString(C8168dfL.c(str));
        if (spannableString.toString().contains("💥")) {
            if (this.d == null) {
                Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.e.getContext(), C7350cuZ.d.c).mutate());
                this.d = wrap;
                DrawableCompat.setTint(wrap, -1);
                int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.B);
                this.d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            }
            ImageSpan imageSpan = new ImageSpan(this.d, 1);
            int indexOf = spannableString.toString().indexOf("💥");
            spannableString.setSpan(imageSpan, indexOf, indexOf + 2, 17);
        }
        return spannableString;
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(String str) {
        InterfaceC4208baF offlineAgentOrNull;
        NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(this.e.getContext(), NetflixActivity.class);
        if (netflixActivity == null || !netflixActivity.canShowDownloadProgressBar() || (offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(netflixActivity)) == null) {
            return;
        }
        C5207buR b = b(offlineAgentOrNull);
        if (b == null || C7353cuc.c((Context) netflixActivity)) {
            b = new C5207buR(C1333Xq.d(com.netflix.mediaclient.ui.R.o.iS).a(1).c(), 0);
        }
        List<String> list = a;
        if (!list.contains(str)) {
            list.add(str);
        }
        C7310ctm c7310ctm = this.b;
        if (c7310ctm == null || !c7310ctm.d()) {
            d(true, b);
        }
        C7310ctm c7310ctm2 = this.b;
        if (c7310ctm2 != null) {
            c7310ctm2.d(a(b.c));
            this.b.o();
        }
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(String str, Status status) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("download_btn" + str);
        if (downloadButton != null) {
            downloadButton.e(status.j() ? DownloadButton.ButtonState.QUEUED : DownloadButton.ButtonState.ERROR, str);
            downloadButton.setEnabled(true);
        }
        C7353cuc.c(this.e.getContext(), false);
        e(true, true);
        if (status.j()) {
            if (!status.h() || downloadButton == null) {
                return;
            }
            downloadButton.e(DownloadButton.ButtonState.ERROR, str);
            return;
        }
        d();
        if (downloadButton == null || status.c() != StatusCode.DL_NOT_ENOUGH_FREE_SPACE) {
            return;
        }
        downloadButton.f();
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void c(InterfaceC5206buQ interfaceC5206buQ, int i) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("download_btn" + interfaceC5206buQ.aH_());
        if (downloadButton != null) {
            if (interfaceC5206buQ.au_() == DownloadState.Complete) {
                downloadButton.e(DownloadButton.ButtonState.SAVED, interfaceC5206buQ.aH_());
            } else {
                downloadButton.e(DownloadButton.ButtonState.DOWNLOADING, interfaceC5206buQ.aH_());
                downloadButton.setProgress(i);
            }
        }
        e(false, true);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void a(InterfaceC5206buQ interfaceC5206buQ) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("download_btn" + interfaceC5206buQ.aH_());
        if (downloadButton != null) {
            downloadButton.e(DownloadButton.ButtonState.SAVED, interfaceC5206buQ.aH_());
        }
        C7353cuc.c(this.e.getContext(), false);
        if (C7353cuc.e(interfaceC5206buQ.aH_()) == null) {
            return;
        }
        e(true, false);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(InterfaceC5206buQ interfaceC5206buQ) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        C7353cuc.c(viewGroup.getContext(), false);
        e(true, true);
        C7310ctm c7310ctm = this.b;
        if (c7310ctm != null) {
            c7310ctm.k();
        }
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, StopReason stopReason) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("download_btn" + interfaceC5206buQ.aH_());
        if (downloadButton != null) {
            if (stopReason.a()) {
                downloadButton.e(DownloadButton.ButtonState.ERROR, interfaceC5206buQ.aH_());
            } else if (stopReason != StopReason.WaitingToBeStarted) {
                downloadButton.e(C7353cuc.j(interfaceC5206buQ) ? DownloadButton.ButtonState.WAITING_FOR_WIFI : DownloadButton.ButtonState.PAUSED, interfaceC5206buQ.aH_());
            }
        }
        C7353cuc.c(this.e.getContext(), false);
        e(true, true);
        C7310ctm c7310ctm = this.b;
        if (c7310ctm != null) {
            c7310ctm.i();
            this.b.m();
        }
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(String str, Status status, boolean z) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("download_btn" + str);
        if (downloadButton != null) {
            downloadButton.e(z ? DownloadButton.ButtonState.QUEUED : DownloadButton.ButtonState.AVAILABLE, str);
        }
        DownloadButton.c(str);
        if (z) {
            return;
        }
        e(true, false);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void c(List<String> list, Status status) {
        if (this.e == null) {
            return;
        }
        for (String str : list) {
            a.remove(str);
            ViewGroup viewGroup = this.e;
            DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("download_btn" + str);
            if (downloadButton != null) {
                downloadButton.e(DownloadButton.ButtonState.AVAILABLE, str);
                DownloadButton.c(str);
            }
        }
        e(true, false);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(Status status) {
        if (this.e == null) {
            return;
        }
        a.clear();
        C7353cuc.b(this.e.getContext());
        ArrayList<View> arrayList = new ArrayList<>();
        this.e.findViewsWithText(arrayList, "download_btn", 2);
        DownloadButton.d();
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof DownloadButton) {
                DownloadButton downloadButton = (DownloadButton) next;
                downloadButton.e(DownloadButton.ButtonState.AVAILABLE, downloadButton.b());
            }
        }
        e(true, false);
    }

    /* renamed from: o.crG$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[StatusCode.values().length];
            b = iArr;
            try {
                iArr[StatusCode.DL_OFFLINE_STORAGE_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[StatusCode.DL_NOT_ENOUGH_FREE_SPACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[StatusCode.DL_URL_DOWNLOAD_DISK_IO_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[StatusCode.DL_CANT_CREATE_VIEWABLE_DIRECTORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(Status status) {
        if (this.e == null) {
            return;
        }
        int i = AnonymousClass1.b[status.c().ordinal()];
        if (i == 1 || i == 2) {
            C7178crM.e(this.e.getContext(), true).show();
        } else if (i == 3 || i == 4) {
            C7178crM.e(this.e.getContext(), "(" + status.c().getValue() + ")").show();
        } else {
            C7353cuc.c(this.e.getContext(), false);
            e(true, false);
        }
        C7310ctm c7310ctm = this.b;
        if (c7310ctm != null) {
            c7310ctm.n();
            this.b.i();
        }
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void e(InterfaceC5206buQ interfaceC5206buQ, Status status) {
        d(interfaceC5206buQ.aH_(), status);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, Status status) {
        d(interfaceC5206buQ.aH_(), status);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void e(boolean z) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(viewGroup.getContext(), NetflixActivity.class);
        if (C8054ddD.l(netflixActivity)) {
            return;
        }
        C8054ddD.c(netflixActivity, com.netflix.mediaclient.ui.R.o.iz, 1);
        if (InterfaceC3643bFl.a((Context) netflixActivity).a((Activity) netflixActivity)) {
            LocalBroadcastManager.getInstance(netflixActivity).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.DETAIL_PAGE_REFRESH"));
        }
    }

    @Override // o.InterfaceC4209baG
    public boolean c() {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return true;
        }
        return C8054ddD.l((NetflixActivity) C8054ddD.a(viewGroup.getContext(), NetflixActivity.class));
    }

    protected void d(String str, Status status) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("download_btn" + str);
        if (downloadButton != null) {
            downloadButton.e(status.j() ? DownloadButton.ButtonState.SAVED : DownloadButton.ButtonState.ERROR, str);
            downloadButton.setEnabled(true);
        }
    }

    @Override // o.InterfaceC7216cry
    public void b(Activity activity, String str) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("download_btn" + str);
        if (downloadButton != null) {
            downloadButton.b(str, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        int i = 0;
        if (NetflixActivity.getOfflineAgentOrNull((NetflixActivity) C8054ddD.a(this.e.getContext(), NetflixActivity.class)) != null) {
            long j = 0;
            long j2 = 0;
            for (InterfaceC5206buQ interfaceC5206buQ : C7353cuc.a().d()) {
                if (a.contains(interfaceC5206buQ.aH_())) {
                    i++;
                    j2 += interfaceC5206buQ.h();
                    j += interfaceC5206buQ.aP_();
                }
            }
            if (i <= 0 || j <= 0) {
                return 100;
            }
            return (int) ((j2 * 100) / j);
        }
        return 0;
    }
}
