package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;

/* loaded from: classes.dex */
public interface DrawContext {
    /* renamed from: getSize-NH-jbRc */
    long mo1538getSizeNHjbRc();

    DrawTransform getTransform();

    /* renamed from: setSize-uvyYCjk */
    void mo1539setSizeuvyYCjk(long j);

    default Canvas getCanvas() {
        return new EmptyCanvas();
    }
}
