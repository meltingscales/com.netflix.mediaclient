package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.home.MoreTabActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class bRK extends MO {
    private boolean e = false;

    public bRK() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bRK.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                bRK.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((InterfaceC3988bSb) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).d((MoreTabActivity) UnsafeCasts.unsafeCast(this));
    }
}
