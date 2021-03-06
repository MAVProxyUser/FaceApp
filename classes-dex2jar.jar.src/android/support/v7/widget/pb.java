package android.support.v7.widget;

import Vd;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import qc;
import qc.a;

public class pb
{
  private final Context a;
  private final TypedArray b;
  private TypedValue c;
  
  private pb(Context paramContext, TypedArray paramTypedArray)
  {
    this.a = paramContext;
    this.b = paramTypedArray;
  }
  
  public static pb a(Context paramContext, int paramInt, int[] paramArrayOfInt)
  {
    return new pb(paramContext, paramContext.obtainStyledAttributes(paramInt, paramArrayOfInt));
  }
  
  public static pb a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    return new pb(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt));
  }
  
  public static pb a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    return new pb(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, paramInt2));
  }
  
  public float a(int paramInt, float paramFloat)
  {
    return this.b.getDimension(paramInt, paramFloat);
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return this.b.getColor(paramInt1, paramInt2);
  }
  
  public ColorStateList a(int paramInt)
  {
    if (this.b.hasValue(paramInt))
    {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0)
      {
        ColorStateList localColorStateList = Vd.a(this.a, i);
        if (localColorStateList != null) {
          return localColorStateList;
        }
      }
    }
    return this.b.getColorStateList(paramInt);
  }
  
  public Typeface a(int paramInt1, int paramInt2, qc.a parama)
  {
    paramInt1 = this.b.getResourceId(paramInt1, 0);
    if (paramInt1 == 0) {
      return null;
    }
    if (this.c == null) {
      this.c = new TypedValue();
    }
    return qc.a(this.a, paramInt1, this.c, paramInt2, parama);
  }
  
  public void a()
  {
    this.b.recycle();
  }
  
  public boolean a(int paramInt, boolean paramBoolean)
  {
    return this.b.getBoolean(paramInt, paramBoolean);
  }
  
  public float b(int paramInt, float paramFloat)
  {
    return this.b.getFloat(paramInt, paramFloat);
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    return this.b.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public Drawable b(int paramInt)
  {
    if (this.b.hasValue(paramInt))
    {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0) {
        return Vd.b(this.a, i);
      }
    }
    return this.b.getDrawable(paramInt);
  }
  
  public int c(int paramInt1, int paramInt2)
  {
    return this.b.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public Drawable c(int paramInt)
  {
    if (this.b.hasValue(paramInt))
    {
      paramInt = this.b.getResourceId(paramInt, 0);
      if (paramInt != 0) {
        return p.a().a(this.a, paramInt, true);
      }
    }
    return null;
  }
  
  public int d(int paramInt1, int paramInt2)
  {
    return this.b.getInt(paramInt1, paramInt2);
  }
  
  public String d(int paramInt)
  {
    return this.b.getString(paramInt);
  }
  
  public int e(int paramInt1, int paramInt2)
  {
    return this.b.getInteger(paramInt1, paramInt2);
  }
  
  public CharSequence e(int paramInt)
  {
    return this.b.getText(paramInt);
  }
  
  public int f(int paramInt1, int paramInt2)
  {
    return this.b.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public CharSequence[] f(int paramInt)
  {
    return this.b.getTextArray(paramInt);
  }
  
  public int g(int paramInt1, int paramInt2)
  {
    return this.b.getResourceId(paramInt1, paramInt2);
  }
  
  public boolean g(int paramInt)
  {
    return this.b.hasValue(paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */