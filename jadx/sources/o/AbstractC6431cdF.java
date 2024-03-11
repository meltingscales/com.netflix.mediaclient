package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.ui.lomo.CwView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cdF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6431cdF extends RelativeLayout implements GeneratedComponentManagerHolder {
    private boolean a;
    private ViewComponentManager d;

    public AbstractC6431cdF(Context context) {
        super(context);
        g();
    }

    public AbstractC6431cdF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public AbstractC6431cdF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager f() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: h */
    public final ViewComponentManager componentManager() {
        if (this.d == null) {
            this.d = f();
        }
        return this.d;
    }

    protected void g() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((InterfaceC6427cdB) generatedComponent()).e((CwView) UnsafeCasts.unsafeCast(this));
    }
}
