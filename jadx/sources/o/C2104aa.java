package o;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.PoolReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.aa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2104aa {
    private final ArrayList<PoolReference> e = new ArrayList<>(5);

    public final PoolReference d(Context context, drO<? extends RecyclerView.RecycledViewPool> dro) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dro, "");
        Iterator<PoolReference> it = this.e.iterator();
        C8632dsu.a(it, "");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            C8632dsu.a(next, "");
            PoolReference poolReference2 = next;
            if (poolReference2.d() == context) {
                if (poolReference != null) {
                    throw new IllegalStateException("A pool was already found");
                }
                poolReference = poolReference2;
            } else if (C2163ab.b(poolReference2.d())) {
                poolReference2.e().clear();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, dro.invoke(), this);
            Lifecycle c = c(context);
            if (c != null) {
                c.addObserver(poolReference);
            }
            this.e.add(poolReference);
        }
        return poolReference;
    }

    public final void a(PoolReference poolReference) {
        C8632dsu.c((Object) poolReference, "");
        if (C2163ab.b(poolReference.d())) {
            poolReference.e().clear();
            this.e.remove(poolReference);
        }
    }

    private final Lifecycle c(Context context) {
        if (context instanceof LifecycleOwner) {
            return ((LifecycleOwner) context).getLifecycle();
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            C8632dsu.a(baseContext, "");
            return c(baseContext);
        }
        return null;
    }
}
