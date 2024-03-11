package o;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.search.SearchActivity;
import javax.inject.Inject;

/* renamed from: o.cTh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6085cTh implements InterfaceC6068cSu {
    private final Activity a;

    @Inject
    public C6085cTh(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.a = activity;
    }

    @Override // o.InterfaceC6068cSu
    public void a(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        C6043cRw.c(str, z);
    }

    @Override // o.InterfaceC6068cSu
    public boolean a() {
        return cRF.d(this.a);
    }

    @Override // o.InterfaceC6068cSu
    public MenuItem a(Menu menu) {
        C8632dsu.c((Object) menu, "");
        Activity activity = this.a;
        C8632dsu.d(activity);
        MenuItem a = cRA.a((NetflixActivity) activity, menu);
        C8632dsu.a(a, "");
        return a;
    }

    @Override // o.InterfaceC6068cSu
    public void c(String str) {
        SearchActivity.d(this.a, str);
    }
}
