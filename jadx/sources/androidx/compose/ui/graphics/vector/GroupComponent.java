package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private drM<? super VNode, dpR> invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;
    private final drM<VNode, dpR> wrappedListener;

    @Override // androidx.compose.ui.graphics.vector.VNode
    public drM<VNode, dpR> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    /* renamed from: getTintColor-0d7_KjU  reason: not valid java name */
    public final long m1577getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(drM<? super VNode, dpR> drm) {
        this.invalidateListener = drm;
    }

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m1309getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new drM<VNode, dpR>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(VNode vNode) {
                invoke2(vNode);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(VNode vNode) {
                GroupComponent.this.markTintForVNode(vNode);
                drM<VNode, dpR> invalidateListener$ui_release = GroupComponent.this.getInvalidateListener$ui_release();
                if (invalidateListener$ui_release != null) {
                    invalidateListener$ui_release.invoke(vNode);
                }
            }
        };
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m1576markTintForColor8_81llA(((SolidColor) brush).m1441getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (groupComponent.isTintable && this.isTintable) {
                m1576markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m1309getUnspecified0d7_KjU();
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path path = this.clipPath;
            if (path == null) {
                path = AndroidPath_androidKt.Path();
                this.clipPath = path;
            }
            PathParserKt.toPath(this.clipPathData, path);
        }
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    private final void updateMatrix() {
        float[] fArr = this.groupMatrix;
        if (fArr == null) {
            fArr = Matrix.m1370constructorimpl$default(null, 1, null);
            this.groupMatrix = fArr;
        } else {
            Matrix.m1375resetimpl(fArr);
        }
        float f = this.translationX;
        float[] fArr2 = fArr;
        Matrix.m1381translateimpl$default(fArr2, this.pivotX + f, this.translationY + this.pivotY, 0.0f, 4, null);
        Matrix.m1376rotateZimpl(fArr, this.rotation);
        Matrix.m1377scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m1381translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    public final void insertAt(int i, VNode vNode) {
        if (i < getNumChildren()) {
            this.children.set(i, vNode);
        } else {
            this.children.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        float[] fArr = this.groupMatrix;
        if (fArr != null) {
            transform.mo1545transform58bKbWc(Matrix.m1368boximpl(fArr).m1382unboximpl());
        }
        Path path = this.clipPath;
        if (getWillClipPath() && path != null) {
            DrawTransform.m1565clipPathmtrdDE$default(transform, path, 0, 2, null);
        }
        List<VNode> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).draw(drawScope);
        }
        drawContext.getCanvas().restore();
        drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("\t");
            sb.append(list.get(i).toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: markTintForColor-8_81llA  reason: not valid java name */
    private final void m1576markTintForColor8_81llA(long j) {
        if (this.isTintable) {
            Color.Companion companion = Color.Companion;
            if (j != companion.m1309getUnspecified0d7_KjU()) {
                if (this.tintColor == companion.m1309getUnspecified0d7_KjU()) {
                    this.tintColor = j;
                } else if (VectorKt.m1590rgbEqualOWjLjI(this.tintColor, j)) {
                } else {
                    markNotTintable();
                }
            }
        }
    }
}
