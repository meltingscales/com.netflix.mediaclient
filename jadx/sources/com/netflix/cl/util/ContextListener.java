package com.netflix.cl.util;

import com.netflix.cl.model.context.CLContext;

/* loaded from: classes.dex */
public interface ContextListener {
    void onAddContext(CLContext cLContext);

    void onRemoveContext(Long l);
}
