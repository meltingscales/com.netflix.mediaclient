package o;

import java.io.Closeable;
import o.AbstractC8766dxt;
import o.dqZ;

/* renamed from: o.dxt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8766dxt extends dwQ implements Closeable {
    public static final c a = new c(null);

    public abstract void close();

    /* renamed from: o.dxt$c */
    /* loaded from: classes5.dex */
    public static final class c extends dqX<dwQ, AbstractC8766dxt> {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super(dwQ.Key, new drM<dqZ.b, AbstractC8766dxt>() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1
                @Override // o.drM
                /* renamed from: d */
                public final AbstractC8766dxt invoke(dqZ.b bVar) {
                    if (bVar instanceof AbstractC8766dxt) {
                        return (AbstractC8766dxt) bVar;
                    }
                    return null;
                }
            });
        }
    }
}
