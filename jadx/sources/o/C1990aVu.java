package o;

import android.content.Context;
import android.content.Intent;
import com.facebook.battery.metrics.composite.CompositeMetrics;
import com.facebook.battery.metrics.composite.CompositeMetricsCollector;
import com.facebook.battery.metrics.core.StatefulSystemMetricsCollector;
import com.facebook.battery.metrics.cpu.CpuFrequencyMetrics;
import com.facebook.battery.metrics.cpu.CpuFrequencyMetricsCollector;
import com.facebook.battery.metrics.cpu.CpuMetrics;
import com.facebook.battery.metrics.cpu.CpuMetricsCollector;
import com.facebook.battery.metrics.devicebattery.DeviceBatteryMetrics;
import com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector;
import com.facebook.battery.metrics.time.TimeMetrics;
import com.facebook.battery.metrics.time.TimeMetricsCollector;
import com.facebook.battery.metrics.wakelock.WakeLockMetrics;
import com.facebook.battery.metrics.wakelock.WakeLockMetricsCollector;
import com.facebook.battery.reporter.composite.CompositeMetricsReporter;
import com.facebook.battery.reporter.core.SystemMetricsReporter;
import com.facebook.battery.reporter.cpu.CpuFrequencyMetricsReporter;
import com.facebook.battery.reporter.cpu.CpuMetricsReporter;
import com.facebook.battery.reporter.devicebattery.DeviceBatteryMetricsReporter;
import com.facebook.battery.reporter.time.TimeMetricsReporter;
import com.facebook.battery.reporter.wakelock.WakeLockMetricsReporter;
import com.facebook.battery.serializer.composite.CompositeMetricsSerializer;
import com.facebook.battery.serializer.cpu.CpuFrequencyMetricsSerializer;
import com.facebook.battery.serializer.cpu.CpuMetricsSerializer;
import com.facebook.battery.serializer.devicebattery.DeviceBatteryMetricsSerializer;
import com.facebook.battery.serializer.time.TimeMetricsSerializer;
import com.facebook.battery.serializer.wakelock.WakeLockMetricsSerializer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: o.aVu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1990aVu implements InterfaceC1072Nq {
    private final File a;
    private final CompositeMetricsCollector b;
    private final CompositeMetricsSerializer c;
    private final SystemMetricsReporter.Event d = new C1989aVt();
    private final CompositeMetricsReporter e;
    private final StatefulSystemMetricsCollector<CompositeMetrics, CompositeMetricsCollector> i;

    private boolean c() {
        return false;
    }

    @Override // o.InterfaceC1072Nq
    public void b(NC nc) {
    }

    @Override // o.InterfaceC1072Nq
    public void c(NC nc) {
    }

    @Override // o.InterfaceC1072Nq
    public void d(NC nc) {
    }

    @Override // o.InterfaceC1072Nq
    public void e(NC nc) {
    }

    public C1990aVu(Context context) {
        Context applicationContext = context.getApplicationContext();
        CompositeMetricsCollector build = new CompositeMetricsCollector.Builder().addMetricsCollector(TimeMetrics.class, new TimeMetricsCollector()).addMetricsCollector(CpuMetrics.class, new CpuMetricsCollector()).addMetricsCollector(CpuFrequencyMetrics.class, new CpuFrequencyMetricsCollector()).addMetricsCollector(WakeLockMetrics.class, new WakeLockMetricsCollector()).addMetricsCollector(DeviceBatteryMetrics.class, new DeviceBatteryMetricsCollector(applicationContext)).build();
        this.b = build;
        this.e = new CompositeMetricsReporter().addMetricsReporter(TimeMetrics.class, new TimeMetricsReporter()).addMetricsReporter(CpuFrequencyMetrics.class, new CpuFrequencyMetricsReporter()).addMetricsReporter(CpuMetrics.class, new CpuMetricsReporter()).addMetricsReporter(WakeLockMetrics.class, new WakeLockMetricsReporter()).addMetricsReporter(DeviceBatteryMetrics.class, new DeviceBatteryMetricsReporter());
        this.c = new CompositeMetricsSerializer().addMetricsSerializer(TimeMetrics.class, new TimeMetricsSerializer()).addMetricsSerializer(CpuFrequencyMetrics.class, new CpuFrequencyMetricsSerializer()).addMetricsSerializer(CpuMetrics.class, new CpuMetricsSerializer()).addMetricsSerializer(WakeLockMetrics.class, new WakeLockMetricsSerializer()).addMetricsSerializer(DeviceBatteryMetrics.class, new DeviceBatteryMetricsSerializer());
        this.i = new StatefulSystemMetricsCollector<>(build);
        this.a = applicationContext.getFilesDir();
    }

    public void d() {
        AbstractApplicationC1040Mh.getInstance().o().c(this);
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(e()));
            this.c.deserialize(this.b.createMetrics(), dataInputStream);
            dataInputStream.close();
        } catch (IOException e) {
            C1044Mm.j("BatteryApplication", "Failed to deserialize", e);
        }
    }

    private void e(String str) {
        if (c()) {
            CompositeMetrics latestDiffAndReset = this.i.getLatestDiffAndReset();
            this.d.acquireEvent(null, "BatteryMetricsLogging");
            if (this.d.isSampled()) {
                this.d.add("dimension", str);
                this.e.reportTo(latestDiffAndReset, this.d);
                this.d.logAndRelease();
            }
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(e()));
                this.c.serialize(latestDiffAndReset, dataOutputStream);
                dataOutputStream.close();
            } catch (IOException e) {
                C1044Mm.j("BatteryMetricsLogging", "Failed to serialize", e);
            }
        }
    }

    private File e() {
        return new File(this.a, "snapshot20180815");
    }

    @Override // o.InterfaceC1072Nq
    public void c(NC nc, Intent intent) {
        e("background");
    }

    @Override // o.InterfaceC1072Nq
    public void a(NC nc, boolean z) {
        e("foreground");
    }
}
