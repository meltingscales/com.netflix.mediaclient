package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.games.game_details.GameDetailsActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class bNX extends bFS {
    private boolean c = false;

    public bNX() {
        r();
    }

    private void r() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bNX.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                bNX.this.inject();
            }
        });
    }

    @Override // o.bFH, o.bFK, o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((bNU) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).e((GameDetailsActivity) UnsafeCasts.unsafeCast(this));
    }
}
