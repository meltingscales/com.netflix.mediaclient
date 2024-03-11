package o;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.coP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC7023coP extends MO {
    private boolean a = false;

    public AbstractActivityC7023coP() {
        c();
    }

    private void c() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.coP.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                AbstractActivityC7023coP.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((InterfaceC7026coS) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).e((NonMemberHomeActivity) UnsafeCasts.unsafeCast(this));
    }
}
