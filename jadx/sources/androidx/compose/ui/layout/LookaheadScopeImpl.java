package androidx.compose.ui.layout;

import o.C8627dsp;
import o.drO;

/* loaded from: classes.dex */
public final class LookaheadScopeImpl implements LookaheadScope {
    private drO<? extends LayoutCoordinates> scopeCoordinates;

    public LookaheadScopeImpl() {
        this(null, 1, null);
    }

    public LookaheadScopeImpl(drO<? extends LayoutCoordinates> dro) {
        this.scopeCoordinates = dro;
    }

    public /* synthetic */ LookaheadScopeImpl(drO dro, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : dro);
    }
}
