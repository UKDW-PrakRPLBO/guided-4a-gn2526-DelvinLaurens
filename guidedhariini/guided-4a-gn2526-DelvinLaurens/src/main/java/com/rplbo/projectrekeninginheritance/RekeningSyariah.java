package com.rplbo.projectrekeninginheritance;

public class RekeningSyariah extends Rekening{
    
    @Override
    public void penarikan(int jumlah) {
        super.penarikan(jumlah);
    }

    public RekeningSyariah(Nasabah nasabah,int saldo){
        super(nasabah,saldo);
    }

    public RekeningSyariah(Nasabah nasabah){
        super(nasabah);
    }

    public void sumbangan(int jumlah){
        if(jumlah < getSaldo()) penarikan(jumlah);
    }
}
