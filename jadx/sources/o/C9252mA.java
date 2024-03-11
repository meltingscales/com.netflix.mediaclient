package o;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.Map;
import o.C9277mZ;

/* renamed from: o.mA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9252mA implements C9277mZ.b<Map<String, Object>> {
    private final byte[] a;

    public C9252mA() {
        byte[] bytes = "\"[OBJECT]\"".getBytes(C8674dui.i);
        C8632dsu.a(bytes, "");
        this.a = bytes;
    }

    @Override // o.C9277mZ.b
    public void e(Object obj, OutputStream outputStream) {
        outputStream.write(this.a);
    }

    @Override // o.C9277mZ.b
    public Object a(Map<String, Object> map, Type type, InputStream inputStream) {
        throw new UnsupportedOperationException();
    }
}
