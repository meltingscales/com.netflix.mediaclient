package o;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* renamed from: o.cD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5643cD implements InterfaceC5724cG, InterfaceC5508cA {
    private final String a;
    private final MergePaths d;
    private final Path b = new Path();
    private final Path g = new Path();
    private final Path c = new Path();
    private final List<InterfaceC5724cG> e = new ArrayList();

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.a;
    }

    public C5643cD(MergePaths mergePaths) {
        this.a = mergePaths.b();
        this.d = mergePaths;
    }

    @Override // o.InterfaceC5508cA
    public void e(ListIterator<InterfaceC7324cu> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC7324cu previous = listIterator.previous();
            if (previous instanceof InterfaceC5724cG) {
                this.e.add((InterfaceC5724cG) previous);
                listIterator.remove();
            }
        }
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).e(list, list2);
        }
    }

    @Override // o.InterfaceC5724cG
    public Path c() {
        this.c.reset();
        if (this.d.d()) {
            return this.c;
        }
        int i = AnonymousClass3.a[this.d.c().ordinal()];
        if (i == 1) {
            b();
        } else if (i == 2) {
            e(Path.Op.UNION);
        } else if (i == 3) {
            e(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            e(Path.Op.INTERSECT);
        } else if (i == 5) {
            e(Path.Op.XOR);
        }
        return this.c;
    }

    /* renamed from: o.cD$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void b() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).c());
        }
    }

    @TargetApi(19)
    private void e(Path.Op op) {
        this.g.reset();
        this.b.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            InterfaceC5724cG interfaceC5724cG = this.e.get(size);
            if (interfaceC5724cG instanceof C7483cx) {
                C7483cx c7483cx = (C7483cx) interfaceC5724cG;
                List<InterfaceC5724cG> a = c7483cx.a();
                for (int size2 = a.size() - 1; size2 >= 0; size2--) {
                    Path c = a.get(size2).c();
                    c.transform(c7483cx.i());
                    this.g.addPath(c);
                }
            } else {
                this.g.addPath(interfaceC5724cG.c());
            }
        }
        InterfaceC5724cG interfaceC5724cG2 = this.e.get(0);
        if (interfaceC5724cG2 instanceof C7483cx) {
            C7483cx c7483cx2 = (C7483cx) interfaceC5724cG2;
            List<InterfaceC5724cG> a2 = c7483cx2.a();
            for (int i = 0; i < a2.size(); i++) {
                Path c2 = a2.get(i).c();
                c2.transform(c7483cx2.i());
                this.b.addPath(c2);
            }
        } else {
            this.b.set(interfaceC5724cG2.c());
        }
        this.c.op(this.b, this.g, op);
    }
}
