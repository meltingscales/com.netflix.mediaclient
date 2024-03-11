package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes.dex */
public abstract class RE extends FrameLayout implements GeneratedComponentManagerHolder {
    private ViewComponentManager b;
    private boolean d;

    public RE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public RE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager d() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: c */
    public final ViewComponentManager componentManager() {
        if (this.b == null) {
            this.b = d();
        }
        return this.b;
    }

    protected void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((InterfaceC1188Sb) generatedComponent()).e((NetflixBottomNavBar) UnsafeCasts.unsafeCast(this));
    }
}
