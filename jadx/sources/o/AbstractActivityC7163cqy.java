package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cqy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC7163cqy extends MO {
    private boolean d = false;

    public AbstractActivityC7163cqy() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.cqy.4
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC7163cqy.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((InterfaceC7116cqD) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).b((MultiTitleNotificationsActivity) UnsafeCasts.unsafeCast(this));
    }
}
