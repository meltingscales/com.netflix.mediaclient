package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class PathBuilder {
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    public final PathBuilder moveTo(float f, float f2) {
        this._nodes.add(new PathNode.MoveTo(f, f2));
        return this;
    }

    public final PathBuilder lineTo(float f, float f2) {
        this._nodes.add(new PathNode.LineTo(f, f2));
        return this;
    }

    public final PathBuilder lineToRelative(float f, float f2) {
        this._nodes.add(new PathNode.RelativeLineTo(f, f2));
        return this;
    }

    public final PathBuilder horizontalLineToRelative(float f) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(f));
        return this;
    }

    public final PathBuilder verticalLineToRelative(float f) {
        this._nodes.add(new PathNode.RelativeVerticalTo(f));
        return this;
    }

    public final PathBuilder curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this._nodes.add(new PathNode.CurveTo(f, f2, f3, f4, f5, f6));
        return this;
    }

    public final PathBuilder curveToRelative(float f, float f2, float f3, float f4, float f5, float f6) {
        this._nodes.add(new PathNode.RelativeCurveTo(f, f2, f3, f4, f5, f6));
        return this;
    }

    public final PathBuilder reflectiveCurveTo(float f, float f2, float f3, float f4) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(f, f2, f3, f4));
        return this;
    }
}
