package com.charsequence;

public class Shifter implements CharSequence {

  private String word;
  private int shift;

  public Shifter(String word, int shift) {
    this.word = word;
    this.shift = shift;
  }

  public int length() {
    return  word.length();
  }

  public char charAt(int index) {
    return word.charAt(index + shift);
  }

  public CharSequence subSequence(int start, int end) {
    return reverseString(word).subSequence(start, end);
  }

  public String reverseString(String word) {
    StringBuilder reversedString = new StringBuilder();
    for (int i = (word.length() - 1); i >= 0; i--) {
      reversedString.append(word.charAt(i));
    }
    return reversedString.toString();
  }

}
