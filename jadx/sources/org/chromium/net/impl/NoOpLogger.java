package org.chromium.net.impl;

import org.chromium.net.impl.CronetLogger;

/* loaded from: classes5.dex */
public final class NoOpLogger extends CronetLogger {
    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetEngineCreation(int i, CronetLogger.CronetEngineBuilderInfo cronetEngineBuilderInfo, CronetLogger.CronetVersion cronetVersion, CronetLogger.CronetSource cronetSource) {
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetTrafficInfo(int i, CronetLogger.CronetTrafficInfo cronetTrafficInfo) {
    }
}
