package org.chromium.net.impl;

import android.content.Context;
import org.chromium.net.CronetEngine;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes5.dex */
public class NativeCronetEngineBuilderWithLibraryLoaderImpl extends NativeCronetEngineBuilderImpl {
    private VersionSafeCallbacks.LibraryLoader mLibraryLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.chromium.net.impl.CronetEngineBuilderImpl
    public VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return this.mLibraryLoader;
    }

    public NativeCronetEngineBuilderWithLibraryLoaderImpl(Context context) {
        super(context);
    }

    @Override // org.chromium.net.impl.NativeCronetEngineBuilderImpl, org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.mLibraryLoader = new VersionSafeCallbacks.LibraryLoader(libraryLoader);
        return this;
    }
}
