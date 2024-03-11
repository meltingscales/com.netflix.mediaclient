package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import o.InterfaceC8612dsa;
import o.drX;

/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks {
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();
    private static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinWidth = new InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
            AnonymousClass1 anonymousClass1 = new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.1
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
                }
            };
            AnonymousClass2 anonymousClass2 = new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.2
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(list, anonymousClass1, anonymousClass2, i, i2, layoutOrientation, layoutOrientation));
        }
    };
    private static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinWidth = new InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(list, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.1
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
                }
            }, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.2
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, i, i2, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    };
    private static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinHeight = new InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(list, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.1
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
                }
            }, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.2
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, i, i2, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    };
    private static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinHeight = new InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
            AnonymousClass1 anonymousClass1 = new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.1
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
                }
            };
            AnonymousClass2 anonymousClass2 = new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.2
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(list, anonymousClass1, anonymousClass2, i, i2, layoutOrientation, layoutOrientation));
        }
    };
    private static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxWidth = new InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
            AnonymousClass1 anonymousClass1 = new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.1
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            };
            AnonymousClass2 anonymousClass2 = new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.2
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(list, anonymousClass1, anonymousClass2, i, i2, layoutOrientation, layoutOrientation));
        }
    };
    private static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxWidth = new InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(list, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.1
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.2
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, i, i2, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    };
    private static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxHeight = new InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(list, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.1
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.2
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, i, i2, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    };
    private static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxHeight = new InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
            AnonymousClass1 anonymousClass1 = new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.1
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            };
            AnonymousClass2 anonymousClass2 = new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.2
                @Override // o.drX
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(list, anonymousClass1, anonymousClass2, i, i2, layoutOrientation, layoutOrientation));
        }
    };

    public final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxHeight() {
        return HorizontalMaxHeight;
    }

    public final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxWidth() {
        return HorizontalMaxWidth;
    }

    public final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinHeight() {
        return HorizontalMinHeight;
    }

    public final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinWidth() {
        return HorizontalMinWidth;
    }

    public final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxHeight() {
        return VerticalMaxHeight;
    }

    public final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxWidth() {
        return VerticalMaxWidth;
    }

    public final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinHeight() {
        return VerticalMinHeight;
    }

    public final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinWidth() {
        return VerticalMinWidth;
    }

    private IntrinsicMeasureBlocks() {
    }
}
