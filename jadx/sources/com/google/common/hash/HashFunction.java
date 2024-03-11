package com.google.common.hash;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public interface HashFunction {
    HashCode hashString(CharSequence charSequence, Charset charset);

    Hasher newHasher();
}
