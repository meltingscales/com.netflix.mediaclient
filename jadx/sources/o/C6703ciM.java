package o;

import android.content.ComponentName;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.home.MoreTabActivity;
import com.netflix.mediaclient.ui.more.MoreFragment;

/* renamed from: o.ciM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6703ciM implements InterfaceC5345bwx {
    private final bMZ e;

    @Override // o.InterfaceC5345bwx
    public void a(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
    }

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

    public C6703ciM(bMZ bmz) {
        C8632dsu.c((Object) bmz, "");
        this.e = bmz;
    }

    @Override // o.InterfaceC5345bwx
    public boolean e(Intent intent) {
        C8632dsu.c((Object) intent, "");
        if (intent.getComponent() != null) {
            ComponentName component = intent.getComponent();
            C8632dsu.d(component);
            if (C8632dsu.c((Object) component.getClassName(), (Object) MoreTabActivity.c().getCanonicalName())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC5345bwx
    /* renamed from: c */
    public NetflixFrag d(Intent intent) {
        C8632dsu.c((Object) intent, "");
        if (e(intent)) {
            return new MoreFragment();
        }
        return null;
    }

    @Override // o.InterfaceC5345bwx
    public AppView a(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return AppView.accountMenu;
    }

    @Override // o.InterfaceC5345bwx
    public boolean a() {
        return this.e.e();
    }
}
