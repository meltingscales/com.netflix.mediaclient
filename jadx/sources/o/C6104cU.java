package o;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.cU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6104cU {
    private final List<AbstractC5913cN<C7880dP, Path>> a;
    private final List<Mask> b;
    private final List<AbstractC5913cN<Integer, Integer>> e;

    public List<AbstractC5913cN<C7880dP, Path>> b() {
        return this.a;
    }

    public List<Mask> d() {
        return this.b;
    }

    public List<AbstractC5913cN<Integer, Integer>> e() {
        return this.e;
    }

    public C6104cU(List<Mask> list) {
        this.b = list;
        this.a = new ArrayList(list.size());
        this.e = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).e().b());
            this.e.add(list.get(i).d().b());
        }
    }
}
