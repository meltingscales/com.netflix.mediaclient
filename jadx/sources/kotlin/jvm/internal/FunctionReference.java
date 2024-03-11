package kotlin.jvm.internal;

import o.C8632dsu;
import o.InterfaceC8633dsv;
import o.InterfaceC8656dtr;
import o.dsA;
import o.dtA;

/* loaded from: classes.dex */
public class FunctionReference extends CallableReference implements InterfaceC8633dsv, dtA {
    private final int arity;
    private final int flags;

    @Override // o.InterfaceC8633dsv
    public int getArity() {
        return this.arity;
    }

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public dtA getReflected() {
        return (dtA) super.getReflected();
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected InterfaceC8656dtr computeReflected() {
        return dsA.a(this);
    }

    @Override // o.dtA
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // o.dtA
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // o.dtA
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // o.dtA
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.jvm.internal.CallableReference, o.InterfaceC8656dtr
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && C8632dsu.c(getBoundReceiver(), functionReference.getBoundReceiver()) && C8632dsu.c(getOwner(), functionReference.getOwner());
        } else if (obj instanceof dtA) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        InterfaceC8656dtr compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
