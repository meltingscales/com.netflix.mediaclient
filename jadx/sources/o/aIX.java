package o;

import android.content.Context;
import android.net.Uri;
import com.google.gson.Gson;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public abstract class aIX {
    protected final ExecutorService a;
    private final AbstractC1647aJa e;

    public aIX(AbstractC1647aJa abstractC1647aJa) {
        this.a = abstractC1647aJa.b;
        this.e = abstractC1647aJa;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context b() {
        return this.e.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Uri> a() {
        return this.e.b();
    }

    public Gson e() {
        return C8118deO.a();
    }
}
