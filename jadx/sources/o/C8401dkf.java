package o;

import com.netflix.msl.io.MslEncoderException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.dkf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8401dkf {
    private final Map<String, Object> b = new HashMap();

    public C8401dkf() {
    }

    public C8401dkf(Map<?, ?> map) {
        if (map != null) {
            for (Object obj : map.keySet()) {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Map key is not a string.");
                }
                e((String) obj, map.get(obj));
            }
        }
    }

    public Object d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null key.");
        }
        Object obj = this.b.get(str);
        if (obj == null) {
            throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] not found.");
        } else if (obj instanceof Map) {
            return new C8401dkf((Map) obj);
        } else {
            if (obj instanceof Collection) {
                return new C8398dkc((Collection) obj);
            }
            return obj instanceof Object[] ? new C8398dkc((Object[]) obj) : obj;
        }
    }

    public boolean a(String str) {
        Object d = d(str);
        if (d instanceof Boolean) {
            return ((Boolean) d).booleanValue();
        }
        throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] is not a boolean.");
    }

    public byte[] e(String str) {
        Object d = d(str);
        if (d instanceof byte[]) {
            return (byte[]) d;
        }
        if (d instanceof C8407dkl) {
            return ((C8407dkl) d).d();
        }
        throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] is not binary data.");
    }

    public int c(String str) {
        Object d = d(str);
        if (d instanceof Number) {
            return ((Number) d).intValue();
        }
        throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] is not a number.");
    }

    public C8398dkc j(String str) {
        Object d = d(str);
        if (d instanceof C8398dkc) {
            return (C8398dkc) d;
        }
        if (d instanceof Object[]) {
            return new C8398dkc((Object[]) d);
        }
        throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] is not a MslArray.");
    }

    public C8401dkf b(String str, AbstractC8399dkd abstractC8399dkd) {
        Object d = d(str);
        if (d instanceof C8401dkf) {
            return (C8401dkf) d;
        }
        if (d instanceof Map) {
            return new C8401dkf((Map) d);
        }
        if (d instanceof byte[]) {
            try {
                return abstractC8399dkd.c((byte[]) d);
            } catch (MslEncoderException unused) {
                throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] is not a MslObject.");
            }
        }
        throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] is not a MslObject.");
    }

    public long b(String str) {
        Object d = d(str);
        if (d instanceof Number) {
            return ((Number) d).longValue();
        }
        throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] is not a number.");
    }

    public String g(String str) {
        Object d = d(str);
        if (d instanceof String) {
            return (String) d;
        }
        if (d instanceof C8407dkl) {
            return ((C8407dkl) d).c();
        }
        throw new MslEncoderException("MslObject[" + AbstractC8399dkd.a(str) + "] is not a string.");
    }

    public boolean h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null key.");
        }
        return this.b.containsKey(str);
    }

    public Object f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null key.");
        }
        Object obj = this.b.get(str);
        try {
            if (obj instanceof Map) {
                return new C8401dkf((Map) obj);
            }
            if (obj instanceof Collection) {
                return new C8398dkc((Collection) obj);
            }
            return obj instanceof Object[] ? new C8398dkc((Object[]) obj) : obj;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public byte[] e(String str, byte[] bArr) {
        Object f = f(str);
        if (f instanceof byte[]) {
            return (byte[]) f;
        }
        if (f instanceof C8407dkl) {
            try {
                return ((C8407dkl) f).d();
            } catch (MslEncoderException unused) {
            }
        }
        return bArr;
    }

    public int b(String str, int i) {
        Object f = f(str);
        return f instanceof Number ? ((Number) f).intValue() : i;
    }

    public C8398dkc i(String str) {
        Object f = f(str);
        if (f instanceof C8398dkc) {
            return (C8398dkc) f;
        }
        try {
            if (f instanceof Collection) {
                return new C8398dkc((Collection) f);
            }
            if (f instanceof Object[]) {
                return new C8398dkc((Object[]) f);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String b(String str, String str2) {
        Object f = f(str);
        if (f instanceof String) {
            return (String) f;
        }
        return f instanceof C8407dkl ? ((C8407dkl) f).c() : str2;
    }

    public C8401dkf e(String str, Object obj) {
        if (str != null) {
            if (obj == null) {
                this.b.remove(str);
                return this;
            }
            if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Number) || (obj instanceof C8401dkf) || (obj instanceof C8398dkc) || (obj instanceof String) || (obj instanceof InterfaceC8400dke) || (obj instanceof C8407dkl)) {
                this.b.put(str, obj);
            } else if (obj instanceof Map) {
                this.b.put(str, new C8401dkf((Map) obj));
            } else if (obj instanceof Collection) {
                this.b.put(str, new C8398dkc((Collection) obj));
            } else if (obj instanceof Object[]) {
                this.b.put(str, new C8398dkc((Object[]) obj));
            } else if (obj instanceof Enum) {
                this.b.put(str, ((Enum) obj).name());
            } else {
                throw new IllegalArgumentException("Value [" + obj.getClass() + "] is an unsupported type.");
            }
            return this;
        }
        throw new IllegalArgumentException("Null key.");
    }

    public Set<String> d() {
        return Collections.unmodifiableSet(this.b.keySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8401dkf) {
            try {
                return C8403dkh.e(this, (C8401dkf) obj);
            } catch (MslEncoderException unused) {
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return C8403dkh.a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.b.size();
        Iterator<String> it = this.b.keySet().iterator();
        sb.append('{');
        if (size == 1) {
            String next = it.next();
            sb.append(AbstractC8399dkd.a(next));
            sb.append(':');
            sb.append(AbstractC8399dkd.d(this.b.get(next)));
        } else if (size != 0) {
            boolean z = false;
            while (it.hasNext()) {
                String next2 = it.next();
                if (z) {
                    sb.append(',');
                }
                sb.append(AbstractC8399dkd.a(next2));
                sb.append(':');
                sb.append(AbstractC8399dkd.d(this.b.get(next2)));
                z = true;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
