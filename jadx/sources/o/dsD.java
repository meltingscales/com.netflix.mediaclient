package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class dsD {
    private final ArrayList<Object> b;

    public dsD(int i) {
        this.b = new ArrayList<>(i);
    }

    public void d(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.b;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.b, objArr);
            }
        } else if (obj instanceof Collection) {
            this.b.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.b.add(obj2);
            }
        } else if (!(obj instanceof Iterator)) {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        } else {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.b.add(it.next());
            }
        }
    }

    public int c() {
        return this.b.size();
    }

    public void e(Object obj) {
        this.b.add(obj);
    }

    public Object[] b(Object[] objArr) {
        return this.b.toArray(objArr);
    }
}
