package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;

/* renamed from: o.rM  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9529rM {
    protected boolean a = false;
    public Object b;
    public final ObjectIdGenerator<?> e;

    public C9529rM(ObjectIdGenerator<?> objectIdGenerator) {
        this.e = objectIdGenerator;
    }

    public boolean a(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, C9520rD c9520rD) {
        if (this.b != null) {
            if (this.a || c9520rD.a) {
                if (jsonGenerator.c()) {
                    jsonGenerator.f(String.valueOf(this.b));
                    return true;
                }
                c9520rD.d.e(this.b, jsonGenerator, abstractC9459pw);
                return true;
            }
            return false;
        }
        return false;
    }

    public Object e(Object obj) {
        if (this.b == null) {
            this.b = this.e.c(obj);
        }
        return this.b;
    }

    public void b(JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, C9520rD c9520rD) {
        this.a = true;
        if (jsonGenerator.c()) {
            Object obj = this.b;
            jsonGenerator.b((Object) (obj == null ? null : String.valueOf(obj)));
            return;
        }
        InterfaceC9327nW interfaceC9327nW = c9520rD.b;
        if (interfaceC9327nW != null) {
            jsonGenerator.d(interfaceC9327nW);
            c9520rD.d.e(this.b, jsonGenerator, abstractC9459pw);
        }
    }
}
