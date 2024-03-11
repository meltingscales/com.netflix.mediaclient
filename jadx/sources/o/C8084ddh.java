package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.netflix.model.leafs.originals.interactive.Moment;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8094ddr;

@SuppressLint({"InlinedApi"})
/* renamed from: o.ddh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8084ddh implements InterfaceC5074brr {
    private static int a = 1;
    private static int c = 0;
    private static byte e$ss2$94 = 24;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final NotificationManager d;
    private final Context e;

    public C8084ddh(Context context) {
        this.e = context;
        this.d = (NotificationManager) context.getSystemService(Moment.TYPE.NOTIFICATION);
    }

    @Override // o.InterfaceC5074brr
    public void a(final InterfaceC5098bsO interfaceC5098bsO, Handler handler) {
        this.b.set(true);
        final Notification b = b(false);
        handler.post(new Runnable() { // from class: o.ddh.1
            @Override // java.lang.Runnable
            public void run() {
                interfaceC5098bsO.c(20, b, 4);
            }
        });
    }

    @Override // o.InterfaceC5074brr
    public void c(final InterfaceC5098bsO interfaceC5098bsO, Handler handler) {
        this.b.set(true);
        final Notification b = b(true);
        handler.post(new Runnable() { // from class: o.ddh.4
            @Override // java.lang.Runnable
            public void run() {
                interfaceC5098bsO.c(20, b, 4);
            }
        });
    }

    @Override // o.InterfaceC5074brr
    public void e(final InterfaceC5098bsO interfaceC5098bsO, Handler handler) {
        C1044Mm.e("nf_voip", "Cancel notification");
        this.b.set(false);
        handler.post(new Runnable() { // from class: o.ddh.5
            @Override // java.lang.Runnable
            public void run() {
                interfaceC5098bsO.d(20, true);
            }
        });
    }

    private Notification b(boolean z) {
        String string;
        int i = 2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        String string2 = this.e.getString(C8094ddr.i.r);
        if (string2.startsWith("'!#+")) {
            int i2 = a + 107;
            c = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(string2.substring(4), objArr);
            string2 = ((String) objArr[0]).intern();
        }
        String string3 = this.e.getString(C8094ddr.i.t);
        if (string3.startsWith("'!#+")) {
            int i4 = c + 33;
            a = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            f(string3.substring(4), objArr2);
            string3 = ((String) objArr2[0]).intern();
        }
        if (z) {
            string = this.e.getString(C8094ddr.i.q);
            if (string.startsWith("'!#+")) {
                Object[] objArr3 = new Object[1];
                f(string.substring(4), objArr3);
                string = ((String) objArr3[0]).intern();
            }
        } else {
            string = this.e.getString(C8094ddr.i.s);
            if (string.startsWith("'!#+")) {
                int i6 = a + 91;
                c = i6 % 128;
                if (i6 % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    f(string.substring(4), objArr4);
                    ((String) objArr4[0]).intern();
                    throw null;
                }
                Object[] objArr5 = new Object[1];
                f(string.substring(4), objArr5);
                string = ((String) objArr5[0]).intern();
            }
        }
        Notification build = new NotificationCompat.Builder(this.e, "help_notification_channel").setOngoing(true).setVisibility(1).setOnlyAlertOnce(true).setCategory("call").setSmallIcon(C8094ddr.c.g).setLargeIcon(c()).setPriority(2).setContentTitle(string2).setContentText(string).setTicker(string2).setContentIntent(e()).setDeleteIntent(b()).addAction(C8094ddr.c.a, string3, b()).setAutoCancel(false).setWhen(currentTimeMillis).setUsesChronometer(z).build();
        build.flags |= 64;
        this.d.notify(20, build);
        return build;
    }

    private Bitmap c() {
        return BitmapFactory.decodeResource(this.e.getResources(), C8094ddr.c.i);
    }

    private PendingIntent e() {
        Context context = this.e;
        return PendingIntent.getActivity(context, 0, ActivityC8087ddk.a(context), 335544320);
    }

    private PendingIntent b() {
        return PendingIntent.getBroadcast(this.e, 0, new Intent("com.netflix.mediaclient.intent.action.CALL_CANCEL").addCategory("com.netflix.mediaclient.intent.category.VOIP"), 335544320);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$94);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
