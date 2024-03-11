package com.google.common.hash;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public interface Hasher {
    HashCode hash();

    Hasher putByte(byte b);

    Hasher putString(CharSequence charSequence, Charset charset);
}
