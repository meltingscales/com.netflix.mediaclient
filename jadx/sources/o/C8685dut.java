package o;

import kotlin.text.Regex;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dut  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8685dut {
    public static final Regex a;
    public static final C8685dut d = new C8685dut();

    private C8685dut() {
    }

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        a = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
