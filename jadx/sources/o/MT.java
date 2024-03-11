package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes.dex */
public abstract class MT extends NetflixActivityBase {
    private boolean injected = false;

    public MT() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.MT.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                MT.this.inject();
            }
        });
    }

    @Override // o.AbstractActivityC1635aIp
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC1060Ne) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).a((NetflixActivity) UnsafeCasts.unsafeCast(this));
    }
}
