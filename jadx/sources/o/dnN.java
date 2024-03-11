package o;

import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.dnD;

/* loaded from: classes5.dex */
public final class dnN {
    static final List<dnD.b> b;
    private final int c;
    private final List<dnD.b> d;
    private final ThreadLocal<a> e = new ThreadLocal<>();
    private final Map<Object, dnD<?>> a = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        b = arrayList;
        arrayList.add(dnP.d);
        arrayList.add(dnA.e);
        arrayList.add(dnJ.a);
        arrayList.add(C8500dnx.c);
        arrayList.add(dnR.a);
        arrayList.add(dnC.e);
    }

    dnN(e eVar) {
        int size = eVar.e.size();
        List<dnD.b> list = b;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(eVar.e);
        arrayList.addAll(list);
        this.d = Collections.unmodifiableList(arrayList);
        this.c = eVar.c;
    }

    public <T> dnD<T> b(Type type) {
        return e(type, dnT.c);
    }

    public <T> dnD<T> b(Class<T> cls) {
        return e(cls, dnT.c);
    }

    public <T> dnD<T> e(Type type, Set<? extends Annotation> set) {
        return e(type, set, null);
    }

    public <T> dnD<T> e(Type type, Set<? extends Annotation> set, String str) {
        if (type != null) {
            if (set == null) {
                throw new NullPointerException("annotations == null");
            }
            Type c = dnT.c(dnT.b(type));
            Object b2 = b(c, set);
            synchronized (this.a) {
                dnD<T> dnd = (dnD<T>) this.a.get(b2);
                if (dnd != null) {
                    return dnd;
                }
                a aVar = this.e.get();
                if (aVar == null) {
                    aVar = new a();
                    this.e.set(aVar);
                }
                dnD<T> c2 = aVar.c(c, str, b2);
                try {
                    if (c2 != null) {
                        return c2;
                    }
                    try {
                        int size = this.d.size();
                        for (int i = 0; i < size; i++) {
                            dnD<T> dnd2 = (dnD<T>) this.d.get(i).a(c, set, this);
                            if (dnd2 != null) {
                                aVar.a(dnd2);
                                aVar.a(true);
                                return dnd2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + dnT.d(c, set));
                    } catch (IllegalArgumentException e2) {
                        throw aVar.d(e2);
                    }
                } finally {
                    aVar.a(false);
                }
            }
        }
        throw new NullPointerException("type == null");
    }

    public <T> dnD<T> b(dnD.b bVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type c = dnT.c(dnT.b(type));
        int indexOf = this.d.indexOf(bVar);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + bVar);
        }
        int size = this.d.size();
        for (int i = indexOf + 1; i < size; i++) {
            dnD<T> dnd = (dnD<T>) this.d.get(i).a(c, set, this);
            if (dnd != null) {
                return dnd;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + dnT.d(c, set));
    }

    private Object b(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    /* loaded from: classes5.dex */
    public static final class e {
        final List<dnD.b> e = new ArrayList();
        int c = 0;

        public e c(dnD.b bVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<dnD.b> list = this.e;
            int i = this.c;
            this.c = i + 1;
            list.add(i, bVar);
            return this;
        }

        public e b(Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("adapter == null");
            }
            return c(C8497dnu.d(obj));
        }

        public dnN d() {
            return new dnN(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a {
        boolean e;
        final List<d<?>> d = new ArrayList();
        final Deque<d<?>> c = new ArrayDeque();

        a() {
        }

        <T> dnD<T> c(Type type, String str, Object obj) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                d<?> dVar = this.d.get(i);
                if (dVar.a.equals(obj)) {
                    this.c.add(dVar);
                    dnD<T> dnd = (dnD<T>) dVar.b;
                    return dnd != null ? dnd : dVar;
                }
            }
            d<?> dVar2 = new d<>(type, str, obj);
            this.d.add(dVar2);
            this.c.add(dVar2);
            return null;
        }

        <T> void a(dnD<T> dnd) {
            this.c.getLast().b = dnd;
        }

        void a(boolean z) {
            this.c.removeLast();
            if (this.c.isEmpty()) {
                dnN.this.e.remove();
                if (z) {
                    synchronized (dnN.this.a) {
                        int size = this.d.size();
                        for (int i = 0; i < size; i++) {
                            d<?> dVar = this.d.get(i);
                            dnD<T> dnd = (dnD) dnN.this.a.put(dVar.a, dVar.b);
                            if (dnd != 0) {
                                dVar.b = dnd;
                                dnN.this.a.put(dVar.a, dnd);
                            }
                        }
                    }
                }
            }
        }

        IllegalArgumentException d(IllegalArgumentException illegalArgumentException) {
            if (this.e) {
                return illegalArgumentException;
            }
            this.e = true;
            if (this.c.size() == 1 && this.c.getFirst().d == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<d<?>> descendingIterator = this.c.descendingIterator();
            while (descendingIterator.hasNext()) {
                d<?> next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.c);
                if (next.d != null) {
                    sb.append(' ');
                    sb.append(next.d);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d<T> extends dnD<T> {
        final Object a;
        dnD<T> b;
        final Type c;
        final String d;

        d(Type type, String str, Object obj) {
            this.c = type;
            this.d = str;
            this.a = obj;
        }

        @Override // o.dnD
        public T d(JsonReader jsonReader) {
            dnD<T> dnd = this.b;
            if (dnd == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            return dnd.d(jsonReader);
        }

        @Override // o.dnD
        public void b(dnK dnk, T t) {
            dnD<T> dnd = this.b;
            if (dnd == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            dnd.b(dnk, (dnK) t);
        }

        public String toString() {
            dnD<T> dnd = this.b;
            return dnd != null ? dnd.toString() : super.toString();
        }
    }
}
