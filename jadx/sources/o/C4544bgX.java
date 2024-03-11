package o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.media.app.NotificationCompat;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.InterfaceC4342bch;

/* renamed from: o.bgX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4544bgX {
    private final MediaSessionCompat a;
    private final InterfaceC5098bsO b;
    private final int[] c = {0};
    private final NotificationManagerCompat d;
    private final Context e;
    private final InterfaceC4340bcf g;
    private InterfaceC4342bch.c h;
    private boolean j;

    private static int d() {
        return 201326592;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(InterfaceC4342bch.c cVar) {
        this.h = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4544bgX(Context context, MediaSessionCompat mediaSessionCompat, InterfaceC5098bsO interfaceC5098bsO) {
        this.e = context;
        this.a = mediaSessionCompat;
        this.d = NotificationManagerCompat.from(context);
        this.g = new C4542bgV(context);
        this.b = interfaceC5098bsO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i) {
        C1044Mm.d("PlayerNotification", "show %d", Long.valueOf(this.h.e()));
        NotificationCompat.Builder a = a();
        a.addAction(new NotificationCompat.Action(this.g.j(), this.g.f(), a(this.e)));
        if (!this.j) {
            this.b.c(this.g.d(), a.build(), 2);
            this.j = true;
            return;
        }
        this.d.notify(this.g.d(), a.build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        C1044Mm.b("PlayerNotification", InteractiveAnimation.States.hide);
        this.d.cancel(this.g.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        C1044Mm.b("PlayerNotification", "stop");
        this.b.d(this.g.d(), true);
        this.j = false;
    }

    private NotificationCompat.Builder a() {
        Bitmap b;
        InterfaceC4342bch.c cVar = this.h;
        String a = cVar != null ? cVar.a() : "contentTitle";
        InterfaceC4342bch.c cVar2 = this.h;
        NotificationCompat.Builder style = new NotificationCompat.Builder(this.e, this.g.c()).setVisibility(1).setColor(this.g.a()).setShowWhen(false).setTicker(a).setContentTitle(a).setContentText(cVar2 != null ? cVar2.c() : "contentText").setSmallIcon(this.g.e()).setContentIntent(b()).setStyle(new NotificationCompat.MediaStyle().setMediaSession(this.a.getSessionToken()).setShowActionsInCompactView(this.c));
        InterfaceC4342bch.c cVar3 = this.h;
        if (cVar3 != null) {
            b = cVar3.b();
        } else {
            b = this.g.b();
        }
        style.setLargeIcon(b);
        return style;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingIntent a(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent("com.netflix.mediaclient.intent.action.PlaybackMediaSessionStop"), d());
    }

    private PendingIntent b() {
        Intent putExtra = Intent.makeMainActivity(new ComponentName("com.netflix.mediaclient", "com.netflix.mediaclient.ui.player.PlayerActivity")).addFlags(536870912).putExtra(NetflixActivity.EXTRA_VIDEO_ID, String.valueOf(this.h.e()));
        if (!C8054ddD.j()) {
            putExtra.putExtra("extra_close_notification_shade", true);
        }
        return PendingIntent.getActivity((Context) C1332Xp.b(Context.class), 0, putExtra, 335544320);
    }
}
