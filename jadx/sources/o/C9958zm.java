package o;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.netflix.model.leafs.ArtworkColors;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* renamed from: o.zm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9958zm extends FrameLayout {
    private static final WeakHashMap<Context, Integer> d = new WeakHashMap<>();
    private final int a;
    private TextPaint b;
    private LinkedList<String> c;
    private int e;

    public C9958zm(Context context) {
        this(context, null, 0);
    }

    public C9958zm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9958zm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new LinkedList<>();
        this.b = new TextPaint();
        this.e = 0;
        WeakHashMap<Context, Integer> weakHashMap = d;
        Integer num = weakHashMap.get(context);
        Integer valueOf = Integer.valueOf((num == null ? 0 : num).intValue() + 1);
        this.a = valueOf.intValue();
        weakHashMap.put(context, valueOf);
        this.b.density = context.getResources().getDisplayMetrics().density;
        this.b.setColor(-1);
        this.b.setStrokeWidth(6.0f);
        this.b.setTextSize(30.0f);
        TextPaint textPaint = this.b;
        textPaint.setShadowLayer(textPaint.density * 4.0f, 0.0f, 0.0f, ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        setWillNotDraw(false);
        LinkedList<String> linkedList = this.c;
        linkedList.push(this.e + ". created");
        this.e = this.e + 1;
    }

    public void d() {
        LinkedList<String> linkedList = this.c;
        linkedList.push(this.e + ". onViewAttachedToWindow");
        f();
    }

    public void j() {
        LinkedList<String> linkedList = this.c;
        linkedList.push(this.e + ". onViewDetachedFromWindow");
        f();
    }

    public void h() {
        LinkedList<String> linkedList = this.c;
        linkedList.addFirst(this.e + ". onViewRecycled");
        f();
    }

    public void e(int i) {
        LinkedList<String> linkedList = this.c;
        linkedList.addFirst(this.e + ". onBindViewHolder(" + i + ")");
        f();
    }

    public void c() {
        LinkedList<String> linkedList = this.c;
        linkedList.addFirst(this.e + ". onFailedToRecycleView");
        f();
    }

    public void a() {
        LinkedList<String> linkedList = this.c;
        linkedList.addFirst(this.e + ". onLayoutCoverView");
        f();
    }

    public void b(String str) {
        LinkedList<String> linkedList = this.c;
        linkedList.addFirst(this.e + ". " + str);
        f();
    }

    public final String e() {
        return b() + " #" + this.a;
    }

    private void f() {
        while (this.c.size() > 15) {
            this.c.removeLast();
        }
        invalidate();
        this.e++;
    }

    @Override // android.view.View
    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        canvas.drawText(e(), 10.0f, 40, this.b);
        Iterator<String> it = this.c.iterator();
        int i = 80;
        while (it.hasNext()) {
            canvas.drawText(it.next(), 10.0f, i, this.b);
            i += 40;
        }
    }

    protected String b() {
        return getClass().getSimpleName();
    }
}
