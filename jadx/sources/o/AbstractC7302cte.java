package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.SeasonDownloadButton;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cte  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7302cte extends DownloadButton {
    private boolean b;

    public AbstractC7302cte(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r();
    }

    @Override // o.AbstractC7244csZ
    protected void r() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC7325cuA) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((SeasonDownloadButton) UnsafeCasts.unsafeCast(this));
    }
}
