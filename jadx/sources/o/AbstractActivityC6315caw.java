package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.login.LoginActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.caw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC6315caw extends bZV {
    private boolean b = false;

    public AbstractActivityC6315caw() {
        d();
    }

    private void d() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.caw.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC6315caw.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC6268caB) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).a((LoginActivity) UnsafeCasts.unsafeCast(this));
    }
}
