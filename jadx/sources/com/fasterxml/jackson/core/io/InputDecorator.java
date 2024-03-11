package com.fasterxml.jackson.core.io;

import java.io.DataInput;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import o.C9389of;

/* loaded from: classes2.dex */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract InputStream a(C9389of c9389of, byte[] bArr, int i, int i2);

    public abstract Reader a(C9389of c9389of, Reader reader);

    public abstract InputStream e(C9389of c9389of, InputStream inputStream);

    public DataInput e(C9389of c9389of, DataInput dataInput) {
        throw new UnsupportedOperationException();
    }
}
