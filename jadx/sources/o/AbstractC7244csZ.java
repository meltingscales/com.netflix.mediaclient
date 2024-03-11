package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.csZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7244csZ extends FrameLayout implements GeneratedComponentManagerHolder {
    private boolean b;
    private ViewComponentManager e;

    public AbstractC7244csZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager k() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: o */
    public final ViewComponentManager componentManager() {
        if (this.e == null) {
            this.e = k();
        }
        return this.e;
    }

    protected void r() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC7185crT) generatedComponent()).d((DownloadButton) UnsafeCasts.unsafeCast(this));
    }
}
