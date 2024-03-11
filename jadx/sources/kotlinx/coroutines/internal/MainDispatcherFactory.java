package kotlinx.coroutines.internal;

import java.util.List;
import o.dxN;

/* loaded from: classes5.dex */
public interface MainDispatcherFactory {
    dxN createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
