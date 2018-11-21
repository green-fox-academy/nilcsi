package com.charsequence;

public class Gnirts implements CharSequence {

  String word;

  Gnirts(String word) {
    this.word = word;
  }

  public int length() {
    return  word.length();
  }

  public char charAt(int index) {
    return word.charAt(word.length() - index - 1);
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

  public String toString() {
    return word;
  }
}
