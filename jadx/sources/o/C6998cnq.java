package o;

import android.content.ComponentName;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.mylist.impl.MyListActivity;
import com.netflix.mediaclient.ui.mylist.impl.MyListFragment;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;

/* renamed from: o.cnq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6998cnq implements InterfaceC5345bwx {
    private final MyListTabItems d;
    private final bNP e;

    @Override // o.InterfaceC5345bwx
    public boolean a() {
        return false;
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
        return true;
    }

    public C6998cnq(MyListTabItems myListTabItems, bNP bnp) {
        C8632dsu.c((Object) bnp, "");
        this.d = myListTabItems;
        this.e = bnp;
    }

    @Override // o.InterfaceC5345bwx
    public boolean e(Intent intent) {
        C8632dsu.c((Object) intent, "");
        ComponentName component = intent.getComponent();
        return C8632dsu.c((Object) (component != null ? component.getClassName() : null), (Object) MyListActivity.e.e().getCanonicalName());
    }

    @Override // o.InterfaceC5345bwx
    /* renamed from: c */
    public NetflixFrag d(Intent intent) {
        NetflixFrag c;
        C8632dsu.c((Object) intent, "");
        if (this.e.a()) {
            MyListTabItems myListTabItems = this.d;
            return (myListTabItems == null || (c = MyListFragmentTab.j.c(myListTabItems)) == null) ? MyListFragment.j.d(MyListTabItems.Type.e) : c;
        }
        return MyListFragment.j.d(MyListTabItems.Type.e);
    }

    @Override // o.InterfaceC5345bwx
    public AppView a(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return AppView.myListGallery;
    }

    @Override // o.InterfaceC5345bwx
    public void a(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
        ((NetflixFrag) fragment).bt_();
    }
}
