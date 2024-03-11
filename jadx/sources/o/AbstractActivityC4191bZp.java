package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.bZp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC4191bZp extends MO {
    private boolean a = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractActivityC4191bZp() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bZp.4
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC4191bZp.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((InterfaceC4196bZu) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).d((ActivityC4195bZt) UnsafeCasts.unsafeCast(this));
    }
}
