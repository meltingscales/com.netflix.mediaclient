package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class bFH extends DetailsActivity {
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bFH() {
        q();
    }

    private void q() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bFH.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                bFH.this.inject();
            }
        });
    }

    @Override // o.bFK, o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((bFR) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).a((bFS) UnsafeCasts.unsafeCast(this));
    }
}
