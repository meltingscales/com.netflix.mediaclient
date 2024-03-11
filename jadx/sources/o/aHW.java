package o;

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
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
class aHW extends Resources {
    private static int b = 1;
    private static int c = 0;
    private static byte e$ss2$462 = 24;
    protected final Resources a;

    public aHW(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = resources;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        int i2 = 2 % 2;
        int i3 = c + 5;
        b = i3 % 128;
        int i4 = i3 % 2;
        Resources resources = this.a;
        String string = resources.getString(i);
        if (!(!string.startsWith("'!#+"))) {
            Object[] objArr = new Object[1];
            e(string.substring(4), objArr);
            String intern = ((String) objArr[0]).intern();
            CharSequence text = resources.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(intern);
                TextUtils.copySpansFrom((SpannedString) text, 0, intern.length(), Object.class, spannableString, 0);
                int i5 = b + 111;
                c = i5 % 128;
                int i6 = i5 % 2;
                return spannableString;
            }
            return intern;
        }
        return string;
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        return this.a.getQuantityText(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if ((!r6.startsWith("'!#+")) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r6.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        r1 = new java.lang.Object[1];
        e(r6.substring(4), r1);
        r6 = ((java.lang.String) r1[0]).intern();
     */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.aHW.b
            int r1 = r1 + 49
            int r2 = r1 % 128
            o.aHW.c = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "'!#+"
            r4 = 1
            if (r1 == 0) goto L23
            android.content.res.Resources r1 = r5.a
            java.lang.String r6 = r1.getString(r6)
            boolean r1 = r6.startsWith(r3)
            r3 = 52
            int r3 = r3 / r2
            r1 = r1 ^ r4
            if (r1 == r4) goto L41
            goto L2f
        L23:
            android.content.res.Resources r1 = r5.a
            java.lang.String r6 = r1.getString(r6)
            boolean r1 = r6.startsWith(r3)
            if (r1 == 0) goto L41
        L2f:
            r1 = 4
            java.lang.String r6 = r6.substring(r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r5.e(r6, r1)
            r6 = r1[r2]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
        L41:
            int r1 = o.aHW.c
            int r1 = r1 + 125
            int r2 = r1 % 128
            o.aHW.b = r2
            int r1 = r1 % r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aHW.getString(int):java.lang.String");
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) {
        return this.a.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.a.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        return this.a.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        return this.a.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        return this.a.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        return this.a.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        return this.a.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        return this.a.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        return this.a.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        return this.a.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        return this.a.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.a.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        return this.a.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.a.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        return this.a.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.a.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) {
        return this.a.getMovie(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) {
        return this.a.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) {
        return this.a.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        return this.a.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        return this.a.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        return this.a.getLayout(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        return this.a.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        return this.a.getXml(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        return this.a.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.a.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.a.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.a.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.a.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        return this.a.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        return this.a.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        return this.a.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        return this.a.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.a.parseBundleExtra(str, attributeSet, bundle);
    }

    private void e(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$462);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
