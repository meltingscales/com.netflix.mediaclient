package com.google.common.hash;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
abstract class AbstractHashFunction implements HashFunction {
    @Override // com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return newHasher().putString(charSequence, charset).hash();
    }
}
