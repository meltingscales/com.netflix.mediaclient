package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes.dex */
public abstract class bYP extends NetflixActivity {
    private boolean a = false;

    public bYP() {
        d();
    }

    private void d() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bYP.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                bYP.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((InterfaceC4182bZg) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).a((LaunchActivity) UnsafeCasts.unsafeCast(this));
    }
}
