package o;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.ui.mylist.impl.MyListActivity;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: o.cnu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7002cnu implements InterfaceC6905cmC {
    private final bNP d;
    private final ComponentActivity e;

    @Inject
    public C7002cnu(Activity activity, bNP bnp) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) bnp, "");
        this.d = bnp;
        this.e = (ComponentActivity) C9737vz.e(activity, ComponentActivity.class);
    }

    @Override // o.InterfaceC6905cmC
    public Intent e(boolean z) {
        ArrayList a;
        if (this.d.a()) {
            MyListActivity.e eVar = MyListActivity.e;
            ComponentActivity componentActivity = this.e;
            MyListTabItems.Type type = MyListTabItems.Type.e;
            MyListTabItems.Type type2 = MyListTabItems.Type.a;
            a = C8569dql.a(type, type2);
            if (z) {
                type = type2;
            }
            return eVar.b(componentActivity, new MyListTabItems(a, type));
        }
        return MyListActivity.e.b(MyListActivity.e, this.e, null, 2, null);
    }

    @Override // o.InterfaceC6905cmC
    public void e(AppView appView, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfo, "");
        if (this.d.a()) {
            C6921cmS c6921cmS = C6921cmS.e;
            c6921cmS.b();
            c6921cmS.d(appView, trackingInfo);
        }
    }
}
