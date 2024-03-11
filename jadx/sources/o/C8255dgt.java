package o;

import android.graphics.Bitmap;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import java.util.LinkedList;

/* renamed from: o.dgt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8255dgt {
    private VolleyError b;
    private final Request<?> c;
    public Bitmap d;
    public final LinkedList<C8259dgx> e;

    public VolleyError c() {
        return this.b;
    }

    public void c(VolleyError volleyError) {
        this.b = volleyError;
    }

    public C8255dgt(Request<?> request, C8259dgx c8259dgx) {
        LinkedList<C8259dgx> linkedList = new LinkedList<>();
        this.e = linkedList;
        this.c = request;
        linkedList.add(c8259dgx);
    }

    public Request.ResourceLocationType e() {
        return this.c.q();
    }

    public void d(C8259dgx c8259dgx) {
        this.e.add(c8259dgx);
    }
}
