package o;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.ui.notifications.NotificationsActivity;
import com.netflix.mediaclient.util.NotificationUtils;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.social.NotificationsListSummary;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.C7142cqd;
import o.C9834xU;

/* renamed from: o.cqW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7135cqW implements InterfaceC7136cqX {
    private static String a = null;
    public static final String b = "BaseNotification";
    private static int c = 0;
    private static int e = 1;
    private static byte e$ss2$153 = 24;

    protected abstract void a(NotificationCompat.Builder builder, NotificationCompat.BigPictureStyle bigPictureStyle, NotificationSummaryItem notificationSummaryItem, Context context);

    @Override // o.InterfaceC7136cqX
    public boolean e() {
        return true;
    }

    public View a(C7068cpI c7068cpI) {
        return c7068cpI.j();
    }

    public static C7068cpI c(View view) {
        return new C7068cpI(null, (NetflixImageView) view.findViewById(C7142cqd.b.I), (C7061cpB) view.findViewById(C7142cqd.b.z), (TextView) view.findViewById(C7142cqd.b.G), (TextView) view.findViewById(C7142cqd.b.E), (TextView) view.findViewById(C7142cqd.b.l), null, null, null, null, null, (NetflixImageView) view.findViewById(C7142cqd.b.y), view.findViewById(C7142cqd.b.C), view);
    }

    public void a(C7068cpI c7068cpI, NotificationSummaryItem notificationSummaryItem, Context context) {
        if (c7068cpI.b() != null && notificationSummaryItem.tts() != null) {
            c7068cpI.b().setContentDescription(notificationSummaryItem.tts());
        }
        if (c7068cpI.l() != null) {
            c7068cpI.l().setVisibility(notificationSummaryItem.read() ? 4 : 0);
        }
        if (c7068cpI.e() != null && notificationSummaryItem.friendProfile() != null) {
            c7068cpI.e().setVisibility(0);
            c7068cpI.e().showImage(notificationSummaryItem.friendProfile().bigImageUrl());
            c7068cpI.e().setContentDescription(notificationSummaryItem.friendProfile().getFullName());
        }
        c7068cpI.g().setVisibility(8);
        c7068cpI.j().setVisibility(0);
        c7068cpI.j().showImage(notificationSummaryItem.imageUrl());
        c7068cpI.j().setContentDescription(notificationSummaryItem.header());
        c7068cpI.o().setVisibility(0);
        if (notificationSummaryItem.friendProfile() != null) {
            c7068cpI.o().setText(notificationSummaryItem.friendProfile().getFullName());
        }
        c7068cpI.d().setGravity(8388611);
        if (c7068cpI.c() != null) {
            if (notificationSummaryItem.messageString() == null || notificationSummaryItem.messageString().length() == 0) {
                c7068cpI.c().setVisibility(8);
            } else {
                c7068cpI.c().setVisibility(0);
                c7068cpI.c().setText(String.format("\"%s\"", notificationSummaryItem.messageString()));
            }
        }
        if (c7068cpI.n() != null) {
            c7068cpI.n().setVisibility(0);
            c7068cpI.n().setText(DateUtils.getRelativeTimeSpanString(context, notificationSummaryItem.timestamp()));
        }
        if (c7068cpI.h() != null) {
            c7068cpI.h().setVisibility(8);
        }
        if (c7068cpI.i() != null) {
            c7068cpI.i().setVisibility(0);
        }
        if (c7068cpI.a() != null) {
            c7068cpI.a().setVisibility(8);
        }
        if (c7068cpI.f() != null) {
            c7068cpI.f().setVisibility(8);
        }
    }

    public static void e(C7068cpI c7068cpI, int i) {
        int i2 = 2 % 2;
        int i3 = e + 63;
        c = i3 % 128;
        int i4 = i3 % 2;
        c7068cpI.j().setVisibility(8);
        c7068cpI.o().setVisibility(8);
        if (c7068cpI.e() != null) {
            int i5 = c + 49;
            e = i5 % 128;
            int i6 = i5 % 2;
            c7068cpI.e().setVisibility(8);
        }
        if (c7068cpI.c() != null) {
            int i7 = e + 99;
            c = i7 % 128;
            if (i7 % 2 != 0) {
                c7068cpI.c().setVisibility(123);
            } else {
                c7068cpI.c().setVisibility(8);
            }
        }
        if (c7068cpI.n() != null) {
            int i8 = e + 5;
            c = i8 % 128;
            int i9 = i8 % 2;
            c7068cpI.n().setVisibility(8);
            int i10 = c + 51;
            e = i10 % 128;
            int i11 = i10 % 2;
        }
        if (c7068cpI.a() != null) {
            int i12 = e + 33;
            c = i12 % 128;
            if (i12 % 2 != 0) {
                c7068cpI.a().setVisibility(46);
            } else {
                c7068cpI.a().setVisibility(8);
            }
        }
        if (c7068cpI.f() != null) {
            c7068cpI.f().setVisibility(8);
        }
        if (c7068cpI.h() != null) {
            int i13 = e + 65;
            c = i13 % 128;
            int i14 = i13 % 2;
            c7068cpI.h().setVisibility(8);
        }
        if (c7068cpI.i() != null) {
            c7068cpI.i().setVisibility(8);
        }
        c7068cpI.g().setVisibility(8);
        TextView d = c7068cpI.d();
        Context context = d.getContext();
        String string = context.getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            } else {
                int i15 = c + 75;
                e = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        d.setText(string);
        c7068cpI.d().setSingleLine(false);
        c7068cpI.d().setGravity(17);
    }

    @Override // o.InterfaceC7136cqX
    @SuppressLint({"CheckResult"})
    public final void b(final NotificationSummaryItem notificationSummaryItem, final NotificationsListSummary notificationsListSummary, final MessageData messageData, final Context context) {
        String messageGuid = notificationSummaryItem.messageGuid();
        String str = a;
        if (str != null && str.equals(messageGuid)) {
            C1044Mm.e(b, "Notification with such id was already shown - skipping...");
        } else if (messageGuid.equals(C8157dfA.e(context, "notification_id_deleted_from_statusbar", "-1"))) {
            C1044Mm.e(b, "Notification with such id was swiped out by user - skipping...");
        } else {
            Single.zip(d(context, c(notificationSummaryItem), AssetType.profileAvatar), d(context, notificationSummaryItem.imageUrl(), AssetType.boxArt), new e()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.cqU
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC7135cqW.this.e(context, notificationSummaryItem, notificationsListSummary, messageData, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Context context, NotificationSummaryItem notificationSummaryItem, NotificationsListSummary notificationsListSummary, MessageData messageData, List list) {
        e(context, notificationSummaryItem, notificationsListSummary, messageData, ((GetImageRequest.a) list.get(0)).b(), ((GetImageRequest.a) list.get(1)).b());
    }

    private void e(Context context, NotificationSummaryItem notificationSummaryItem, NotificationsListSummary notificationsListSummary, MessageData messageData, Bitmap bitmap, Bitmap bitmap2) {
        NotificationCompat.Builder builder;
        C8166dfJ.d();
        int color = context.getResources().getColor(C9834xU.c.e);
        NotificationCompat.BigPictureStyle bigPicture = new NotificationCompat.BigPictureStyle().bigPicture(bitmap2);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Moment.TYPE.NOTIFICATION);
        String a2 = NotificationUtils.a(notificationManager, context);
        if (a2 != null) {
            builder = new NotificationCompat.Builder(context, a2);
        } else {
            builder = new NotificationCompat.Builder(context);
        }
        NotificationCompat.Builder builder2 = builder;
        builder2.setSmallIcon(com.netflix.mediaclient.ui.R.e.Z).setLargeIcon(bitmap).setContentTitle(notificationSummaryItem.friendProfile().getFullName()).setStyle(bigPicture).setColor(color);
        builder2.setGroup("iris_notifications");
        builder2.setGroupSummary(true);
        builder2.setAutoCancel(true);
        a(builder2, bigPicture, notificationSummaryItem, context);
        d(builder2, notificationSummaryItem, notificationsListSummary, messageData, context);
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED");
        MessageData.addMessageDataToIntent(intent, messageData);
        intent.putExtra("swiped_notification_id", notificationSummaryItem.messageGuid());
        builder2.setDeleteIntent(PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent, 268435456));
        notificationManager.cancel(1000);
        notificationManager.notify(1000, builder2.build());
        a = notificationSummaryItem.messageGuid();
    }

    private static String c(NotificationSummaryItem notificationSummaryItem) {
        String imageUrl = notificationSummaryItem.friendProfile().imageUrl();
        return C8168dfL.g(imageUrl) ? notificationSummaryItem.friendProfile().bigImageUrl() : imageUrl;
    }

    /* renamed from: o.cqW$e */
    /* loaded from: classes4.dex */
    static class e implements BiFunction<GetImageRequest.a, GetImageRequest.a, List<GetImageRequest.a>> {
        private e() {
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: d */
        public List<GetImageRequest.a> apply(GetImageRequest.a aVar, GetImageRequest.a aVar2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            arrayList.add(aVar2);
            return arrayList;
        }
    }

    private static Single<GetImageRequest.a> d(Context context, String str, AssetType assetType) {
        return InterfaceC9638uF.a.d(context).b(GetImageRequest.e().a(str).a());
    }

    protected void d(NotificationCompat.Builder builder, NotificationSummaryItem notificationSummaryItem, NotificationsListSummary notificationsListSummary, MessageData messageData, Context context) {
        String str = b;
        C1044Mm.e(str, "SocialNotification::addNotificationActions " + messageData);
        Intent b2 = NotificationsActivity.b(messageData);
        NotificationUtils.e(b2);
        builder.setContentIntent(PendingIntent.getBroadcast(context.getApplicationContext(), 3, b2, 201326592));
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$153);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
