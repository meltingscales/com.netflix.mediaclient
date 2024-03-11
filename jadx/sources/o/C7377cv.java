package o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.cv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7377cv {
    private final List<C5859cL> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(C5859cL c5859cL) {
        this.a.add(c5859cL);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            C8914fh.e(path, this.a.get(size));
        }
    }
}
