package o;

import android.content.Context;
import android.widget.LinearLayout;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes5.dex */
public abstract class cWM extends LinearLayout implements GeneratedComponentManagerHolder {
    private ViewComponentManager c;
    private boolean d;

    public cWM(Context context) {
        super(context);
        e();
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
        if (this.c == null) {
            this.c = d();
        }
        return this.c;
    }

    protected void e() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((cXS) generatedComponent()).d((UserMessageAreaView) UnsafeCasts.unsafeCast(this));
    }
}
