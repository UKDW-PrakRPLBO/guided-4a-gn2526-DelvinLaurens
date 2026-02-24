package com.rplbo.projectrekeninginheritance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RekeningBisnis rb = new RekeningBisnis(new Nasabah("A","1","jl 1"), 100000);
        rb.penyetoran(100000);
        rb.penarikan(25000);
        System.out.println(rb.getSaldo());

        RekeningKeluarga rk = new RekeningKeluarga(new Nasabah("A","1","jl 1"), 100000);
        rb.penyetoran(100000);
        rb.penarikan(25000);
        System.out.println(rb.getSaldo());

        RekeningSyariah rs = new RekeningSyariah(new Nasabah("A","1","jl 1"), 100000);
        rb.penyetoran(100000);
        rb.penarikan(25000);
        rs.sumbangan(30000);
        System.out.println(rb.getSaldo());
    }
}
