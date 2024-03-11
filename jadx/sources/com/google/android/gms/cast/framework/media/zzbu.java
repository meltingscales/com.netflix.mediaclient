package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.widget.ArrayAdapter;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.common.internal.Preconditions;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzbu extends ArrayAdapter implements View.OnClickListener {
    private static int b = 0;
    private static int c = 1;
    private static byte e$ss2$53 = 24;
    private final Context zza;
    private int zzb;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzb = ((Integer) Preconditions.checkNotNull(((zzbt) Preconditions.checkNotNull((zzbt) view.getTag())).zzb.getTag())).intValue();
        notifyDataSetChanged();
    }

    public final MediaTrack zza() {
        int i = this.zzb;
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (MediaTrack) getItem(this.zzb);
    }

    public zzbu(Context context, List list, int i) {
        super(context, R.layout.cast_tracks_chooser_dialog_row_layout, list == null ? new ArrayList() : list);
        this.zza = context;
        this.zzb = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c9, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.zzbu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$53);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
