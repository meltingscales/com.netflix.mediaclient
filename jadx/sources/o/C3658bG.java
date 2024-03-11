package o;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: o.bG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3658bG {
    private float a;
    private Map<String, C8315di> b;
    private float c;
    private Rect d;
    private SparseArrayCompat<C8422dl> e;
    private Map<String, C6478ce> f;
    private LongSparseArray<Layer> g;
    private List<C8503do> h;
    private boolean i;
    private List<Layer> j;
    private Map<String, List<Layer>> n;

    /* renamed from: o  reason: collision with root package name */
    private float f13503o;
    private final C6955cn l = new C6955cn();
    private final HashSet<String> m = new HashSet<>();
    private int k = 0;

    public SparseArrayCompat<C8422dl> a() {
        return this.e;
    }

    public float b() {
        return this.c - this.f13503o;
    }

    public Rect c() {
        return this.d;
    }

    public float d() {
        return this.c;
    }

    public void d(int i) {
        this.k += i;
    }

    public void d(boolean z) {
        this.i = z;
    }

    public void e(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, C6478ce> map2, SparseArrayCompat<C8422dl> sparseArrayCompat, Map<String, C8315di> map3, List<C8503do> list2) {
        this.d = rect;
        this.f13503o = f;
        this.c = f2;
        this.a = f3;
        this.j = list;
        this.g = longSparseArray;
        this.n = map;
        this.f = map2;
        this.e = sparseArrayCompat;
        this.b = map3;
        this.h = list2;
    }

    public float f() {
        return this.a;
    }

    public Map<String, C6478ce> g() {
        return this.f;
    }

    public int h() {
        return this.k;
    }

    public List<Layer> i() {
        return this.j;
    }

    public Map<String, C8315di> j() {
        return this.b;
    }

    public C6955cn k() {
        return this.l;
    }

    public boolean l() {
        return this.i;
    }

    public float m() {
        return this.f13503o;
    }

    public void c(String str) {
        C8909fc.b(str);
        this.m.add(str);
    }

    public void c(boolean z) {
        this.l.a(z);
    }

    public Layer c(long j) {
        return this.g.get(j);
    }

    public float e() {
        return (b() / this.a) * 1000.0f;
    }

    public float e(float f) {
        return C8853eZ.b(this.f13503o, this.c, f);
    }

    public List<Layer> a(String str) {
        return this.n.get(str);
    }

    public C8503do d(String str) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            C8503do c8503do = this.h.get(i);
            if (c8503do.e(str)) {
                return c8503do;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.j) {
            sb.append(layer.c("\t"));
        }
        return sb.toString();
    }
}
