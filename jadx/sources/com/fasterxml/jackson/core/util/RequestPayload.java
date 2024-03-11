package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RequestPayload implements Serializable {
    private static final long serialVersionUID = 1;
    protected String c;
    protected CharSequence d;
    protected byte[] e;

    public String toString() {
        byte[] bArr = this.e;
        if (bArr != null) {
            try {
                return new String(bArr, this.c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.d.toString();
    }
}
