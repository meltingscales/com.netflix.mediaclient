package com.netflix.mediaclient.util;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.util.Base64;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.common.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import com.netflix.mediaclient.ui.R;
import com.netflix.model.leafs.originals.interactive.Moment;
import java.nio.charset.StandardCharsets;
import o.C1044Mm;
import o.C8054ddD;
import o.C8153dex;
import o.C9834xU;
import o.InterfaceC1598aHf;

/* loaded from: classes.dex */
public final class NotificationUtils {
    private static int a = 0;
    private static int b = 1;
    private static boolean e = false;
    private static byte e$ss2$132 = 24;

    /* loaded from: classes.dex */
    public enum NotificationMessageChannelIds {
        OLD_DEFAULT_MESSAGES_CHANNEL("messages_notitication_channel", 0),
        NO_SOUND("MESSAGE_SOUND_SILENCE.mp3", -1),
        BOOM_BOOM_SOUND("MESSAGE_SOUND_BOOM_BOOM.mp3", 0);
        
        private final String d;
        private final int j;

        public String e() {
            return this.d;
        }

        NotificationMessageChannelIds(String str, int i) {
            this.d = str;
            this.j = i;
        }
    }

    private NotificationUtils() {
    }

    public static boolean c(Intent intent) {
        if (intent == null) {
            return false;
        }
        if ("true".equals(intent.getStringExtra("nflx_from_push_notification"))) {
            C1044Mm.b("nf_notification", "From push notification, report.");
            return true;
        }
        C1044Mm.e("nf_notification", "Not from push notification, do not report.");
        return false;
    }

    public static void e(Intent intent) {
        if (intent != null) {
            intent.putExtra("nflx_from_push_notification", "true");
        }
    }

    public static boolean b(Context context) {
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        if (from != null) {
            return from.areNotificationsEnabled();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = r0.getNotificationChannel("messages_notitication_channel");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r3) {
        /*
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            if (r0 == 0) goto L22
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L22
            java.lang.String r1 = "messages_notitication_channel"
            android.app.NotificationChannel r0 = androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline1.m(r0, r1)
            if (r0 == 0) goto L22
            int r3 = androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline2.m(r0)
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            return r3
        L22:
            boolean r3 = b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.NotificationUtils.d(android.content.Context):boolean");
    }

    public static void a(Context context) {
        if (C8054ddD.f()) {
            e(context);
        }
    }

    @TargetApi(26)
    private static void e(Context context) {
        synchronized (NotificationUtils.class) {
            if (e) {
                return;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(Moment.TYPE.NOTIFICATION);
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            NotificationChannel m = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("playback_notification_channel", context.getString(R.o.kk), 2);
            m.setShowBadge(false);
            notificationManager.createNotificationChannel(m);
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("download_notification_channel", context.getString(R.o.bw), 2));
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("messages_notitication_channel", context.getString(R.o.hs), 3));
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("help_notification_channel", context.getString(R.o.cd), 2));
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("autologin_notification_channel", context.getString(R.o.ah), 2));
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("appwidget_notification_channel", context.getString(R.o.kr), 2));
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("mdx_notification_channel", context.getString(R.o.hp), 2));
            if (C8153dex.l()) {
                NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
                String string = context.getString(R.o.aq);
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    f(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("cdx_notification_channel", string, 2));
            }
            e = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        if ((r1 instanceof android.text.Spanned) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
        r9 = new android.text.SpannableString(r2);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r1, 0, r2.length(), java.lang.Object.class, r9, 0);
        r1 = com.netflix.mediaclient.util.NotificationUtils.a + 85;
        com.netflix.mediaclient.util.NotificationUtils.b = r1 % 128;
        r1 = r1 % 2;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
        if ((r1 instanceof android.text.Spanned) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.Notification c(android.content.Context r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.util.NotificationUtils.b
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.netflix.mediaclient.util.NotificationUtils.a = r2
            int r1 = r1 % r0
            java.lang.String r2 = "'!#+"
            if (r1 != 0) goto L8a
            int r1 = com.netflix.mediaclient.ui.R.o.eM
            java.lang.String r3 = r10.getString(r1)
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L83
            int r2 = com.netflix.mediaclient.util.NotificationUtils.a
            int r2 = r2 + 33
            int r4 = r2 % 128
            com.netflix.mediaclient.util.NotificationUtils.b = r4
            int r2 = r2 % r0
            r4 = 1
            r5 = 4
            r6 = 0
            if (r2 != 0) goto L47
            java.lang.String r2 = r3.substring(r5)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            f(r2, r3)
            r2 = r3[r6]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.CharSequence r1 = r10.getText(r1)
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 36
            int r4 = r4 / r6
            if (r3 == 0) goto L82
            goto L60
        L47:
            java.lang.String r2 = r3.substring(r5)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            f(r2, r3)
            r2 = r3[r6]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.CharSequence r1 = r10.getText(r1)
            boolean r3 = r1 instanceof android.text.Spanned
            if (r3 == 0) goto L82
        L60:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r2)
            r3 = r1
            android.text.SpannedString r3 = (android.text.SpannedString) r3
            r4 = 0
            int r5 = r2.length()
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r1 = r9
            android.text.SpannableString r1 = (android.text.SpannableString) r1
            r8 = 0
            r7 = r9
            android.text.TextUtils.copySpansFrom(r3, r4, r5, r6, r7, r8)
            int r1 = com.netflix.mediaclient.util.NotificationUtils.a
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.netflix.mediaclient.util.NotificationUtils.b = r2
            int r1 = r1 % r0
            r3 = r9
            goto L83
        L82:
            r3 = r2
        L83:
            java.lang.String r0 = "autologin_notification_channel"
            android.app.Notification r10 = c(r10, r3, r0)
            return r10
        L8a:
            int r0 = com.netflix.mediaclient.ui.R.o.eM
            java.lang.String r10 = r10.getString(r0)
            r10.startsWith(r2)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.NotificationUtils.c(android.content.Context):android.app.Notification");
    }

    private static Notification c(Context context, CharSequence charSequence, String str) {
        int i = 2 % 2;
        int i2 = R.e.Z;
        int color = context.getResources().getColor(C9834xU.c.e);
        NotificationCompat.Builder onlyAlertOnce = new NotificationCompat.Builder(context, str).setSmallIcon(i2).setAutoCancel(false).setOnlyAlertOnce(true);
        String string = context.getString(R.o.ac);
        if (!(!string.startsWith("'!#+"))) {
            int i3 = a + 121;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                f(string.substring(4), objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            f(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        Notification build = onlyAlertOnce.setContentTitle(string).setColor(color).setContentText(charSequence).build();
        int i4 = a + 83;
        b = i4 % 128;
        int i5 = i4 % 2;
        return build;
    }

    public static Notification.Builder d(Notification.Builder builder, Context context) {
        if (C8054ddD.f()) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(Moment.TYPE.NOTIFICATION);
            if (notificationManager == null) {
                InterfaceC1598aHf.a("Notification Utils.configureNotificationWithSound() - NotificationManager is null");
                return builder;
            }
            builder.setChannelId(c(notificationManager, context));
        } else {
            try {
                builder.setSound(RingtoneManager.getDefaultUri(2), 5);
            } catch (Throwable th) {
                InterfaceC1598aHf.e("Notification Utils - Failed to add default device sound to the notification", th);
            }
        }
        return builder;
    }

    public static String a(NotificationManager notificationManager, Context context) {
        if (!C8054ddD.f() || notificationManager == null || context == null) {
            return null;
        }
        return c(notificationManager, context);
    }

    @TargetApi(26)
    private static String c(NotificationManager notificationManager, Context context) {
        NotificationChannel notificationChannel;
        NotificationMessageChannelIds[] values;
        String e2 = NotificationMessageChannelIds.OLD_DEFAULT_MESSAGES_CHANNEL.e();
        notificationChannel = notificationManager.getNotificationChannel(e2);
        if (notificationChannel == null) {
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(e2, context.getString(R.o.hs), 3));
        }
        for (NotificationMessageChannelIds notificationMessageChannelIds : NotificationMessageChannelIds.values()) {
            if (!notificationMessageChannelIds.e().equals(e2)) {
                notificationManager.deleteNotificationChannel(notificationMessageChannelIds.e());
            }
        }
        return e2;
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$132);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
