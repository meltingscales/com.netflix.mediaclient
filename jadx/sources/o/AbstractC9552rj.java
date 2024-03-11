package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* renamed from: o.rj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9552rj implements InterfaceC9545rc {
    protected final TypeFactory c;
    protected final JavaType d;

    @Override // o.InterfaceC9545rc
    public String a() {
        return null;
    }

    @Override // o.InterfaceC9545rc
    public void e(JavaType javaType) {
    }

    protected AbstractC9552rj() {
        this(null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9552rj(JavaType javaType, TypeFactory typeFactory) {
        this.d = javaType;
        this.c = typeFactory;
    }

    @Override // o.InterfaceC9545rc
    public String c() {
        return e((Object) null, this.d.h());
    }

    @Override // o.InterfaceC9545rc
    public JavaType e(AbstractC9446pj abstractC9446pj, String str) {
        throw new IllegalStateException("Sub-class " + getClass().getName() + " MUST implement `typeFromId(DatabindContext,String)");
    }
}
