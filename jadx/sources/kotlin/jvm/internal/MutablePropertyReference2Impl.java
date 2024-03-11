package kotlin.jvm.internal;

/* loaded from: classes6.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override // o.dtK
    public Object c(Object obj, Object obj2) {
        return e().call(obj, obj2);
    }
}
