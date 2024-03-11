package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class cLT extends NetflixActivity {
    private boolean a = false;

    public cLT() {
        b();
    }

    private void b() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.cLT.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                cLT.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((cNR) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((ProfileSelectionActivity) UnsafeCasts.unsafeCast(this));
    }
}
