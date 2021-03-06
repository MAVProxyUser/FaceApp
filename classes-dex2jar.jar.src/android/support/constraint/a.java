package android.support.constraint;

import G;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.reflect.Field;
import java.util.Arrays;

public abstract class a
  extends View
{
  protected int[] a = new int[32];
  protected int b;
  protected Context c;
  protected G d;
  protected boolean e = false;
  private String f;
  
  public a(Context paramContext)
  {
    super(paramContext);
    this.c = paramContext;
    a(null);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.c = paramContext;
    a(paramAttributeSet);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.c = paramContext;
    a(paramAttributeSet);
  }
  
  private void a(String paramString)
  {
    if (paramString == null) {
      return;
    }
    if (this.c == null) {
      return;
    }
    paramString = paramString.trim();
    try
    {
      i = f.class.getField(paramString).getInt(null);
    }
    catch (Exception localException)
    {
      i = 0;
    }
    int j = i;
    if (i == 0) {
      j = this.c.getResources().getIdentifier(paramString, "id", this.c.getPackageName());
    }
    int i = j;
    Object localObject;
    if (j == 0)
    {
      i = j;
      if (isInEditMode())
      {
        i = j;
        if ((getParent() instanceof ConstraintLayout))
        {
          localObject = ((ConstraintLayout)getParent()).a(0, paramString);
          i = j;
          if (localObject != null)
          {
            i = j;
            if ((localObject instanceof Integer)) {
              i = ((Integer)localObject).intValue();
            }
          }
        }
      }
    }
    if (i != 0)
    {
      setTag(i, null);
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Could not find id of \"");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("\"");
      Log.w("ConstraintHelper", ((StringBuilder)localObject).toString());
    }
  }
  
  private void setIds(String paramString)
  {
    if (paramString == null) {
      return;
    }
    int j;
    for (int i = 0;; i = j + 1)
    {
      j = paramString.indexOf(',', i);
      if (j == -1)
      {
        a(paramString.substring(i));
        return;
      }
      a(paramString.substring(i, j));
    }
  }
  
  public void a()
  {
    if (this.d == null) {
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    if ((localLayoutParams instanceof ConstraintLayout.a)) {
      ((ConstraintLayout.a)localLayoutParams).la = this.d;
    }
  }
  
  public void a(ConstraintLayout paramConstraintLayout) {}
  
  protected void a(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, g.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == g.ConstraintLayout_Layout_constraint_referenced_ids)
        {
          this.f = paramAttributeSet.getString(k);
          setIds(this.f);
        }
      }
    }
  }
  
  public void b(ConstraintLayout paramConstraintLayout) {}
  
  public void c(ConstraintLayout paramConstraintLayout)
  {
    if (isInEditMode()) {
      setIds(this.f);
    }
    Object localObject = this.d;
    if (localObject == null) {
      return;
    }
    ((G)localObject).J();
    for (int i = 0; i < this.b; i++)
    {
      localObject = paramConstraintLayout.b(this.a[i]);
      if (localObject != null) {
        this.d.b(paramConstraintLayout.a((View)localObject));
      }
    }
  }
  
  public int[] getReferencedIds()
  {
    return Arrays.copyOf(this.a, this.b);
  }
  
  public void onDraw(Canvas paramCanvas) {}
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.e) {
      super.onMeasure(paramInt1, paramInt2);
    } else {
      setMeasuredDimension(0, 0);
    }
  }
  
  public void setReferencedIds(int[] paramArrayOfInt)
  {
    int i = 0;
    this.b = 0;
    while (i < paramArrayOfInt.length)
    {
      setTag(paramArrayOfInt[i], null);
      i++;
    }
  }
  
  public void setTag(int paramInt, Object paramObject)
  {
    int i = this.b;
    paramObject = this.a;
    if (i + 1 > paramObject.length) {
      this.a = Arrays.copyOf((int[])paramObject, paramObject.length * 2);
    }
    paramObject = this.a;
    i = this.b;
    paramObject[i] = paramInt;
    this.b = (i + 1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/constraint/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */