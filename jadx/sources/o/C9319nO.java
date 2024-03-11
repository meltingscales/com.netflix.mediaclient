package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.nO  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9319nO implements InterfaceC9317nM {
    protected Map<ObjectIdGenerator.IdKey, Object> b;

    @Override // o.InterfaceC9317nM
    public void b(ObjectIdGenerator.IdKey idKey, Object obj) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.b;
        if (map == null) {
            this.b = new HashMap();
        } else if (map.containsKey(idKey)) {
            throw new IllegalStateException("Already had POJO for id (" + idKey.a.getClass().getName() + ") [" + idKey + "]");
        }
        this.b.put(idKey, obj);
    }

    @Override // o.InterfaceC9317nM
    public Object b(ObjectIdGenerator.IdKey idKey) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.b;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }

    @Override // o.InterfaceC9317nM
    public boolean e(InterfaceC9317nM interfaceC9317nM) {
        return interfaceC9317nM.getClass() == getClass();
    }

    @Override // o.InterfaceC9317nM
    public InterfaceC9317nM c(Object obj) {
        return new C9319nO();
    }
}
