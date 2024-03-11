package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;
import o.InterfaceC8656dtr;
import o.InterfaceC8661dtw;
import o.dsA;
import o.dtG;
import o.dtH;

/* loaded from: classes.dex */
public abstract class CallableReference implements InterfaceC8656dtr, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient InterfaceC8656dtr reflected;
    private final String signature;

    protected abstract InterfaceC8656dtr computeReflected();

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // o.InterfaceC8656dtr
    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    /* loaded from: classes5.dex */
    static class NoReceiver implements Serializable {
        private static final NoReceiver a = new NoReceiver();

        private Object readResolve() {
            return a;
        }

        private NoReceiver() {
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    protected CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public InterfaceC8656dtr compute() {
        InterfaceC8656dtr interfaceC8656dtr = this.reflected;
        if (interfaceC8656dtr == null) {
            InterfaceC8656dtr computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return interfaceC8656dtr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC8656dtr getReflected() {
        InterfaceC8656dtr compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public InterfaceC8661dtw getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? dsA.b(cls) : dsA.a(cls);
    }

    @Override // o.InterfaceC8656dtr
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    @Override // o.InterfaceC8656dtr
    public dtH getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // o.InterfaceC8659dtu
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // o.InterfaceC8656dtr
    public List<dtG> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // o.InterfaceC8656dtr
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // o.InterfaceC8656dtr
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @Override // o.InterfaceC8656dtr
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // o.InterfaceC8656dtr
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // o.InterfaceC8656dtr
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // o.InterfaceC8656dtr
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // o.InterfaceC8656dtr
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
