package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.mylist.impl.MyListActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cmK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC6913cmK extends NetflixActivity {
    private boolean a = false;

    public AbstractActivityC6913cmK() {
        a();
    }

    private void a() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.cmK.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC6913cmK.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((InterfaceC6916cmN) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).d((MyListActivity) UnsafeCasts.unsafeCast(this));
    }
}
