package o;

import com.fasterxml.jackson.core.JsonGenerator;

/* renamed from: o.rX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9540rX implements InterfaceC9451po {
    protected Object c;

    public C9540rX(String str) {
        this.c = str;
    }

    @Override // o.InterfaceC9451po
    public void a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object obj = this.c;
        if (obj instanceof InterfaceC9451po) {
            ((InterfaceC9451po) obj).a(jsonGenerator, abstractC9459pw);
        } else {
            c(jsonGenerator);
        }
    }

    @Override // o.InterfaceC9451po
    public void b(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        Object obj = this.c;
        if (obj instanceof InterfaceC9451po) {
            ((InterfaceC9451po) obj).b(jsonGenerator, abstractC9459pw, abstractC9544rb);
        } else if (obj instanceof InterfaceC9327nW) {
            a(jsonGenerator, abstractC9459pw);
        }
    }

    public void b(JsonGenerator jsonGenerator) {
        Object obj = this.c;
        if (obj instanceof InterfaceC9451po) {
            jsonGenerator.a(obj);
        } else {
            c(jsonGenerator);
        }
    }

    protected void c(JsonGenerator jsonGenerator) {
        Object obj = this.c;
        if (obj instanceof InterfaceC9327nW) {
            jsonGenerator.c((InterfaceC9327nW) obj);
        } else {
            jsonGenerator.g(String.valueOf(obj));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9540rX) {
            Object obj2 = this.c;
            Object obj3 = ((C9540rX) obj).c;
            if (obj2 == obj3) {
                return true;
            }
            return obj2 != null && obj2.equals(obj3);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return String.format("[RawValue of type %s]", C9537rU.d(this.c));
    }
}
