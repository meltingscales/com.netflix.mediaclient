package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes.dex */
abstract class bYW extends LaunchActivity {
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bYW() {
        j();
    }

    private void j() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bYW.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                bYW.this.inject();
            }
        });
    }

    @Override // o.bYP, o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC4184bZi) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).d((ActivityC4183bZh) UnsafeCasts.unsafeCast(this));
    }
}
