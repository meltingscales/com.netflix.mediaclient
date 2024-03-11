package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cZd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractActivityC6243cZd extends MO {
    private boolean a = false;

    public AbstractActivityC6243cZd() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.cZd.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC6243cZd.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((InterfaceC7943daz) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((UpNextFeedActivity) UnsafeCasts.unsafeCast(this));
    }
}
