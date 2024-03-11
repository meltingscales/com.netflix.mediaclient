package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.bYg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC4155bYg extends DetailsActivity {
    private boolean c = false;

    public AbstractActivityC4155bYg() {
        q();
    }

    private void q() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bYg.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC4155bYg.this.inject();
            }
        });
    }

    @Override // o.bFK, o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((InterfaceC4161bYm) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).e((KidsCharacterDetailsActivity) UnsafeCasts.unsafeCast(this));
    }
}
