package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class bFK extends MO {
    private boolean e = false;

    public bFK() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bFK.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                bFK.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((InterfaceC3640bFi) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((DetailsActivity) UnsafeCasts.unsafeCast(this));
    }
}
