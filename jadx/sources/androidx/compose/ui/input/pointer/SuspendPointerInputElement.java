package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.ModifierNodeElement;
import java.util.Arrays;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {
    private final Object key1;
    private final Object key2;
    private final Object[] keys;
    private final drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> pointerInputHandler;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, drX drx, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, drx);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this.pointerInputHandler = drx;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SuspendingPointerInputModifierNodeImpl create() {
        return new SuspendingPointerInputModifierNodeImpl(this.pointerInputHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl) {
        suspendingPointerInputModifierNodeImpl.setPointerInputHandler(this.pointerInputHandler);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuspendPointerInputElement) {
            SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
            if (C8632dsu.c(this.key1, suspendPointerInputElement.key1) && C8632dsu.c(this.key2, suspendPointerInputElement.key2)) {
                Object[] objArr = this.keys;
                if (objArr != null) {
                    Object[] objArr2 = suspendPointerInputElement.keys;
                    if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                        return false;
                    }
                } else if (suspendPointerInputElement.keys != null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Object obj = this.key1;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.key2;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        Object[] objArr = this.keys;
        return (((hashCode * 31) + hashCode2) * 31) + (objArr != null ? Arrays.hashCode(objArr) : 0);
    }
}
