package o;

import android.content.ComponentName;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.ui.notifications.NotificationsActivity;
import com.netflix.mediaclient.ui.notifications.NotificationsFrag;

/* renamed from: o.cpU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7080cpU implements InterfaceC5345bwx {
    private final FragmentHelper c;

    @Override // o.InterfaceC5345bwx
    public TrackingInfo b(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return null;
    }

    @Override // o.InterfaceC5345bwx
    public void b(Intent intent, Fragment fragment, Intent intent2, boolean z) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
    }

    @Override // o.InterfaceC5345bwx
    public void c(Intent intent, Fragment fragment, boolean z) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
    }

    @Override // o.InterfaceC5345bwx
    public boolean c(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
        return false;
    }

    public C7080cpU(FragmentHelper fragmentHelper) {
        C8632dsu.c((Object) fragmentHelper, "");
        this.c = fragmentHelper;
    }

    @Override // o.InterfaceC5345bwx
    public boolean e(Intent intent) {
        C8632dsu.c((Object) intent, "");
        ComponentName component = intent.getComponent();
        return C8632dsu.c((Object) (component != null ? component.getClassName() : null), (Object) NotificationsActivity.o().getCanonicalName());
    }

    @Override // o.InterfaceC5345bwx
    public Fragment d(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return new NotificationsFrag();
    }

    @Override // o.InterfaceC5345bwx
    public AppView a(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return AppView.notificationSelector;
    }

    @Override // o.InterfaceC5345bwx
    public boolean a() {
        return this.c.e();
    }

    @Override // o.InterfaceC5345bwx
    public void a(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
        ((NetflixFrag) fragment).bt_();
    }
}
