package o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class RB extends AppCompatImageView implements GeneratedComponentManagerHolder {
    private ViewComponentManager componentManager;
    private boolean injected;

    RB(Context context) {
        super(context);
        inject();
    }

    RB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

    public RB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inject();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager createComponentManager() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ViewComponentManager componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC1201So) generatedComponent()).a((NetflixImageView) UnsafeCasts.unsafeCast(this));
    }
}
