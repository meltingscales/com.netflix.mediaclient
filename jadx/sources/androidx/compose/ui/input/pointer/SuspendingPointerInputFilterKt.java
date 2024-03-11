package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import java.util.List;
import o.C8569dql;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent;

    public static final Modifier pointerInput(Modifier modifier, Object obj, drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, drx, 6, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, drx, 4, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, drx, 3, null));
    }

    static {
        List i;
        i = C8569dql.i();
        EmptyPointerEvent = new PointerEvent(i);
    }

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return new SuspendingPointerInputModifierNodeImpl(drx);
    }
}
