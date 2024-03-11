package androidx.navigation;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class NavAction {
    private Bundle defaultArguments;
    private final int destinationId;
    private NavOptions navOptions;

    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final NavOptions getNavOptions() {
        return this.navOptions;
    }
}
