package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.ctc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC7300ctc extends NetflixActivity {
    private boolean d = false;

    public AbstractActivityC7300ctc() {
        a();
    }

    private void a() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.ctc.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC7300ctc.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((InterfaceC7305cth) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((OfflineActivityV2) UnsafeCasts.unsafeCast(this));
    }
}
