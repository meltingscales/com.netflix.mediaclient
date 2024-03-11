package o;

import android.content.Context;

/* renamed from: o.aSq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC1906aSq implements Runnable {
    protected Context a;

    public AbstractRunnableC1906aSq(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Owner activity can not be null!");
        }
        this.a = context;
    }
}
