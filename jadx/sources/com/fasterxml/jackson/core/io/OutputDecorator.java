package com.fasterxml.jackson.core.io;

import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import o.C9389of;

/* loaded from: classes2.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream a(C9389of c9389of, OutputStream outputStream);

    public abstract Writer b(C9389of c9389of, Writer writer);
}
