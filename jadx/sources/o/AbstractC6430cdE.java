package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.ui.lomo.BillboardView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cdE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6430cdE extends RelativeLayout implements GeneratedComponentManagerHolder {
    private boolean a;
    private ViewComponentManager e;

    public AbstractC6430cdE(Context context) {
        super(context);
        v();
    }

    public AbstractC6430cdE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v();
    }

    public AbstractC6430cdE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        v();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager w() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: u */
    public final ViewComponentManager componentManager() {
        if (this.e == null) {
            this.e = w();
        }
        return this.e;
    }

    protected void v() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((InterfaceC6471cdt) generatedComponent()).b((BillboardView) UnsafeCasts.unsafeCast(this));
    }
}
