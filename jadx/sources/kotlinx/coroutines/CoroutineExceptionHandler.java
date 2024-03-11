package kotlinx.coroutines;

import o.dqZ;

/* loaded from: classes5.dex */
public interface CoroutineExceptionHandler extends dqZ.b {
    public static final c Key = c.d;

    void handleException(dqZ dqz, Throwable th);

    /* loaded from: classes5.dex */
    public static final class c implements dqZ.d<CoroutineExceptionHandler> {
        static final /* synthetic */ c d = new c();

        private c() {
        }
    }
}
