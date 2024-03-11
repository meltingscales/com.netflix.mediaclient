package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.mediaclient.android.widget.NetflixTagsTextView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class RC extends C1204Sr implements GeneratedComponentManagerHolder {
    private boolean b;
    private ViewComponentManager e;

    public RC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager b() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: d */
    public final ViewComponentManager componentManager() {
        if (this.e == null) {
            this.e = b();
        }
        return this.e;
    }

    protected void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC1200Sn) generatedComponent()).e((NetflixTagsTextView) UnsafeCasts.unsafeCast(this));
    }
}
