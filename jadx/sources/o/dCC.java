package o;

import kotlin.jvm.internal.Ref;
import kotlinx.serialization.SerializationException;
import o.InterfaceC7717dCt;

/* loaded from: classes5.dex */
public abstract class dCC<T> implements dBT<T> {
    public abstract InterfaceC8660dtv<T> d();

    @Override // o.dBZ
    public final void e(InterfaceC7721dCx interfaceC7721dCx, T t) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) t, "");
        dBZ<? super T> c = dBW.c(this, interfaceC7721dCx, t);
        InterfaceC7707dCj e = e();
        InterfaceC7719dCv e2 = interfaceC7721dCx.e(e);
        e2.c(e(), 0, c.e().d());
        InterfaceC7707dCj e3 = e();
        C8632dsu.d(c);
        e2.b(e3, 1, c, t);
        e2.d(e);
    }

    @Override // o.dBP
    public final T b(InterfaceC7720dCw interfaceC7720dCw) {
        T t;
        C8632dsu.c((Object) interfaceC7720dCw, "");
        InterfaceC7707dCj e = e();
        InterfaceC7717dCt c = interfaceC7720dCw.c(e);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (c.h()) {
            t = (T) c(c);
        } else {
            t = null;
            while (true) {
                int h = c.h(e());
                if (h != -1) {
                    if (h == 0) {
                        objectRef.d = (T) c.h(e(), h);
                    } else if (h != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) objectRef.d;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(h);
                        throw new SerializationException(sb.toString());
                    } else {
                        T t2 = objectRef.d;
                        if (t2 == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                        objectRef.d = t2;
                        t = (T) InterfaceC7717dCt.d.d(c, e(), h, dBW.a(this, c, (String) t2), null, 8, null);
                    }
                } else if (t != null) {
                    C8632dsu.d(t);
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.d)).toString());
                }
            }
        }
        c.e(e);
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T c(InterfaceC7717dCt interfaceC7717dCt) {
        return (T) InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), 1, dBW.a(this, interfaceC7717dCt, interfaceC7717dCt.h(e(), 0)), null, 8, null);
    }

    public dBP<T> d(InterfaceC7717dCt interfaceC7717dCt, String str) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        return interfaceC7717dCt.n().a((InterfaceC8660dtv) d(), str);
    }

    public dBZ<T> d(InterfaceC7721dCx interfaceC7721dCx, T t) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) t, "");
        return interfaceC7721dCx.c().a((InterfaceC8660dtv<? super InterfaceC8660dtv<T>>) d(), (InterfaceC8660dtv<T>) t);
    }
}
