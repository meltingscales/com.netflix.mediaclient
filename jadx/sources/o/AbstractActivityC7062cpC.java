package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.notifications.NotificationsActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cpC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC7062cpC extends MO {
    private boolean e = false;

    public AbstractActivityC7062cpC() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.cpC.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC7062cpC.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((InterfaceC7066cpG) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).e((NotificationsActivity) UnsafeCasts.unsafeCast(this));
    }
}
