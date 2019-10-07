package model;

public class Keuangan extends Karyawan{
  private String jabatanName   = "Keuangan";
  private int gajiPokok        = 3400000;
  private int transportasi     = 300000;
  private int pajak            = 2;

  public int jumlahLembur      = 0;
  public int jumlahHadir       = 0;

  public String getJabatan(){
    return this.jabatanName;
  }

  public int getGaji(){
    return this.gajiPokok;
  }

  public int getTransport(){
    return this.transportasi * this.jumlahHadir;
  }

  public int getPajak(){
    return this.pajak;
  }

  public int getTotalTerima(){
    int gajiKotor =
      this.getGaji() +
      this.getTransport();

    return gajiKotor - ((gajiKotor * this.getPajak())/100);
  }
}
