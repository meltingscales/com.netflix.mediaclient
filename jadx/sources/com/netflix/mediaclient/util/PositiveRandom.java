package com.netflix.mediaclient.util;

import java.util.Random;

/* loaded from: classes5.dex */
public class PositiveRandom extends Random {
    public int e() {
        return next(31);
    }
}
