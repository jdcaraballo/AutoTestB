package co.com.testtechnical.utils.enums;

public enum EnumLetra {
  LETRA_K("K");

  private String letra;

  EnumLetra(String letra) {
    this.letra = letra;
  }

  public String getLetra() {
    return letra;
  }
}
