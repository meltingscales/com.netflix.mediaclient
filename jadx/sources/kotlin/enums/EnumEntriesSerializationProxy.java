package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final a d = new a(null);
    private static final long serialVersionUID = 0;
    private final Class<E> e;

    public EnumEntriesSerializationProxy(E[] eArr) {
        C8632dsu.c((Object) eArr, "");
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        C8632dsu.d(cls);
        this.e = cls;
    }

    /* loaded from: classes6.dex */
    static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    private final Object readResolve() {
        E[] enumConstants = this.e.getEnumConstants();
        C8632dsu.a(enumConstants, "");
        return C8600drp.e(enumConstants);
    }
}
