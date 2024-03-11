package o;

import android.os.Bundle;
import com.netflix.mediaclient.ui.notifications.NotificationsFrag;
import o.C7142cqd;

/* renamed from: o.cpW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7082cpW extends NotificationsFrag {
    @Override // com.netflix.mediaclient.ui.notifications.NotificationsFrag
    public int F() {
        return 2;
    }

    @Override // com.netflix.mediaclient.ui.notifications.NotificationsFrag
    public int I() {
        return C7142cqd.a.l;
    }

    @Override // com.netflix.mediaclient.ui.notifications.NotificationsFrag
    public boolean L() {
        return true;
    }

    @Override // com.netflix.mediaclient.ui.notifications.NotificationsFrag
    public boolean O() {
        return false;
    }

    @Override // com.netflix.mediaclient.ui.notifications.NotificationsFrag
    public boolean a() {
        return false;
    }

    @Override // com.netflix.mediaclient.ui.notifications.NotificationsFrag, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ((NotificationsFrag) this).n = false;
        super.onCreate(bundle);
    }
}
