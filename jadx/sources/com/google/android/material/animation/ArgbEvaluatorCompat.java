package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & PrivateKeyType.INVALID) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow((intValue2 & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        return Integer.valueOf((Math.round((f2 + (((((intValue2 >> 24) & PrivateKeyType.INVALID) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow + ((pow4 - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(pow2 + ((((float) Math.pow(((intValue2 >> 8) & PrivateKeyType.INVALID) / 255.0f, 2.2d)) - pow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + ((pow5 - pow3) * f), 0.45454545454545453d)) * 255.0f));
    }
}
