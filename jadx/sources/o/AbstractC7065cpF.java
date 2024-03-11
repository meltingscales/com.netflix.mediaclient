package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.cl.Logger;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.DeepLinkInput;
import com.netflix.cl.model.event.discrete.PushNotificationAcknowledged;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.ResumeDownloadCommand;
import com.netflix.cl.model.event.session.command.ShareCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.service.pushnotification.NotificationReceiver;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.service.pushnotification.PushNotificationTrackingInfo;
import com.netflix.mediaclient.util.NotificationUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.originals.interactive.Moment;
import io.reactivex.functions.Consumer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import o.C9834xU;

/* renamed from: o.cpF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7065cpF {
    private static int b = 0;
    private static int c = 1;
    private static byte e$ss2$231 = 24;

    AbstractC7065cpF() {
    }

    private static PendingIntent a(Context context, Payload payload, int i) {
        String scheme;
        Uri defaultActionPayload = payload.getDefaultActionPayload();
        if (defaultActionPayload != null && (scheme = defaultActionPayload.getScheme()) != null) {
            Locale locale = Locale.US;
            if ("https".equals(scheme.toLowerCase(locale)) || "http".equals(scheme.toLowerCase(locale))) {
                C1044Mm.e("nf_push", "Target destination is web site https or http");
                return c(context, defaultActionPayload, payload, i);
            }
        }
        C1044Mm.e("nf_push", "Target destination is our application");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(defaultActionPayload);
        if (!C8168dfL.g(payload.defaultActionKey)) {
            intent.putExtra("notificationAction", payload.defaultActionKey);
        }
        NotificationUtils.e(intent);
        intent.setFlags(872415232);
        intent.putExtra("notificationId", i);
        if (!C8168dfL.g(payload.guid)) {
            intent.putExtra(Payload.PARAM_GUID, payload.guid);
        }
        if (!C8168dfL.g(payload.messageGuid)) {
            intent.putExtra(Payload.PARAM_MESSAGE_GUID, payload.messageGuid);
        }
        if (C8168dfL.h(payload.originator)) {
            intent.putExtra(Payload.PARAM_ORIGINATOR, payload.originator);
        }
        return PendingIntent.getActivity(context, i, intent, 201326592);
    }

    private static PendingIntent e(Context context, Payload payload, int i) {
        Intent intent = new Intent(context, NotificationReceiver.class);
        intent.setAction("com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED");
        if (!C8168dfL.g(payload.guid)) {
            intent.putExtra(Payload.PARAM_GUID, payload.guid);
        }
        if (!C8168dfL.g(payload.messageGuid)) {
            intent.putExtra(Payload.PARAM_MESSAGE_GUID, payload.messageGuid);
        }
        if (C8168dfL.h(payload.originator)) {
            intent.putExtra(Payload.PARAM_ORIGINATOR, payload.originator);
        }
        return PendingIntent.getBroadcast(context, i, intent, 335544320);
    }

    private static PendingIntent a(Context context, Uri uri, Payload payload, Payload.Action action, int i) {
        String str = action.key;
        String str2 = action.trackingInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setFlags(872415232);
        if (!C8168dfL.g(str)) {
            intent.putExtra("notificationAction", str);
        }
        if (!C8168dfL.g(str2)) {
            intent.putExtra("notificationCTAActionTrackingInfo", str2);
        }
        intent.putExtra("notificationId", i);
        if (!C8168dfL.g(payload.guid)) {
            intent.putExtra(Payload.PARAM_GUID, payload.guid);
        }
        if (!C8168dfL.g(payload.messageGuid)) {
            intent.putExtra(Payload.PARAM_MESSAGE_GUID, payload.messageGuid);
        }
        if (C8168dfL.h(payload.originator)) {
            intent.putExtra(Payload.PARAM_ORIGINATOR, payload.originator);
        }
        return PendingIntent.getActivity(context, i, intent, 201326592);
    }

    private static PendingIntent a(Context context, Uri uri, Payload payload, int i) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", C8119deP.e(context.getResources(), payload.getVideoTitle(""), uri.toString()));
        intent.putExtra("playable_id", payload.getVideoId());
        intent.setFlags(268435456);
        if (!C8168dfL.g(payload.guid)) {
            intent.putExtra(Payload.PARAM_GUID, payload.guid);
        }
        if (!C8168dfL.g(payload.messageGuid)) {
            intent.putExtra(Payload.PARAM_MESSAGE_GUID, payload.messageGuid);
        }
        if (C8168dfL.h(payload.originator)) {
            intent.putExtra(Payload.PARAM_ORIGINATOR, payload.originator);
        }
        return PendingIntent.getActivity(context, i, Intent.createChooser(intent, context.getResources().getString(com.netflix.mediaclient.ui.R.o.ls)), 201326592);
    }

    private static PendingIntent c(Context context, Uri uri, Payload payload, int i) {
        Intent b2 = C1588aGw.a(context).b(uri);
        b2.putExtra("target_url", uri.toString());
        b2.putExtra("is_push_notification", true);
        if (!C8168dfL.g(payload.guid)) {
            b2.putExtra(Payload.PARAM_GUID, payload.guid);
        }
        if (!C8168dfL.g(payload.messageGuid)) {
            b2.putExtra(Payload.PARAM_MESSAGE_GUID, payload.messageGuid);
        }
        if (C8168dfL.h(payload.originator)) {
            b2.putExtra(Payload.PARAM_ORIGINATOR, payload.originator);
        }
        return PendingIntent.getActivity(context, i, b2, 335544320);
    }

    private static void e(Context context, Notification notification, int i, Payload payload) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Moment.TYPE.NOTIFICATION);
        if (notificationManager != null) {
            try {
                notificationManager.notify(i, notification);
                return;
            } catch (SecurityException e) {
                C1044Mm.e("nf_push", "We are missing privilege?", e);
                return;
            } catch (Throwable th) {
                C1044Mm.e("nf_push", "Unexpected failure when trying to send notification", th);
                return;
            }
        }
        C1044Mm.d("nf_push", "Notification manager is not available!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"CheckResult"})
    public static void a(final Context context, final Payload payload, final InterfaceC9638uF interfaceC9638uF, final int i) {
        int i2 = 2 % 2;
        Objects.requireNonNull(context);
        Objects.requireNonNull(payload);
        Objects.requireNonNull(interfaceC9638uF);
        long when = payload.getWhen();
        String string = context.getString(com.netflix.mediaclient.ui.R.o.ac);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        String title = payload.getTitle(string);
        String ticker = payload.getTicker(title);
        int i3 = com.netflix.mediaclient.ui.R.e.Z;
        final Notification.Builder builder = new Notification.Builder(context);
        NotificationUtils.d(builder, context);
        builder.setContentIntent(a(context, payload, i));
        builder.setDeleteIntent(e(context, payload, i));
        builder.setTicker(ticker);
        builder.setAutoCancel(true);
        builder.setContentTitle(title);
        builder.setContentText(payload.text);
        builder.setSmallIcon(i3);
        builder.setWhen(when);
        builder.setSubText(payload.subtext);
        builder.setColor(context.getResources().getColor(C9834xU.c.e));
        Payload.Action[] actions = payload.getActions();
        int i4 = c + 97;
        b = i4 % 128;
        int i5 = i4 % 2;
        for (Payload.Action action : actions) {
            if (action == null) {
                int i6 = b + 73;
                c = i6 % 128;
                int i7 = i6 % 2;
            } else {
                Uri payload2 = action.getPayload();
                if (payload2 != null) {
                    if (Payload.Action.SHARE.equals(action.key)) {
                        int i8 = b + 39;
                        c = i8 % 128;
                        if (i8 % 2 == 0) {
                            builder.addAction(C9834xU.c.F, action.text, a(context, payload2, payload, i));
                            int i9 = 18 / 0;
                        } else {
                            builder.addAction(C9834xU.c.F, action.text, a(context, payload2, payload, i));
                        }
                    } else {
                        builder.addAction(C9834xU.c.F, action.text, a(context, payload2, payload, action, i));
                    }
                }
            }
        }
        Object obj = null;
        if (!C8168dfL.g(payload.largeIcon)) {
            interfaceC9638uF.b(GetImageRequest.e().a(payload.largeIcon).a()).subscribe(new Consumer() { // from class: o.cpK
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    AbstractC7065cpF.b(builder, context, payload, i, interfaceC9638uF, (GetImageRequest.a) obj2);
                }
            }, new Consumer() { // from class: o.cpH
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    AbstractC7065cpF.b(Payload.this, context, builder, i, interfaceC9638uF, (Throwable) obj2);
                }
            });
            int i10 = b + 35;
            c = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i11 = b + 35;
        c = i11 % 128;
        if (i11 % 2 != 0) {
            C1044Mm.e("nf_push", "Icon was not set");
            b(context, payload, builder, i, interfaceC9638uF);
            return;
        }
        C1044Mm.e("nf_push", "Icon was not set");
        b(context, payload, builder, i, interfaceC9638uF);
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Notification.Builder builder, Context context, Payload payload, int i, InterfaceC9638uF interfaceC9638uF, GetImageRequest.a aVar) {
        builder.setLargeIcon(ViewUtils.d(aVar.b()));
        b(context, payload, builder, i, interfaceC9638uF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Payload payload, Context context, Notification.Builder builder, int i, InterfaceC9638uF interfaceC9638uF, Throwable th) {
        InterfaceC1598aHf.a(new C1596aHd("SPY-34623 - failed to load large icon image for notification").d(th).e("imageUrl", payload.largeIcon).e(true));
        b(context, payload, builder, i, interfaceC9638uF);
    }

    private static void b(Context context, Payload payload, Notification.Builder builder, int i, InterfaceC9638uF interfaceC9638uF) {
        if (!C8168dfL.g(payload.bigViewPicture)) {
            e(context, payload, builder, i, interfaceC9638uF);
        } else {
            b(context, payload, builder, i);
        }
    }

    @SuppressLint({"CheckResult"})
    private static void e(final Context context, final Payload payload, final Notification.Builder builder, final int i, InterfaceC9638uF interfaceC9638uF) {
        if (C8168dfL.g(payload.bigViewPicture)) {
            C1044Mm.e("nf_push", "Large picture view was not set");
            e(context, builder.build(), i, payload);
            return;
        }
        interfaceC9638uF.b(GetImageRequest.e().a(payload.bigViewPicture).a()).subscribe(new Consumer() { // from class: o.cpE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC7065cpF.e(builder, payload, context, i, (GetImageRequest.a) obj);
            }
        }, new Consumer() { // from class: o.cpJ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC7065cpF.b(Payload.this, context, builder, i, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Notification.Builder builder, Payload payload, Context context, int i, GetImageRequest.a aVar) {
        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(builder);
        bigPictureStyle.bigPicture(aVar.b());
        C1044Mm.e("nf_push", "Big picture image is set");
        if (!C8168dfL.g(payload.bigViewSummary)) {
            bigPictureStyle.setSummaryText(payload.bigViewSummary);
        }
        if (!C8168dfL.g(payload.bigViewTitle)) {
            bigPictureStyle.setBigContentTitle(payload.bigViewTitle);
        }
        e(context, bigPictureStyle.build(), i, payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Payload payload, Context context, Notification.Builder builder, int i, Throwable th) {
        InterfaceC1598aHf.a(new C1596aHd("SPY-34623 - failed to load big view image for notification").d(th).e("imageUrl", payload.bigViewPicture).e(true));
        b(context, payload, builder, i);
    }

    private static void b(Context context, Payload payload, Notification.Builder builder, int i) {
        Notification build;
        if (!C8168dfL.g(payload.bigViewText)) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle(builder);
            bigTextStyle.bigText(payload.bigViewText);
            if (!C8168dfL.g(payload.bigViewSummary)) {
                bigTextStyle.setSummaryText(payload.bigViewSummary);
            }
            if (!C8168dfL.g(payload.bigViewTitle)) {
                bigTextStyle.setBigContentTitle(payload.bigViewTitle);
            }
            build = bigTextStyle.build();
        } else {
            build = builder.build();
        }
        e(context, build, i, payload);
    }

    public static void c(Context context, Intent intent) {
        TrackingInfo pushNotificationTrackingInfo;
        int intExtra = intent.getIntExtra("notificationId", -1);
        if (intExtra == -1 || C8168dfL.g(intent.getStringExtra(Payload.PARAM_MESSAGE_GUID))) {
            return;
        }
        String stringExtra = intent.getStringExtra("notificationAction");
        if (intent.getData() != null && stringExtra != null) {
            c(intent.getData().toString(), stringExtra);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Moment.TYPE.NOTIFICATION);
        if (notificationManager != null) {
            notificationManager.cancel(intExtra);
        }
        String stringExtra2 = intent.getStringExtra("notificationCTAActionTrackingInfo");
        if (C8168dfL.h(stringExtra2)) {
            pushNotificationTrackingInfo = CLv2Utils.e(stringExtra2);
        } else {
            pushNotificationTrackingInfo = new PushNotificationTrackingInfo(MessageData.createInstance(intent));
        }
        Logger.INSTANCE.logEvent(new PushNotificationAcknowledged(0L, pushNotificationTrackingInfo));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void c(String str, String str2) {
        char c2;
        DeepLinkInput deepLinkInput = new DeepLinkInput(Boolean.FALSE, str, Double.valueOf(1.0d));
        str2.hashCode();
        switch (str2.hashCode()) {
            case -2084521848:
                if (str2.equals(Payload.Action.DOWNLOAD)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1538832448:
                if (str2.equals(Payload.Action.ADD2QUEUE)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -177661763:
                if (str2.equals(Payload.Action.THUMBS_UP)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 76185:
                if (str2.equals(Payload.Action.MDP)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 2458420:
                if (str2.equals(Payload.Action.PLAY)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 78862271:
                if (str2.equals(Payload.Action.SHARE)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1065232964:
                if (str2.equals(Payload.Action.THUMBS_DOWN)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1999208305:
                if (str2.equals(Payload.Action.CUSTOM)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        Command command = null;
        switch (c2) {
            case 0:
                command = new ResumeDownloadCommand();
                break;
            case 1:
            case 2:
            case 6:
                return;
            case 3:
                command = new ViewDetailsCommand();
                break;
            case 4:
                command = new PlayCommand(null);
                break;
            case 5:
                command = new ShareCommand();
                break;
            case 7:
                return;
            default:
                InterfaceC1598aHf.a(String.format("%s: Don't know how to handle command: %s", "nf_push", str2));
                break;
        }
        Logger logger = Logger.INSTANCE;
        long addContext = logger.addContext(deepLinkInput);
        CLv2Utils.d(command);
        logger.removeContext(Long.valueOf(addContext));
    }

    public static boolean b(Intent intent) {
        return intent != null && intent.getBooleanExtra("is_push_notification", false);
    }

    private static void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$231);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
