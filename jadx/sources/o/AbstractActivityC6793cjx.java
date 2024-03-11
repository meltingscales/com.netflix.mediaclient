package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.mssi.impl.GameControllerActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cjx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC6793cjx extends MO {
    private boolean b = false;

    public AbstractActivityC6793cjx() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.cjx.3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC6793cjx.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC6709ciS) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((GameControllerActivity) UnsafeCasts.unsafeCast(this));
    }
}
