package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cwN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC7444cwN extends MO {
    private boolean c = false;

    public AbstractActivityC7444cwN() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.cwN.4
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC7444cwN.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((InterfaceC7489cxF) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((PlayerActivity) UnsafeCasts.unsafeCast(this));
    }
}
