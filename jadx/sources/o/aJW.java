package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class aJW extends FrameLayout implements GeneratedComponentManagerHolder {
    private ViewComponentManager b;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public aJW(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager c() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: a */
    public final ViewComponentManager componentManager() {
        if (this.b == null) {
            this.b = c();
        }
        return this.b;
    }

    protected void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((aJZ) generatedComponent()).b((aJY) UnsafeCasts.unsafeCast(this));
    }
}
