package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C9246lv;

/* renamed from: o.ma  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9278ma implements C9246lv.a {
    public static final d d = new d(null);
    private final List<C9279mb> b;

    public final List<C9279mb> e() {
        return this.b;
    }

    /* renamed from: o.ma$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final Boolean a(String str, Collection<String> collection) {
            boolean i;
            Collection<String> collection2 = collection;
            if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                return null;
            }
            for (String str2 : collection2) {
                i = C8691duz.i(str, str2, false, 2, null);
                if (i) {
                    return Boolean.TRUE;
                }
            }
            return null;
        }
    }

    public C9278ma(List<C9279mb> list) {
        this.b = d(list);
    }

    public C9278ma(StackTraceElement[] stackTraceElementArr, Collection<String> collection, InterfaceC9200lB interfaceC9200lB) {
        StackTraceElement[] d2 = d(stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : d2) {
            C9279mb b = b(stackTraceElement, collection, interfaceC9200lB);
            if (b != null) {
                arrayList.add(b);
            }
        }
        this.b = arrayList;
    }

    private final StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        C8654dtp g;
        Object[] d2;
        if (stackTraceElementArr.length >= 200) {
            g = C8657dts.g(0, 200);
            d2 = C8563dqf.d(stackTraceElementArr, g);
            return (StackTraceElement[]) d2;
        }
        return stackTraceElementArr;
    }

    private final List<C9279mb> d(List<C9279mb> list) {
        return list.size() >= 200 ? list.subList(0, 200) : list;
    }

    private final C9279mb b(StackTraceElement stackTraceElement, Collection<String> collection, InterfaceC9200lB interfaceC9200lB) {
        String methodName;
        try {
            String className = stackTraceElement.getClassName();
            if (className.length() > 0) {
                methodName = className + '.' + ((Object) stackTraceElement.getMethodName());
            } else {
                methodName = stackTraceElement.getMethodName();
            }
            String str = methodName;
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "Unknown";
            }
            return new C9279mb(str, fileName, Integer.valueOf(stackTraceElement.getLineNumber()), d.a(className, collection), null, null, 48, null);
        } catch (Exception e) {
            interfaceC9200lB.e("Failed to serialize stacktrace", e);
            return null;
        }
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.c();
        for (C9279mb c9279mb : this.b) {
            c9246lv.c(c9279mb);
        }
        c9246lv.b();
    }
}
