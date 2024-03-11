package androidx.compose.foundation.interaction;

import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes.dex */
public interface MutableInteractionSource extends InteractionSource {
    Object emit(Interaction interaction, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    boolean tryEmit(Interaction interaction);
}
