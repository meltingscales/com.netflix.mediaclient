package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.ArrayList;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ImageVector {
    public static final Companion Companion = new Companion(null);
    private static int imageVectorCount;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    public /* synthetic */ ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, int i2, C8627dsp c8627dsp) {
        this(str, f, f2, f3, f4, vectorGroup, j, i, z, i2);
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM  reason: not valid java name */
    public final float m1578getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM  reason: not valid java name */
    public final float m1579getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    public final int getGenId$ui_release() {
        return this.genId;
    }

    public final String getName() {
        return this.name;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU  reason: not valid java name */
    public final int m1580getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU  reason: not valid java name */
    public final long m1581getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    private ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, int i2) {
        this.name = str;
        this.defaultWidth = f;
        this.defaultHeight = f2;
        this.viewportWidth = f3;
        this.viewportHeight = f4;
        this.root = vectorGroup;
        this.tintColor = j;
        this.tintBlendMode = i;
        this.autoMirror = z;
        this.genId = i2;
    }

    public /* synthetic */ ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, int i2, int i3, C8627dsp c8627dsp) {
        this(str, f, f2, f3, f4, vectorGroup, j, i, z, (i3 & 512) != 0 ? Companion.generateImageVectorId$ui_release() : i2, null);
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList<GroupParams> nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, C8627dsp c8627dsp) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        private Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.name = str;
            this.defaultWidth = f;
            this.defaultHeight = f2;
            this.viewportWidth = f3;
            this.viewportHeight = f4;
            this.tintColor = j;
            this.tintBlendMode = i;
            this.autoMirror = z;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            ImageVectorKt.push(arrayList, groupParams);
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? BlendMode.Companion.m1258getSrcIn0nO6VwU() : i, (i2 & 128) != 0 ? false : z, null);
        }

        private final GroupParams getCurrentGroup() {
            Object peek;
            peek = ImageVectorKt.peek(this.nodes);
            return (GroupParams) peek;
        }

        public final Builder addGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list) {
            ensureNotConsumed();
            ImageVectorKt.push(this.nodes, new GroupParams(str, f, f2, f3, f4, f5, f6, f7, list, null, 512, null));
            return this;
        }

        public final Builder clearGroup() {
            Object pop;
            ensureNotConsumed();
            pop = ImageVectorKt.pop(this.nodes);
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) pop));
            return this;
        }

        /* renamed from: addPath-oIyEayM  reason: not valid java name */
        public final Builder m1583addPathoIyEayM(List<? extends PathNode> list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(str, list, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        private final void ensureNotConsumed() {
            if (!(!this.isConsumed)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class GroupParams {
            private List<VectorNode> children;
            private List<? extends PathNode> clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public final List<VectorNode> getChildren() {
                return this.children;
            }

            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            public final String getName() {
                return this.name;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, List<VectorNode> list2) {
                this.name = str;
                this.rotate = f;
                this.pivotX = f2;
                this.pivotY = f3;
                this.scaleX = f4;
                this.scaleY = f5;
                this.translationX = f6;
                this.translationY = f7;
                this.clipPathData = list;
                this.children = list2;
            }

            public /* synthetic */ GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, C8627dsp c8627dsp) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & JSONzip.end) != 0 ? VectorKt.getEmptyPath() : list, (i & 512) != 0 ? new ArrayList() : list2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final int generateImageVectorId$ui_release() {
            int i;
            synchronized (this) {
                Companion companion = ImageVector.Companion;
                i = ImageVector.imageVectorCount;
                ImageVector.imageVectorCount = i + 1;
            }
            return i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageVector) {
            ImageVector imageVector = (ImageVector) obj;
            return C8632dsu.c((Object) this.name, (Object) imageVector.name) && Dp.m2494equalsimpl0(this.defaultWidth, imageVector.defaultWidth) && Dp.m2494equalsimpl0(this.defaultHeight, imageVector.defaultHeight) && this.viewportWidth == imageVector.viewportWidth && this.viewportHeight == imageVector.viewportHeight && C8632dsu.c(this.root, imageVector.root) && Color.m1294equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m1229equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.defaultWidth);
        int m2495hashCodeimpl2 = Dp.m2495hashCodeimpl(this.defaultHeight);
        int hashCode2 = Float.hashCode(this.viewportWidth);
        int hashCode3 = Float.hashCode(this.viewportHeight);
        int hashCode4 = this.root.hashCode();
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.tintColor);
        return (((((((((((((((hashCode * 31) + m2495hashCodeimpl) * 31) + m2495hashCodeimpl2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + m1300hashCodeimpl) * 31) + BlendMode.m1230hashCodeimpl(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }
}
