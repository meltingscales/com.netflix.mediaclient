package kotlin.jvm.internal;

import java.io.Serializable;
import o.C8632dsu;
import o.InterfaceC8633dsv;
import o.dsA;

/* loaded from: classes5.dex */
public class AdaptedFunctionReference implements InterfaceC8633dsv, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private final String signature;

    @Override // o.InterfaceC8633dsv
    public int getArity() {
        return this.arity;
    }

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdaptedFunctionReference) {
            AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
            return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && C8632dsu.c(this.receiver, adaptedFunctionReference.receiver) && C8632dsu.c(this.owner, adaptedFunctionReference.owner) && this.name.equals(adaptedFunctionReference.name) && this.signature.equals(adaptedFunctionReference.signature);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Class cls = this.owner;
        int hashCode2 = cls != null ? cls.hashCode() : 0;
        int hashCode3 = this.name.hashCode();
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return dsA.d(this);
    }
}
