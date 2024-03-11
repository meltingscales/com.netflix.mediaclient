package o;

import com.netflix.msl.io.MslEncoderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.dkc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8398dkc {
    private final List<Object> b = new ArrayList();

    public C8398dkc() {
    }

    public C8398dkc(Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                b(-1, obj);
            }
        }
    }

    public C8398dkc(Collection<?> collection) {
        if (collection != null) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                b(-1, it.next());
            }
        }
    }

    public Object a(int i) {
        if (i < 0 || i >= this.b.size()) {
            throw new ArrayIndexOutOfBoundsException("MslArray[" + i + "] is negative or exceeds array length.");
        }
        Object obj = this.b.get(i);
        if (obj == null) {
            throw new MslEncoderException("MslArray[" + i + "] is null.");
        } else if (obj instanceof Map) {
            return new C8401dkf((Map) obj);
        } else {
            if (obj instanceof Collection) {
                return new C8398dkc((Collection) obj);
            }
            return obj instanceof Object[] ? new C8398dkc((Object[]) obj) : obj;
        }
    }

    public byte[] e(int i) {
        Object a = a(i);
        if (a instanceof byte[]) {
            return (byte[]) a;
        }
        if (a instanceof C8407dkl) {
            return ((C8407dkl) a).d();
        }
        throw new MslEncoderException("MslArray[" + i + "] is not binary data.");
    }

    public C8401dkf a(int i, AbstractC8399dkd abstractC8399dkd) {
        Object a = a(i);
        if (a instanceof C8401dkf) {
            return (C8401dkf) a;
        }
        if (a instanceof Map) {
            return new C8401dkf((Map) a);
        }
        if (a instanceof byte[]) {
            try {
                return abstractC8399dkd.c((byte[]) a);
            } catch (MslEncoderException e) {
                throw new MslEncoderException("MslObject[" + i + "] is not a MslObject.", e);
            }
        }
        throw new MslEncoderException("MslArray[" + i + "] is not a MslObject.");
    }

    public String d(int i) {
        Object a = a(i);
        if (a instanceof String) {
            return (String) a;
        }
        if (a instanceof C8407dkl) {
            return ((C8407dkl) a).c();
        }
        throw new MslEncoderException("MslArray[" + i + "] is not a string.");
    }

    public int b() {
        return this.b.size();
    }

    public Object b(int i) {
        if (i < 0 || i >= this.b.size()) {
            throw new ArrayIndexOutOfBoundsException("MslArray[" + i + "] is negative or exceeds array length.");
        }
        Object obj = this.b.get(i);
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

    public byte[] d(int i, byte[] bArr) {
        Object b = b(i);
        if (b instanceof byte[]) {
            return (byte[]) b;
        }
        if (b instanceof C8407dkl) {
            try {
                return ((C8407dkl) b).d();
            } catch (MslEncoderException unused) {
            }
        }
        return bArr;
    }

    public C8398dkc b(int i, Object obj) {
        Object c8398dkc;
        if (i < -1) {
            throw new ArrayIndexOutOfBoundsException("MslArray[" + i + "] is negative.");
        }
        if (!(obj instanceof Boolean) && !(obj instanceof byte[]) && !(obj instanceof Number) && !(obj instanceof C8401dkf) && !(obj instanceof C8398dkc) && !(obj instanceof String) && !(obj instanceof InterfaceC8400dke) && !(obj instanceof C8407dkl)) {
            if (obj instanceof Map) {
                c8398dkc = new C8401dkf((Map) obj);
            } else if (obj instanceof Collection) {
                c8398dkc = new C8398dkc((Collection) obj);
            } else if (obj instanceof Object[]) {
                c8398dkc = new C8398dkc((Object[]) obj);
            } else if (obj instanceof Enum) {
                obj = ((Enum) obj).name();
            } else if (obj != null) {
                throw new IllegalArgumentException("Value [" + obj.getClass() + "] is an unsupported type.");
            } else {
                obj = null;
            }
            obj = c8398dkc;
        }
        for (int size = this.b.size(); size < i; size++) {
            this.b.add(null);
        }
        if (i == -1 || i == this.b.size()) {
            this.b.add(obj);
            return this;
        }
        this.b.set(i, obj);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8398dkc) {
            try {
                return C8403dkh.a(this, (C8398dkc) obj);
            } catch (MslEncoderException unused) {
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return C8403dkh.d(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.b.size();
        sb.append('[');
        int i = 0;
        if (size == 1) {
            sb.append(AbstractC8399dkd.d(this.b.get(0)));
        } else if (size != 0) {
            boolean z = false;
            while (i < size) {
                if (z) {
                    sb.append(',');
                }
                sb.append(AbstractC8399dkd.d(this.b.get(i)));
                i++;
                z = true;
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
