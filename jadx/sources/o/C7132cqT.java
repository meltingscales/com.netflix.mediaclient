package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* renamed from: o.cqT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7132cqT extends C7138cqZ {
    @Override // o.C7138cqZ, o.AbstractC7135cqW
    public void a(C7068cpI c7068cpI, NotificationSummaryItem notificationSummaryItem, Context context) {
        Map k;
        Throwable th;
        boolean g;
        C8632dsu.c((Object) c7068cpI, "");
        C8632dsu.c((Object) notificationSummaryItem, "");
        C8632dsu.c((Object) context, "");
        super.a(c7068cpI, notificationSummaryItem, context);
        c7068cpI.g().setVisibility(8);
        c7068cpI.m().setVisibility(0);
        String imageUrl = notificationSummaryItem.imageUrl();
        if (imageUrl != null) {
            g = C8691duz.g(imageUrl);
            if (!g) {
                c7068cpI.k().showImage(imageUrl);
                c7068cpI.k().setContentDescription(notificationSummaryItem.imageAltText());
            }
        }
        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
        k = dqE.k(new LinkedHashMap());
        C1596aHd c1596aHd = new C1596aHd("Notification image url is empty", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1597aHe c2 = dVar2.c();
        if (c2 != null) {
            c2.d(c1596aHd, th);
        } else {
            dVar2.e().b(c1596aHd, th);
        }
        c7068cpI.k().clearImage();
        c7068cpI.k().setContentDescription(notificationSummaryItem.imageAltText());
    }
}
