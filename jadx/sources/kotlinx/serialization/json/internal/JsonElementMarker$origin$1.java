package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C7798dFt;
import o.C8632dsu;
import o.InterfaceC7707dCj;
import o.drX;

/* loaded from: classes5.dex */
public final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements drX<InterfaceC7707dCj, Integer, Boolean> {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, C7798dFt.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean b(InterfaceC7707dCj interfaceC7707dCj, int i) {
        boolean d;
        C8632dsu.c((Object) interfaceC7707dCj, "");
        d = ((C7798dFt) this.receiver).d(interfaceC7707dCj, i);
        return Boolean.valueOf(d);
    }

    @Override // o.drX
    public /* synthetic */ Boolean invoke(InterfaceC7707dCj interfaceC7707dCj, Integer num) {
        return b(interfaceC7707dCj, num.intValue());
    }
}
