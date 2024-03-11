package org.bouncycastle.jcajce.util;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;

/* loaded from: classes6.dex */
public interface JcaJceHelper {
    AlgorithmParameters createAlgorithmParameters(String str);

    KeyFactory createKeyFactory(String str);
}
