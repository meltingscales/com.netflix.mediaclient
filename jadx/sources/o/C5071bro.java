package o;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.bro  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5071bro extends BroadcastReceiver {
    private BluetoothDevice a;
    private boolean b;
    private BluetoothAdapter c;
    private boolean d = false;
    private AudioManager e;
    private b f;
    private BluetoothHeadset g;
    private Context h;
    private BluetoothProfile.ServiceListener j;

    /* renamed from: o.bro$b */
    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    public C5071bro(Context context, b bVar) {
        this.h = context;
        this.e = (AudioManager) context.getSystemService("audio");
        this.f = bVar;
    }

    public void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        ContextCompat.registerReceiver(this.h, this, intentFilter, 4);
        C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] broadcast receiver started");
        f();
    }

    private void f() {
        if (this.d) {
            C1044Mm.j("nf_voip_bluetooth", "[BluetoothAudioManager] Already started, skipping...");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.c = defaultAdapter;
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            if (this.j != null) {
                C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] Headset profile was already opened, let's close it");
                this.c.closeProfileProxy(1, this.g);
            }
            BluetoothProfile.ServiceListener serviceListener = new BluetoothProfile.ServiceListener() { // from class: o.bro.2
                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                    if (i == 1) {
                        C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] Headset connected");
                        C5071bro.this.g = (BluetoothHeadset) bluetoothProfile;
                        C5071bro.this.d = true;
                    }
                }

                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceDisconnected(int i) {
                    if (i == 1) {
                        C5071bro.this.g = null;
                        C5071bro.this.d = false;
                        C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] Headset disconnected");
                        C5071bro.this.f.a();
                    }
                }
            };
            this.j = serviceListener;
            if (this.c.getProfileProxy(this.h, serviceListener, 1)) {
                return;
            }
            C1044Mm.j("nf_voip_bluetooth", "[BluetoothAudioManager] getProfileProxy failed !");
            return;
        }
        C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] Interface disabled on device");
    }

    public boolean i() {
        AudioManager audioManager;
        BluetoothAdapter bluetoothAdapter = this.c;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && (audioManager = this.e) != null && audioManager.isBluetoothScoAvailableOffCall() && e()) {
            AudioManager audioManager2 = this.e;
            if (audioManager2 != null && !audioManager2.isBluetoothScoOn()) {
                C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] SCO off, let's start it");
                this.e.setBluetoothScoOn(true);
                this.e.startBluetoothSco();
            }
            boolean d = d();
            if (d) {
                C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] Audio route ok");
            } else {
                C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] Audio route not ok.");
            }
            return d;
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public boolean d() {
        AudioManager audioManager;
        BluetoothHeadset bluetoothHeadset = this.g;
        return bluetoothHeadset != null && bluetoothHeadset.isAudioConnected(this.a) && this.b && (audioManager = this.e) != null && audioManager.isBluetoothScoOn();
    }

    @SuppressLint({"MissingPermission"})
    public boolean e() {
        AudioManager audioManager;
        BluetoothHeadset bluetoothHeadset;
        BluetoothAdapter bluetoothAdapter = this.c;
        boolean z = false;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && (audioManager = this.e) != null && audioManager.isBluetoothScoAvailableOffCall() && (bluetoothHeadset = this.g) != null) {
            List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
            this.a = null;
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BluetoothDevice next = it.next();
                int connectionState = this.g.getConnectionState(next);
                C1044Mm.a("nf_voip_bluetooth", "[BluetoothAudioManager] BT device %s, state %d", next, Integer.valueOf(connectionState));
                if (connectionState == 2) {
                    this.a = next;
                    z = true;
                    break;
                }
            }
            C1044Mm.e("nf_voip_bluetooth", z ? "[BluetoothAudioManager] Headset found, bluetooth audio route available" : "[BluetoothAudioManager] No headset found, bluetooth audio route unavailable");
        }
        return z;
    }

    public void a() {
        AudioManager audioManager = this.e;
        if (audioManager != null) {
            audioManager.stopBluetoothSco();
            this.e.setBluetoothScoOn(false);
            C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] SCO disconnected!");
        }
    }

    public void j() {
        BluetoothHeadset bluetoothHeadset;
        C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] Stopping...");
        this.d = false;
        a();
        BluetoothAdapter bluetoothAdapter = this.c;
        if (bluetoothAdapter != null && this.j != null && (bluetoothHeadset = this.g) != null) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
            this.j = null;
        }
        this.a = null;
        C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] Stopped!");
    }

    public void b() {
        try {
            j();
            this.h.unregisterReceiver(this);
        } catch (Exception e) {
            C1044Mm.d("nf_voip_bluetooth", e.getMessage());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            if (intExtra == 1) {
                C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] SCO state: connected");
                this.b = true;
            } else if (intExtra == 0) {
                C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] SCO state: disconnected");
                this.b = false;
            }
        } else if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(action)) {
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
            if (intExtra2 == 0) {
                C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] State: disconnected, stopping Blutooth");
                j();
            } else if (intExtra2 == 2) {
                C1044Mm.e("nf_voip_bluetooth", "[BluetoothAudioManager] State: connected, starting Bluetooth");
                f();
            }
        }
    }
}
