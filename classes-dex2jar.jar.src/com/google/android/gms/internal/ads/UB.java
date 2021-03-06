package com.google.android.gms.internal.ads;

import Hq;
import Hq.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class ub
  extends XU
  implements sb
{
  ub(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
  }
  
  public final gb E()
    throws RemoteException
  {
    Parcel localParcel = a(6, a());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if ((localIInterface instanceof gb)) {
        localObject = (gb)localIInterface;
      } else {
        localObject = new ib((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (gb)localObject;
  }
  
  public final String F()
    throws RemoteException
  {
    Parcel localParcel = a(10, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final Hq G()
    throws RemoteException
  {
    Parcel localParcel = a(2, a());
    Hq localHq = Hq.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localHq;
  }
  
  public final double J()
    throws RemoteException
  {
    Parcel localParcel = a(8, a());
    double d = localParcel.readDouble();
    localParcel.recycle();
    return d;
  }
  
  public final String O()
    throws RemoteException
  {
    Parcel localParcel = a(9, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final q getVideoController()
    throws RemoteException
  {
    Parcel localParcel = a(13, a());
    q localq = r.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localq;
  }
  
  public final Ya t()
    throws RemoteException
  {
    Parcel localParcel = a(17, a());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
      if ((localIInterface instanceof Ya)) {
        localObject = (Ya)localIInterface;
      } else {
        localObject = new ab((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (Ya)localObject;
  }
  
  public final String u()
    throws RemoteException
  {
    Parcel localParcel = a(3, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String v()
    throws RemoteException
  {
    Parcel localParcel = a(7, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String x()
    throws RemoteException
  {
    Parcel localParcel = a(5, a());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List z()
    throws RemoteException
  {
    Parcel localParcel = a(4, a());
    ArrayList localArrayList = ZU.b(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */