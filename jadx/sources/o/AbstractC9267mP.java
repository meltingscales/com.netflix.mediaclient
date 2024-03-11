package o;

import com.bugsnag.android.internal.TaskType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* renamed from: o.mP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9267mP {
    private final List<InterfaceC8554dpx<?>> e = new ArrayList();

    public final <T> InterfaceC8554dpx<T> e(final drO<? extends T> dro) {
        InterfaceC8554dpx<T> b;
        b = dpB.b(new drO<T>() { // from class: com.bugsnag.android.internal.dag.DependencyModule$future$lazy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public final T invoke() {
                return dro.invoke();
            }
        });
        this.e.add(b);
        return b;
    }

    public final void a(C9301mx c9301mx, TaskType taskType) {
        try {
            Result.c cVar = Result.e;
            Result.e(c9301mx.e(taskType, new Runnable() { // from class: o.mW
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC9267mP.c(AbstractC9267mP.this);
                }
            }).get());
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            Result.e(C8556dpz.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC9267mP abstractC9267mP) {
        Iterator<T> it = abstractC9267mP.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC8554dpx) it.next()).getValue();
        }
    }
}
