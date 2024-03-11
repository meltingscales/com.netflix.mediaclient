package o;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

/* renamed from: o.dtr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8656dtr<R> extends InterfaceC8659dtu {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    dtH getReturnType();

    List<dtG> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
