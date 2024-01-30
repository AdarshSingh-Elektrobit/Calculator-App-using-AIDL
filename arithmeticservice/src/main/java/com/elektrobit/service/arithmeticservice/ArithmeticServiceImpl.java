package com.elektrobit.service.arithmeticservice;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class ArithmeticServiceImpl extends IArithmeticService.Stub{
    private final String TAG = ArithmeticServiceImpl.class.getName();
    @Override
    public IBinder asBinder() {
        return super.asBinder();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        Log.d(TAG, "in add");
        return a+b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        Log.d(TAG, "in subtract");
        return a-b;
    }
//
//    @Override
//    public int multiply(int a, int b) throws RemoteException {
//        return a*b;
//    }
//
//    @Override
//    public int divide(int a, int b) throws RemoteException {
//        if (b==0){return 0;}
//        return a/b;
//    }


}
