package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: o.bmN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4779bmN implements SensorEventListener {
    @SuppressLint({"StaticFieldLeak"})
    private static C4779bmN a;
    public static final d c = new d(null);
    private float b;
    private final Sensor d;
    private final Context e;
    private final SensorManager h;

    public static final void a() {
        c.b();
    }

    public static final C4779bmN b(Context context) {
        C4779bmN e;
        synchronized (C4779bmN.class) {
            e = c.e(context);
        }
        return e;
    }

    public final float b() {
        return this.b;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C4779bmN(Context context) {
        C8632dsu.c((Object) context, "");
        this.e = context;
        Object systemService = context.getSystemService("sensor");
        C8632dsu.d(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.h = sensorManager;
        this.d = sensorManager.getDefaultSensor(5);
        this.b = -1.0f;
    }

    /* renamed from: o.bmN$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("AmbientLightChangeObserver");
        }

        public final C4779bmN e(Context context) {
            C4779bmN c4779bmN;
            synchronized (this) {
                C8632dsu.c((Object) context, "");
                if (C4779bmN.a == null) {
                    C4779bmN.a = new C4779bmN(context);
                }
                c4779bmN = C4779bmN.a;
            }
            return c4779bmN;
        }

        public final void b() {
            C4779bmN.a = null;
        }
    }

    public final void e() {
        this.h.registerListener(this, this.d, 2);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent == null || (fArr = sensorEvent.values) == null) {
            return;
        }
        float f = fArr[0];
        if (this.b < 0.0f) {
            this.b = f;
            this.h.unregisterListener(this);
        }
    }
}
