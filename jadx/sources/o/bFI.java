package o;

import android.content.Context;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.ui.details.EpisodeView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class bFI extends RelativeLayout implements GeneratedComponentManagerHolder {
    private ViewComponentManager b;
    private boolean d;

    public bFI(Context context) {
        super(context);
        f();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager h() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: a */
    public final ViewComponentManager componentManager() {
        if (this.b == null) {
            this.b = h();
        }
        return this.b;
    }

    protected void f() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((bFD) generatedComponent()).b((EpisodeView) UnsafeCasts.unsafeCast(this));
    }
}
