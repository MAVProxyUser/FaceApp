package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class _a
  extends YU
  implements Ya
{
  public _a()
  {
    super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
  }
  
  public static Ya a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    if ((localIInterface instanceof Ya)) {
      return (Ya)localIInterface;
    }
    return new ab(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3) {
        return false;
      }
      paramParcel1 = va();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
    }
    else
    {
      paramParcel1 = getText();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */