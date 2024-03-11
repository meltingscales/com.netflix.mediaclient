package o;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.zk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9956zk extends LinearSnapHelper {
    private final int a;
    private int b;
    private int c;
    private OrientationHelper d;
    private RecyclerView e;
    private OrientationHelper f;
    private RecyclerView.OnScrollListener g;
    private final b h;
    private int i;
    private int j;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f13934o;

    /* renamed from: o.zk$b */
    /* loaded from: classes2.dex */
    public interface b {
        int d(int i);
    }

    public C9956zk(int i) {
        this(i, null);
    }

    public C9956zk(int i, b bVar) {
        this.b = 0;
        this.g = new RecyclerView.OnScrollListener() { // from class: o.zk.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                super.onScrollStateChanged(recyclerView, i2);
                if (C9956zk.this.h != null && i2 == 0) {
                    if (C9956zk.this.j != -1) {
                        if (C9956zk.this.c != C9956zk.this.j) {
                            C1044Mm.a("GravitySnapHelper", "onSnap at %s", Integer.valueOf(C9956zk.this.j));
                            C9956zk c9956zk = C9956zk.this;
                            c9956zk.c = c9956zk.h.d(C9956zk.this.j);
                        }
                    } else {
                        C1044Mm.e("GravitySnapHelper", "No snap");
                    }
                }
                if (i2 == 1) {
                    C9956zk.this.j = -1;
                    C1044Mm.e("GravitySnapHelper", "Reset mSnappedPosition");
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) C9956zk.this.e.getLayoutManager()).findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition != -1) {
                        C9956zk.this.b = findFirstVisibleItemPosition;
                    }
                }
            }
        };
        if (i != 8388611 && i != 8388613 && i != 80 && i != 48 && i != 17) {
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants");
        }
        this.h = bVar;
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        c(recyclerView, 40, 1, 2, 1);
    }

    public void c(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        this.e = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.g);
            this.i = i;
            this.m = i2;
            this.f13934o = i3;
            this.n = i4;
        }
        super.attachToRecyclerView(this.e);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            int i = this.a;
            if (i == 17) {
                return super.calculateDistanceToFinalSnap(layoutManager, view);
            }
            if (i == 8388611) {
                iArr[0] = b(view, d(layoutManager), false);
            } else {
                iArr[0] = c(view, d(layoutManager), false);
            }
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i2 = this.a;
            if (i2 == 17) {
                return super.calculateDistanceToFinalSnap(layoutManager, view);
            }
            if (i2 == 48) {
                iArr[1] = b(view, c(layoutManager), false);
            } else {
                iArr[1] = c(view, c(layoutManager), false);
            }
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int a = a(layoutManager, i, i2);
        this.j = a;
        C1044Mm.a("GravitySnapHelper", "findTargetSnapPosition mSnappedPosition = %s", Integer.valueOf(a));
        return this.j;
    }

    protected int a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return super.findTargetSnapPosition(layoutManager, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        View a = a(layoutManager);
        if (a != null) {
            int position = layoutManager.getPosition(a);
            this.j = position;
            C1044Mm.a("GravitySnapHelper", "findSnapView mSnappedPosition = %s", Integer.valueOf(position));
        } else {
            this.j = -1;
            C1044Mm.a("GravitySnapHelper", "findSnapView mSnappedPosition = %s", -1);
        }
        return a;
    }

    protected View a(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            int i = this.a;
            if (i == 17) {
                return super.findSnapView(layoutManager);
            }
            if (i == 48) {
                return c(layoutManager, c(layoutManager));
            }
            if (i == 80) {
                return a(layoutManager, c(layoutManager));
            }
            if (i == 8388611) {
                return c(layoutManager, d(layoutManager));
            }
            if (i == 8388613) {
                return a(layoutManager, d(layoutManager));
            }
        }
        return null;
    }

    private int b(View view, OrientationHelper orientationHelper, boolean z) {
        if (a(view) && !z) {
            return c(view, orientationHelper, true);
        }
        return orientationHelper.getDecoratedStart(view) - orientationHelper.getStartAfterPadding();
    }

    private static boolean a(View view) {
        return view.getLayoutDirection() == 1;
    }

    private int c(View view, OrientationHelper orientationHelper, boolean z) {
        if (a(view) && !z) {
            return b(view, orientationHelper, true);
        }
        return orientationHelper.getDecoratedEnd(view) - orientationHelper.getEndAfterPadding();
    }

    private View c(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        LinearLayoutManager linearLayoutManager;
        int findFirstVisibleItemPosition;
        float decoratedEnd;
        int decoratedMeasurement;
        if (!(layoutManager instanceof LinearLayoutManager) || (findFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) == -1) {
            return null;
        }
        View findViewByPosition = layoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (a(findViewByPosition)) {
            decoratedEnd = orientationHelper.getTotalSpace() - orientationHelper.getDecoratedStart(findViewByPosition);
            decoratedMeasurement = orientationHelper.getDecoratedMeasurement(findViewByPosition);
        } else {
            decoratedEnd = orientationHelper.getDecoratedEnd(findViewByPosition);
            decoratedMeasurement = orientationHelper.getDecoratedMeasurement(findViewByPosition);
        }
        float f = decoratedEnd / decoratedMeasurement;
        boolean z = linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1;
        if (f <= 0.5f || z) {
            if (z) {
                return null;
            }
            return layoutManager.findViewByPosition(findFirstVisibleItemPosition + 1);
        }
        return findViewByPosition;
    }

    private View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        LinearLayoutManager linearLayoutManager;
        int findLastVisibleItemPosition;
        float totalSpace;
        int decoratedMeasurement;
        if (!(layoutManager instanceof LinearLayoutManager) || (findLastVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) layoutManager).findLastVisibleItemPosition()) == -1) {
            return null;
        }
        View findViewByPosition = layoutManager.findViewByPosition(findLastVisibleItemPosition);
        if (a(findViewByPosition)) {
            totalSpace = orientationHelper.getDecoratedEnd(findViewByPosition);
            decoratedMeasurement = orientationHelper.getDecoratedMeasurement(findViewByPosition);
        } else {
            totalSpace = orientationHelper.getTotalSpace() - orientationHelper.getDecoratedStart(findViewByPosition);
            decoratedMeasurement = orientationHelper.getDecoratedMeasurement(findViewByPosition);
        }
        float f = totalSpace / decoratedMeasurement;
        boolean z = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
        if (f <= 0.5f || z) {
            if (z) {
                return null;
            }
            return layoutManager.findViewByPosition(findLastVisibleItemPosition - 1);
        }
        return findViewByPosition;
    }

    private OrientationHelper d(RecyclerView.LayoutManager layoutManager) {
        if (this.d == null) {
            this.d = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.d;
    }

    private OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        if (this.f == null) {
            this.f = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.e.getContext()) { // from class: o.zk.1
                @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void setTargetPosition(int i) {
                    int max;
                    int i2 = C9956zk.this.m * C9956zk.this.f13934o * C9956zk.this.n;
                    if (i > C9956zk.this.b) {
                        max = Math.min(C9956zk.this.b + i2, i);
                    } else {
                        max = Math.max(C9956zk.this.b - i2, i);
                    }
                    super.setTargetPosition(max);
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    C9956zk c9956zk = C9956zk.this;
                    int[] calculateDistanceToFinalSnap = c9956zk.calculateDistanceToFinalSnap(c9956zk.e.getLayoutManager(), view);
                    int i = calculateDistanceToFinalSnap[0];
                    int i2 = calculateDistanceToFinalSnap[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        action.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return C9956zk.this.i / displayMetrics.densityDpi;
                }
            };
        }
        return null;
    }
}
