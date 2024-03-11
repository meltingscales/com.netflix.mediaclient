package o;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;

/* renamed from: o.cqZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7138cqZ extends AbstractC7135cqW {
    @Override // o.AbstractC7135cqW
    protected void a(NotificationCompat.Builder builder, NotificationCompat.BigPictureStyle bigPictureStyle, NotificationSummaryItem notificationSummaryItem, Context context) {
    }

    @Override // o.AbstractC7135cqW, o.InterfaceC7136cqX
    public boolean e() {
        return false;
    }

    @Override // o.AbstractC7135cqW
    public View a(C7068cpI c7068cpI) {
        return c7068cpI.g();
    }

    @Override // o.AbstractC7135cqW
    public void a(C7068cpI c7068cpI, NotificationSummaryItem notificationSummaryItem, Context context) {
        if (c7068cpI.b() != null && notificationSummaryItem.tts() != null) {
            c7068cpI.b().setContentDescription(notificationSummaryItem.tts());
        }
        if (C8168dfL.h(notificationSummaryItem.header())) {
            c7068cpI.o().setVisibility(0);
            c7068cpI.o().setText(C8168dfL.c(notificationSummaryItem.header()));
        }
        if (c7068cpI.e() != null) {
            c7068cpI.e().setVisibility(8);
        }
        if (c7068cpI.l() != null) {
            c7068cpI.l().setVisibility(notificationSummaryItem.read() ? 4 : 0);
        }
        c7068cpI.j().setVisibility(8);
        c7068cpI.m().setVisibility(8);
        c7068cpI.g().setVisibility(0);
        String imageUrl = notificationSummaryItem.imageUrl();
        if (C8168dfL.g(imageUrl)) {
            InterfaceC1597aHe.e("Notification image url is empty");
            c7068cpI.g().clearImage();
        } else {
            c7068cpI.g().showImage(imageUrl);
        }
        if (c7068cpI.c() != null) {
            c7068cpI.c().setVisibility(8);
        }
        if (c7068cpI.n() != null && notificationSummaryItem.showTimestamp()) {
            c7068cpI.n().setVisibility(0);
            c7068cpI.n().setText(DateUtils.getRelativeTimeSpanString(context, notificationSummaryItem.timestamp()));
        }
        if (c7068cpI.i() != null) {
            c7068cpI.i().setVisibility(8);
        }
        if (c7068cpI.h() != null) {
            c7068cpI.h().setVisibility(0);
        }
        if (C8168dfL.h(notificationSummaryItem.body())) {
            c7068cpI.d().setGravity(8388611);
            c7068cpI.d().setText(C8168dfL.c(notificationSummaryItem.body()));
        }
        if (c7068cpI.f() != null) {
            c7068cpI.f().setVisibility(0);
        }
        if (c7068cpI.a() != null) {
            c7068cpI.a().setVisibility(4);
        }
    }
}
