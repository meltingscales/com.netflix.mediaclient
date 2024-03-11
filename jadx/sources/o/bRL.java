package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.home.HomeActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes.dex */
public abstract class bRL extends MO {
    private boolean b = false;

    public bRL() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bRL.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                bRL.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((bRW) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).d((HomeActivity) UnsafeCasts.unsafeCast(this));
    }
}
