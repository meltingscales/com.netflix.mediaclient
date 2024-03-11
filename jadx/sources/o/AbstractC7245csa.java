package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Base64;
import android.util.LruCache;
import androidx.core.content.ContextCompat;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.cl.model.event.session.command.PauseDownloadCommand;
import com.netflix.cl.model.event.session.command.RemoveCachedVideoCommand;
import com.netflix.cl.model.event.session.command.ResumeDownloadCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.offline.agent.IntentCommandGroupType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import com.netflix.mediaclient.util.l10n.BidiMarker;
import com.netflix.model.leafs.originals.interactive.Moment;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o.AbstractC7245csa;
import o.C7350cuZ;
import o.C9834xU;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.csa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7245csa extends AbstractC5166btd implements InterfaceC4247bas {
    private static byte e$ss2$6714 = 24;
    private static int l = 0;
    private static int m = 1;
    private boolean b;
    final Context c;
    private final LruCache<String, e> f;
    private final InterfaceC5098bsO j;
    private final NotificationManager k;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC4208baF f13766o;
    private final int a = 101;
    private final int d = 102;
    private final int e = 103;
    private int h = 192;
    private int i = 192;
    private int n = 0;
    private final Object g = new Object();

    protected abstract void a(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ);

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(InterfaceC5206buQ interfaceC5206buQ) {
    }

    protected abstract String c(InterfaceC5206buQ interfaceC5206buQ, e eVar);

    protected abstract void c(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ, VideoType videoType);

    @Override // o.InterfaceC4209baG
    public boolean c() {
        return false;
    }

    protected abstract int d();

    protected abstract void d(Notification.Builder builder);

    protected abstract void d(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ);

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, Status status) {
    }

    protected abstract String e(InterfaceC5206buQ interfaceC5206buQ, e eVar);

    protected abstract void e(Notification.Builder builder);

    protected abstract void e(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ);

    protected abstract void e(Notification.Builder builder, InterfaceC5206buQ interfaceC5206buQ, VideoType videoType, int i);

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void e(InterfaceC5206buQ interfaceC5206buQ, Status status) {
    }

    protected abstract int f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.csa$e */
    /* loaded from: classes4.dex */
    public class e {
        CharSequence d = "";
        CharSequence a = "";
        Bitmap b = null;
        VideoType c = null;
        boolean e = false;

        e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC7245csa c(Handler handler, Context context, InterfaceC5098bsO interfaceC5098bsO, boolean z, InterfaceC4208baF interfaceC4208baF) {
        return new C7250csf(handler, context, interfaceC5098bsO, z, interfaceC4208baF);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7245csa(Handler handler, Context context, InterfaceC5098bsO interfaceC5098bsO, boolean z, InterfaceC4208baF interfaceC4208baF) {
        this.c = context;
        this.f13766o = interfaceC4208baF;
        this.f = new LruCache<>(z ? 2 : 4);
        this.j = interfaceC5098bsO;
        this.k = (NotificationManager) context.getSystemService(Moment.TYPE.NOTIFICATION);
        handler.post(new Runnable() { // from class: o.csb
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC7245csa.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        try {
            this.h = this.c.getResources().getDimensionPixelSize(17104901);
            this.i = this.c.getResources().getDimensionPixelSize(17104902);
        } catch (Exception e2) {
            InterfaceC1598aHf.a(new C1596aHd().d(e2));
        }
        this.f13766o.e((InterfaceC4208baF) this);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(String str, Status status) {
        InterfaceC5206buQ c;
        if (!status.j() || (c = C7353cuc.a().c(str)) == null) {
            return;
        }
        c(c);
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(String str, Status status, boolean z) {
        if (g(str)) {
            return;
        }
        this.n = 0;
        k();
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void c(List<String> list, Status status) {
        this.n = 0;
        k();
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(Status status) {
        C1044Mm.a("nf_downloadNotification", "onAllPlayablesDeleted status=" + status);
        k();
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(Status status) {
        k();
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void e(boolean z) {
        k();
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void c(InterfaceC5206buQ interfaceC5206buQ, int i) {
        VideoType videoType;
        C1044Mm.a("nf_downloadNotification", "onOfflinePlayableProgress");
        e c = c(interfaceC5206buQ);
        Notification.Builder builder = new Notification.Builder(this.c);
        builder.setProgress(100, i, false);
        if (C7353cuc.c(interfaceC5206buQ) && (videoType = c.c) != null) {
            c(builder, interfaceC5206buQ, videoType);
        }
        a(builder, interfaceC5206buQ);
        d(builder, interfaceC5206buQ);
        builder.setContentText(d(interfaceC5206buQ)).setShowWhen(false).setOngoing(true).setAutoCancel(false);
        e(builder);
        String c2 = c(interfaceC5206buQ, c);
        CharSequence d = c.e ? C8168dfL.d(com.netflix.mediaclient.ui.R.o.eU) : c.d;
        Notification.BigTextStyle bigContentTitle = new Notification.BigTextStyle().setBigContentTitle(d);
        bigContentTitle.bigText(c2);
        builder.setContentTitle(d).setStyle(bigContentTitle);
        builder.setContentIntent(j(interfaceC5206buQ.aH_()));
        Notification c3 = c(builder, c.b);
        if (c3 != null) {
            j();
            if (!C8054ddD.j()) {
                this.j.c(101, c3, 0);
            }
            try {
                C1044Mm.b("nf_downloadNotification", "updating notification progress");
                b(101, c3);
            } catch (Exception e2) {
                InterfaceC1598aHf.a(new C1596aHd().d(e2));
            }
        }
    }

    private String d(InterfaceC5206buQ interfaceC5206buQ) {
        return C8176dfT.b(interfaceC5206buQ.aD_());
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void a(InterfaceC5206buQ interfaceC5206buQ) {
        e c = c(interfaceC5206buQ);
        C1044Mm.a("download completed. ");
        if (c.c != null) {
            if (interfaceC5206buQ.s() == CreateRequest.DownloadRequestType.DownloadForYou) {
                k();
                return;
            } else {
                f(interfaceC5206buQ);
                return;
            }
        }
        C1044Mm.d("nf_downloadNotification", "mVideoType is not available.");
        k();
    }

    private void f(InterfaceC5206buQ interfaceC5206buQ) {
        CharSequence c;
        Notification c2;
        CharSequence charSequence;
        e c3 = c(interfaceC5206buQ);
        this.n++;
        Notification.Builder builder = new Notification.Builder(this.c);
        builder.setDeleteIntent(n());
        builder.setShowWhen(true).setOngoing(false).setSmallIcon(d()).setAutoCancel(true);
        CharSequence d = c3.e ? C8168dfL.d(com.netflix.mediaclient.ui.R.o.eV) : C8168dfL.d(com.netflix.mediaclient.ui.R.o.eJ);
        builder.setContentTitle(d).setTicker(d);
        int i = this.n;
        if (i <= 1) {
            if (c3.e) {
                charSequence = a(interfaceC5206buQ, i);
            } else if (C8168dfL.b(c3.a)) {
                charSequence = ((Object) c3.d) + "\n" + ((Object) c3.a);
            } else {
                charSequence = c3.d;
            }
            builder.setContentText(charSequence);
            Notification.BigTextStyle bigContentTitle = new Notification.BigTextStyle().setBigContentTitle(d);
            bigContentTitle.bigText(charSequence);
            builder.setStyle(bigContentTitle);
            e(builder, interfaceC5206buQ, c3.c, 103);
            builder.setContentIntent(j(interfaceC5206buQ.aH_()));
            c2 = c(builder, c3.b);
        } else {
            if (c3.e) {
                c = a(interfaceC5206buQ, i);
            } else {
                c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.eR).a(i - 1).d("showOrMovieName", c3.d).c();
            }
            builder.setContentText(c);
            builder.setStyle(new Notification.BigTextStyle().bigText(c));
            builder.setContentIntent(j(null));
            c2 = c(builder, c3.b);
        }
        if (c2 != null) {
            j();
            if (!C8054ddD.j()) {
                this.j.d(103, false);
            }
            b(103, c2);
            if (C8054ddD.j()) {
                l();
            } else {
                i();
            }
        }
    }

    @Override // o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, StopReason stopReason) {
        String d;
        boolean j;
        BidiMarker bidiMarker;
        if (stopReason == StopReason.StoppedFromAgentAPI) {
            e(interfaceC5206buQ);
            return;
        }
        if (stopReason == StopReason.NoNetworkConnectivity || stopReason == StopReason.NotAllowedOnCurrentNetwork) {
            if (this.f13766o.o()) {
                d = C8168dfL.d(com.netflix.mediaclient.ui.R.o.eS);
            } else {
                d = C8168dfL.d(com.netflix.mediaclient.ui.R.o.eP);
            }
            j = C8054ddD.j();
        } else {
            j = false;
            if (stopReason == StopReason.NotEnoughSpace) {
                d = C8168dfL.d(com.netflix.mediaclient.ui.R.o.eO);
            } else if (stopReason == StopReason.EncodesAreNotAvailableAnyMore || stopReason == StopReason.GeoCheckError) {
                String e2 = C8181dfY.e(C8181dfY.b(stopReason));
                String d2 = C8168dfL.d(com.netflix.mediaclient.ui.R.o.eL);
                d = C8310dhv.c(d2, bidiMarker) + C8310dhv.c(e2, BidiMarker.FORCED_RTL);
            } else {
                k();
                return;
            }
        }
        b(interfaceC5206buQ, d, j);
    }

    private CharSequence a(InterfaceC5206buQ interfaceC5206buQ, int i) {
        InterfaceC5160btX aE_;
        String aC_;
        C7460cwd e2 = C7353cuc.e(interfaceC5206buQ.aH_());
        if (e2 == null || (aE_ = e2.aE_()) == null) {
            return "";
        }
        String aK_ = aE_.aK_();
        if (e2.aU_() || C8168dfL.g(aK_)) {
            aC_ = aE_.aC_();
        } else {
            aC_ = C8168dfL.a(com.netflix.mediaclient.ui.R.o.gm, aE_.aC_(), aK_, Integer.valueOf(aE_.aw_()));
        }
        if (i <= 1) {
            return C8168dfL.a(com.netflix.mediaclient.ui.R.o.eT, aC_);
        }
        return C1333Xq.d(com.netflix.mediaclient.ui.R.o.eX).a(this.n - 1).d("showOrMovieName", aC_).c();
    }

    private void b(InterfaceC5206buQ interfaceC5206buQ, String str, boolean z) {
        e c = c(interfaceC5206buQ);
        Notification.Builder builder = new Notification.Builder(this.c);
        builder.setContentText(str).setShowWhen(true).setOngoing(z).setSmallIcon(f()).setAutoCancel(true);
        Notification.BigTextStyle bigContentTitle = new Notification.BigTextStyle().setBigContentTitle(c.d);
        bigContentTitle.bigText(str);
        builder.setContentTitle(c.d).setStyle(bigContentTitle).setContentText(str);
        builder.setContentIntent(j(interfaceC5206buQ.aH_()));
        Notification c2 = c(builder, c.b);
        if (c2 != null) {
            int i = z ? 101 : 102;
            c2.priority = 2;
            if (!C8054ddD.j()) {
                i();
            } else if (!z) {
                l();
            }
            C1044Mm.j("nf_downloadNotification", "error notification");
            b(i, c2);
        }
    }

    private void e(InterfaceC5206buQ interfaceC5206buQ) {
        VideoType videoType;
        e c = c(interfaceC5206buQ);
        Notification.Builder builder = new Notification.Builder(this.c);
        builder.setProgress(100, interfaceC5206buQ.aD_(), false);
        if (C7353cuc.c(interfaceC5206buQ) && (videoType = c.c) != null) {
            c(builder, interfaceC5206buQ, videoType);
        }
        e(builder, interfaceC5206buQ);
        d(builder, interfaceC5206buQ);
        builder.setContentText(d(interfaceC5206buQ));
        builder.setShowWhen(false).setOngoing(C8054ddD.j()).setAutoCancel(false);
        d(builder);
        String e2 = e(interfaceC5206buQ, c);
        Notification.BigTextStyle bigContentTitle = new Notification.BigTextStyle().setBigContentTitle(c.d);
        bigContentTitle.bigText(e2);
        builder.setContentTitle(c.d).setStyle(bigContentTitle);
        builder.setContentIntent(j(interfaceC5206buQ.aH_()));
        Notification c2 = c(builder, c.b);
        if (c2 != null) {
            j();
            if (!C8054ddD.j()) {
                this.j.d(101, false);
            }
            b(101, c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(InterfaceC5206buQ interfaceC5206buQ, e eVar) {
        long h = interfaceC5206buQ.h();
        long aP_ = interfaceC5206buQ.aP_();
        StringBuilder sb = new StringBuilder();
        if (eVar.e && C8168dfL.b(eVar.d)) {
            sb.append(eVar.d);
            sb.append(" ");
        }
        if (C8168dfL.b(eVar.a)) {
            sb.append(eVar.a);
            sb.append("\n");
        }
        String d = d(interfaceC5206buQ);
        String d2 = C8176dfT.d(this.c, h);
        sb.append(C1333Xq.d(com.netflix.mediaclient.ui.R.o.eN).d("percentage", d).d("currentRatio", d2).d("totalRatio", C8176dfT.d(this.c, aP_)).c());
        return sb.toString();
    }

    private Notification g() {
        int i = 2 % 2;
        C1044Mm.j("nf_downloadNotification", "building placeholder notification");
        Notification.Builder smallIcon = new Notification.Builder(this.c).setSmallIcon(17301634);
        String string = this.c.getString(C7350cuZ.a.s);
        if (!(!string.startsWith("'!#+"))) {
            int i2 = l + 81;
            m = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            p(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i4 = l + 43;
            m = i4 % 128;
            int i5 = i4 % 2;
        }
        Notification.Builder color = smallIcon.setContentTitle(string).setContentIntent(j(null)).setShowWhen(false).setOngoing(true).setAutoCancel(false).setOnlyAlertOnce(true).setVisibility(1).setColor(ContextCompat.getColor(this.c, C9834xU.c.e));
        if (C8054ddD.f()) {
            color.setChannelId("download_notification_channel");
        }
        return c(color, (Bitmap) null);
    }

    @Override // o.InterfaceC4247bas
    public boolean a() {
        synchronized (this) {
            if (C8054ddD.j()) {
                Notification g = g();
                synchronized (this.g) {
                    if (!this.b && g != null) {
                        j();
                        C1044Mm.e("nf_downloadNotification", "starting foreground service");
                        this.b = ServiceC4249bau.d(this.c, 101, g);
                    }
                }
                return this.b;
            }
            return true;
        }
    }

    @Override // o.InterfaceC4247bas
    public void b() {
        if (C8054ddD.j()) {
            C8187dfe.c(new Runnable() { // from class: o.crX
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC7245csa.this.m();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        synchronized (this.g) {
            if (this.b) {
                this.b = false;
                C1044Mm.j("nf_downloadNotification", "stopping foreground service");
                ServiceC4249bau.c(this.c, 101);
            }
            d(101);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC4247bas
    public void c(Intent intent) {
        char c;
        C1044Mm.a("nf_downloadNotification", "intent=" + intent);
        String stringExtra = intent.getStringExtra("playable_id");
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -387641117:
                    if (action.equals("com.netflix.mediaclient.intent.action.offline.delete_download")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -334911956:
                    if (action.equals("com.netflix.mediaclient.intent.action.offline.stop_download")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -78267907:
                    if (action.equals("com.netflix.mediaclient.intent.action.offline.download_complete_notification_dismissed")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1770353310:
                    if (action.equals("com.netflix.mediaclient.intent.action.offline.start_download")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                k();
                CLv2Utils.d(new RemoveCachedVideoCommand());
                this.f13766o.d(stringExtra);
            } else if (c == 1) {
                CLv2Utils.d(new PauseDownloadCommand());
                this.f13766o.e(stringExtra);
            } else if (c == 2) {
                this.n = 0;
            } else if (c == 3) {
                CLv2Utils.d(new ResumeDownloadCommand());
                this.f13766o.h(stringExtra);
            } else {
                C1044Mm.a("nf_downloadNotification", "no action done.");
            }
        }
    }

    private Notification c(Notification.Builder builder, Bitmap bitmap) {
        C1044Mm.a("nf_downloadNotification", "buildNotification");
        builder.setOnlyAlertOnce(true);
        builder.setVisibility(1);
        builder.setColor(ContextCompat.getColor(this.c, C9834xU.c.e));
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        }
        if (C8054ddD.f()) {
            builder.setChannelId("download_notification_channel");
        }
        try {
            return builder.build();
        } catch (Exception e2) {
            InterfaceC1598aHf.a(new C1596aHd().d(e2));
            return null;
        }
    }

    @SuppressLint({"CheckResult"})
    private void b(InterfaceC5206buQ interfaceC5206buQ, final e eVar) {
        InterfaceC5160btX aE_;
        String str;
        String a;
        C7460cwd e2 = C7353cuc.e(interfaceC5206buQ.aH_());
        if (e2 == null || (aE_ = e2.aE_()) == null) {
            return;
        }
        VideoType type = e2.getType();
        eVar.c = type;
        String str2 = "";
        if (type == VideoType.EPISODE) {
            String aC_ = aE_.aC_();
            if (aC_ == null) {
                InterfaceC1593aHa.b("Episode playable " + aE_.aH_() + " (" + aE_.aI_() + "), parent " + aE_.aO_());
                InterfaceC1598aHf.a(new C1596aHd("SPY-33545 Downloads: episode missing parent title").b(false));
            } else {
                str2 = aC_;
            }
            String str3 = new String(str2);
            if (e2.aU_() || C8168dfL.g(aE_.aK_())) {
                a = C8168dfL.a(com.netflix.mediaclient.ui.R.o.du, e2.getTitle());
            } else {
                a = C8168dfL.a(com.netflix.mediaclient.ui.R.o.ds, aE_.aK_(), Integer.valueOf(aE_.aw_()), e2.getTitle());
            }
            str = a;
            str2 = str3;
        } else {
            String title = e2.getTitle();
            if (title == null) {
                str = "";
            } else {
                str2 = title;
                str = "";
            }
        }
        BidiMarker bidiMarker = BidiMarker.FORCED_RTL;
        eVar.d = C8310dhv.c(str2, bidiMarker);
        eVar.a = C8310dhv.c(str, bidiMarker);
        String D = e2.D();
        if (C8168dfL.g(D)) {
            eVar.b = null;
        } else {
            InterfaceC9638uF.a.d(this.c).b(GetImageRequest.e().a(D).a()).observeOn(Schedulers.computation()).map(new Function() { // from class: o.crY
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Bitmap c;
                    c = AbstractC7245csa.this.c((GetImageRequest.a) obj);
                    return c;
                }
            }).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.crZ
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC7245csa.e.this.b = (Bitmap) obj;
                }
            }, new Consumer() { // from class: o.crW
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    AbstractC7245csa.e.this.b = null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap c(GetImageRequest.a aVar) {
        return C8054ddD.d(aVar.b(), this.h, this.i, true);
    }

    private e c(InterfaceC5206buQ interfaceC5206buQ) {
        e eVar = this.f.get(interfaceC5206buQ.aH_());
        if (eVar == null) {
            eVar = new e();
            this.f.put(interfaceC5206buQ.aH_(), eVar);
            b(interfaceC5206buQ, eVar);
        }
        eVar.e = interfaceC5206buQ.aZ_() && !interfaceC5206buQ.ba_();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent c(String str) {
        return a(new Intent("com.netflix.mediaclient.intent.action.offline.stop_download"), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent d(String str) {
        return a(new Intent("com.netflix.mediaclient.intent.action.offline.start_download"), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent b(String str, VideoType videoType) {
        return e(str, videoType, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent e(String str, VideoType videoType, int i) {
        Intent c = bDL.e(this.c).c(this.c, str, videoType, PlayContextImp.t, -1L);
        if (i > 0) {
            c.putExtra(NetflixActivity.EXTRA_DISMISS_NOTIFICATION_ID, i);
        }
        c.addFlags(268435456);
        return PendingIntent.getActivity(this.c, 0, c, 201326592);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent e(String str) {
        return a(new Intent("com.netflix.mediaclient.intent.action.offline.delete_download"), str);
    }

    private PendingIntent j(String str) {
        Intent c;
        if (str != null) {
            c = OfflineActivityV2.b(this.c, str, true);
        } else {
            c = OfflineActivityV2.c(this.c, true);
        }
        return PendingIntent.getActivity(this.c, 0, c, 201326592);
    }

    private PendingIntent n() {
        return a(new Intent("com.netflix.mediaclient.intent.action.offline.download_complete_notification_dismissed"), (String) null);
    }

    private PendingIntent a(Intent intent, String str) {
        intent.setClass(this.c, NetflixService.class).addCategory("com.netflix.mediaclient.intent.category.offline");
        if (str != null) {
            intent.putExtra("playable_id", str);
        }
        IntentCommandGroupType.c(intent, IntentCommandGroupType.DownloadNotification);
        return PendingIntent.getService(this.c, 0, intent, 201326592);
    }

    private void k() {
        C1044Mm.a("nf_downloadNotification", "removeAllNotifications");
        if (C8054ddD.j()) {
            l();
        } else {
            i();
        }
        j();
        h();
    }

    private void h() {
        C1044Mm.e("nf_downloadNotification", "cancelAndRemoveDownloadCompleteNotification");
        d(103);
        if (C8054ddD.j()) {
            return;
        }
        this.j.d(103, true);
    }

    private void l() {
        Notification g;
        C1044Mm.e("nf_downloadNotification", "cancelDownloadProgressAndShowPlaceholderNotification");
        synchronized (this.g) {
            if (this.b && (g = g()) != null) {
                C1044Mm.a("nf_downloadNotification", new Throwable(), "notifying placeholder notification");
                b(101, g);
            }
        }
    }

    private void i() {
        C1044Mm.e("nf_downloadNotification", "cancelAndRemoveDownloadProgressNotification");
        d(101);
        this.j.d(101, true);
    }

    private void j() {
        C1044Mm.e("nf_downloadNotification", "cancelAndRemoveErrorNotification");
        d(102);
    }

    @Override // o.InterfaceC4247bas
    public void e() {
        C8166dfJ.d();
        k();
    }

    private void d(int i) {
        NotificationManager notificationManager = this.k;
        if (notificationManager != null) {
            notificationManager.cancel(i);
        }
    }

    private void b(int i, Notification notification) {
        NotificationManager notificationManager = this.k;
        if (notificationManager != null) {
            notificationManager.notify(i, notification);
        }
    }

    private boolean g(String str) {
        LruCache<String, e> lruCache = this.f;
        if (lruCache == null || lruCache.size() == 0 || str == null || str.equals(this.f.snapshot().keySet().toArray()[this.f.size() - 1])) {
            return false;
        }
        return ((e) this.f.snapshot().values().toArray()[this.f.size() - 1]).e;
    }

    private void p(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$6714);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
