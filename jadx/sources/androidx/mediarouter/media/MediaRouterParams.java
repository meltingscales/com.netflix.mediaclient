package androidx.mediarouter.media;

import android.os.Build;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class MediaRouterParams {
    final int mDialogType;
    final Bundle mExtras;
    final boolean mOutputSwitcherEnabled;
    final boolean mTransferToLocalEnabled;

    public int getDialogType() {
        return this.mDialogType;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public boolean isOutputSwitcherEnabled() {
        return this.mOutputSwitcherEnabled;
    }

    public boolean isTransferToLocalEnabled() {
        return this.mTransferToLocalEnabled;
    }

    MediaRouterParams(Builder builder) {
        this.mDialogType = builder.mDialogType;
        this.mOutputSwitcherEnabled = builder.mOutputSwitcherEnabled;
        this.mTransferToLocalEnabled = builder.mTransferToLocalEnabled;
        Bundle bundle = builder.mExtras;
        this.mExtras = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        int mDialogType = 1;
        Bundle mExtras;
        boolean mOutputSwitcherEnabled;
        boolean mTransferToLocalEnabled;

        public Builder setOutputSwitcherEnabled(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mOutputSwitcherEnabled = z;
            }
            return this;
        }

        public Builder setTransferToLocalEnabled(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mTransferToLocalEnabled = z;
            }
            return this;
        }

        public MediaRouterParams build() {
            return new MediaRouterParams(this);
        }
    }
}
