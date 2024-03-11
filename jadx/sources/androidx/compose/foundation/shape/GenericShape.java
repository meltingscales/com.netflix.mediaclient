package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes.dex */
public final class GenericShape implements Shape {
    private final InterfaceC8612dsa<Path, Size, LayoutDirection, dpR> builder;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericShape(InterfaceC8612dsa<? super Path, ? super Size, ? super LayoutDirection, dpR> interfaceC8612dsa) {
        this.builder = interfaceC8612dsa;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo139createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m1170boximpl(j), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        return C8632dsu.c(genericShape != null ? genericShape.builder : null, this.builder);
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
