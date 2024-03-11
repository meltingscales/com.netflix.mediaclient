package com.fasterxml.jackson.core;

import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import o.C9392oi;

/* loaded from: classes2.dex */
public abstract class TokenStreamFactory implements Serializable {
    private static final long serialVersionUID = 2;

    /* JADX INFO: Access modifiers changed from: protected */
    public OutputStream b(DataOutput dataOutput) {
        return new C9392oi(dataOutput);
    }

    public InputStream a(URL url) {
        String host;
        if ("file".equals(url.getProtocol()) && (((host = url.getHost()) == null || host.length() == 0) && url.getPath().indexOf(37) < 0)) {
            return new FileInputStream(url.getPath());
        }
        return url.openStream();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InputStream b(File file) {
        return new FileInputStream(file);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public OutputStream e(File file) {
        return new FileOutputStream(file);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            b("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            b(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(char[] cArr, int i, int i2) {
        if (cArr == null) {
            b("Invalid `char[]` argument: `null`");
        }
        int length = cArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            b(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    protected <T> T b(String str) {
        throw new IllegalArgumentException(str);
    }
}
