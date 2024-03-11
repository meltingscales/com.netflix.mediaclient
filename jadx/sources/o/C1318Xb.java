package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.app.NotificationCompat;
import androidx.media.app.NotificationCompat;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification.NotificationIntentRetriever;
import com.netflix.model.leafs.originals.interactive.Moment;
import javax.inject.Singleton;
import kotlin.Pair;
import o.C1308Wr;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

@Singleton
/* renamed from: o.Xb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1318Xb implements WY {
    public static final d c = new d(null);
    private NotificationCompat.Builder a;
    private final Context b;
    private boolean d;
    private Bitmap e;
    private String f;
    private final NotificationIntentRetriever g;
    private Notification h;
    private boolean i;
    private final TV j;
    private String l;
    private final NotificationManager m;
    private int n;

    public C1318Xb(boolean z, NotificationIntentRetriever notificationIntentRetriever, TV tv) {
        C8632dsu.c((Object) notificationIntentRetriever, "");
        this.g = notificationIntentRetriever;
        this.j = tv;
        this.l = "";
        this.f = "";
        this.d = z;
        Context d2 = AbstractApplicationC1040Mh.d();
        this.b = d2;
        Object systemService = d2.getSystemService(Moment.TYPE.NOTIFICATION);
        C8632dsu.d(systemService);
        this.m = (NotificationManager) systemService;
        this.a = b(false, false, null);
    }

    /* renamed from: o.Xb$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MediaNotificationManagerImpl");
        }
    }

    private final Bitmap e() {
        Context context = this.b;
        return BitmapFactory.decodeResource(context != null ? context.getResources() : null, HawkinsIcon.C0303gn.e.e());
    }

    private final PendingIntent a() {
        if (this.b == null) {
            return null;
        }
        Intent addFlags = aMH.c().c(this.b).addFlags(268435456);
        C8632dsu.a(addFlags, "");
        return PendingIntent.getActivity(this.b, 0, addFlags, 201326592);
    }

    @Override // o.WY
    @SuppressLint({"InlinedApi"})
    public void a(Notification notification, InterfaceC5098bsO interfaceC5098bsO) {
        c.getLogTag();
        if (notification == null) {
            return;
        }
        if (202 != this.n) {
            if (interfaceC5098bsO != null) {
                interfaceC5098bsO.c(202, notification, 16);
            }
            this.n = 202;
        }
        this.i = true;
    }

    @Override // o.WY
    public void b(InterfaceC5098bsO interfaceC5098bsO) {
        c.getLogTag();
        b();
        if (interfaceC5098bsO != null) {
            interfaceC5098bsO.d(202, true);
        }
        this.n = 0;
        this.i = false;
    }

    @Override // o.WY
    public Pair<Integer, Notification> c() {
        c.getLogTag();
        NotificationCompat.Builder b = b(false, false, null);
        this.a = b;
        this.h = b != null ? b.build() : null;
        return new Pair<>(202, this.h);
    }

    @Override // o.WY
    public void e(boolean z, String str, String str2) {
        c.getLogTag();
        this.d = z;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        c(str, str2);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            r3 = this;
            o.Xb$d r0 = o.C1318Xb.c
            r0.getLogTag()
            androidx.core.app.NotificationCompat$Builder r1 = r3.a
            if (r1 != 0) goto La
            return
        La:
            android.graphics.Bitmap r1 = r3.e
            if (r1 != 0) goto L17
            r0.getLogTag()
            android.graphics.Bitmap r1 = r3.e()
            r3.e = r1
        L17:
            android.graphics.Bitmap r1 = r3.e
            if (r1 != 0) goto L1c
            goto L26
        L1c:
            androidx.core.app.NotificationCompat$Builder r2 = r3.a
            if (r2 == 0) goto L23
            r2.setLargeIcon(r1)
        L23:
            r0.getLogTag()
        L26:
            java.lang.String r1 = r3.f
            boolean r1 = o.C8684dus.a(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L3c
            androidx.core.app.NotificationCompat$Builder r1 = r3.a
            if (r1 == 0) goto L39
            java.lang.String r2 = r3.f
            r1.setContentTitle(r2)
        L39:
            r0.getLogTag()
        L3c:
            boolean r1 = r3.d
            if (r1 == 0) goto L57
            java.lang.String r1 = r3.l
            boolean r1 = o.C8684dus.a(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L57
            androidx.core.app.NotificationCompat$Builder r1 = r3.a
            if (r1 == 0) goto L53
            java.lang.String r2 = r3.l
            r1.setContentText(r2)
        L53:
            r0.getLogTag()
            goto L67
        L57:
            boolean r1 = r3.d
            if (r1 != 0) goto L67
            androidx.core.app.NotificationCompat$Builder r1 = r3.a
            if (r1 == 0) goto L64
            java.lang.String r2 = "    "
            r1.setContentText(r2)
        L64:
            r0.getLogTag()
        L67:
            androidx.core.app.NotificationCompat$Builder r0 = r3.a
            if (r0 == 0) goto L70
            int r1 = o.C1308Wr.a.c
            r0.setSmallIcon(r1)
        L70:
            androidx.core.app.NotificationCompat$Builder r0 = r3.a
            if (r0 == 0) goto L7b
            android.app.PendingIntent r1 = r3.a()
            r0.setContentIntent(r1)
        L7b:
            androidx.core.app.NotificationCompat$Builder r0 = r3.a
            if (r0 == 0) goto L84
            android.app.Notification r0 = r0.build()
            goto L85
        L84:
            r0 = 0
        L85:
            r3.h = r0
            android.app.NotificationManager r1 = r3.m
            if (r1 == 0) goto L90
            r2 = 202(0xca, float:2.83E-43)
            r1.notify(r2, r0)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1318Xb.d():void");
    }

    private final void c(String str, String str2) {
        c.getLogTag();
        if (this.a == null) {
            return;
        }
        this.f = str;
        this.l = str2;
    }

    public void c(Bitmap bitmap) {
        c.getLogTag();
        if (bitmap == null) {
            return;
        }
        this.e = bitmap;
    }

    @Override // o.WY
    public void e(Bitmap bitmap) {
        c.getLogTag();
        if (bitmap == null) {
            return;
        }
        c(bitmap);
        d();
    }

    @Override // o.WY
    public void a(boolean z, boolean z2, boolean z3, String str) {
        c.getLogTag();
        if (str == null) {
            str = "";
        }
        e(z, z2, z3, str);
    }

    private final void e(boolean z, boolean z2, boolean z3, String str) {
        c.getLogTag();
        if (this.a == null || this.m == null || !this.i) {
            return;
        }
        NotificationCompat.Builder b = b(z, z3, str);
        this.a = b;
        if (b != null) {
            b.setContentIntent(a());
        }
        d();
    }

    public void b() {
        c.getLogTag();
        NotificationManager notificationManager = this.m;
        if (notificationManager == null) {
            return;
        }
        notificationManager.cancel(202);
    }

    private final NotificationCompat.Builder b(boolean z, boolean z2, String str) {
        c.getLogTag();
        NotificationCompat.Builder style = new NotificationCompat.Builder(AbstractApplicationC1040Mh.d(), "cdx_notification_channel").setOngoing(true).setVisibility(1).setShowWhen(false).setOnlyAlertOnce(true).setSmallIcon(C1308Wr.a.c).setStyle(c(z2));
        C8632dsu.a(style, "");
        style.addAction(HawkinsIcon.R.b.d(), AbstractApplicationC1040Mh.d().getString(C1308Wr.d.i), this.g.c());
        if (z) {
            style.addAction(HawkinsIcon.gG.e.d(), AbstractApplicationC1040Mh.d().getString(C1308Wr.d.j), this.g.e());
        } else {
            style.addAction(HawkinsIcon.C0312gw.c.d(), AbstractApplicationC1040Mh.d().getString(C1308Wr.d.b), this.g.b());
        }
        style.addAction(HawkinsIcon.dK.e.d(), AbstractApplicationC1040Mh.d().getString(C1308Wr.d.d), this.g.a());
        if (z2) {
            style.addAction(HawkinsIcon.hW.c.d(), str, this.g.b(NotificationIntentRetriever.SegmentType.a.d(str)));
        }
        return style;
    }

    private final NotificationCompat.MediaStyle c(boolean z) {
        Throwable th;
        c.getLogTag();
        NotificationCompat.MediaStyle mediaStyle = new NotificationCompat.MediaStyle();
        if (z) {
            mediaStyle.setShowActionsInCompactView(0, 1, 3);
        } else {
            mediaStyle.setShowActionsInCompactView(0, 1, 2);
        }
        TV tv = this.j;
        if (tv != null && tv.a() != null) {
            mediaStyle.setMediaSession(this.j.a());
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd b = new C1596aHd("SPY-7597 - Got null mMediaSessionTokenProvider for CdxNotificationManagerLollipop", null, null, false, null, false, false, 126, null).b(false);
            ErrorType errorType = b.a;
            if (errorType != null) {
                b.e.put("errorType", errorType.c());
                String b2 = b.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    b.a(c2 + " " + b2);
                }
            }
            if (b.b() != null && b.i != null) {
                th = new Throwable(b.b(), b.i);
            } else if (b.b() != null) {
                th = new Throwable(b.b());
            } else {
                th = b.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(b, th);
            } else {
                dVar.e().b(b, th);
            }
        }
        return mediaStyle;
    }
}
