package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.ContextCompat;
import androidx.mediarouter.R;
import java.nio.charset.StandardCharsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    private static int b = 0;
    private static int e = 1;
    private static byte e$ss2$57 = 24;
    final AnimationDrawable mCollapseAnimationDrawable;
    final String mCollapseGroupDescription;
    final AnimationDrawable mExpandAnimationDrawable;
    final String mExpandGroupDescription;
    boolean mIsGroupExpanded;
    View.OnClickListener mListener;

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) ContextCompat.getDrawable(context, R.drawable.mr_group_expand);
        this.mExpandAnimationDrawable = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) ContextCompat.getDrawable(context, R.drawable.mr_group_collapse);
        this.mCollapseAnimationDrawable = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(MediaRouterThemeHelper.getControllerColor(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            c(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i2 = e + 71;
            b = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.mExpandGroupDescription = string;
        String string2 = context.getString(R.string.mr_controller_collapse_group);
        if (!(!string2.startsWith("'!#+"))) {
            Object[] objArr2 = new Object[1];
            c(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
        }
        this.mCollapseGroupDescription = string2;
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteExpandCollapseButton.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                boolean z = !mediaRouteExpandCollapseButton.mIsGroupExpanded;
                mediaRouteExpandCollapseButton.mIsGroupExpanded = z;
                if (z) {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.mExpandAnimationDrawable);
                    MediaRouteExpandCollapseButton.this.mExpandAnimationDrawable.start();
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.mCollapseGroupDescription);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.mCollapseAnimationDrawable);
                    MediaRouteExpandCollapseButton.this.mCollapseAnimationDrawable.start();
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.mExpandGroupDescription);
                }
                View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.mListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
        int i5 = b + 27;
        e = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void c(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$57);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
