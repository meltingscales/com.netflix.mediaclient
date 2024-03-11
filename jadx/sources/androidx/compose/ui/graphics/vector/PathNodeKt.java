package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PathNodeKt {
    public static final void addPathNodes(char c, ArrayList<PathNode> arrayList, float[] fArr, int i) {
        if (c == 'z' || c == 'Z') {
            arrayList.add(PathNode.Close.INSTANCE);
            return;
        }
        int i2 = 0;
        if (c == 'm') {
            while (i2 <= i - 2) {
                int i3 = i2 + 1;
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(fArr[i2], fArr[i3]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeMoveTo = new PathNode.LineTo(fArr[i2], fArr[i3]);
                } else if (i2 > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i3]);
                }
                arrayList.add(relativeMoveTo);
                i2 += 2;
            }
        } else if (c == 'M') {
            while (i2 <= i - 2) {
                int i4 = i2 + 1;
                PathNode moveTo = new PathNode.MoveTo(fArr[i2], fArr[i4]);
                if (i2 > 0) {
                    moveTo = new PathNode.LineTo(fArr[i2], fArr[i4]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    moveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i4]);
                }
                arrayList.add(moveTo);
                i2 += 2;
            }
        } else if (c == 'l') {
            while (i2 <= i - 2) {
                int i5 = i2 + 1;
                PathNode relativeLineTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i5]);
                if ((relativeLineTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeLineTo = new PathNode.LineTo(fArr[i2], fArr[i5]);
                } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeLineTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i5]);
                }
                arrayList.add(relativeLineTo);
                i2 += 2;
            }
        } else if (c == 'L') {
            while (i2 <= i - 2) {
                int i6 = i2 + 1;
                PathNode lineTo = new PathNode.LineTo(fArr[i2], fArr[i6]);
                if ((lineTo instanceof PathNode.MoveTo) && i2 > 0) {
                    lineTo = new PathNode.LineTo(fArr[i2], fArr[i6]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    lineTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i6]);
                }
                arrayList.add(lineTo);
                i2 += 2;
            }
        } else if (c == 'h') {
            while (i2 <= i - 1) {
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(fArr[i2]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(fArr[i2], fArr[i2 + 1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]);
                }
                arrayList.add(relativeHorizontalTo);
                i2++;
            }
        } else if (c == 'H') {
            while (i2 <= i - 1) {
                PathNode horizontalTo = new PathNode.HorizontalTo(fArr[i2]);
                if ((horizontalTo instanceof PathNode.MoveTo) && i2 > 0) {
                    horizontalTo = new PathNode.LineTo(fArr[i2], fArr[i2 + 1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]);
                }
                arrayList.add(horizontalTo);
                i2++;
            }
        } else if (c == 'v') {
            while (i2 <= i - 1) {
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(fArr[i2]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(fArr[i2], fArr[i2 + 1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]);
                }
                arrayList.add(relativeVerticalTo);
                i2++;
            }
        } else if (c == 'V') {
            while (i2 <= i - 1) {
                PathNode verticalTo = new PathNode.VerticalTo(fArr[i2]);
                if ((verticalTo instanceof PathNode.MoveTo) && i2 > 0) {
                    verticalTo = new PathNode.LineTo(fArr[i2], fArr[i2 + 1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]);
                }
                arrayList.add(verticalTo);
                i2++;
            }
        } else if (c == 'c') {
            while (i2 <= i - 6) {
                int i7 = i2 + 1;
                PathNode relativeCurveTo = new PathNode.RelativeCurveTo(fArr[i2], fArr[i7], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]);
                if ((relativeCurveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeCurveTo = new PathNode.LineTo(fArr[i2], fArr[i7]);
                } else if ((relativeCurveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeCurveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i7]);
                }
                arrayList.add(relativeCurveTo);
                i2 += 6;
            }
        } else if (c == 'C') {
            while (i2 <= i - 6) {
                int i8 = i2 + 1;
                PathNode curveTo = new PathNode.CurveTo(fArr[i2], fArr[i8], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]);
                if ((curveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    curveTo = new PathNode.LineTo(fArr[i2], fArr[i8]);
                } else if ((curveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    curveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i8]);
                }
                arrayList.add(curveTo);
                i2 += 6;
            }
        } else if (c == 's') {
            while (i2 <= i - 4) {
                int i9 = i2 + 1;
                PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(fArr[i2], fArr[i9], fArr[i2 + 2], fArr[i2 + 3]);
                if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeReflectiveCurveTo = new PathNode.LineTo(fArr[i2], fArr[i9]);
                } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeReflectiveCurveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i9]);
                }
                arrayList.add(relativeReflectiveCurveTo);
                i2 += 4;
            }
        } else if (c == 'S') {
            while (i2 <= i - 4) {
                int i10 = i2 + 1;
                PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(fArr[i2], fArr[i10], fArr[i2 + 2], fArr[i2 + 3]);
                if ((reflectiveCurveTo instanceof PathNode.MoveTo) && i2 > 0) {
                    reflectiveCurveTo = new PathNode.LineTo(fArr[i2], fArr[i10]);
                } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    reflectiveCurveTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i10]);
                }
                arrayList.add(reflectiveCurveTo);
                i2 += 4;
            }
        } else if (c == 'q') {
            while (i2 <= i - 4) {
                int i11 = i2 + 1;
                PathNode relativeQuadTo = new PathNode.RelativeQuadTo(fArr[i2], fArr[i11], fArr[i2 + 2], fArr[i2 + 3]);
                if ((relativeQuadTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeQuadTo = new PathNode.LineTo(fArr[i2], fArr[i11]);
                } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeQuadTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i11]);
                }
                arrayList.add(relativeQuadTo);
                i2 += 4;
            }
        } else if (c == 'Q') {
            while (i2 <= i - 4) {
                int i12 = i2 + 1;
                PathNode quadTo = new PathNode.QuadTo(fArr[i2], fArr[i12], fArr[i2 + 2], fArr[i2 + 3]);
                if ((quadTo instanceof PathNode.MoveTo) && i2 > 0) {
                    quadTo = new PathNode.LineTo(fArr[i2], fArr[i12]);
                } else if ((quadTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    quadTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i12]);
                }
                arrayList.add(quadTo);
                i2 += 4;
            }
        } else if (c == 't') {
            while (i2 <= i - 2) {
                int i13 = i2 + 1;
                PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(fArr[i2], fArr[i13]);
                if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && i2 > 0) {
                    relativeReflectiveQuadTo = new PathNode.LineTo(fArr[i2], fArr[i13]);
                } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    relativeReflectiveQuadTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i13]);
                }
                arrayList.add(relativeReflectiveQuadTo);
                i2 += 2;
            }
        } else if (c == 'T') {
            while (i2 <= i - 2) {
                int i14 = i2 + 1;
                PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(fArr[i2], fArr[i14]);
                if ((reflectiveQuadTo instanceof PathNode.MoveTo) && i2 > 0) {
                    reflectiveQuadTo = new PathNode.LineTo(fArr[i2], fArr[i14]);
                } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && i2 > 0) {
                    reflectiveQuadTo = new PathNode.RelativeLineTo(fArr[i2], fArr[i14]);
                }
                arrayList.add(reflectiveQuadTo);
                i2 += 2;
            }
        } else if (c == 'a') {
            for (int i15 = 0; i15 <= i - 7; i15 += 7) {
                int i16 = i15 + 1;
                PathNode relativeArcTo = new PathNode.RelativeArcTo(fArr[i15], fArr[i16], fArr[i15 + 2], Float.compare(fArr[i15 + 3], 0.0f) != 0, Float.compare(fArr[i15 + 4], 0.0f) != 0, fArr[i15 + 5], fArr[i15 + 6]);
                if ((relativeArcTo instanceof PathNode.MoveTo) && i15 > 0) {
                    relativeArcTo = new PathNode.LineTo(fArr[i15], fArr[i16]);
                } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && i15 > 0) {
                    relativeArcTo = new PathNode.RelativeLineTo(fArr[i15], fArr[i16]);
                }
                arrayList.add(relativeArcTo);
            }
        } else if (c != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c);
        } else {
            for (int i17 = 0; i17 <= i - 7; i17 += 7) {
                int i18 = i17 + 1;
                PathNode arcTo = new PathNode.ArcTo(fArr[i17], fArr[i18], fArr[i17 + 2], Float.compare(fArr[i17 + 3], 0.0f) != 0, Float.compare(fArr[i17 + 4], 0.0f) != 0, fArr[i17 + 5], fArr[i17 + 6]);
                if ((arcTo instanceof PathNode.MoveTo) && i17 > 0) {
                    arcTo = new PathNode.LineTo(fArr[i17], fArr[i18]);
                } else if ((arcTo instanceof PathNode.RelativeMoveTo) && i17 > 0) {
                    arcTo = new PathNode.RelativeLineTo(fArr[i17], fArr[i18]);
                }
                arrayList.add(arcTo);
            }
        }
    }
}
