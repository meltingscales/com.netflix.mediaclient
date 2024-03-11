package o;

import android.view.View;

/* renamed from: o.az  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3442az<T extends View> extends AbstractC3073as<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    protected final int a() {
        throw new UnsupportedOperationException("Layout resources are unsupported. Views must be created with `buildView`");
    }

    @Override // o.AbstractC3073as
    public AbstractC3073as<T> a(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported. Views must be created with `buildView`");
    }
}
