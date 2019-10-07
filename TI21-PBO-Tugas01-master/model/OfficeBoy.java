package model;

public class OfficeBoy extends Karyawan{
  private String jabatanName= "Office Boy";
  private int gajiPokok     = 1500000;
  private int tunjangan     = 0;
  private int transportasi  = 75000;
  private int lembur        = 10000;
  private int pajak         = 2;

  public int jumlahLembur   = 0;
  public int jumlahHadir    = 0;

  public String getJabatan(){
    return this.jabatanName;
  }

  public int getGaji(){
    return this.gajiPokok;
  }

  public int getTunjangan(){
    return this.tunjangan;
  }

  public int getTransport(){
    return jumlahHadir*this.transportasi;
  }

  public int getLembur(){
    return jumlahLembur*this.lembur;
  }

  public int getPajak(){
    return this.pajak;
  }

  public int getTotalTerima(){
    int gajiKotor =
      this.getGaji() +
      this.getTunjangan() +
      this.getTransport() +
      this.getLembur();

    return gajiKotor - ((gajiKotor * this.getPajak())/100);
  }
}
