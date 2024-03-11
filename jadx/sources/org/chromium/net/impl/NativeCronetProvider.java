package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import org.chromium.build.annotations.UsedByReflection;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes5.dex */
public class NativeCronetProvider extends CronetProvider {
    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return CronetProvider.PROVIDER_NAME_APP_PACKAGED;
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return true;
    }

    @UsedByReflection
    public NativeCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        return new ExperimentalCronetEngine.Builder(new NativeCronetEngineBuilderWithLibraryLoaderImpl(this.mContext));
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext));
    }
}
