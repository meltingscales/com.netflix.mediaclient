package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import java.util.List;

/* loaded from: classes.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        PathNode pathNode;
        float f;
        int i;
        int i2;
        PathNode pathNode2;
        float f2;
        float f3;
        float f4;
        float dx;
        float dy;
        float x2;
        float y2;
        float f5;
        float f6;
        float f7;
        float y;
        float f8;
        float f9;
        float dy2;
        float f10;
        float f11;
        float f12;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int mo1220getFillTypeRgk1Os = path.mo1220getFillTypeRgk1Os();
        path.rewind();
        path2.mo1222setFillTypeoQ8Xj4U(mo1220getFillTypeRgk1Os);
        PathNode pathNode3 = list.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list.size();
        float f13 = 0.0f;
        int i3 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i3 < size) {
            PathNode pathNode4 = list2.get(i3);
            if (pathNode4 instanceof PathNode.Close) {
                path.close();
                path2.moveTo(f18, f19);
                f11 = f18;
                f10 = f11;
                f12 = f19;
                f7 = f12;
            } else if (pathNode4 instanceof PathNode.RelativeMoveTo) {
                PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode4;
                float dx2 = f16 + relativeMoveTo.getDx();
                float dy3 = f17 + relativeMoveTo.getDy();
                path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                f11 = dx2;
                f7 = dy3;
                f18 = f15;
                f12 = f7;
                f19 = f14;
                f10 = f11;
            } else {
                if (pathNode4 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode4;
                    f9 = moveTo.getX();
                    y = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                    f8 = f9;
                    f7 = y;
                } else {
                    if (pathNode4 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode4;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        f16 += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else if (pathNode4 instanceof PathNode.LineTo) {
                        PathNode.LineTo lineTo = (PathNode.LineTo) pathNode4;
                        path2.lineTo(lineTo.getX(), lineTo.getY());
                        float x = lineTo.getX();
                        float f20 = f19;
                        y = lineTo.getY();
                        f8 = f18;
                        f9 = x;
                        f7 = f20;
                    } else if (pathNode4 instanceof PathNode.RelativeHorizontalTo) {
                        PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode4;
                        path2.relativeLineTo(relativeHorizontalTo.getDx(), f13);
                        f16 += relativeHorizontalTo.getDx();
                        f8 = f18;
                        f7 = f19;
                        f9 = f16;
                        y = f17;
                    } else if (pathNode4 instanceof PathNode.HorizontalTo) {
                        PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode4;
                        path2.lineTo(horizontalTo.getX(), f17);
                        f7 = f19;
                        y = f17;
                        float f21 = f18;
                        f9 = horizontalTo.getX();
                        f8 = f21;
                    } else if (pathNode4 instanceof PathNode.RelativeVerticalTo) {
                        PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode4;
                        path2.relativeLineTo(f13, relativeVerticalTo.getDy());
                        dy2 = relativeVerticalTo.getDy();
                    } else if (pathNode4 instanceof PathNode.VerticalTo) {
                        PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode4;
                        path2.lineTo(f16, verticalTo.getY());
                        f7 = f19;
                        y = verticalTo.getY();
                        f8 = f18;
                        f9 = f16;
                    } else {
                        if (pathNode4 instanceof PathNode.RelativeCurveTo) {
                            PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode4;
                            pathNode = pathNode4;
                            path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                            f4 = relativeCurveTo.getDx2() + f16;
                            f14 = relativeCurveTo.getDy2() + f17;
                            dx = f16 + relativeCurveTo.getDx3();
                            dy = relativeCurveTo.getDy3();
                        } else {
                            pathNode = pathNode4;
                            if (pathNode instanceof PathNode.CurveTo) {
                                PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode;
                                path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                f4 = curveTo.getX2();
                                f14 = curveTo.getY2();
                                x2 = curveTo.getX3();
                                y2 = curveTo.getY3();
                            } else if (pathNode instanceof PathNode.RelativeReflectiveCurveTo) {
                                if (pathNode3.isCurve()) {
                                    float f22 = f17 - f14;
                                    f5 = f16 - f15;
                                    f6 = f22;
                                } else {
                                    f5 = f13;
                                    f6 = f5;
                                }
                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode;
                                path.relativeCubicTo(f5, f6, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                f4 = relativeReflectiveCurveTo.getDx1() + f16;
                                f14 = relativeReflectiveCurveTo.getDy1() + f17;
                                dx = f16 + relativeReflectiveCurveTo.getDx2();
                                dy = relativeReflectiveCurveTo.getDy2();
                            } else if (pathNode instanceof PathNode.ReflectiveCurveTo) {
                                if (pathNode3.isCurve()) {
                                    float f23 = 2;
                                    f17 = (f17 * f23) - f14;
                                    f16 = (f16 * f23) - f15;
                                }
                                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode;
                                path.cubicTo(f16, f17, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                f4 = reflectiveCurveTo.getX1();
                                f14 = reflectiveCurveTo.getY1();
                                x2 = reflectiveCurveTo.getX2();
                                y2 = reflectiveCurveTo.getY2();
                            } else if (pathNode instanceof PathNode.RelativeQuadTo) {
                                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode;
                                path2.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                f4 = relativeQuadTo.getDx1() + f16;
                                f14 = relativeQuadTo.getDy1() + f17;
                                dx = f16 + relativeQuadTo.getDx2();
                                dy = relativeQuadTo.getDy2();
                            } else if (pathNode instanceof PathNode.QuadTo) {
                                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode;
                                path2.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                f4 = quadTo.getX1();
                                f14 = quadTo.getY1();
                                x2 = quadTo.getX2();
                                y2 = quadTo.getY2();
                            } else if (pathNode instanceof PathNode.RelativeReflectiveQuadTo) {
                                if (pathNode3.isQuad()) {
                                    f2 = f16 - f15;
                                    f3 = f17 - f14;
                                } else {
                                    f2 = f13;
                                    f3 = f2;
                                }
                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode;
                                path2.relativeQuadraticBezierTo(f2, f3, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                f4 = f2 + f16;
                                f14 = f3 + f17;
                                dx = f16 + relativeReflectiveQuadTo.getDx();
                                dy = relativeReflectiveQuadTo.getDy();
                            } else {
                                if (pathNode instanceof PathNode.ReflectiveQuadTo) {
                                    if (pathNode3.isQuad()) {
                                        float f24 = 2;
                                        f16 = (f16 * f24) - f15;
                                        f17 = (f24 * f17) - f14;
                                    }
                                    PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode;
                                    path2.quadraticBezierTo(f16, f17, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                    pathNode2 = pathNode;
                                    f15 = f16;
                                    f = f13;
                                    i = i3;
                                    i2 = size;
                                    f16 = reflectiveQuadTo.getX();
                                    float f25 = f17;
                                    f17 = reflectiveQuadTo.getY();
                                    f14 = f25;
                                } else if (pathNode instanceof PathNode.RelativeArcTo) {
                                    PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode;
                                    float arcStartDx = relativeArcTo.getArcStartDx() + f16;
                                    float arcStartDy = relativeArcTo.getArcStartDy() + f17;
                                    pathNode2 = pathNode;
                                    i = i3;
                                    f = 0.0f;
                                    i2 = size;
                                    drawArc(path, f16, f17, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                    f15 = arcStartDx;
                                    f16 = f15;
                                    f18 = f18;
                                    f19 = f19;
                                    f14 = arcStartDy;
                                    f17 = f14;
                                } else {
                                    float f26 = f18;
                                    float f27 = f19;
                                    f = f13;
                                    i = i3;
                                    i2 = size;
                                    if (pathNode instanceof PathNode.ArcTo) {
                                        PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                        pathNode2 = pathNode;
                                        drawArc(path, f16, f17, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                        float arcStartX = arcTo.getArcStartX();
                                        f14 = arcTo.getArcStartY();
                                        f15 = arcStartX;
                                        f16 = f15;
                                        f17 = f14;
                                    } else {
                                        pathNode2 = pathNode;
                                    }
                                    f18 = f26;
                                    f19 = f27;
                                }
                                i3 = i + 1;
                                path2 = path;
                                size = i2;
                                pathNode3 = pathNode2;
                                f13 = f;
                                list2 = list;
                            }
                            pathNode2 = pathNode;
                            f16 = x2;
                            f17 = y2;
                            f = f13;
                            i = i3;
                            i2 = size;
                            f15 = f4;
                            i3 = i + 1;
                            path2 = path;
                            size = i2;
                            pathNode3 = pathNode2;
                            f13 = f;
                            list2 = list;
                        }
                        y2 = f17 + dy;
                        x2 = dx;
                        pathNode2 = pathNode;
                        f16 = x2;
                        f17 = y2;
                        f = f13;
                        i = i3;
                        i2 = size;
                        f15 = f4;
                        i3 = i + 1;
                        path2 = path;
                        size = i2;
                        pathNode3 = pathNode2;
                        f13 = f;
                        list2 = list;
                    }
                    f17 += dy2;
                    f8 = f18;
                    f7 = f19;
                    f9 = f16;
                    y = f17;
                }
                float f28 = f14;
                f10 = f8;
                f11 = f9;
                f18 = f15;
                f12 = y;
                f19 = f28;
            }
            f16 = f11;
            f17 = f12;
            pathNode2 = pathNode4;
            f15 = f18;
            f = f13;
            i = i3;
            i2 = size;
            f18 = f10;
            f14 = f19;
            f19 = f7;
            i3 = i + 1;
            path2 = path;
            size = i2;
            pathNode3 = pathNode2;
            f13 = f;
            list2 = list;
        }
        return path;
    }

    private static final void drawArc(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double d11 = ((d * cos) + (d2 * sin)) / d5;
        double d12 = (((-d) * sin) + (d2 * cos)) / d6;
        double d13 = ((d3 * cos) + (d4 * sin)) / d5;
        double d14 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d15 * d15) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            drawArc(path, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d15 * sqrt2;
        double d23 = sqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d12 - d9, d11 - d8);
        double atan22 = Math.atan2(d14 - d9, d13 - d8) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z2 != (i >= 0)) {
            atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d5;
        double d25 = d9 * d6;
        arcToBezier(path, (d24 * cos) - (d25 * sin), (d24 * sin) + (d25 * cos), d5, d6, d, d2, d10, atan2, atan22);
    }

    private static final void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = d12 * sin;
        double d16 = d4 * cos;
        double d17 = d9 / ceil;
        double d18 = d6;
        double d19 = (sin2 * d13) - (cos2 * d14);
        double d20 = (sin2 * d15) + (cos2 * d16);
        double d21 = d8;
        int i = 0;
        double d22 = d5;
        while (i < ceil) {
            double d23 = d21 + d17;
            double sin3 = Math.sin(d23);
            double cos3 = Math.cos(d23);
            double d24 = d17;
            double d25 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d26 = d2 + (d10 * sin * cos3) + (d16 * sin3);
            double d27 = (d13 * sin3) - (d14 * cos3);
            double d28 = (sin3 * d15) + (cos3 * d16);
            double d29 = d23 - d21;
            int i2 = ceil;
            double tan = Math.tan(d29 / 2);
            double sin4 = (Math.sin(d29) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - 1)) / 3;
            path.cubicTo((float) (d22 + (d19 * sin4)), (float) (d18 + (d20 * sin4)), (float) (d25 - (sin4 * d27)), (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
            i++;
            d18 = d26;
            d22 = d25;
            d21 = d23;
            d20 = d28;
            ceil = i2;
            d19 = d27;
            cos = cos;
            sin = sin;
            d10 = d3;
            d17 = d24;
        }
    }
}
