package o;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import androidx.media.app.NotificationCompat;
import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.originals.interactive.Moment;
import java.nio.charset.StandardCharsets;

/* renamed from: o.cgc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6613cgc implements aWY {
    private static byte e$ss2$2114 = 24;
    private static int k = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f13723o = 1;
    private boolean a;
    private NotificationCompat.Builder b;
    private boolean c;
    private final Context d;
    private Bitmap e;
    private final MdxNotificationIntentRetriever f;
    private Notification g;
    private final TV h;
    private boolean i;
    private String j;
    private String l;
    private int m;
    private final NotificationManager n;

    @Override // o.aWY
    public void a(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.e = bitmap;
    }

    @Override // o.aWY
    public boolean e() {
        return this.i;
    }

    public C6613cgc(Context context, boolean z, MdxNotificationIntentRetriever mdxNotificationIntentRetriever, TV tv) {
        C1044Mm.e("nf_mdxnotification", "is episode " + z);
        this.c = z;
        this.d = context;
        this.f = mdxNotificationIntentRetriever;
        this.h = tv;
        this.n = (NotificationManager) context.getSystemService(Moment.TYPE.NOTIFICATION);
        this.b = a(false, false, false, null);
    }

    @Override // o.aWY
    public void a(Notification notification, InterfaceC5098bsO interfaceC5098bsO, boolean z) {
        if (notification == null) {
            return;
        }
        if (1 != this.m) {
            interfaceC5098bsO.c(1, notification, 16);
            this.m = 1;
        }
        this.i = z;
        this.a = true;
    }

    @Override // o.aWY
    public void c(InterfaceC5098bsO interfaceC5098bsO) {
        c();
        interfaceC5098bsO.d(1, true);
        this.m = 0;
        this.a = false;
    }

    @Override // o.aWY
    public void a(InterfaceC5098bsO interfaceC5098bsO) {
        if (this.i) {
            interfaceC5098bsO.d(1, true);
            this.m = 0;
            this.a = false;
        }
    }

    @Override // o.aWY
    public Pair<Integer, Notification> e(boolean z) {
        this.i = z;
        NotificationCompat.Builder a = a(z, false, false, null);
        this.b = a;
        this.g = a.build();
        return Pair.create(1, this.g);
    }

    @Override // o.aWY
    public void d(boolean z, String str, String str2) {
        this.c = z;
        d(str, str2);
        d();
    }

    private Bitmap a() {
        return BitmapFactory.decodeResource(this.d.getResources(), com.netflix.mediaclient.ui.R.e.av);
    }

    private void d() {
        if (this.b == null) {
            return;
        }
        if (this.e == null) {
            this.e = a();
        }
        Bitmap bitmap = this.e;
        if (bitmap == null) {
            C1044Mm.d("nf_mdxnotification", "We failed to decode resource!");
        } else {
            this.b.setLargeIcon(ViewUtils.d(bitmap));
        }
        String str = this.j;
        if (str != null) {
            this.b.setContentText(str);
        }
        String str2 = this.l;
        if (str2 != null) {
            this.b.setSubText(str2);
        }
        if (this.i) {
            this.b.setContentTitle(C8168dfL.d(com.netflix.mediaclient.ui.R.o.er));
        } else {
            this.b.setContentTitle(C8168dfL.d(com.netflix.mediaclient.ui.R.o.hM));
        }
        this.b.setSmallIcon(com.netflix.mediaclient.ui.R.e.Z);
        Notification build = this.b.build();
        this.g = build;
        this.n.notify(1, build);
    }

    private void d(String str, String str2) {
        NotificationCompat.Builder builder = this.b;
        if (builder == null) {
            return;
        }
        this.j = str;
        this.l = str2;
        if (this.c) {
            builder.setTicker(str2);
        } else {
            builder.setTicker(str);
        }
    }

    @Override // o.aWY
    public void e(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        a(bitmap);
        d();
    }

    @Override // o.aWY
    public void c(boolean z, boolean z2, boolean z3, String str) {
        b(z, z2, z3, str, false);
    }

    @Override // o.aWY
    public void d(boolean z, boolean z2, boolean z3) {
        if (z3) {
            e(z, z2, z3);
        }
    }

    private PendingIntent b() {
        Context context = this.d;
        if (context == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, aMH.c().b(this.d), 201326592);
    }

    private void e(boolean z, boolean z2, boolean z3) {
        b(z, z2, false, "", z3);
    }

    private void b(boolean z, boolean z2, boolean z3, String str, boolean z4) {
        if (this.b == null || this.n == null || !this.a) {
            return;
        }
        this.i = z4;
        NotificationCompat.Builder a = a(z4, z, z3, str);
        this.b = a;
        a.setContentIntent(b());
        d();
    }

    @Override // o.aWY
    public void c() {
        NotificationManager notificationManager = this.n;
        if (notificationManager == null) {
            return;
        }
        notificationManager.cancel(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x017c, code lost:
        if (r13.startsWith("'!#+") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0192, code lost:
        if ((!r13.startsWith("'!#+")) != true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0194, code lost:
        r0 = new java.lang.Object[1];
        p(r13.substring(4), r0);
        r13 = ((java.lang.String) r0[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a5, code lost:
        r10.addAction(r12, r13, r9.f.b(r11));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private androidx.core.app.NotificationCompat.Builder a(boolean r10, boolean r11, boolean r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6613cgc.a(boolean, boolean, boolean, java.lang.String):androidx.core.app.NotificationCompat$Builder");
    }

    private NotificationCompat.MediaStyle d(boolean z) {
        NotificationCompat.MediaStyle showActionsInCompactView = new NotificationCompat.MediaStyle().setShowActionsInCompactView(0, 1);
        if (z) {
            showActionsInCompactView.setShowActionsInCompactView(0, 1, 3);
        }
        TV tv = this.h;
        if (tv != null && tv.a() != null) {
            showActionsInCompactView.setMediaSession(this.h.a());
        } else {
            InterfaceC1598aHf.a(new C1596aHd("SPY-7597 - Got null mMediaSessionTokenProvider for MdxNotificationManagerLollipop").b(false));
        }
        return showActionsInCompactView;
    }

    private void p(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2114);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
