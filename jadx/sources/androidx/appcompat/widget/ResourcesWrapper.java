package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.resources.Compatibility;
import androidx.core.content.res.ResourcesCompat;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ResourcesWrapper extends Resources {
    private static int a = 1;
    private static int d = 0;
    private static byte e$ss2$472 = 24;
    private final Resources mResources;

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        int i2 = 2 % 2;
        int i3 = a + 5;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            this.mResources.getString(i).startsWith("'!#+");
            throw null;
        }
        Resources resources = this.mResources;
        String string = resources.getString(i);
        if (string.startsWith("'!#+")) {
            String substring = string.substring(4);
            Object[] objArr = new Object[1];
            b(substring, objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = resources.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            }
        }
        int i4 = a + 49;
        d = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        return this.mResources.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        int i2 = 2 % 2;
        int i3 = a + 55;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            this.mResources.getString(i).startsWith("'!#+");
            throw null;
        }
        String string = this.mResources.getString(i);
        if (string.startsWith("'!#+")) {
            int i4 = d + 123;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i5 = 8 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                b(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            int i6 = d + 89;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        return string;
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) {
        return this.mResources.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.mResources.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        return this.mResources.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        return this.mResources.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        return this.mResources.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        return this.mResources.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        return this.mResources.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        return this.mResources.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        return this.mResources.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        return this.mResources.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        return this.mResources.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.mResources.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        return this.mResources.getDrawable(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable getDrawableCanonical(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        return ResourcesCompat.getDrawable(this.mResources, i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        return ResourcesCompat.getDrawableForDensity(this.mResources, i, i2, null);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return ResourcesCompat.getDrawableForDensity(this.mResources, i, i2, theme);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) {
        return this.mResources.getMovie(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) {
        return this.mResources.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) {
        return this.mResources.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        return this.mResources.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        return this.mResources.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        return this.mResources.getLayout(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        return this.mResources.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        return this.mResources.getXml(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        return this.mResources.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.mResources.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.mResources.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.mResources.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        Compatibility.Api15Impl.getValueForDensity(this.mResources, i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.mResources.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.mResources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        return this.mResources.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        return this.mResources.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        return this.mResources.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        return this.mResources.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$472);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
