package android.support.design.theme;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.l;
import android.util.AttributeSet;
import qa;

@Keep
public class MaterialComponentsViewInflater
  extends AppCompatViewInflater
{
  protected l createButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new qa(paramContext, paramAttributeSet);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/theme/MaterialComponentsViewInflater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */