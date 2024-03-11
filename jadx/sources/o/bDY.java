package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;

/* loaded from: classes4.dex */
public class bDY extends NetflixDialogFrag implements SeekBar.OnSeekBarChangeListener {
    private BroadcastReceiver b;
    private SeekBar d;
    private c e;

    /* loaded from: classes4.dex */
    public interface c {
        void d(int i);
    }

    public void a(c cVar) {
        this.e = cVar;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public static bDY e() {
        bDY bdy = new bDY();
        bdy.setStyle(1, 0);
        return bdy;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.bO, viewGroup, false);
        SeekBar seekBar = (SeekBar) inflate.findViewById(com.netflix.mediaclient.ui.R.g.ha);
        this.d = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.d.setMax(100);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.b = new BroadcastReceiver() { // from class: o.bDY.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("volume", -1);
                if (intExtra >= 0) {
                    bDY.this.d.setProgress(intExtra);
                } else {
                    C1044Mm.d("VolumeDialogFrag", "Volume value is missed from MDX_ACTION_SETVOLUME Intent");
                }
            }
        };
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.b, new IntentFilter("com.netflix.mediaclient.intent.action.MDX_ACTION_SETVOLUME"));
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o.bDY.2
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (bDY.this.getActivity() != null) {
                    return ((NetflixActivity) bDY.this.getActivity()).dispatchKeyEvent(keyEvent);
                }
                return false;
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (getActivity() == null || this.b == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(this.b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.d.setProgress(d());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        C1044Mm.b("VolumeDialogFrag", "Setting mdx volume to: " + progress);
        getNetflixActivity().requireMdxTargetCallback().c(progress);
        c cVar = this.e;
        if (cVar != null) {
            cVar.d(progress);
        }
    }

    private int d() {
        return getNetflixActivity().requireMdxTargetCallback().h();
    }
}
