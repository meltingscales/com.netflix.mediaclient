package com.netflix.cl.model.context;

import com.netflix.cl.Platform;
import com.netflix.cl.model.ContextType;
import com.netflix.cl.util.CLUtils;

/* loaded from: classes.dex */
public abstract class CLContext extends ContextType {
    public void prepareForSending() {
        if (this.id != 0) {
            Platform.ErrorReporter errorReporter = Platform.getErrorReporter();
            errorReporter.logHandledException("Event used before: " + getClass().getSimpleName());
            if (Platform.getLocalLogger().isDebug()) {
                throw new IllegalStateException("This should NOT happen! Event used before: " + getClass().getSimpleName());
            }
        }
        this.id = CLUtils.createContextId();
    }
}
