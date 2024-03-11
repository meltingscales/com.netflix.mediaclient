package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import java.util.List;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public interface SubcomposeMeasureScope extends MeasureScope {
    List<Measurable> subcompose(Object obj, drX<? super Composer, ? super Integer, dpR> drx);
}
