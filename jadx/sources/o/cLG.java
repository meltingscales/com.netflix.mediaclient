package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuFragment;
import com.netflix.mediaclient.ui.profiles.RecentlyWatchedVideoInfo;
import dagger.Lazy;
import o.AbstractC3813bLp;
import o.InterfaceC1126Pr;
import o.bJW;

/* loaded from: classes4.dex */
public final class cLG {
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(o.InterfaceC2023aX r7, final o.InterfaceC5162btZ r8, final dagger.Lazy<o.InterfaceC1126Pr> r9, final com.netflix.mediaclient.android.activity.NetflixActivity r10, final com.netflix.mediaclient.clutils.TrackingInfoHolder r11) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cLG.e(o.aX, o.btZ, dagger.Lazy, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.clutils.TrackingInfoHolder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3771bKa c3771bKa, bJW.b bVar, int i) {
        bVar.a().setTag("share_button_in_recently_watched_row");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5162btZ interfaceC5162btZ, Lazy lazy, String str, View view) {
        C8632dsu.c((Object) interfaceC5162btZ, "");
        C8632dsu.c((Object) lazy, "");
        if (interfaceC5162btZ instanceof InterfaceC5161btY) {
            InterfaceC5161btY interfaceC5161btY = (InterfaceC5161btY) interfaceC5162btZ;
            String id = interfaceC5161btY.getId();
            C8632dsu.a(id, "");
            VideoType type = interfaceC5161btY.getType();
            C8632dsu.a(type, "");
            C8632dsu.d((Object) str);
            ((InterfaceC1126Pr) lazy.get()).e(id, type, str, interfaceC5162btZ.b());
            return;
        }
        Object obj = lazy.get();
        C8632dsu.a(obj, "");
        InterfaceC1126Pr.c.b((InterfaceC1126Pr) obj, interfaceC5162btZ, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3771bKa c3771bKa, bJW.b bVar, int i) {
        bVar.a().setTag("more_button_in_recently_watched_row");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5162btZ interfaceC5162btZ, TrackingInfoHolder trackingInfoHolder, String str, NetflixActivity netflixActivity, View view) {
        C8632dsu.c((Object) interfaceC5162btZ, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) netflixActivity, "");
        Bundle bundle = new Bundle();
        String id = interfaceC5162btZ.getId();
        C8632dsu.a(id, "");
        boolean z = interfaceC5162btZ instanceof InterfaceC5161btY;
        String id2 = z ? ((InterfaceC5161btY) interfaceC5162btZ).e().getId() : interfaceC5162btZ.getId();
        C8632dsu.d((Object) id2);
        String title = interfaceC5162btZ.getTitle();
        C8632dsu.a(title, "");
        String title2 = z ? ((InterfaceC5161btY) interfaceC5162btZ).e().getTitle() : interfaceC5162btZ.getTitle();
        C8632dsu.d((Object) title2);
        VideoType type = interfaceC5162btZ.getType();
        C8632dsu.a(type, "");
        String b = interfaceC5162btZ.b();
        C8632dsu.d((Object) str);
        bundle.putParcelable("my_profile_recently_watched_video_info", new RecentlyWatchedVideoInfo(id, id2, title, title2, type, trackingInfoHolder, b, str, false, JSONzip.end, null));
        MyNetflixRecentlyWatchedMenuFragment myNetflixRecentlyWatchedMenuFragment = new MyNetflixRecentlyWatchedMenuFragment();
        myNetflixRecentlyWatchedMenuFragment.setArguments(bundle);
        netflixActivity.showFullScreenDialog(myNetflixRecentlyWatchedMenuFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i, C3814bLq c3814bLq, AbstractC3813bLp.c cVar, int i2) {
        ViewParent parent = cVar.r().getParent();
        C8632dsu.d(parent);
        C9702vQ.d((View) parent, 0, true, false, 5, null);
        LD.e(cVar.b(), Token.Typography.C0681aa.e, null, 2, null);
        C1204Sr b = cVar.b();
        b.setPaddingRelative(i, b.getPaddingTop(), i, b.getPaddingBottom());
        cVar.b().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
}
