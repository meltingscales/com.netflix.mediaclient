package o;

import android.content.ComponentName;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsFragment;
import o.C7313ctp;

/* renamed from: o.ctD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7275ctD implements InterfaceC5345bwx {
    public static final int b = FragmentHelper.b;
    private final FragmentHelper e;

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

    public C7275ctD(FragmentHelper fragmentHelper) {
        C8632dsu.c((Object) fragmentHelper, "");
        this.e = fragmentHelper;
    }

    @Override // o.InterfaceC5345bwx
    public boolean e(Intent intent) {
        C8632dsu.c((Object) intent, "");
        if (intent.getBooleanExtra("smart_downloads_tutorial", false) || intent.getBooleanExtra("smart_downloads_with_d4u_tutorial", false)) {
            return true;
        }
        ComponentName component = intent.getComponent();
        return C8632dsu.c((Object) (component != null ? component.getClassName() : null), (Object) OfflineActivityV2.b.c().getCanonicalName());
    }

    @Override // o.InterfaceC5345bwx
    /* renamed from: c */
    public NetflixFrag d(Intent intent) {
        C8632dsu.c((Object) intent, "");
        if (intent.getBooleanExtra("smart_downloads_tutorial", false)) {
            return new C7295ctX();
        }
        if (intent.getBooleanExtra("smart_downloads_with_d4u_tutorial", false)) {
            return new DownloadedForYouSettingsFragment();
        }
        if (intent.hasExtra("playable_id")) {
            C7313ctp.c cVar = C7313ctp.e;
            String stringExtra = intent.getStringExtra("playable_id");
            return cVar.a(stringExtra != null ? stringExtra : "");
        } else if (intent.hasExtra("title_id")) {
            C7313ctp.c cVar2 = C7313ctp.e;
            String stringExtra2 = intent.getStringExtra("title_id");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            String stringExtra3 = intent.getStringExtra("profile_id");
            return cVar2.e(stringExtra2, stringExtra3 != null ? stringExtra3 : "");
        } else {
            return new C7357cug();
        }
    }

    @Override // o.InterfaceC5345bwx
    public AppView a(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return AppView.cachedVideos;
    }

    @Override // o.InterfaceC5345bwx
    public boolean a() {
        return this.e.e();
    }

    @Override // o.InterfaceC5345bwx
    public void a(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
        ((NetflixFrag) fragment).bt_();
    }
}
