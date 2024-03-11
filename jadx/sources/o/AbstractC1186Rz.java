package o;

import android.content.Context;
import android.widget.LinearLayout;
import com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.Rz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1186Rz extends LinearLayout implements GeneratedComponentManagerHolder {
    private boolean c;
    private ViewComponentManager d;

    public AbstractC1186Rz(Context context) {
        super(context);
        e();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager b() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: a */
    public final ViewComponentManager componentManager() {
        if (this.d == null) {
            this.d = b();
        }
        return this.d;
    }

    protected void e() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((RT) generatedComponent()).a((NetflixActionBarInterstitials) UnsafeCasts.unsafeCast(this));
    }
}
