package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import javax.inject.Inject;

/* renamed from: o.crI  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7174crI implements DownloadButton.e {
    private final InterfaceC7303ctf a;
    private final String b;
    private final NetflixActivity c;
    private final boolean d;
    private final boolean e;
    private final VideoType f;
    private final boolean g;

    C7174crI(String str, VideoType videoType, NetflixActivity netflixActivity, boolean z, boolean z2, boolean z3, InterfaceC7303ctf interfaceC7303ctf) {
        this.c = netflixActivity;
        this.b = str;
        this.f = videoType;
        this.g = z;
        this.e = z2;
        this.d = z3;
        this.a = interfaceC7303ctf;
    }

    @Override // com.netflix.mediaclient.ui.offline.DownloadButton.e
    public void e(DownloadButton downloadButton, PlayContext playContext) {
        d(downloadButton, playContext);
    }

    @Override // com.netflix.mediaclient.ui.offline.DownloadButton.e
    public void d(DownloadButton downloadButton, PlayContext playContext) {
        if (downloadButton.a == DownloadButton.ButtonState.NOT_AVAILABLE) {
            return;
        }
        if (C4337bcc.a(this.c)) {
            C7353cuc.e(this.c);
            return;
        }
        Context context = downloadButton.getContext();
        InterfaceC4208baF t = this.c.getServiceManager().t();
        if (t == null) {
            return;
        }
        InterfaceC7281ctJ a = C7353cuc.a();
        boolean z = a.e() == 0;
        InterfaceC5206buQ c = a.c(this.b);
        if (c == null) {
            c(downloadButton, downloadButton.b(), playContext);
            return;
        }
        switch (AnonymousClass5.a[downloadButton.c().ordinal()]) {
            case 1:
                if (C4295bbn.c(c.l())) {
                    playContext = C7353cuc.c(c, downloadButton.e());
                } else if (playContext == null) {
                    NetflixActivity netflixActivity = this.c;
                    if (netflixActivity instanceof bDG) {
                        playContext = ((bDG) netflixActivity).y_();
                    } else {
                        playContext = new EmptyPlayContext("download_button", -460);
                    }
                }
                C7178crM.b(context, downloadButton, this.b, this.f, this.g, playContext).show();
                return;
            case 2:
                return;
            case 3:
                this.c.showMenu(C7178crM.d(context, downloadButton, this.b, this.g));
                return;
            case 4:
            case 5:
                this.c.showMenu(C7178crM.d(context, downloadButton, this.b, this.g, z));
                return;
            case 6:
                this.c.showMenu(C7178crM.d(context, downloadButton, this.b, this.g, z));
                return;
            case 7:
                this.c.showMenu(C7178crM.b(context, downloadButton, this.b, this.g));
                return;
            case 8:
                if (this.d) {
                    this.a.a(this.c, SignupConstants.Field.VIDEO_TITLE, "Expired or Not Available", 2, VideoType.EPISODE);
                    return;
                } else {
                    C7317ctt.c(this.c, this.f, c, t);
                    return;
                }
            default:
                c(downloadButton, downloadButton.b(), playContext);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.crI$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DownloadButton.ButtonState.values().length];
            a = iArr;
            try {
                iArr[DownloadButton.ButtonState.SAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DownloadButton.ButtonState.NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DownloadButton.ButtonState.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[DownloadButton.ButtonState.PRE_QUEUED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[DownloadButton.ButtonState.QUEUED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[DownloadButton.ButtonState.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[DownloadButton.ButtonState.WAITING_FOR_WIFI.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[DownloadButton.ButtonState.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    protected void c(DownloadButton downloadButton, String str, PlayContext playContext) {
        Context context = downloadButton.getContext();
        Long g = downloadButton.g();
        boolean o2 = this.c.getServiceManager().t().o();
        boolean m = ConnectivityUtils.m(context);
        if (o2 && !m && ConnectivityUtils.o(context)) {
            C7178crM.a(context, str, 0).show();
            b(downloadButton, true, playContext);
        } else if (ConnectivityUtils.o(context)) {
            b(downloadButton, false, playContext);
        } else {
            C7178crM.e(context, downloadButton.b(), false).show();
        }
        downloadButton.c(g);
    }

    private void b(View view, boolean z, PlayContext playContext) {
        if (DownloadButton.c.contains(this.b)) {
            return;
        }
        ((DownloadButton) view).e(DownloadButton.ButtonState.PRE_QUEUED, this.b);
        DownloadButton.c.add(this.b);
        if (playContext == null) {
            NetflixActivity netflixActivity = this.c;
            if (netflixActivity instanceof bDG) {
                playContext = ((bDG) netflixActivity).y_();
            } else {
                InterfaceC1598aHf.a("netflixActivity is NOT an instanceof PlayContextProvider");
                playContext = new EmptyPlayContext("download_button", -461);
            }
        }
        this.c.getServiceManager().t().b(C7353cuc.b(this.b, this.f, playContext, z));
    }

    /* renamed from: o.crI$b */
    /* loaded from: classes6.dex */
    public static class b implements DownloadButton.a {
        private final boolean a;
        private final InterfaceC7303ctf e;

        @Inject
        public b(boolean z, InterfaceC7303ctf interfaceC7303ctf) {
            this.a = z;
            this.e = interfaceC7303ctf;
        }

        @Override // com.netflix.mediaclient.ui.offline.DownloadButton.a
        public DownloadButton.e a(String str, VideoType videoType, Activity activity, boolean z, boolean z2) {
            return new C7174crI(str, videoType, (NetflixActivity) activity, z, z2, this.a, this.e);
        }
    }
}
